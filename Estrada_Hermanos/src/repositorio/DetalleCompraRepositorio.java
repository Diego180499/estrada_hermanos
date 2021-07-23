package repositorio;

import backend.Compra;
import backend.DetalleCompra;
import backend.Producto;
import backend.Zapateria;
import conector.Conector;
import java.util.ArrayList;

public class DetalleCompraRepositorio implements Repositorio<DetalleCompra, String> {

    ArrayList<String> campos;

    public DetalleCompraRepositorio() {
        campos = new ArrayList<>();
        campos.add("id_detalle_compra");
        campos.add("id_compra");
        campos.add("id_producto");
        campos.add("cantidad_producto");
        campos.add("total_compra");

    }

    @Override
    public DetalleCompra save(DetalleCompra compra) {
        ArrayList<Object> valores = new ArrayList<>();
        valores.add(compra.getIdDetalleCompra());
        valores.add(compra.getIdCompra().getIdCompra());
        valores.add(compra.getIdProducto().getIdProducto());
        valores.add((Integer) compra.getCantidadProducto());
        valores.add((Double) compra.getTotalCompra());

        Integer insertar = Conector.insertar("detalle_compra", campos, valores);
        return insertar > 0 ? compra : null;
    }

    @Override
    public DetalleCompra update(DetalleCompra detalleCompra) {
        ArrayList<Object> valores = new ArrayList<>();
        valores.add(detalleCompra.getIdDetalleCompra());
        valores.add(detalleCompra.getIdCompra().getIdCompra());
        valores.add(detalleCompra.getIdProducto().getIdProducto());
        valores.add(detalleCompra.getCantidadProducto());
        valores.add(detalleCompra.getTotalCompra());

        Integer modificar = Conector.modificar("detalle_compra", campos, valores, "id_detalle_compra", detalleCompra.getIdDetalleCompra());
        return modificar > 0 ? detalleCompra : null;
    }

    @Override
    public DetalleCompra find(String primaryKey) {
        Zapateria zapateria = new Zapateria();
        ArrayList<String> camposClave = new ArrayList<>();
        ArrayList<Object> valoresClave = new ArrayList<>();
        camposClave.add("id_detalle_compra");
        valoresClave.add(primaryKey);

        ArrayList<Object[]> registros = Conector.consultar("detalle_compra", campos, camposClave, valoresClave);
        if (registros.isEmpty()) {
            return null;
        }

        Object[] registro = registros.get(0);
        DetalleCompra detalleCompra = new DetalleCompra();
        Compra compra = zapateria.consultarCompra(String.valueOf(registro[1]));
        Producto producto = zapateria.consultarProducto(String.valueOf(registro[2]));
        detalleCompra.setIdDetalleCompra(String.valueOf(registro[0]));
        detalleCompra.setIdCompra(compra);
        detalleCompra.setIdProducto(producto);
        detalleCompra.setCantidadProducto((Integer) registro[3]);
        detalleCompra.setTotalCompra((Double) registro[4]);

        return detalleCompra;
    }

    @Override
    public Boolean delete(String idDetalleCompra) {
        ArrayList<String> camposClave = new ArrayList<>();
        camposClave.add("id_detalle_compra");
        ArrayList<Object> valoresClave = new ArrayList<>();
        valoresClave.add(idDetalleCompra);

        Integer eliminar = Conector.eliminar("detalle_compra", camposClave, valoresClave);
        return eliminar > 0;
    }

    public ArrayList<DetalleCompra> consultarDetallesCompra(String id_compra) {
        Zapateria zapateria = new Zapateria();
        ArrayList<String> camposClave = new ArrayList<>();
        camposClave.add("id_compra");
        ArrayList<Object> valoresClave = new ArrayList<>();
        valoresClave.add(id_compra);

        ArrayList<Object[]> registros = Conector.consultar("detalle_compra", campos, camposClave, valoresClave);

        ArrayList<DetalleCompra> detalleCompras = new ArrayList<>();

        for (int i = 0; i < registros.size(); i++) {
            DetalleCompra detalleCompra = new DetalleCompra();
            Compra compra = zapateria.consultarCompra(String.valueOf(registros.get(i)[1]));
            Producto prodcuto = zapateria.consultarProducto(String.valueOf(registros.get(i)[2]));
            detalleCompra.setIdDetalleCompra(String.valueOf(registros.get(i)[0]));
            detalleCompra.setIdCompra(compra);
            detalleCompra.setIdProducto(prodcuto);
            detalleCompra.setCantidadProducto((Integer) registros.get(i)[3]);
            detalleCompra.setTotalCompra((Double) registros.get(i)[4]);
            detalleCompras.add(detalleCompra);
        }
        return detalleCompras;

    }

}
