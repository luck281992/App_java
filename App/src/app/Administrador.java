/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javax.swing.JOptionPane;

/**
 *
 * @author luck
 */
public class Administrador extends javax.swing.JFrame {

    String user,rol;
    Screensize pantalla = new Screensize();
    public Administrador(String usuario, String role) {
        user= usuario;
        rol=role;
        initComponents();
        
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        admin = new javax.swing.JMenu();
        usuario = new javax.swing.JMenuItem();
        mobiliario = new javax.swing.JMenuItem();
        provedores = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 89, Short.MAX_VALUE)
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.jpeg"))); // NOI18N

        admin.setText("Administracion");

        usuario.setText("Usuarios");
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        admin.add(usuario);

        mobiliario.setText("Mobiliarios");
        mobiliario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobiliarioActionPerformed(evt);
            }
        });
        admin.add(mobiliario);

        provedores.setText("Provedores");
        provedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provedoresActionPerformed(evt);
            }
        });
        admin.add(provedores);

        jMenuBar1.add(admin);

        jMenu2.setText("Movimientos");

        jMenuItem3.setText("inventario");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem7.setText("reporte de Movimientos");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem4.setText("Reparacion");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("login");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem6.setText("Log out");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(484, 484, 484)
                .addComponent(jLabel3))
            .addGroup(layout.createSequentialGroup()
                .addGap(444, 444, 444)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(36, 36, 36)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Inventario i = new Inventario(user,rol);
        i.setVisible(true);
        i.setBounds((pantalla.ancho / 2) - (i.getWidth() / 2), (pantalla.alto / 2) - (i.getHeight() / 2),i.getWidth(),i.getHeight());
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Login v = new Login();
        v.setVisible(true);
        v.setBounds((pantalla.ancho / 2) - (v.getWidth() / 2), (pantalla.alto / 2) - (v.getHeight() / 2), v.getWidth(), v.getHeight());
        this.dispose();
        JOptionPane.showMessageDialog(null, "Adios "+user);
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        ReporteMov r= new ReporteMov(user,rol);
        r.setVisible(true);
        r.setBounds((pantalla.ancho / 2) - (r.getWidth() / 2), (pantalla.alto / 2) - (r.getHeight() / 2),r.getWidth(), r.getHeight());
        this.dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void mobiliarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobiliarioActionPerformed
        Mobiliario m = new Mobiliario(user,rol);
        m.setVisible(true);
        m.setBounds((pantalla.ancho / 2) - (m.getWidth() / 2), (pantalla.alto / 2) - (m.getHeight() / 2),m.getWidth(), m.getHeight());
        this.dispose();
    }//GEN-LAST:event_mobiliarioActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Reparacion r = new Reparacion(user,rol);
        r.setVisible(true);
        r.setBounds((pantalla.ancho / 2) - (r.getWidth() / 2), (pantalla.alto / 2) - (r.getHeight() / 2),r.getWidth(), r.getHeight());
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void provedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provedoresActionPerformed
        Proveedor p = new Proveedor(user,rol);
        p.setVisible(true);
        p.setBounds((pantalla.ancho / 2) - (p.getWidth() / 2), (pantalla.alto / 2) - (p.getHeight() / 2),p.getWidth(), p.getHeight());
        this.dispose();
    }//GEN-LAST:event_provedoresActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed

        // TODO add your handling code here:
        Usuarios u = new Usuarios(user,rol);
        u.setVisible(true);
        u.setBounds((pantalla.ancho/2)-(u.getWidth()/2),(pantalla.alto / 2) - (u.getHeight() / 2), u.getWidth(),u.getWidth());
        this.dispose();

    }//GEN-LAST:event_usuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               // new Administrador(String usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu admin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem mobiliario;
    private javax.swing.JMenuItem provedores;
    private javax.swing.JMenuItem usuario;
    // End of variables declaration//GEN-END:variables
}
