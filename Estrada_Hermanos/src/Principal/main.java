package Principal;

import backend.Zapateria;
import frontend.ModuloInicial;


public class main {

    public static void main(String[] args) {

        Zapateria zapateria = new Zapateria();
        try {
            ModuloInicial conector = new ModuloInicial(zapateria);
            conector.setVisible(true);

            metodo2();
        } catch (Exception ex) {
            System.out.println("Excepcion capturada" + ex.getMessage());
        }
    }

    public static void metodo1() {

        throw new RuntimeException("Es una excepcion de prueba");

    }

    public static void metodo2() {

        metodo1();
    }

}
