/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.awt.Color;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luck
 */
public class Usuarios extends javax.swing.JFrame {
    String data[][]={};
    String cabecera[]={"Nombre","Edad","Domicilio","Username","Role","Email"};
    String user,rol;
    DefaultTableModel table;
    Connection miConexion;
    int iduser;
    Screensize pantalla = new Screensize();
    Mysqlconector conexion =new  Mysqlconector();
    public Usuarios(String Usuario,String role){
            
            user=Usuario;
            rol=role;
            initComponents();
            this.getContentPane().setBackground(Color.lightGray);
            table= new DefaultTableModel(data,cabecera);
            tabla.setModel(table);
            this.role.removeAllItems();
            this.role.addItem("administrador");
            this.role.addItem("otros");
        //restricciones para usuarios que no sean el admin
        if(role.equals("administrador")){
            try { 
               miConexion = conexion.Connection().getConnection();
               String query ="SELECT nombre,edad,domicilio,username,role,email FROM users WHERE status='A'";         
               // create the java statement
               Statement st = miConexion.createStatement();
               ResultSet rs = st.executeQuery(query);
               //checamos que haya usuarios correctos       
               int cont=0;
               while(rs.next()){
                   String datos[]={rs.getString("nombre"),rs.getString("edad"),rs.getString("domicilio"),rs.getString("username"),rs.getString("role"),rs.getString("email")};
                   table.addRow(datos);
                   // cont++;
               }
         
            } catch (SQLException ex) {
                Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally{
               Mysqlconector.liberaConexion(miConexion);
            }
        }else{
            this.eliminar.setEnabled(false);
            this.editar.setEnabled(false);
            this.tabla.setEnabled(false); 
            this.bus.setEnabled(false);
            this.save.setEnabled(false);
            this.nombre.setEnabled(false);
            this.domicilio.setEnabled(false);
            this.email.setEnabled(false);
            this.edad.setEnabled(false);
            this.username.setEnabled(false);
            this.role.setEnabled(false);
            this.busqueda.setEnabled(false);
            this.nuevo.setEnabled(false);
            this.password.setEnabled(false);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        guardarpass = new javax.swing.JButton();
        newpass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        edad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        domicilio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        nuevo = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        save = new javax.swing.JButton();
        busqueda = new javax.swing.JTextField();
        bus = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        role = new javax.swing.JComboBox();
        generarpass = new javax.swing.JButton();

        jDialog.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("ingrese su nueva contraseña");
        jLabel9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel9KeyTyped(evt);
            }
        });
        jDialog.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 210, 30));

        guardarpass.setText("Save");
        guardarpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarpassActionPerformed(evt);
            }
        });
        jDialog.getContentPane().add(guardarpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 80, -1));
        jDialog.getContentPane().add(newpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 200, 20));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 25, 82, 20));

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 24, 203, -1));

        jLabel2.setText("Edad:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 24, 49, 20));

        edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadActionPerformed(evt);
            }
        });
        edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edadKeyTyped(evt);
            }
        });
        getContentPane().add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 24, 66, -1));

        jLabel3.setText("Domicilio:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 74, -1, 26));

        domicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                domicilioKeyTyped(evt);
            }
        });
        getContentPane().add(domicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 73, 252, -1));

        jLabel4.setText("Username:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 128, -1, 20));

        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usernameKeyTyped(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 128, 162, -1));

        jLabel5.setText("Password:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 128, -1, 20));

        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordKeyTyped(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 128, 166, -1));

        jLabel6.setText("Role:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 46, 20));

        nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });
        getContentPane().add(nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 287, 74, -1));

        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });
        getContentPane().add(editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 385, 74, 44));

        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 472, 74, 43));

        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, 60, 46));

        busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaActionPerformed(evt);
            }
        });
        getContentPane().add(busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 215, 184, -1));

        bus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.jpeg"))); // NOI18N
        bus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busActionPerformed(evt);
            }
        });
        getContentPane().add(bus, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 80, 50));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresa_01.jpg"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 562, 74, 47));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "Domicilio", "Username", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 261, 637, 370));

        jLabel7.setText("Multibusqueda");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 180, 132, -1));

        jLabel8.setText("Email");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 73, -1, 20));

        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailKeyTyped(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 73, 213, -1));

        role.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 190, -1));

        generarpass.setText("Change password");
        generarpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarpassActionPerformed(evt);
            }
        });
        getContentPane().add(generarpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 170, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
            // TODO add your handling code here:
            Administrador a = new Administrador(user,rol);
            a.setVisible(true);
            a.setBounds((pantalla.ancho / 2) - (a.getWidth() / 2), (pantalla.alto / 2) - (a.getHeight() / 2), a.getWidth(), a.getHeight());
            this.dispose();
         
    }//GEN-LAST:event_jButton6ActionPerformed
   
    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        this.password.setEnabled(false);
        if(rol.equals("administrador")){
                   int filasele=tabla.getSelectedRow();       
                   this.nombre.setText(tabla.getValueAt(filasele, 0).toString());
                   this.edad.setText(tabla.getValueAt(filasele, 1).toString());
                   this.domicilio.setText(tabla.getValueAt(filasele, 2).toString());
                   this.username.setText(tabla.getValueAt(filasele, 3).toString());
                   this.role.setSelectedItem(tabla.getValueAt(filasele, 4).toString());
                   this.email.setText(tabla.getValueAt(filasele, 5).toString());
               try {
                   iduser=0;
                   // TODO add your handling code here:
                    miConexion = conexion.Connection().getConnection();
                   String query ="SELECT id FROM users WHERE nombre= '"+this.nombre.getText()+"' "
                           + "AND username='"+this.username.getText()+"' AND email='"+this.email.getText()+"' ";
                   // create the java statement
                 
                   Statement st = miConexion.createStatement();
                   ResultSet rs = st.executeQuery(query);

                   if(rs.next()){
                       iduser=Integer.parseInt(rs.getString("id"));
                   }             
               } catch (SQLException ex) {
                    Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
                finally{
                   Mysqlconector.liberaConexion(miConexion);
                }
        }
      
    }//GEN-LAST:event_tablaMouseClicked

    private void busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busquedaActionPerformed
      public void LimpiarJTable(){
        int a =table.getRowCount()-1;  //Índices van de 0 a n-1
        //System.out.println("Tabla "+a);   //Para mostrar por consola el resultado
        for(int i=a;i>=0;i--){ 

            //System.out.println("i "+i);    //Para mostrar por consola el resultado
            table.removeRow(i);
        }
   }
    private void busActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busActionPerformed
        limpiarcampos();
        LimpiarJTable();      
        try {
            
            // TODO add your handling code here:
            miConexion = conexion.Connection().getConnection();
            String query ="SELECT nombre,edad,domicilio,username,role,email FROM users WHERE status='A' AND (nombre LIKE '%"+this.busqueda.getText()+"%' "
                    + "OR edad LIKE '%"+this.busqueda.getText()+"%' OR domicilio LIKE '%"+this.busqueda.getText()+"%' "
                    + "OR username LIKE '%"+this.busqueda.getText()+"%' OR role LIKE '%"+this.busqueda.getText()+"%' OR email LIKE '%"+this.busqueda.getText()+"%')";
         
            // create the java statement
            Statement st = miConexion.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next()){
                String datos[]={rs.getString("nombre"),rs.getString("edad"),rs.getString("domicilio"),rs.getString("username"),rs.getString("role"),rs.getString("email")};
                table.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
           Mysqlconector.liberaConexion(miConexion);
        }
     
    }//GEN-LAST:event_busActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
      //Saber si eligio usuario y es update
        int fila = tabla.getSelectedRow();
            if(fila==-1){
                  JOptionPane.showMessageDialog(null,"Seleccione Usuario a Modificar e intentelo de nuevo correctamente'","Error Guardar",JOptionPane.ERROR_MESSAGE);
                return;
            }
             int id,eda=0;
            //validaciones
             if(!edad.getText().equals("")){
                eda=Integer.parseInt(edad.getText());
             }
             if(nombre.getText().equals("")||username.getText().equals("")||email.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Error algunos datos son necesarios favor de ingresarlos","Error guardar",JOptionPane.ERROR_MESSAGE);            
                        return;
             }
             //email
             if(!Validaciones.validateEmail(email.getText())){
                        JOptionPane.showMessageDialog(null,"Email no valido ingresar correctamente","Error guardar",JOptionPane.ERROR_MESSAGE);            
                        return;
             }
             //username
             if(Validaciones.validateUsername(username.getText())==1){
                       JOptionPane.showMessageDialog(null,"Longitud minima de 6 ","Error Username",JOptionPane.ERROR_MESSAGE);
                        return;
             }
             if(Validaciones.validateUsername(username.getText())==2){
                        JOptionPane.showMessageDialog(null,"Longitud maxima de 20 ","Error Username",JOptionPane.ERROR_MESSAGE);
                        return;
             }
            
             int mensaje=JOptionPane.showConfirmDialog(null,"Estas seguro que deseas Modificar este usuario?");
             if(mensaje==JOptionPane.YES_OPTION){           
                 try {
                 miConexion = conexion.Connection().getConnection();
                     //actualizar o modificar elregistro seleccionado
                      String queryupdate="UPDATE users SET nombre='"+this.nombre.getText()+"',domicilio='"+this.domicilio.getText()+"',"
                              + "edad='"+eda+"',username='"+this.username.getText()+"',role='"+this.role.getSelectedItem()
                              +"',email='"+this.email.getText()+"' WHERE id="+iduser+"";  
                      //executar el query

                      Statement st = miConexion.createStatement();
                      int cant = st.executeUpdate(queryupdate);

                      if (cant==1){
                          JOptionPane.showMessageDialog(null,"Se ha modificado correctamente");
                          limpiarcampos();
                          actualizar();
                      }else{
                           JOptionPane.showMessageDialog(null,"No se encontro Usuario intente de nuevo correctamente'","Error update",JOptionPane.ERROR_MESSAGE);
                      }
                  
                } catch (SQLException ex) {
                    Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
                finally{
                  Mysqlconector.liberaConexion(miConexion);
                } 
            }
    }//GEN-LAST:event_editarActionPerformed
  
    private int obtenerid(){
        int id=0;
       
            String query="SELECT id FROM users";
        try {
          
            Statement st = miConexion.createStatement();
            ResultSet rs = st.executeQuery(query);
          //while(rs.next()){  
            if(rs.last()){
               id=Integer.parseInt(rs.getString("id"));
            }
         } catch (SQLException ex) {
                    Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
               
        return id;
    }
    
    private void limpiarcampos(){
        this.password.setEnabled(true);
        this.nombre.setText("");
        this.domicilio.setText("");
        this.edad.setText("");
        this.username.setText("");
        this.email.setText("");
    }
    private void actualizar(){
        
        LimpiarJTable();
       
            String query="SELECT nombre,edad,domicilio,username,role,email FROM users WHERE status='A' ";
        try {
            
            Statement st = miConexion.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                String datos[]={rs.getString("nombre"),rs.getString("edad"),rs.getString("domicilio"),rs.getString("username"),rs.getString("role"),rs.getString("email")};
                table.addRow(datos);
            }
        
         } catch (SQLException ex) {
                    Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
                
    }
    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        // TODO add your handling code here:
        //para saber que se agregara un nuevo Usuario
        tabla.clearSelection();
        limpiarcampos();
    }//GEN-LAST:event_nuevoActionPerformed
    
    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        int id,eda =0;
        //para evitar error que eligan editar en vez de guardar uno nuevo
        String pass = new String(password.getPassword()); 
        if(!edad.getText().equals(""))
         eda=Integer.parseInt(edad.getText());
        int fila = tabla.getSelectedRow();
            if(fila!=-1){
                  JOptionPane.showMessageDialog(null,"Seleccione un nuevo Usuario e intentelo de nuevo correctamente'","Error Guardar",JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(nombre.getText().equals("")||username.getText().equals("")||pass.equals("")||email.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Error algunos datos son necesarios favor de ingresarlos","Error guardar",JOptionPane.ERROR_MESSAGE);            
                return;
            }
            //email
            if(!Validaciones.validateEmail(email.getText())){
                    JOptionPane.showMessageDialog(null,"Email no valido ingresar correctamente","Error guardar",JOptionPane.ERROR_MESSAGE);            
                    return;
                }
            //username
            if(Validaciones.validateUsername(username.getText())==1){
                   JOptionPane.showMessageDialog(null,"Longitud minima de 6 ","Error Username",JOptionPane.ERROR_MESSAGE);
                    return;
            }
            if(Validaciones.validateUsername(username.getText())==2){
                    JOptionPane.showMessageDialog(null,"Longitud maxima de 30 ","Error Username",JOptionPane.ERROR_MESSAGE);
                    return;
            }
             if(!Validaciones.valiUsername(username.getText())){
                    JOptionPane.showMessageDialog(null,"Username no valido ingresar correctamente","Error Username",JOptionPane.ERROR_MESSAGE);
                    return;
            }
            //password
            if(Validaciones.validatePassword(pass)==1){
                   JOptionPane.showMessageDialog(null,"Longitud minima de 8 caracteres","Error Password",JOptionPane.ERROR_MESSAGE);
                   return;
            } 
            if(Validaciones.validatePassword(pass)==2){
                   JOptionPane.showMessageDialog(null,"Longitud maxima de 30 caracteres","Error Password",JOptionPane.ERROR_MESSAGE);
                   return;
            }
            //evitar usuarios repetidos
            
                 try{
                    miConexion = conexion.Connection().getConnection();
                    String query="SELECT nombre FROM users WHERE username='"+username.getText()+"' AND email='"+email.getText()+"'";
       
                    Statement sta = miConexion.createStatement();
                    ResultSet resul = sta.executeQuery(query);
                  //while(rs.next()){  
                    if(resul.next()){
                       JOptionPane.showMessageDialog(null,"Error este usuario ya esta registrado","Error guardar",JOptionPane.ERROR_MESSAGE);
                    }else{
                            id=obtenerid();
                            id=id+1;
                            String queryinsert="INSERT INTO users (id,nombre,domicilio,edad,username,password,role,email,status) "
                                    + " VALUES ('"+id+"','"+this.nombre.getText()+"','"+this.domicilio.getText()+"','"+eda+"'"
                                    + ",'"+this.username.getText()+"',md5('"+pass+"'),'"+this.role.getSelectedItem()+"','"+this.email.getText()+"','A')";
                            
                            Statement st = miConexion.createStatement();
                            int cont = st.executeUpdate(queryinsert);

                            if(cont==1){
                                JOptionPane.showMessageDialog(null,"El usuario se ha guardado correctamente");
                                limpiarcampos();
                                actualizar();
                            }else{
                                JOptionPane.showMessageDialog(null,"Error al intentar guardar intentelo de nuevo","Error guardar",JOptionPane.ERROR_MESSAGE);
                            }
                       }
                     
                } catch (SQLException ex) {
                    Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
                finally{
                   Mysqlconector.liberaConexion(miConexion);
                }
        
    }//GEN-LAST:event_saveActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
      int fila = tabla.getSelectedRow();
            if(fila==-1){
                  JOptionPane.showMessageDialog(null,"Seleccione Usuario a Eliminar e intentelo de nuevo correctamente'","Error Guardar",JOptionPane.ERROR_MESSAGE);
                return;
            }
                int mensaje=JOptionPane.showConfirmDialog(null,"Estas seguro que deseas eliminar este usuario?");
               if(mensaje==JOptionPane.YES_OPTION){
                        try {
                            // TODO add your handling code here:
                            miConexion = conexion.Connection().getConnection();
                            String queryDelete="UPDATE users SET status='B' WHERE id='"+iduser+"' ";

                            Statement st = miConexion.createStatement();
                            int cant = st.executeUpdate(queryDelete);
                            if(cant==1){
                                 JOptionPane.showMessageDialog(null,"Se ha eliminado Usuario correctamente");
                                 limpiarcampos();
                                 actualizar();
                            }else{
                                 JOptionPane.showMessageDialog(null,"No se encontro Usuario intente de nuevo correctamente'","Error Delete",JOptionPane.ERROR_MESSAGE);
                            }
                        
                        } catch (SQLException ex) {
                            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        finally{
                           Mysqlconector.liberaConexion(miConexion);
                        }
                }
    }//GEN-LAST:event_eliminarActionPerformed

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        // TODO add your handling code here:
          char c=evt.getKeyChar();
          String cadena= this.nombre.getText();
          if(cadena.length()>99) {
             
              evt.consume();
              
              JOptionPane.showMessageDialog(null,"Longitud maxima de 100 caracteres","Error Validacion",JOptionPane.ERROR_MESSAGE);
              
          }
        
          if(Character.isDigit(c)) {
              getToolkit().beep();              
              evt.consume();    
              nombre.setCursor(null);
              JOptionPane.showMessageDialog(null,"Ingresa Solo Letras","Error Validacion",JOptionPane.ERROR_MESSAGE);         
          }
          else if(c>32 && c<=47||c>=58 && c<=64|| c>=91 && c<=96|| c>=123 && c<=255)
           {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(this, "Ingrese solo Letras","Error Validacion",JOptionPane.ERROR_MESSAGE);
                nombre.setCursor(null);
           }
    }//GEN-LAST:event_nombreKeyTyped

    private void edadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edadKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        String cadena=this.edad.getText();    
          if(cadena.length()>2) {             
              evt.consume();             
              JOptionPane.showMessageDialog(null,"Longitud maxima de 3 digitos","Error Validacion",JOptionPane.ERROR_MESSAGE);
              
          }
          if(Character.isLetter(c))
            {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(this, "Ingrese solo numeros","Error Validacion",JOptionPane.ERROR_MESSAGE);
                edad.setCursor(null);
            }
            else if(c>32 && c<=47||c>=58 && c<=64|| c>=91 && c<=96|| c>=123 && c<=255)
           {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(this, "Ingrese solo numeros","Error Validacion",JOptionPane.ERROR_MESSAGE);
                edad.setCursor(null);
            }
          
    }//GEN-LAST:event_edadKeyTyped

    private void domicilioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_domicilioKeyTyped
        // TODO add your handling code here:
       char c=evt.getKeyChar();
        String cadena=this.domicilio.getText();    
          if(cadena.length()>99) {            
              evt.consume();             
              JOptionPane.showMessageDialog(null,"Longitud maxima de 100 caracteres","Error Validacion",JOptionPane.ERROR_MESSAGE);
             
          }
    }//GEN-LAST:event_domicilioKeyTyped

    private void edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadActionPerformed

    private void usernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();  
        if(c>32 && c<=47||c>=58 && c<=64|| c>=91 && c<=96|| c>=123 && c<=255){
            if(c==46||c==95){
            }else{
                evt.consume();
                username.setCursor(null);
                JOptionPane.showMessageDialog(null,"Ingresa Numeros, Letras y algunos caracteres especiales (.,_)","Error Validacion",JOptionPane.ERROR_MESSAGE);      
            }
                
        }
    }//GEN-LAST:event_usernameKeyTyped

    private void emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
        String cadena=this.email.getText();    
          if(cadena.length()>49) {             
              evt.consume();            
              JOptionPane.showMessageDialog(null,"Longitud maxima de 50 caracteres","Error Validacion",JOptionPane.ERROR_MESSAGE);
              
          }
    }//GEN-LAST:event_emailKeyTyped

    private void passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(c>32 &&c<=47||c>=58 && c<=64|| c>=91 && c<=96||c>=123 && c<=255){
            evt.consume();
            JOptionPane.showMessageDialog(null,"Ingresa Numeros y Letras sin carateres especiales","Error Validacion",JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_passwordKeyTyped

    private void generarpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarpassActionPerformed
        // TODO add your handling code here:
        jDialog.setLocationRelativeTo(this);
        //La hacemos modal
        jDialog.setModal(true);
        //Establecemos dimensiones.
        jDialog.setMinimumSize(new Dimension(500, 200));
        //Establecemos un título para el jDialog
        jDialog.setTitle("Contraseña");
        //La hacemos visible.
        jDialog.setVisible(true);
    }//GEN-LAST:event_generarpassActionPerformed

    private void guardarpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarpassActionPerformed
        // TODO add your handling code here:
        //password
        String newpas = new String(newpass.getPassword());
            if(newpas.equals("")){
               JOptionPane.showMessageDialog(null,"Ingresar datos necesarios","Error Password",JOptionPane.ERROR_MESSAGE);
               return;
            }
            if(Validaciones.validatePassword(newpas)==1){
                   JOptionPane.showMessageDialog(null,"Longitud minima de 8 caracteres","Error Password",JOptionPane.ERROR_MESSAGE);
                   return;
            } 
            if(Validaciones.validatePassword(newpas)==2){
                   JOptionPane.showMessageDialog(null,"Longitud maxima de 30 caracteres","Error Password",JOptionPane.ERROR_MESSAGE);
                   return;
            }
            
        try {
            miConexion = conexion.Connection().getConnection();
            String query="UPDATE users SET password =md5('"+newpas+"') WHERE username='"+user+"' ";
            
            Statement st = miConexion.createStatement();
            int cant = st.executeUpdate(query);
            if(cant >0){
                  JOptionPane.showMessageDialog(null,"Su contraseña ha sido cambiada");
                  jDialog.dispose();
            }else
                  JOptionPane.showMessageDialog(null,"Error al Cambiar contraseña intentelo de nuevo","Error Password",JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
            

            
    }//GEN-LAST:event_guardarpassActionPerformed

    private void jLabel9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel9KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9KeyTyped

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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
              //  new Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bus;
    private javax.swing.JTextField busqueda;
    private javax.swing.JTextField domicilio;
    private javax.swing.JTextField edad;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField email;
    private javax.swing.JButton generarpass;
    private javax.swing.JButton guardarpass;
    private javax.swing.JButton jButton6;
    private javax.swing.JDialog jDialog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField newpass;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton nuevo;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox role;
    private javax.swing.JButton save;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
