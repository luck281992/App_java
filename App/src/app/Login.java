package app;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author luck
 */
public class Login extends javax.swing.JFrame {
   Connection miConexion;
   Screensize pantalla = new Screensize();
   Mysqlconector conexion =new  Mysqlconector();
    public Login() {
       try {
           miConexion = conexion.Connection().getConnection();
           initComponents();
       } catch (SQLException ex) {
           Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
       }
       finally{
         Mysqlconector.liberaConexion(miConexion);
       }
             
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel5 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        Enviar = new javax.swing.JButton();
        jFrame2 = new javax.swing.JFrame();
        nomb = new javax.swing.JLabel();
        RegNomb = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        RegDomi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        RegEdad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        RegEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        RegUsername = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        RegPass = new javax.swing.JPasswordField();
        RegSave = new javax.swing.JButton();
        user = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passw = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        jLabel5.setText("Email");

        Enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/email.jpg"))); // NOI18N
        Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                        .addComponent(Enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(Enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        nomb.setText("Nombre: ");

        RegNomb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RegNombKeyTyped(evt);
            }
        });

        jLabel6.setText("Domicilio: ");

        RegDomi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RegDomiKeyTyped(evt);
            }
        });

        jLabel7.setText("Edad:");

        RegEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RegEdadKeyTyped(evt);
            }
        });

        jLabel8.setText("Email: ");

        RegEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RegEmailKeyTyped(evt);
            }
        });

        jLabel9.setText("Username: ");

        RegUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RegUsernameKeyTyped(evt);
            }
        });

        jLabel10.setText("Password: ");

        RegPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RegPassKeyTyped(evt);
            }
        });

        RegSave.setText("Save");
        RegSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame2Layout.createSequentialGroup()
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jFrame2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(RegSave, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jFrame2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFrame2Layout.createSequentialGroup()
                                .addComponent(nomb)
                                .addGap(26, 26, 26)
                                .addComponent(RegNomb, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jFrame2Layout.createSequentialGroup()
                                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jFrame2Layout.createSequentialGroup()
                                        .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(RegEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(RegUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                        .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jFrame2Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(18, 18, 18)
                                                .addComponent(RegEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jFrame2Layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(18, 18, 18)
                                                .addComponent(RegPass, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jFrame2Layout.createSequentialGroup()
                                        .addComponent(RegDomi, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGap(63, 63, 63))
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomb)
                    .addComponent(RegNomb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(RegDomi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(RegEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RegEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(RegUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RegPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(RegSave)
                .addGap(24, 24, 24))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 135, 164, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrada.gif"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 98, 89));

        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 135, -1, 20));

        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 181, 82, 20));
        getContentPane().add(passw, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 181, 164, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 103, 89));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logi.jpeg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 108));

        jLabel4.setText("Olvide mi password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jButton3.setText("New password");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 140, -1));

        jButton6.setText("Registrarse");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 130, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String pass = new String(this.passw.getPassword());
       if(user.getText().equals("")||pass.equals("")){
           JOptionPane.showMessageDialog(null, "Ingresar datos necesarios","Error Login",JOptionPane.ERROR_MESSAGE);
           return;
       }
       try {
           // TODO add your handling code here:
           miConexion = conexion.Connection().getConnection();
           String query ="SELECT username,password,role FROM users WHERE username='"+this.user.getText()+"' AND password=md5('"+pass+"') ";
           
           // create the java statement
           Statement st = miConexion.createStatement();
           ResultSet rs = st.executeQuery(query);
           //checamos que haya usuarios correctos
           if(rs.next()){
               Administrador a = new Administrador(rs.getString("username"),rs.getString("role"));
               a.setVisible(true);
               a.setBounds((pantalla.ancho / 2) - (a.getWidth() / 2), (pantalla.alto / 2) - (a.getHeight() / 2),a.getWidth(),a.getHeight());
               this.dispose();
               if(rs.getString("role").equals("administrador"))
                   JOptionPane.showMessageDialog(null,"Bienvenido Administrador "+rs.getString("username"));
               else
                   JOptionPane.showMessageDialog(null,"Bienvenido "+rs.getString("username"));
           }else{
               JOptionPane.showMessageDialog(null,"Usuario o Contraseña invalidos");
           }
       } catch (SQLException ex) {
           Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
       }
        finally{
            Mysqlconector.liberaConexion(miConexion);
        }
    
        
       
    }//GEN-LAST:event_jButton1ActionPerformed
 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 
           // TODO add your handling code here:
           System.exit(0);
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
      
        //Centramos nuestro jDialog
        jFrame1.setLocationRelativeTo(this);
        //La hacemos modal
        //Establecemos dimensiones.
        jFrame1.setMinimumSize(new Dimension(393, 190));
        //Establecemos un título para el jDialog
        jFrame1.setTitle("Generar nueva contraseña");
        //La hacemos visible.
        jFrame1.setVisible(true);
   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarActionPerformed
       
           // TODO add your handling code here:
       if(this.email.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese datos necesarios","ERROR NEW PASSWORD",JOptionPane.ERROR_MESSAGE);
            return;
          }
        if(!Validaciones.validateEmail(this.email.getText())){
            JOptionPane.showMessageDialog(null, "Email no valido ingreselo conrrectamente","ERROR NEW PASSWORD",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            miConexion = conexion.Connection().getConnection();
           String query="SELECT id FROM users WHERE email='"+this.email.getText()+"'";
           Statement st = miConexion.createStatement();
           ResultSet rs = st.executeQuery(query);

           if(rs.next()){
               //modificar contraseña del usuario y enviarle el correo con su nueva contraseña
               String pass = PasswordGenerator.getPassword();
               String queryupdate="UPDATE users SET password=md5('"+pass+"') WHERE id='"+rs.getString("id")+"'";
               //enviar email
                   String username= "guerrero28.1992@gmail.com";
                   String password= "1357642I";
                   String to =rs.getString("email");;
                   String subject ="Nueva Contraseña";
                   String Mensaje ="Buenos dias \n"+
                           "Su nueva contraseña es: "+ pass+" \n"+
                           "Gracias por usar este Software";
                   
               if(!Email(username,password,to,subject,Mensaje)){
                     JOptionPane.showMessageDialog(this, "Error al enviar Email","Error Correo",JOptionPane.ERROR_MESSAGE);
                     return;
               }
               Statement st2 = miConexion.createStatement();
               int cantidad = st2.executeUpdate(queryupdate);
               if(cantidad > 0){
                   JOptionPane.showMessageDialog(this, "Se ha enviado un mensaje a su email con su nueva contraseña");
                   jFrame1.dispose();
               }else{
                   JOptionPane.showMessageDialog(null, "Error al cambiar contraseña","ERROR NEW PASSWORD",JOptionPane.ERROR_MESSAGE);
               }
           }else
               JOptionPane.showMessageDialog(null, "Error no existe usuario con ese email","ERROR NEW PASSWORD",JOptionPane.ERROR_MESSAGE);
       } catch (SQLException ex) {
           Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
       }
       finally{
            Mysqlconector.liberaConexion(miConexion);
        }
        
         

    }//GEN-LAST:event_EnviarActionPerformed

    private void RegSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegSaveActionPerformed
        String pass = new String(RegPass.getPassword()); 
        int eda=0;
        if(!RegEdad.getText().equals(""))
         eda=Integer.parseInt(RegEdad.getText());
        
        if(RegNomb.getText().equals("")||RegUsername.getText().equals("")||pass.equals("")||RegEmail.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Error algunos datos son necesarios favor de ingresarlos","Error guardar",JOptionPane.ERROR_MESSAGE);            
                return;
            }
            //email
            if(!Validaciones.validateEmail(RegEmail.getText())){
                    JOptionPane.showMessageDialog(null,"Email no valido ingresar correctamente","Error guardar",JOptionPane.ERROR_MESSAGE);            
                    return;
                }
            //username
            if(Validaciones.validateUsername(RegUsername.getText())==1){
                   JOptionPane.showMessageDialog(null,"Longitud minima de 6 ","Error Username",JOptionPane.ERROR_MESSAGE);
                    return;
            }
            if(Validaciones.validateUsername(RegUsername.getText())==2){
                    JOptionPane.showMessageDialog(null,"Longitud maxima de 30 ","Error Username",JOptionPane.ERROR_MESSAGE);
                    return;
            }
            if(!Validaciones.valiUsername(RegUsername.getText())){
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
                    String query="SELECT nombre FROM users WHERE username='"+RegUsername.getText()+"' AND email='"+RegEmail.getText()+"' AND status='A' ";
       
                    Statement sta = miConexion.createStatement();
                    ResultSet resul = sta.executeQuery(query);
                  //while(rs.next()){  
                    if(resul.next()){
                       JOptionPane.showMessageDialog(null,"Error este usuario ya esta registrado","Error guardar",JOptionPane.ERROR_MESSAGE);
                    }else{                          
                            String queryinsert="INSERT INTO users (nombre,domicilio,edad,username,password,role,email,status) "
                                    + " VALUES ('"+RegNomb.getText()+"','"+RegDomi.getText()+"','"+eda+"'"
                                    + ",'"+RegUsername.getText()+"',md5('"+pass+"'),'otros','"+RegEmail.getText()+"','A')";
                            
                            Statement st = miConexion.createStatement();
                            int cont = st.executeUpdate(queryinsert);

                            if(cont==1){
                                JOptionPane.showMessageDialog(null,"El usuario se ha guardado correctamente");                               
                                jFrame2.dispose();
                            }else
                                JOptionPane.showMessageDialog(null,"Error al intentar guardar intentelo de nuevo","Error guardar",JOptionPane.ERROR_MESSAGE);
                            
                       }
                     
                } catch (SQLException ex) {
                    Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
                finally{
                   Mysqlconector.liberaConexion(miConexion);
                }
    }//GEN-LAST:event_RegSaveActionPerformed

    private void RegNombKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RegNombKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
          String cadena= this.RegNomb.getText();
          if(cadena.length()>99) {
             
              evt.consume();
              
              JOptionPane.showMessageDialog(null,"Longitud maxima de 100 caracteres","Error Validacion",JOptionPane.ERROR_MESSAGE);
              
          }
        
          if(Character.isDigit(c)) {
              getToolkit().beep();              
              evt.consume();              
              JOptionPane.showMessageDialog(null,"Ingresa Solo Letras","Error Validacion",JOptionPane.ERROR_MESSAGE);         
              RegNomb.setCursor(null);
          }
          else if(c>32 && c<=47||c>=58 && c<=64|| c>=91 && c<=96|| c>=123 && c<=255)
           {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(this, "Ingrese solo Letras","Error Validacion",JOptionPane.ERROR_MESSAGE);
                RegNomb.setCursor(null);
           }
    }//GEN-LAST:event_RegNombKeyTyped

    private void RegEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RegEdadKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        String cadena=this.RegEdad.getText();    
          if(cadena.length()>2) {             
              evt.consume();             
              JOptionPane.showMessageDialog(null,"Longitud maxima de 3 digitos","Error Validacion",JOptionPane.ERROR_MESSAGE);
              
          }
          if(Character.isLetter(c))
            {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(this, "Ingrese solo numeros","Error Validacion",JOptionPane.ERROR_MESSAGE);
                RegEdad.setCursor(null);
            }
            else if(c>32 && c<=47||c>=58 && c<=64|| c>=91 && c<=96|| c>=123 && c<=255)
           {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(this, "Ingrese solo numeros","Error Validacion",JOptionPane.ERROR_MESSAGE);
                RegEdad.setCursor(null);
            }
    }//GEN-LAST:event_RegEdadKeyTyped

    private void RegDomiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RegDomiKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
        String cadena=this.RegDomi.getText();    
          if(cadena.length()>99) {            
              evt.consume();             
              JOptionPane.showMessageDialog(null,"Longitud maxima de 100 caracteres","Error Validacion",JOptionPane.ERROR_MESSAGE);
             
          }
    }//GEN-LAST:event_RegDomiKeyTyped

    private void RegEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RegEmailKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
        String cadena=this.RegEmail.getText();    
          if(cadena.length()>49) {
             
              evt.consume();
              
              JOptionPane.showMessageDialog(null,"Longitud maxima de 50 caracteres","Error Validacion",JOptionPane.ERROR_MESSAGE);
              
          }
    }//GEN-LAST:event_RegEmailKeyTyped

    private void RegUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RegUsernameKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();  
        if(c>32 && c<=47||c>=58 && c<=64|| c>=91 && c<=96|| c>=123 && c<=255){
            if(c==46||c==95){
            }else{
                evt.consume();
                RegUsername.setCursor(null);
                JOptionPane.showMessageDialog(null,"Ingresa Numeros, Letras y algunos caracteres especiales (.,_)","Error Validacion",JOptionPane.ERROR_MESSAGE);      
            }
                
        }
    }//GEN-LAST:event_RegUsernameKeyTyped

    private void RegPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RegPassKeyTyped
        // TODO add your handling code here:
       char c=evt.getKeyChar();
        if(c>32 &&c<=47||c>=58 && c<=64|| c>=91 && c<=96||c>=123 && c<=255){
            evt.consume();
            JOptionPane.showMessageDialog(null,"Ingresa Numeros y Letras sin carateres especiales","Error Validacion",JOptionPane.ERROR_MESSAGE);

        }
        
    }//GEN-LAST:event_RegPassKeyTyped

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jFrame2.setLocationRelativeTo(this);
        //La hacemos modal
        jFrame2.setMinimumSize(new Dimension(670, 300));
        //Establecemos un título para el jDialog
        jFrame2.setTitle("Registrar Usuario");
        //La hacemos visible.
        jFrame2.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed
  
   
    public boolean Email(final String Username,final String Password,String To,String Subject,String Mensage) {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(Username, Password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(Username));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(To));
            message.setSubject(Subject);
            message.setText(Mensage);
            Transport.send(message);
        } catch (MessagingException e) {
            return false;
        }
       return true;
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       //</editor-fold>
       //</editor-fold>
       
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enviar;
    private javax.swing.JTextField RegDomi;
    private javax.swing.JTextField RegEdad;
    private javax.swing.JTextField RegEmail;
    private javax.swing.JTextField RegNomb;
    private javax.swing.JPasswordField RegPass;
    private javax.swing.JButton RegSave;
    private javax.swing.JTextField RegUsername;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel nomb;
    private javax.swing.JPasswordField passw;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
