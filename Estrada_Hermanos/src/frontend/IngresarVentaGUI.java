package frontend;

import backend.Cliente;
import backend.DetalleVenta;
import backend.Producto;
import backend.Venta;
import backend.Zapateria;
import javax.swing.JOptionPane;
import utils.Utils;
//javax.swing.JFrame

public class IngresarVentaGUI extends BaseFrame {

    Zapateria zapateria;
    Venta venta;
    Double totalVenta;

    public IngresarVentaGUI(ModuloVentaGUI parent) {
        super(parent);
        zapateria = new Zapateria();
        initComponents();
        this.setLocationRelativeTo(null);
        Utils.setPanelEnabled(panelDetalleVenta, false);
    }

    public void limpiarCampos() {
        id_detalle_venta.setText("");
        id_producto.setText("");
        cantidad_producto.setText("");
        total_venta.setText("0");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        panelDetalleVenta = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        total_venta = new javax.swing.JLabel();
        botonIngresarAVenta = new javax.swing.JButton();
        id_detalle_venta = new javax.swing.JTextField();
        id_producto = new javax.swing.JTextField();
        cantidad_producto = new javax.swing.JTextField();
        panelVenta = new javax.swing.JPanel();
        botonVenta = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fecha_venta = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        id_venta = new javax.swing.JTextField();
        id_cliente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        botonFinalizar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelDetalleVenta.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Detalle Venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("ID Detalle de Venta");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("ID Producto");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Cantidad Productos");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Total Detalle Venta   Q");

        total_venta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        total_venta.setText("0");

        botonIngresarAVenta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonIngresarAVenta.setText("Ingresar a la Venta");
        botonIngresarAVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarAVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDetalleVentaLayout = new javax.swing.GroupLayout(panelDetalleVenta);
        panelDetalleVenta.setLayout(panelDetalleVentaLayout);
        panelDetalleVentaLayout.setHorizontalGroup(
            panelDetalleVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetalleVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDetalleVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelDetalleVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(total_venta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(id_detalle_venta, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(id_producto)
                    .addComponent(cantidad_producto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetalleVentaLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(botonIngresarAVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        panelDetalleVentaLayout.setVerticalGroup(
            panelDetalleVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetalleVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDetalleVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDetalleVentaLayout.createSequentialGroup()
                        .addGroup(panelDetalleVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(id_detalle_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(id_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDetalleVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cantidad_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDetalleVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(total_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonIngresarAVenta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelVenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        botonVenta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonVenta.setText("Ingresar  Venta");
        botonVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVentaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("ID Cliente");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Fecha Venta");

        fecha_venta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Venta   No.");

        id_venta.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        id_cliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        javax.swing.GroupLayout panelVentaLayout = new javax.swing.GroupLayout(panelVenta);
        panelVenta.setLayout(panelVentaLayout);
        panelVentaLayout.setHorizontalGroup(
            panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVentaLayout.createSequentialGroup()
                .addGroup(panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVentaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fecha_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelVentaLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(botonVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        panelVentaLayout.setVerticalGroup(
            panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(fecha_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonVenta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Total Venta   Q");

        total.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        total.setText("0");

        botonFinalizar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonFinalizar.setText("Finalizar Venta");
        botonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(panelDetalleVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(botonFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDetalleVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonFinalizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(total))
                .addContainerGap())
        );

        jMenu3.setText("Opciones");
        jMenu3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem1.setText("Consultar Venta");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem2.setText("Regresar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVentaActionPerformed
        try {
            Cliente cliente = zapateria.consultarCliente(id_cliente.getText());
            if (cliente == null) {
                JOptionPane.showMessageDialog(null, "El cliente no existe en el sistema");
                return;
            }
            venta = new Venta(id_venta.getText(), Utils.stringToDate(fecha_venta.getText()), cliente, 0.0);
            zapateria.ingresarVenta(venta);
            JOptionPane.showMessageDialog(null, "Venta ingresada, ahora detalle la venta");
            totalVenta = 0.0;
            Utils.setPanelEnabled(panelDetalleVenta, true);
            Utils.setPanelEnabled(panelVenta, false);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_botonVentaActionPerformed

    private void botonIngresarAVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarAVentaActionPerformed
        try {
            Producto producto = zapateria.consultarProducto(id_producto.getText());
            if (producto == null) {
                JOptionPane.showMessageDialog(null, "El producto no existe");
                return;
            }
            Double precioTotal = producto.getPrecioVenta() * (Integer.parseInt(cantidad_producto.getText()));
            DetalleVenta detalleVenta = new DetalleVenta(id_detalle_venta.getText(), producto, Integer.parseInt(cantidad_producto.getText()), venta, precioTotal);
            total_venta.setText(String.valueOf(precioTotal));
            zapateria.ingresarDetalleVenta(detalleVenta);
            JOptionPane.showMessageDialog(null, "Detalle de venta registrada");
            totalVenta += precioTotal;
            limpiarCampos();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_botonIngresarAVentaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed


    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void botonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFinalizarActionPerformed
        this.getZapateria().agregarTotalVenta(venta, totalVenta);
        botonVenta.setEnabled(false);
        botonIngresarAVenta.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Venta finalizada");
        total.setText(String.valueOf(totalVenta));
    }//GEN-LAST:event_botonFinalizarActionPerformed
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.getPadre().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonFinalizar;
    private javax.swing.JButton botonIngresarAVenta;
    private javax.swing.JButton botonVenta;
    private javax.swing.JTextField cantidad_producto;
    private javax.swing.JFormattedTextField fecha_venta;
    private javax.swing.JTextField id_cliente;
    private javax.swing.JTextField id_detalle_venta;
    private javax.swing.JTextField id_producto;
    private javax.swing.JTextField id_venta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelDetalleVenta;
    private javax.swing.JPanel panelVenta;
    private javax.swing.JLabel total;
    private javax.swing.JLabel total_venta;
    // End of variables declaration//GEN-END:variables
}
