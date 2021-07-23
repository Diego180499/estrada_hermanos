package utils;

import java.awt.Component;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Utils {

    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

    public static void setPanelEnabled(JPanel panel, Boolean isEnabled) {
        panel.setEnabled(isEnabled);

        Component[] components = panel.getComponents();

        for (Component component : components) {
            if (component instanceof JPanel) {
                setPanelEnabled((JPanel) component, isEnabled);
            }
            component.setEnabled(isEnabled);
        }
    }

    public static Date stringToDate(String date) throws Exception {
        try {
            return SIMPLE_DATE_FORMAT.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException("error en la fecha", e.getCause());
        }
    }

    public static void escogerImagen(JPanel panelLogo, JFrame frame) {

        JFileChooser escoger = new JFileChooser();
        escoger.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.jpg", "jpg");
        escoger.setFileFilter(filtro);

        int seleccion = escoger.showOpenDialog(frame);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = escoger.getSelectedFile();
            String ruta = archivo.getAbsolutePath();

            ImagenPC imagen = new ImagenPC(panelLogo.getWidth(), panelLogo.getHeight(), ruta);
            panelLogo.add(imagen);
            panelLogo.repaint();
        }
    }

    public static File escogerArchivo(JFrame frame) {
        JFileChooser escoger = new JFileChooser();
        escoger.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.jpg", "jpg");
        escoger.setFileFilter(filtro);
        int seleccion = escoger.showOpenDialog(frame);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = escoger.getSelectedFile();
            return archivo;
        }
        return null;
    }

}
