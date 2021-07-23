package repositorio;

import backend.TipoProducto;
import conector.Conector;
import java.util.ArrayList;

public class TipoProductoRepositorio implements Repositorio<TipoProducto, String> {

    ArrayList<String> campos;

    public TipoProductoRepositorio() {
        campos = new ArrayList<>();
        campos.add("id_tipo_producto");
        campos.add("nombre");
    }

    @Override
    public TipoProducto save(TipoProducto tipoProducto) {
        ArrayList<Object> valores = new ArrayList<>();
        valores.add(tipoProducto.getIdTipoProducto());
        valores.add(tipoProducto.getNombre());

        Integer ingresado = Conector.insertar("tipo_producto", campos, valores);
        return ingresado > 0 ? tipoProducto : null;
    }

    @Override
    public TipoProducto update(TipoProducto tipoProducto) {

        return null;
    }

    @Override
    public TipoProducto find(String primaryKey) {
        ArrayList<String> camposClave = new ArrayList<>();
        ArrayList<Object> valoresClave = new ArrayList<>();
        camposClave.add("id_tipo_producto");
        valoresClave.add(primaryKey);

        ArrayList<Object[]> registros = new ArrayList<>();
        registros = Conector.consultar("tipo_producto", campos, camposClave, valoresClave);
        Object[] registro = registros.get(0);
        TipoProducto tipoProducto = new TipoProducto();
        tipoProducto.setIdTipoProducto((String) registro[0]);
        tipoProducto.setNombre((String) registro[1]);

        return tipoProducto;
    }

    @Override
    public Boolean delete(String id_tipo_producto) {

        return null;
    }

}
