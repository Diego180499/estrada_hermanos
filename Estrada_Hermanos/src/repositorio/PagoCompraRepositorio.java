package repositorio;

import backend.PagoCompra;
import backend.Zapateria;
import java.util.ArrayList;

public class PagoCompraRepositorio implements Repositorio<PagoCompra, String> {

    ArrayList<String> campos;
    Zapateria zapateria;

    public PagoCompraRepositorio() {
        campos = new ArrayList<>();
        campos.add("id_compra");
        campos.add("monto_pago");
        campos.add("fecha_pago");
    }

    @Override
    public PagoCompra save(PagoCompra pagoCompra) {
        ArrayList<Object> valores = new ArrayList<>();
        valores.add(pagoCompra.getCompra().getIdCompra());
        valores.add(pagoCompra.getMonto_pago());
        valores.add(pagoCompra.getFecha_pago());

        Integer insertado = conector.Conector.insertar("pago_compra", campos, valores);

        return insertado > 0 ? pagoCompra : null;
    }

    @Override
    public PagoCompra update(PagoCompra objeto) {

        return null;
    }

    @Override
    public PagoCompra find(String primaryKey) {

        return null;
    }

    @Override
    public Boolean delete(String objeto) {

        return null;
    }

}
