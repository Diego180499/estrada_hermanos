package repositorio;

import backend.Compra;
import backend.Proveedor;
import backend.Zapateria;
import conector.Conector;
import java.util.ArrayList;
import java.util.Date;

public class CompraRepositorio implements Repositorio<Compra, String> {

    ArrayList<String> campos;

    public CompraRepositorio() {
        campos = new ArrayList<>();
        campos.add("id_compra");
        campos.add("id_proveedor");
        campos.add("fecha_compra");
        campos.add("total_compra");

    }

    @Override
    public Compra save(Compra compra) {
        ArrayList<Object> valores = new ArrayList<>();
        valores.add(compra.getIdCompra());
        valores.add(compra.getIdProveedor().getIdProveedor());
        valores.add(compra.getFechaCompra());
        valores.add(compra.getTotal_compra());

        Integer insertar = Conector.insertar("compra", campos, valores);
        return insertar > 0 ? compra : null;
    }

    @Override
    public Compra update(Compra objeto) {
        return null;
    }

    @Override
    public Compra find(String primaryKey) {
        ArrayList<String> camposClave = new ArrayList<>();
        camposClave.add("id_compra");
        ArrayList<Object> valoresClave = new ArrayList<>();
        valoresClave.add(primaryKey);
        ArrayList<Object[]> registros = Conector.consultar("compra", campos, camposClave, valoresClave);
        Object[] registro = registros.get(0);
        Compra compra = new Compra();
        try {
            Zapateria zapateria = new Zapateria();
            Proveedor proveedor = zapateria.consultarProveedor(String.valueOf(registro[1]));
            compra.setIdCompra(String.valueOf(registro[0]));
            compra.setIdProveedor(proveedor);
            compra.setFechaCompra((Date) registro[2]);
            compra.setTotal_compra((Double) registro[3]);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return compra;
    }

    @Override
    public Boolean delete(String objeto) {
        return true;
    }

    public Compra agregaTotalCompra(Compra compra, Double totalCompra) {
        ArrayList<Object> valores = new ArrayList<>();
        valores.add(compra.getIdCompra());
        valores.add(compra.getIdProveedor().getIdProveedor());
        valores.add(compra.getFechaCompra());
        valores.add(totalCompra);

        Integer modificar = Conector.modificar("compra", campos, valores, "id_compra", compra.getIdCompra());
        return modificar > 0 ? compra : null;

    }

    public ArrayList<Compra> consultarCompras(Zapateria zapateria) throws Exception {
        ArrayList<Compra> compras = new ArrayList<>();

        ArrayList<Object[]> registros = Conector.consultarTabla("compra", campos);

        for (int i = 0; i < registros.size(); i++) {

            Compra compra = new Compra();
            Proveedor proveedor = zapateria.consultarProveedor(String.valueOf(registros.get(i)[1]));
            
            compra.setIdCompra(String.valueOf(registros.get(i)[0]));
            compra.setIdProveedor(proveedor);
            compra.setFechaCompra((Date)registros.get(i)[2]);
            compra.setTotal_compra((Double) registros.get(i)[3]);
            compras.add(compra);
        }
        return compras;
    }

}
