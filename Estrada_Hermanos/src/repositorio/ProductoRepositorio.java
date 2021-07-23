package repositorio;

import backend.Producto;
import backend.TipoProducto;
import backend.Zapateria;
import conector.Conector;
import java.util.ArrayList;

public class ProductoRepositorio implements Repositorio<Producto, String> {

    ArrayList<String> campos;
    Zapateria zapateria;

    public ProductoRepositorio() {
        zapateria = new Zapateria();
        campos = new ArrayList<>();
        campos.add("id_producto");
        campos.add("nombre");
        campos.add("precio_compra");
        campos.add("precio_venta");
        campos.add("id_tipo_producto");
    }

    @Override
    public Producto save(Producto producto) {
        ArrayList<Object> valores = new ArrayList<>();
        valores.add(producto.getIdProducto());
        valores.add(producto.getNombre());
        valores.add(producto.getPrecioCompra());
        valores.add(producto.getPrecioVenta());
        valores.add(producto.getIdTipoProducto().getIdTipoProducto());
        Integer insertar = conector.Conector.insertar("producto", campos, valores);
        return insertar > 0 ? producto : null;
    }

    @Override
    public Producto update(Producto producto) {
        ArrayList<Object> valores = new ArrayList<>();
        valores.add(producto.getIdProducto());
        valores.add(producto.getNombre());
        valores.add(producto.getPrecioCompra());
        valores.add(producto.getPrecioVenta());
        valores.add(producto.getIdTipoProducto().getIdTipoProducto());

        Integer modificar = Conector.modificar("producto", campos, valores, "id_producto", producto.getIdProducto());
        return modificar > 0 ? producto : null;
    }

    @Override
    public Producto find(String primaryKey) {
        ArrayList<String> camposClave = new ArrayList<>();
        ArrayList<Object> valoresClave = new ArrayList<>();
        camposClave.add("id_producto");
        valoresClave.add(primaryKey);

        ArrayList<Object[]> registros = new ArrayList<>();
        registros = Conector.consultar("producto", campos, camposClave, valoresClave);
        Object[] registro = registros.get(0);
        Producto producto = new Producto();
        TipoProducto tipoProducto = zapateria.consultarTipoProducto(String.valueOf(registro[4]));
        producto.setIdProducto((String) registro[0]);
        producto.setNombre((String) registro[1]);
        producto.setPrecioCompra((Double) registro[2]);
        producto.setPrecioVenta((Double) registro[3]);
        producto.setIdTipoProducto(tipoProducto);

        return producto;
    }

    @Override
    public Boolean delete(String idProducto) {
        ArrayList<String> camposClave = new ArrayList<>();
        camposClave.add("id_producto");
        ArrayList<Object> valoresClave = new ArrayList<>();
        valoresClave.add(idProducto);

        Integer eliminado = Conector.eliminar("producto", camposClave, valoresClave);

        return eliminado > 0;
    }

}
