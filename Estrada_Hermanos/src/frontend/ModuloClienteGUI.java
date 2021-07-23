package frontend;

import backend.Cliente;
import backend.Zapateria;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ModuloClienteGUI extends javax.swing.JFrame {

    Zapateria zapateria;
    ConsultaClientesGUI consultaClienteGUI;

    public ModuloClienteGUI() {
        zapateria = new Zapateria();
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void limpiarCampos() {
        idCliente.setText("");
        nombre.setText("");
        apellido.setText("");
        telefono.setText("");
        correo.setText("");
        idCliente.setEditable(true);
        id_cliente.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelCliente = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        idCliente = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botonModificar = new javax.swing.JButton();
        botonConsultar = new javax.swing.JButton();
        botonElliminar = new javax.swing.JButton();
        id_cliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        botonLimpiar = new javax.swing.JButton();
        botonIngresar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuVerClientes = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MODULO   CLIENTE");

        panelCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Apellido:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Teléfono:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Correo Electrónico: ");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("ID Cliente");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Nombre: ");

        javax.swing.GroupLayout panelClienteLayout = new javax.swing.GroupLayout(panelCliente);
        panelCliente.setLayout(panelClienteLayout);
        panelClienteLayout.setHorizontalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        panelClienteLayout.setVerticalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        botonModificar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonConsultar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonConsultar.setText("Consultar");
        botonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarActionPerformed(evt);
            }
        });

        botonElliminar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonElliminar.setText("Eliminar");
        botonElliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonElliminarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("ID Cliente");

        botonLimpiar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonLimpiar.setText("Limpiar Casillas");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        botonIngresar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonIngresar.setText("Ingresar");
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonLimpiar)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonElliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonElliminar)
                    .addComponent(botonModificar)
                    .addComponent(botonIngresar))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonConsultar))
                .addGap(18, 18, 18)
                .addComponent(botonLimpiar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("Opciones");

        menuVerClientes.setText("Consultar Clientes");
        menuVerClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerClientesActionPerformed(evt);
            }
        });
        jMenu1.add(menuVerClientes);

        jMenuItem2.setText("Regresar");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

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

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        try {
            Cliente cliente = new Cliente(idCliente.getText(), nombre.getText(), apellido.getText(), Integer.parseInt(telefono.getText()), correo.getText());

            boolean ingresado = zapateria.agregarCliente(cliente);
            if (ingresado) {
                JOptionPane.showMessageDialog(null, "Cliente Agregado");
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "No se ha ingresado el cliente");
            }

        } catch (Exception ex) {
            Logger.getLogger(ModuloClienteGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonIngresarActionPerformed

    private void botonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarActionPerformed

        try {
            if (id_cliente.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Ingresa el ID del cliente a consultar");
                return;
            }
            Cliente cliente = zapateria.consultarCliente(id_cliente.getText());
            if (cliente == null) {
                JOptionPane.showMessageDialog(null, "Registro no encontrado");
                return;
            }

            this.idCliente.setText(cliente.getIdCliente());
            nombre.setText(cliente.getNombre());
            apellido.setText(cliente.getApellido());
            telefono.setText(String.valueOf(cliente.getTelefono()));
            correo.setText(cliente.getEmail());
            idCliente.setEditable(false);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_botonConsultarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed

        try {
            Cliente cliente = new Cliente(id_cliente.getText(), nombre.getText(), apellido.getText(), Integer.parseInt(telefono.getText()), correo.getText());
            boolean modificado = zapateria.modificarCliente(cliente, cliente.getIdCliente());
            if (modificado) {
                JOptionPane.showMessageDialog(null, "Cliente modificado");
            } else {
                JOptionPane.showMessageDialog(null, "No se ha podido modificar");
            }
        } catch (Exception ex) {
            Logger.getLogger(ModuloClienteGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void botonElliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonElliminarActionPerformed

        try {
            if (zapateria.eliminarCliente(id_cliente.getText())) {
                JOptionPane.showMessageDialog(null, "Cliente eliminado");
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "No se ha podido eliminar");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }//GEN-LAST:event_botonElliminarActionPerformed

    private void menuVerClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerClientesActionPerformed

        consultaClienteGUI = new ConsultaClientesGUI();
        consultaClienteGUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuVerClientesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido;
    private javax.swing.JButton botonConsultar;
    private javax.swing.JButton botonElliminar;
    private javax.swing.JButton botonIngresar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField idCliente;
    private javax.swing.JTextField id_cliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem menuVerClientes;
    private javax.swing.JTextField nombre;
    private javax.swing.JPanel panelCliente;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
