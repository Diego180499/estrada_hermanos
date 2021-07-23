package repositorio;

import backend.Proveedor;
import conector.Conector;
import java.util.ArrayList;

public class ProveedorRepositorio implements Repositorio<Proveedor, String> {

    ArrayList<String> campos;

    public ProveedorRepositorio() {

        campos = new ArrayList<>();
        campos.add("id_proveedor");
        campos.add("nombre");
        campos.add("apellido");
        campos.add("direccion");
        campos.add("telefono");
        campos.add("email");

    }

    @Override
    public Proveedor save(Proveedor proveedor) {

        ArrayList<Object> valores = new ArrayList<>();
        valores.add(proveedor.getIdProveedor());
        valores.add(proveedor.getNombre());
        valores.add(proveedor.getApellido());
        valores.add(proveedor.getDireccion());
        valores.add(proveedor.getTelefono());
        valores.add(proveedor.getEmail());

        Integer insertado;
        insertado = Conector.insertar("proveedor", campos, valores);
        return insertado > 0 ? proveedor : null;
    }

    @Override
    public Proveedor update(Proveedor proveedor) {
        ArrayList<Object> valoresCampos = new ArrayList<>();
        valoresCampos.add(proveedor.getIdProveedor());
        valoresCampos.add(proveedor.getNombre());
        valoresCampos.add(proveedor.getApellido());
        valoresCampos.add(proveedor.getDireccion());
        valoresCampos.add(proveedor.getTelefono());
        valoresCampos.add(proveedor.getEmail());

        Integer modificar = Conector.modificar("proveedor", campos, valoresCampos, "id_proveedor", proveedor.getIdProveedor());

        return modificar > 0 ? proveedor : null;
    }

    @Override
    public Proveedor find(String id_proveedor) {
        ArrayList<String> camposClave = new ArrayList<>();
        camposClave.add("id_proveedor");
        ArrayList<Object> valoresClave = new ArrayList<>();
        valoresClave.add(id_proveedor);
        ArrayList<Object[]> registros = new ArrayList<>();
        registros = Conector.consultar("proveedor", campos, camposClave, valoresClave);
        if (registros.isEmpty()) {
            return null;
        }
        Proveedor proveedor = new Proveedor();
        Object[] registro = registros.get(0);
        proveedor.setIdProveedor((String) registro[0]);
        proveedor.setNombre((String) registro[1]);
        proveedor.setApellido((String) registro[2]);
        proveedor.setDireccion((String) registro[3]);
        proveedor.setTelefono((Integer) registro[4]);
        proveedor.setEmail((String) registro[5]);

        return proveedor;
    }

    public ArrayList<Proveedor> consultarProveedores() {

        ArrayList<Proveedor> proveedores = new ArrayList<>();
        ArrayList<Object[]> registros = Conector.consultarTabla("proveedor", campos);

        for (int i = 0; i < registros.size(); i++) {
            Proveedor proveedor = new Proveedor();
            proveedor.setIdProveedor(String.valueOf(registros.get(i)[0]));
            proveedor.setNombre(String.valueOf(registros.get(i)[1]));
            proveedor.setApellido(String.valueOf(registros.get(i)[2]));
            proveedor.setDireccion(String.valueOf(registros.get(i)[3]));
            proveedor.setTelefono((Integer) (registros.get(i)[4]));
            proveedor.setEmail(String.valueOf(registros.get(i)[5]));
            proveedores.add(proveedor);
        }
        return proveedores;
    }

    @Override
    public Boolean delete(String id_proveedor) {

        ArrayList<String> camposClave = new ArrayList<>();
        camposClave.add("id_proveedor");
        ArrayList<Object> valoresClave = new ArrayList<>();
        valoresClave.add(id_proveedor);
        Integer eliminado = Conector.eliminar("proveedor", camposClave, valoresClave);
        return eliminado > 0;
    }

}
