package repositorio;

import backend.DetalleVenta;
import backend.Producto;
import backend.Venta;
import backend.Zapateria;
import java.util.ArrayList;

public class DetalleVentaRepositorio implements Repositorio<DetalleVenta, String> {

    ArrayList<String> campos;

    public DetalleVentaRepositorio() {
        campos = new ArrayList<>();
        campos.add("id_detalle_venta");
        campos.add("id_venta");
        campos.add("id_producto");
        campos.add("cantidad_producto");
        campos.add("total_venta");
    }

    @Override
    public DetalleVenta save(DetalleVenta detalleVenta) {
        ArrayList<Object> valores = new ArrayList<>();
        valores.add(detalleVenta.getIdDetalleVenta());
        valores.add(detalleVenta.getIdVenta().getIdVenta());
        valores.add(detalleVenta.getIdProducto().getIdProducto());
        valores.add((Integer) detalleVenta.getCantidadProducto());
        valores.add((Double) detalleVenta.getTotalVenta());

        Integer ventaIngresada = conector.Conector.insertar("detalle_venta", campos, valores);
        return ventaIngresada > 0 ? detalleVenta : null;
    }

    @Override
    public DetalleVenta update(DetalleVenta objeto) {
        return null;
    }

    @Override
    public DetalleVenta find(String primaryKey) {

        return null;
    }

    public DetalleVenta[] consultarDetallesVenta(String id_venta) {
        Zapateria zapateria = new Zapateria();
        ArrayList<String> camposClave = new ArrayList<>();
        camposClave.add("id_venta");
        ArrayList<Object> valorClaves = new ArrayList<>();
        valorClaves.add(id_venta);

        ArrayList<Object[]> registros = conector.Conector.consultar("detalle_venta", campos, camposClave, valorClaves);
        if (registros == null || registros.isEmpty()) {
            return null;
        }
        DetalleVenta detallesVenta[] = new DetalleVenta[registros.size()];

        for (int i = 0; i < registros.size(); i++) {
            DetalleVenta detalleVenta = new DetalleVenta();
            Venta venta = zapateria.consultarVenta(id_venta);
            Object[] registro = registros.get(i);
            Producto producto = zapateria.consultarProducto(String.valueOf(registro[2]));
            detalleVenta.setIdDetalleVenta((String) registro[0]);
            detalleVenta.setIdVenta(venta);
            detalleVenta.setIdProducto(producto);
            detalleVenta.setCantidadProducto((Integer) registro[3]);
            detalleVenta.setTotalVenta((Double) registro[4]);
            detallesVenta[i] = detalleVenta;
        }

        return detallesVenta;
    }

    @Override
    public Boolean delete(String objeto) {
        return true;
    }

}
