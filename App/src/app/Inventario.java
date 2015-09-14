/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;

/**
 *
 * @author luck
 */
public class Inventario extends javax.swing.JFrame {

    String user,rol;
    Connection miConexion;
    String data[][]={};
    String cabecera[]={"Nombre","Descripcion","Existencia","Costo"};
    DefaultTableModel table1;
     JTable tabla ;
    Screensize pantalla = new Screensize();
    Mysqlconector conexion = new Mysqlconector();
    public Inventario(String usuario, String role){
      
            user=usuario;
            rol=role;
            initComponents();
            //Color JFrame
            this.getContentPane().setBackground(Color.lightGray);
            //creo una tabla no visible que tendremos todos los datos para pasarlos a excel
            table1= new DefaultTableModel(data,cabecera);
            tabla = new JTable(table1);           
            iniciar();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog = new javax.swing.JDialog();
        file = new javax.swing.JTextField();
        seleccionar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        nombre = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        inventario = new javax.swing.JEditorPane();
        exel = new javax.swing.JButton();

        file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileActionPerformed(evt);
            }
        });

        seleccionar.setText("Seleccionar archivo");
        seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarActionPerformed(evt);
            }
        });

        guardar.setText("save");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialogLayout = new javax.swing.GroupLayout(jDialog.getContentPane());
        jDialog.getContentPane().setLayout(jDialogLayout);
        jDialogLayout.setHorizontalGroup(
            jDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogLayout.createSequentialGroup()
                        .addComponent(file, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogLayout.createSequentialGroup()
                        .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)))
                .addComponent(seleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jDialogLayout.setVerticalGroup(
            jDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seleccionar)
                    .addComponent(file, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(897, 25, 148, 38));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresa_01.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 586, 71, 42));

        jScrollPane1.setViewportView(inventario);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 889, 484));

        exel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/excel.gif"))); // NOI18N
        exel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exelActionPerformed(evt);
            }
        });
        getContentPane().add(exel, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 586, -1, 43));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void iniciar(){
        try {
             miConexion = conexion.Connection().getConnection();
            String query="SELECT nombre,descripcion,existencia,costo FROM producto WHERE status='A' ";
            String querytotal="SELECT IFNULL(TRUNCATE(SUM(costo),2),0) AS total FROM producto WHERE STATUS='A' ";
            
            Statement st = miConexion.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            Statement st2 = miConexion.createStatement();
            ResultSet rs2 = st2.executeQuery(querytotal);
            
            
            // add an html editor kit
            HTMLEditorKit kit = new HTMLEditorKit();
            this.inventario.setEditorKit(kit);
            
            // add some styles to the html
            StyleSheet styleSheet = kit.getStyleSheet();
            styleSheet.addRule("body {color:#000; font-family:times;margin: 20px;  }");
            styleSheet.addRule("h1 {color: blue; margin-left 20px}");
            styleSheet.addRule("table {color: #ff0000; margin-top: 20px;}");
            styleSheet.addRule("td {color: black; font-family:times; margin: 10px; font: 14}");
            styleSheet.addRule("h3 {color: red;  }");
            
            
            String lista="";
            int cont=0;
           
            // create some simple html as a string
            String htmlString = "<html>\n"
                    + "<body>\n"
                    + "<h1>Inventario de Mobiliario!</h1>\n"
                    + "<table>\n"
                    + "<tr>\n"
                    + "<td><h3>Numero</h3></td>\n"
                    + "<td><h3>Nombre</h3</td>\n"
                    + "<td><h3>Descripcion</h3></td>\n"
                    + "<td><h3>Existencia</h3></td>\n"
                    + "<td><h3>Costo</h3></td>\n"
                    + "</tr>\n";
            
            //ciclo con registros de la base de datos
            while(rs.next()){
                cont++;
                lista += "<tr>\n";
                lista += "<td>\n";
                lista += cont+"\n";
                lista += "</td>\n";
                lista += "<td>\n";
                lista += rs.getString("nombre")+"\n";
                lista += "</td>\n";
                lista += "<td>\n";
                lista += rs.getString("descripcion")+"\n";
                lista += "</td>\n";
                lista += "<td>\n";
                lista += rs.getString("existencia")+"\n";
                lista += "</td>\n";
                lista += "<td>\n";
                lista += rs.getString("costo")+"\n";
                lista += "</td>\n";
                lista += "</tr>\n";
                String datos[]={rs.getString("nombre"),rs.getString("descripcion"),rs.getString("existencia"),rs.getString("costo")};
                table1.addRow(datos);
            }
         
            //total
            htmlString+=lista;
            htmlString +="<tr>\n"
                    +"<td></td>\n"
                    +"<td></td>\n"
                    +"<td></td>\n"
                    +"<td><h2>Total</h2></td>\n";
            if(rs2.next()){
               htmlString+="<td>\n";
               htmlString+=rs2.getString("total")+"\n";
               htmlString+="</td>\n";
               String datos[]={"","","Total:",rs2.getString("total")};
               table1.addRow(datos);
            }
               htmlString+="</tr>\n"
                    
                    +"</table>\n"
                    
                    + "</body>\n"
                    + "</html>";
            
            // create a document, set it on the jeditorpane, then add the html
            Document doc = kit.createDefaultDocument();
            this.inventario.setDocument(doc);
            this.inventario.setText(htmlString);
            this.inventario.setEditable(false);
        
        } catch (SQLException ex) {
             Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
           Mysqlconector.liberaConexion(miConexion);
        }
        
 }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         Administrador a = new Administrador(user,rol);
         a.setVisible(true);
          a.setBounds((pantalla.ancho / 2) - (a.getWidth() / 2), (pantalla.alto / 2) - (a.getHeight() / 2),a.getWidth(),a.getHeight());
         this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
         try {      	 
           List<JTable> tb = new ArrayList<>();
           tb.add(tabla);
           
           //-------------------
           ExportaExcel excelExporter = new ExportaExcel(tb, new File(file.getText()+".xls"));
           if (excelExporter.export()) {
               JOptionPane.showMessageDialog(null, "DATOS EXPORTADOS CON EXITOS!");
           }
       } catch (Exception ex) {
                Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
       }
         llama_excel();
         jDialog.dispose();
    }//GEN-LAST:event_guardarActionPerformed

    private void seleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarActionPerformed
        // TODO add your handling code here:
         JFileChooser dialog = new JFileChooser();
        int opcion = dialog.showSaveDialog(this);

        if(opcion == JFileChooser.APPROVE_OPTION){

            File dir = dialog.getSelectedFile();
            String fl = dir.toString();

            this.file.setText(fl);
        }
    }//GEN-LAST:event_seleccionarActionPerformed

    private void exelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exelActionPerformed
        // TODO add your handling code here:
        llamarJDialogExcel();
    }//GEN-LAST:event_exelActionPerformed

    private void fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_fileActionPerformed

    public void llama_excel()
	 {
		 try {
				Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+file.getText()+".xls");
				} catch (Exception e) {
				// TODO Auto-generated catch block
				        Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, e);
				}
	 }
    
    private void llamarJDialogExcel() {

        //Centramos nuestro jDialog
        jDialog.setLocationRelativeTo(this);
        //La hacemos modal
        jDialog.setModal(true);
        //Establecemos dimensiones.
        jDialog.setMinimumSize(new Dimension(500, 160));
        //Establecemos un título para el jDialog
        jDialog.setTitle("Imprimir en Excel");
        //La hacemos visible.
        jDialog.setVisible(true);
    }

    
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
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               // new Inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exel;
    private javax.swing.JTextField file;
    private javax.swing.JButton guardar;
    private javax.swing.JEditorPane inventario;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombre;
    private javax.swing.JButton seleccionar;
    // End of variables declaration//GEN-END:variables
}
