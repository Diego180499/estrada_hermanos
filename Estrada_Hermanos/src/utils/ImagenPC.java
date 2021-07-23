package utils;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class ImagenPC extends javax.swing.JPanel {

    private String ruta;

    public ImagenPC(int ancho, int alto, String ruta) {
        this.setSize(ancho, alto);
        this.ruta = ruta;
    }

    public void paint(Graphics g) { // si quisieramos usar nua imagen del programa usamos el ImageIcon, si no, seguimos usando el Image
        Dimension tamanio = getSize();
        //ImageIcon imagen = new ImageIcon(getClass().getResource(ruta));
        Image imagen = new ImageIcon(ruta).getImage();
        g.drawImage(imagen, 0, 0, (int) tamanio.width, (int) tamanio.getHeight(), null);
        setOpaque(false);
        super.paintComponent(g);
    }

}
