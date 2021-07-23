package repositorio;

import backend.Cliente;
import conector.Conector;
import java.util.ArrayList;

public class ClienteRepositorio implements Repositorio<Cliente, String> {

    ArrayList<String> campos;

    public ClienteRepositorio() {
        campos = new ArrayList<>();
        campos.add("id_cliente");
        campos.add("nombre");
        campos.add("apellido");
        campos.add("telefono");
        campos.add("email");
    }

    @Override
    public Cliente save(Cliente cliente) {

        ArrayList<Object> valores = new ArrayList<>();
        valores.add(cliente.getIdCliente());
        valores.add(cliente.getNombre());
        valores.add(cliente.getApellido());
        valores.add(cliente.getTelefono());
        valores.add(cliente.getEmail());
        Integer insertar = Conector.insertar("cliente", campos, valores);
        return insertar > 0 ? cliente : null;
    }

    @Override
    public Cliente update(Cliente cliente) {

        ArrayList<String> camposClave = new ArrayList<>();
        camposClave.add("id_cliente");

        ArrayList<Object> datosClave = new ArrayList<>();
        datosClave.add(cliente.getIdCliente());

        ArrayList<Object> valoresCampos = new ArrayList<>();
        valoresCampos.add(cliente.getIdCliente());
        valoresCampos.add(cliente.getNombre());
        valoresCampos.add(cliente.getApellido());
        valoresCampos.add(cliente.getTelefono());
        valoresCampos.add(cliente.getEmail());

        Integer modificar = Conector.modificar("cliente", campos, valoresCampos, "id_cliente", cliente.getIdCliente());

        return modificar > 0 ? cliente : null;
    }

    @Override
    public Cliente find(String primaryKey) {
        ArrayList<String> nombrePrimariKey = new ArrayList<>();
        nombrePrimariKey.add("id_cliente");
        ArrayList<Object> valorPrimaryKey = new ArrayList<>();
        valorPrimaryKey.add(primaryKey);
        ArrayList< Object[]> registros = Conector.consultar("cliente", campos, nombrePrimariKey, valorPrimaryKey);
        if (registros == null || registros.isEmpty()) {
            return null;
        }

        Object[] registro = registros.get(0);

        Cliente cliente = new Cliente();
        cliente.setIdCliente((String) registro[0]);
        cliente.setNombre((String) registro[1]);
        cliente.setApellido((String) registro[2]);
        cliente.setTelefono((Integer) registro[3]);
        cliente.setEmail((String) registro[4]);

        return cliente;
    }

    @Override
    public Boolean delete(String idCliente) {
        ArrayList<String> camposClave = new ArrayList<>();
        camposClave.add("id_cliente");
        ArrayList<Object> valoresCampos = new ArrayList<>();
        valoresCampos.add(idCliente);
        Integer eliminar = Conector.eliminar("cliente", camposClave, valoresCampos);
        return eliminar > 0;
    }

    public ArrayList<Cliente> consultarClientes() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Object[]> registros = Conector.consultarTabla("cliente", campos);
        ArrayList<Object> registro = new ArrayList<>();

        for (int i = 0; i < registros.size(); i++) {
            registro.add(registros.get(i));
        }

        for (int i = 0; i < registros.size(); i++) {
            Cliente cliente = new Cliente();
            cliente.setIdCliente(String.valueOf(registros.get(i)[0]));
            cliente.setNombre(String.valueOf(registros.get(i)[1]));
            cliente.setApellido(String.valueOf(registros.get(i)[2]));
            cliente.setTelefono((Integer) registros.get(i)[3]);
            cliente.setEmail(String.valueOf(registros.get(i)[4]));
            clientes.add(cliente);
        }

        return clientes;

    }

}
