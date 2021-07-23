package repositorio;

import backend.Cliente;
import backend.Venta;
import backend.Zapateria;
import conector.Conector;
import java.util.ArrayList;
import java.util.Date;

public class VentaRepositorio implements Repositorio<Venta, String> {

    ArrayList<String> campos;

    public VentaRepositorio() {
        campos = new ArrayList<>();
        campos.add("id_venta");
        campos.add("id_cliente");
        campos.add("fecha_venta");
        campos.add("total_venta");
    }

    @Override
    public Venta save(Venta venta) {
        ArrayList<Object> valores = new ArrayList<>();
        valores.add(venta.getIdVenta());
        valores.add(venta.getIdCliente().getIdCliente());
        valores.add(venta.getFechaVenta());
        valores.add(venta.getTotal_venta());

        Integer ventaIngresada = Conector.insertar("venta", campos, valores);
        return ventaIngresada > 0 ? venta : null;
    }

    @Override
    public Venta update(Venta objeto) {
        return null;
    }

    @Override
    public Venta find(String primaryKey) {

        ArrayList<String> camposClave = new ArrayList<>();
        camposClave.add("id_venta");
        ArrayList<Object> valoresClave = new ArrayList<>();
        valoresClave.add(primaryKey);

        ArrayList<Object[]> registrosVenta = Conector.consultar("venta", campos, camposClave, valoresClave);
        Object[] registroVenta = registrosVenta.get(0);
        Venta venta = new Venta();
        try {

            Zapateria zapateria = new Zapateria();
            Cliente cliente = zapateria.consultarCliente(String.valueOf(registroVenta[1]));
            venta.setIdVenta((String) registroVenta[0]);
            venta.setIdCliente(cliente);
            venta.setFechaVenta((Date) registroVenta[2]);
            venta.setTotal_venta((Double) registroVenta[3]);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return venta;
    }

    @Override
    public Boolean delete(String objeto) {
        return true;
    }

    public Venta agregarTotalVenta(Venta venta, Double totalVenta) {
        ArrayList<Object> valores = new ArrayList<>();
        valores.add(venta.getIdVenta());
        valores.add(venta.getIdCliente().getIdCliente());
        valores.add(venta.getFechaVenta());
        valores.add(totalVenta);

        Integer modificar = Conector.modificar("venta", campos, valores, "id_venta", venta.getIdVenta());
        return modificar > 0 ? venta : null;
    }

}
