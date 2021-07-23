package frontend;

import utils.ImagenPC;
import backend.Zapateria;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ModuloInicial extends BaseFrame {

    ModuloClienteGUI moduloClienteGUI;
    ModuloProveedorGUI moduloProveedorGUI;
    ModuloProductoGui moduloProductoGui;
    ModuloVentaGUI moduloVentaGUI;
    ModuloCompraGUI moduloCompraGUI;

    public ModuloInicial(Zapateria zapateria) {
        super(zapateria);
        initComponents();
        this.setLocationRelativeTo(null);
        pintarImagen();
    }

    public void pintarImagen() {
        ImagenPC imagen = new ImagenPC(panelLogo.getWidth(), panelLogo.getHeight(), "/imagenes/logoEH.jpg");
        panelLogo.add(imagen);
        panelLogo.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jFileChooser1 = new javax.swing.JFileChooser();
        jFileChooser2 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        panelLogo = new javax.swing.JPanel();
        botonExaminar = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        opciones = new javax.swing.JMenu();
        moduloCliente = new javax.swing.JMenuItem();
        moduloProveedor = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));

        botonExaminar.setText("Examinar");
        botonExaminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonExaminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLogoLayout = new javax.swing.GroupLayout(panelLogo);
        panelLogo.setLayout(panelLogoLayout);
        panelLogoLayout.setHorizontalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLogoLayout.createSequentialGroup()
                .addContainerGap(240, Short.MAX_VALUE)
                .addComponent(botonExaminar)
                .addContainerGap())
        );
        panelLogoLayout.setVerticalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLogoLayout.createSequentialGroup()
                .addContainerGap(334, Short.MAX_VALUE)
                .addComponent(botonExaminar)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jMenuBar2.setBackground(new java.awt.Color(153, 153, 0));
        jMenuBar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        opciones.setBackground(new java.awt.Color(153, 153, 0));
        opciones.setForeground(new java.awt.Color(0, 0, 0));
        opciones.setText("Opciones");
        opciones.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesActionPerformed(evt);
            }
        });

        moduloCliente.setBackground(new java.awt.Color(153, 153, 0));
        moduloCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        moduloCliente.setForeground(new java.awt.Color(0, 0, 0));
        moduloCliente.setText("Módulo Cliente");
        moduloCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moduloClienteActionPerformed(evt);
            }
        });
        opciones.add(moduloCliente);

        moduloProveedor.setBackground(new java.awt.Color(153, 153, 0));
        moduloProveedor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        moduloProveedor.setForeground(new java.awt.Color(0, 0, 0));
        moduloProveedor.setText("Módulo Proveedor");
        moduloProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moduloProveedorActionPerformed(evt);
            }
        });
        opciones.add(moduloProveedor);

        jMenuItem3.setBackground(new java.awt.Color(153, 153, 0));
        jMenuItem3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem3.setText("Módulo Producto");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        opciones.add(jMenuItem3);

        jMenuItem4.setBackground(new java.awt.Color(153, 153, 0));
        jMenuItem4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem4.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem4.setText("Módulo Tipo Producto");
        opciones.add(jMenuItem4);

        jMenuItem2.setBackground(new java.awt.Color(153, 153, 0));
        jMenuItem2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem2.setText("Módulo Venta");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        opciones.add(jMenuItem2);

        jMenuItem5.setBackground(new java.awt.Color(153, 153, 0));
        jMenuItem5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem5.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem5.setText("Módulo Compra");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        opciones.add(jMenuItem5);

        jMenuItem1.setBackground(new java.awt.Color(153, 153, 0));
        jMenuItem1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem1.setText("SALIR");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        opciones.add(jMenuItem1);

        jMenuBar2.add(opciones);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void moduloClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moduloClienteActionPerformed

        moduloClienteGUI = new ModuloClienteGUI();
        moduloClienteGUI.setVisible(true);
        this.setVisible(false);

        this.setVisible(false);

    }//GEN-LAST:event_moduloClienteActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        moduloProductoGui = new ModuloProductoGui();
        moduloProductoGui.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void moduloProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moduloProveedorActionPerformed
        moduloProveedorGUI = new ModuloProveedorGUI(this);
        moduloProveedorGUI.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_moduloProveedorActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void opcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesActionPerformed


    }//GEN-LAST:event_opcionesActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        moduloVentaGUI = new ModuloVentaGUI(this);
        moduloVentaGUI.setVisible(true);
        this.setVisible(false);
     }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        moduloCompraGUI = new ModuloCompraGUI(this);
        moduloCompraGUI.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void botonExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExaminarActionPerformed
        utils.Utils.escogerImagen(panelLogo, this);
        // esto solo es un comentario
    }//GEN-LAST:event_botonExaminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonExaminar;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem moduloCliente;
    private javax.swing.JMenuItem moduloProveedor;
    private javax.swing.JMenu opciones;
    private javax.swing.JPanel panelLogo;
    // End of variables declaration//GEN-END:variables
}
