package conector;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import utils.Utils;

public class Conector {

    public static final String URL = "jdbc:mysql://localhost:3306/zapateria?autoReconnet=true&useSSL=false";
    public static final String USUARIO = "root";
    public static final String PASSWORD = "diegousac17";

    public static Connection getConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return (Connection) DriverManager.getConnection(URL, USUARIO, PASSWORD);

        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException(ex);
        }

    }

    /**
     * Insertamos valores a cualquier tabla
     *
     * @param nombreTabla
     * @param campos
     * @return
     */
    public static Integer insertar(String nombreTabla, ArrayList<String> campos, ArrayList<Object> valores) {
        String camposQuery = "";

        for (int i = 0; i < campos.size(); i++) {
            if (i == 0) {
                camposQuery = "(" + campos.get(i) + ",";
            } else if (i < campos.size() - 1) {
                camposQuery += campos.get(i) + ",";
            } else if (i + 1 == campos.size()) {
                camposQuery += campos.get(i) + ")";
            }
        }

        String valoresQuery = "";

        for (int i = 0; i < campos.size(); i++) {
            if (campos.size() == 1) {
                valoresQuery = "(?)";
            } else if (i == 0) {
                valoresQuery = "(?,";
            } else if (i < campos.size() - 1) {
                valoresQuery += "?,";
            } else if (i + 1 == campos.size()) {
                valoresQuery += "?)";
            }
        }

        String insertar = "insert into " + nombreTabla + camposQuery + " values " + valoresQuery;
        System.out.println(insertar);
        try {
            PreparedStatement ps = getConnection().prepareStatement(insertar);

            for (int i = 0; i < valores.size(); i++) {
                Object valor = valores.get(i);
                ps.setObject(i + 1, valor);
            }

            return ps.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException("Error insertando", ex);

        }
    }

    //este es el mero consultar
    public static ArrayList<Object[]> consultar(String nombreTabla, ArrayList<String> campos, ArrayList<String> camposClave, ArrayList<Object> datosClave) {

        ArrayList<Object[]> registros = new ArrayList<>();
        String where = " where ";
        for (int i = 0; i < camposClave.size(); i++) {
            where += camposClave.get(i) + "=" + datosClave.get(i);
            if (i < (camposClave.size() - 1)) {
                where += " and ";
            }
        }
        String query = "select " + String.join(",", campos) + " from " + nombreTabla + where;

        System.out.println("query: " + query);
        try {
            PreparedStatement ps = getConnection().prepareStatement(query);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Object[] registro = new Object[campos.size()];
                for (int i = 0; i < campos.size(); i++) {
                    registro[i] = rs.getObject(campos.get(i));
                }
                registros.add(registro);
            }

            return registros;
        } catch (SQLException ex) {
            throw new RuntimeException("Error al consultar", ex);
        }
    }

    public static ArrayList<Object[]> consultarTabla(String nombreTabla, ArrayList<String> campos) {

        String query = "select * from " + nombreTabla;
        try {
            PreparedStatement ps = getConnection().prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ArrayList<Object[]> registros = new ArrayList<>();
            while (rs.next()) {
                Object[] registro = new Object[campos.size()];
                for (int i = 0; i < registro.length; i++) {
                    registro[i] = rs.getObject(campos.get(i));
                }
                registros.add(registro);
            }
            return registros;
        } catch (SQLException ex) {
            throw new RuntimeException("Error en la consulta,", ex);
        }

    }

    public static Integer modificar(String nombreTabla, ArrayList<String> campos, ArrayList<Object> valores, String clavePrimaria, String valorClavePrimaria) {

        String queryModificar = "update " + nombreTabla + " set ";

        for (int i = 0; i < campos.size(); i++) {
            if (campos.size() == 1) {
                queryModificar += campos.get(i) + "=?";
            } else if (i < campos.size() - 1) {
                queryModificar += campos.get(i) + "=?,";
            } else if (i + 1 == campos.size()) {
                queryModificar += campos.get(i) + "=?";
            }
        }

        queryModificar += " where " + clavePrimaria + " = " + valorClavePrimaria;
        System.out.println(queryModificar);
        try {
            PreparedStatement ps = getConnection().prepareStatement(queryModificar);
            for (int i = 0, j = 1; i < valores.size(); i++, j++) {
                Object valor = valores.get(i);
                ps.setObject(j, valor);
            }

            return ps.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException("Error al modificar", ex);
        }
    }

    public static Integer eliminar(String nombreTabla, ArrayList<String> camposClave, ArrayList<Object> valoresCampos) {

        Connection conexion = getConnection();
        String where = " where ";

        for (int i = 0; i < camposClave.size(); i++) {
            if (camposClave.size() == 1) {
                where += camposClave.get(i) + " = " + valoresCampos.get(i);
            } else if (i < camposClave.size() - 1) {
                where += camposClave.get(i) + " = " + valoresCampos.get(i) + ", ";
            } else if (i + 1 == camposClave.size()) {
                where += camposClave.get(i) + " = " + valoresCampos.get(i);
            }
        }
        String queryEliminar = "delete  from " + nombreTabla + where;
        try {
            PreparedStatement ps = conexion.prepareStatement(queryEliminar);
            return ps.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException("Error al eliminar", ex);
        }

    }

    public static Integer agregarImagen(JFrame frame, String nombreTabla, ArrayList<String> campos, ArrayList<Object> valores) throws FileNotFoundException {

        String camposQuery = "";

        for (int i = 0; i < campos.size(); i++) {
            if (i == 0) {
                camposQuery = "(" + campos.get(i) + ",";
            } else if (i < campos.size() - 1) {
                camposQuery += campos.get(i) + ",";
            } else if (i + 1 == campos.size()) {
                camposQuery += campos.get(i) + ")";
            }
        }

        String valoresQuery = "";

        for (int i = 0; i < campos.size(); i++) {
            if (campos.size() == 1) {
                valoresQuery = "(?)";
            } else if (i == 0) {
                valoresQuery = "(?,";
            } else if (i < campos.size() - 1) {
                valoresQuery += "?,";
            } else if (i + 1 == campos.size()) {
                valoresQuery += "?)";
            }
        }

        String insertar = "insert into " + nombreTabla + camposQuery + " values " + valoresQuery;
        System.out.println(insertar);
        try {
            PreparedStatement ps = getConnection().prepareStatement(insertar);

            for (int i = 0; i < valores.size() - 1; i++) {
                Object valor = valores.get(i);
                ps.setObject(i + 1, valor);
            }
            File archivo = Utils.escogerArchivo(frame);
            FileInputStream archivoEntrada = new FileInputStream(archivo);
            ps.setBinaryStream(valores.size() - 1, archivoEntrada, archivo.length());

            return ps.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException("Error insertando", ex);

        }
    }

}
