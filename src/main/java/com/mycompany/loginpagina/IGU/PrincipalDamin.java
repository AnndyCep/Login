
package com.mycompany.loginpagina.IGU;

import com.mycompany.loginpagina.logica.ControladoraLogica;
import com.mycompany.loginpagina.logica.Usuario;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PrincipalDamin extends javax.swing.JFrame {
    ControladoraLogica controlLogica;
    Usuario usr;
    
    public PrincipalDamin(ControladoraLogica controlLogica, Usuario usr) {
        initComponents();
        this.controlLogica = controlLogica;
        this.usr = usr;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaAdmin = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnCrearUser = new javax.swing.JButton();
        btnRecargarTabla = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnBorrarUser = new javax.swing.JButton();
        txtFieldNombreUser = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Sistema Adiminstrador de Usuarios");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TablaAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaAdmin);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        btnEditar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnEditar.setText("Editar Usuario");

        btnCrearUser.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCrearUser.setText("Crear Usuario");
        btnCrearUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUserActionPerformed(evt);
            }
        });

        btnRecargarTabla.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnRecargarTabla.setText("Recargar Tabla");

        btnSalir.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnBorrarUser.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnBorrarUser.setText("Borrar Usuario");
        btnBorrarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarUserActionPerformed(evt);
            }
        });

        txtFieldNombreUser.setEditable(false);
        txtFieldNombreUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFieldNombreUser.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(132, 132, 132))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFieldNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRecargarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBorrarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(643, Short.MAX_VALUE)
                    .addComponent(btnCrearUser, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(48, 48, 48)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtFieldNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRecargarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(192, 192, 192)
                    .addComponent(btnCrearUser, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(359, Short.MAX_VALUE)))
        );

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

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.txtFieldNombreUser.setText(usr.getName());
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnCrearUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUserActionPerformed
        
        CrearUsuario pantalla = new CrearUsuario(controlLogica);
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_btnCrearUserActionPerformed

    private void btnBorrarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarUserActionPerformed
        
        //Validar que la tabla tenga datos
        if (TablaAdmin.getRowCount() > 0) {
            //controlar que se haya seleccionado un elemento
            if (TablaAdmin.getSelectedRow() != -1) {
                int id_usuario = Integer.parseInt(String.valueOf(TablaAdmin.getValueAt(TablaAdmin.getSelectedRow(),0)));
                controlLogica.eliminarUsuario(id_usuario);
                
                mostrarMensaje("Se elimino de forma correcta", "Info", "Eliminado Ok");
                cargarTabla();
            } else {
                mostrarMensaje("No selecciono datos en la tabla", "Error", "Error");
            }
        } else {
            mostrarMensaje("No tiene datos en la tabla", "Error", "Error");
        }
        
    }//GEN-LAST:event_btnBorrarUserActionPerformed
    
    
     private void mostrarMensaje(String mensaje, String tipo, String titulo){
        
        JOptionPane optionPane = new JOptionPane(mensaje);
            if (tipo.equalsIgnoreCase("Info")) {
                optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            } else if (tipo.equalsIgnoreCase("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
            }
        
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        
    }
     
    private void cargarTabla() {
        
        DefaultTableModel modelTable = new DefaultTableModel(){
          //No se pueda modificar la tabla
            @Override
            public boolean isCellEditable (int row, int column){
                return false;
            }
        };
        
        //Creando el encabezado de la tabla
        String headTable[] = {"Id","Usuario","Rol"};
        //Enviando en encabezado a al modelo
        modelTable.setColumnIdentifiers(headTable);
        
        //Enviando la lista de usuarios
        List<Usuario> listaUsiarios = controlLogica.traerUsuarios();
        
        if (listaUsiarios != null) {
            for (Usuario use : listaUsiarios) {
                Object [] object = {use.getId_usser(),use.getName(),use.getUnRol().getNombreUsiario()};
                modelTable.addRow(object);
            }
        }
        
        
        TablaAdmin.setModel(modelTable);
        
        
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaAdmin;
    private javax.swing.JButton btnBorrarUser;
    private javax.swing.JButton btnCrearUser;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnRecargarTabla;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtFieldNombreUser;
    // End of variables declaration//GEN-END:variables

    
}
