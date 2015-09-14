/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author luck
 */
public class ReporteMov extends javax.swing.JFrame {

    String user,rol,tipo_mov,provedor;
    Connection miConexion;
    String data[][]={};
    String cabecera[]={"Numero","Tipo de Movimiento","Fecha","Cantidad","Producto","Usuario","Provedor"};
    String cabecera2[]={"Tipo de Movimiento","Fecha","Cantidad","Producto","Usuario","Provedor"};
    DefaultTableModel table,table2;
    DefaultListModel list;
    Screensize pantalla = new Screensize();
    Calendar c2 = new GregorianCalendar();
    Mysqlconector conexion= new Mysqlconector();
    public ReporteMov(String usuario,String role){
       
            user=usuario;
            rol=role;
            initComponents();
            this.getContentPane().setBackground(Color.lightGray);
            
            date.setCalendar(c2);
            date.getDateEditor().setEnabled(false);
            //tablas
            table= new DefaultTableModel(data,cabecera);
            table2= new DefaultTableModel(data,cabecera2);
            list = new DefaultListModel();
            this.tabla.setModel(table);
            this.tabla2.setModel(table2);
          
            //lista
            this.producto.setModel(list);
            
            this.tabla.setEnabled(false);
            this.provedores.setEnabled(false);
            //combobox
            this.buttonGroup1.add(this.reparacion);
            this.buttonGroup1.add(this.alta);
            this.buttonGroup1.add(this.baja);
            this.provedores.removeAllItems();
            if(!rol.equals("administrador"))
                this.consulta.setEnabled(false);
            
            inicializar();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDialog = new javax.swing.JDialog();
        file = new javax.swing.JTextField();
        seleccionar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        jFrame1 = new javax.swing.JFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        datebus1 = new com.toedter.calendar.JDateChooser();
        datebus2 = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        busqueda = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        date = new com.toedter.calendar.JDateChooser();
        save = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        reparacion = new javax.swing.JRadioButton();
        alta = new javax.swing.JRadioButton();
        baja = new javax.swing.JRadioButton();
        provedores = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Cantidad = new javax.swing.JTextField();
        nuevo = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        producto = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        consulta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        quitar = new javax.swing.JButton();

        file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileActionPerformed(evt);
            }
        });

        seleccionar.setText("Selecciona archivo");
        seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarActionPerformed(evt);
            }
        });

        guardar.setText("guardar");
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
                .addGroup(jDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(file, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(seleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialogLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jDialogLayout.setVerticalGroup(
            jDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(file, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seleccionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabla);

        jFrame1.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 771, 250));
        jFrame1.getContentPane().add(datebus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 66, 164, -1));
        jFrame1.getContentPane().add(datebus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 66, 165, -1));

        jLabel11.setText("Busqueda por fecha");
        jFrame1.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 20, -1, 28));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.jpeg"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 85, 55));

        jLabel12.setText("Multibusqueda");
        jFrame1.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 128, -1, 27));

        jLabel13.setText("Fecha final");
        jFrame1.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 66, -1, 28));

        jLabel14.setText("Fecha Inicial");
        jFrame1.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 66, -1, 28));
        jFrame1.getContentPane().add(busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 127, 179, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/excel.gif"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, 192, 40));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 12, 152, 17));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresa_01.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 590, 91, 44));

        date.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dateKeyTyped(evt);
            }
        });
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 176, -1));

        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 71, 47));

        jLabel2.setText("Tipo de Movimiento");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 37, -1, 26));

        reparacion.setText("Reparacion ");
        reparacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reparacionActionPerformed(evt);
            }
        });
        getContentPane().add(reparacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 38, -1, -1));

        alta.setText("alta");
        alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaActionPerformed(evt);
            }
        });
        getContentPane().add(alta, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 38, -1, -1));

        baja.setText("Reubicacion");
        baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaActionPerformed(evt);
            }
        });
        getContentPane().add(baja, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 38, -1, -1));

        provedores.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        provedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provedoresActionPerformed(evt);
            }
        });
        getContentPane().add(provedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 176, -1));

        jLabel4.setText("Provedor");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 85, 20));

        jLabel5.setText("Cantidad: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 93, 20));

        Cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CantidadKeyTyped(evt);
            }
        });
        getContentPane().add(Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 130, 130, -1));

        nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });
        getContentPane().add(nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 71, 43));

        jLabel10.setText("Fecha");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, 20));

        producto.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(producto);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 190, 180));

        jLabel3.setText("Productos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 128, 100, 30));

        consulta.setText("Consultar Movimientos");
        consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaActionPerformed(evt);
            }
        });
        getContentPane().add(consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 230, 50));

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 760, 210));

        quitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/quitar.png"))); // NOI18N
        quitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitarActionPerformed(evt);
            }
        });
        getContentPane().add(quitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, 70, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents
     public void iniciar(){
         try{ 
            miConexion = conexion.Connection().getConnection();
            String query3 ="SELECT tipo_mov,fecha_mov,cantidad_mov,producto,usuario,provedor FROM query_movimiento";
            // create the java statement
            Statement st1 = miConexion.createStatement();
            ResultSet rs1 = st1.executeQuery(query3);
            //checamos que haya usuarios correctos
                        
            int cont=0;
            while(rs1.next()){
                cont++;
                String numero= Integer.toString(cont);
                String datos[]={numero,rs1.getString("tipo_mov"),rs1.getString("fecha_mov"),rs1.getString("cantidad_mov"),rs1.getString("producto"),rs1.getString("usuario"),rs1.getString("provedor")};
                table.addRow(datos);
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ReporteMov.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            Mysqlconector.liberaConexion(miConexion);
        }
        
     }
    private void inicializar(){
        //listado dinamico combo box
       try{
         miConexion = conexion.Connection().getConnection();
            String query="Select nombre from producto WHERE status='A' ";
            String query2="Select Nombre from Provedores WHERE status='A' ";
            
            Statement st=  miConexion.createStatement();
            ResultSet rs= st.executeQuery(query);
            
            Statement st2=  miConexion.createStatement();
            ResultSet rs2= st2.executeQuery(query2);
            //Lista
            while(rs.next()){
                list.addElement(rs.getString("nombre"));
                producto.setModel(list);
            }
           
            //segundo combo
            while(rs2.next()){
                this.provedores.addItem(rs2.getString("Nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReporteMov.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            Mysqlconector.liberaConexion(miConexion);
        }
    }
    //obtener la existencia del producto para restarle o sumarle la cantidad del movimiento
    private int Cantpro(String producto){
        int cant=0;
        try {
            
            miConexion = conexion.Connection().getConnection();
            String query="SELECT existencia FROM producto WHERE nombre='"+producto+"'";
            Statement st=  miConexion.createStatement();
            ResultSet rs= st.executeQuery(query);
            if(rs.next()){
                cant=Integer.parseInt(rs.getString("existencia"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ReporteMov.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
           Mysqlconector.liberaConexion(miConexion);
        }
         return cant;    
    }
    
    private void LimpiarCampos(){
        this.Cantidad.setText("");
        this.buttonGroup1.clearSelection();
        date.setCalendar(c2);
        this.provedores.setEnabled(false);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         Administrador a = new Administrador(user,rol);
         a.setVisible(true);
         a.setBounds((pantalla.ancho / 2) - (a.getWidth() / 2), (pantalla.alto / 2) - (a.getHeight() / 2),a.getWidth(),a.getHeight());
         this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        int count=tabla2.getRowCount();
        //si no hay registros guardados en la tabla guardamos de un producto 
        if(count==0){
                if(Cantidad.getText().equals("")||date.getCalendar()==null||buttonGroup1.isSelected(null)||producto.isSelectionEmpty())
                {
                    JOptionPane.showMessageDialog(null,"Error Favor de ingresar todos los datos","Error Movimiento",JOptionPane.ERROR_MESSAGE);
                    return;
                }
            try {
                
                if(this.reparacion.isSelected())
                    provedor=this.provedores.getSelectedItem().toString();
                Date fecha = this.date.getDate();
                SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
                String fechaformato=formato.format(fecha);
                String dateF=fechaformato.replaceAll("/", "-");
                //lamar al procedimiento almacenado
                miConexion = conexion.Connection().getConnection();
                CallableStatement proc = miConexion.prepareCall(" CALL procedimiento(?,?,?,?,?,?,?,?) ");
                //se cargan los parametros de entrada
                proc.setString("_tipo",tipo_mov );//Tipo String
                proc.setString("_fecha", dateF);//Tipo entero
                proc.setString("_producto",producto.getSelectedValue().toString());//Tipo String
                proc.setString("_usuario", user);//Tipo entero
                proc.setString("_provedor", provedor);//Tipo String
                proc.setInt("_cantidad",Integer.parseInt(Cantidad.getText()));//Tipo entero
                // parametros de salida
                proc.registerOutParameter("msj", Types.VARCHAR);//Tipo String
                // Se ejecuta el procedimiento almacenado
                proc.execute();            
                // devuelve el valor del parametro de salida del procedimiento
                String resultado = proc.getString("_band");
                if(resultado!=null){
                     JOptionPane.showMessageDialog(null,proc.getString("msj"),"Error Existencia",JOptionPane.ERROR_MESSAGE);                    
                     LimpiarCampos();
                }else{
                     JOptionPane.showMessageDialog(null,proc.getString("msj"));
                }
           
            } catch (SQLException ex) {
                Logger.getLogger(ReporteMov.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                Mysqlconector.liberaConexion(miConexion);
            }
        }
        else{
          //guardamos los datos de nuestro de productos  
          String resultado;
        
           try {
               int i = 0;
                //Vector<String> matriz = new Vector<String>();
                miConexion = conexion.Connection().getConnection();
                for(int x=0;x<count;x++){
                    i++;
                    //insertamos todos los datos que guardamos en nuestra tabla
                  
                    Date fecha;
                    SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
                    fecha=formato.parse(tabla2.getValueAt(x, 1).toString());

                    String fechaformato=formato.format(fecha);
                    String dateF=fechaformato.replaceAll("/", "-");                  
                    CallableStatement proc = miConexion.prepareCall(" CALL procedimiento(?,?,?,?,?,?,?,?) ");
                    //se cargan los parametros de entrada
                    proc.setString("_tipo",tabla2.getValueAt(x, 0).toString());//Tipo String
                    proc.setString("_fecha", dateF);//Tipo entero
                    proc.setString("_producto",tabla2.getValueAt(x, 3).toString());//Tipo String
                    proc.setString("_usuario", user);//Tipo entero
                    proc.setString("_provedor", provedor);//Tipo String
                    proc.setInt("_cantidad",Integer.parseInt(tabla2.getValueAt(x, 2).toString()));//Tipo entero
                    // parametros de salida
                    proc.registerOutParameter("msj", Types.VARCHAR);//Tipo String
                    proc.registerOutParameter("_band", Types.INTEGER);//Tipo Integer
                    // Se ejecuta el procedimiento almacenado
                    proc.execute();
                    // devuelve el valor del parametro de salida del procedimiento
                    resultado = proc.getString("_band");
                   
                    if(resultado!=null){
                        JOptionPane.showMessageDialog(null,proc.getString("msj")+" registro: "+i,"Error Existencia",JOptionPane.ERROR_MESSAGE);
                       // matriz.add("-1");
                    }else{
                       JOptionPane.showMessageDialog(null,proc.getString("msj")+" registro: "+i);
                       //matriz.add(Integer.toString(x));   
                       table2.removeRow(x);
                       x--;
                       count=table2.getRowCount();
                       
                    }
                      
                }
              LimpiarCampos();
            }catch (ParseException | SQLException ex) {
                Logger.getLogger(ReporteMov.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally{
                Mysqlconector.liberaConexion(miConexion);
            }
        }
        
    }//GEN-LAST:event_saveActionPerformed
    //actualizar tabla
    private void actualizar(){
        
        try {
            LimpiarJTable();
            
            String query="SELECT tipo_mov,fecha_mov,cantidad_mov,producto,usuario,provedor FROM query_movimiento GROUP BY id_mov";
            
            Statement st = miConexion.createStatement();
            ResultSet rs = st.executeQuery(query);
            int cont=0;
            while(rs.next()){
                cont++;
                String numero= Integer.toString(cont);
                String datos[]={numero,rs.getString("tipo_mov"),rs.getString("fecha_mov"),rs.getString("cantidad_mov"),rs.getString("producto"),rs.getString("usuario"),rs.getString("provedor")};
                table.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReporteMov.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
    }
 
    private void reparacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reparacionActionPerformed
        // TODO add your handling code here:
        this.provedores.setEnabled(true);
        tipo_mov="Reparacion";
        if(this.provedores.getSelectedItem()==null){
            JOptionPane.showMessageDialog(null,"No hay agregados ningun provedor favor de agregar uno","Error ",JOptionPane.ERROR_MESSAGE);
            return;
        }
        provedor=this.provedores.getSelectedItem().toString();
       
    }//GEN-LAST:event_reparacionActionPerformed

    private void provedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provedoresActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_provedoresActionPerformed

    private void altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaActionPerformed
        // TODO add your handling code here:
        this.provedores.setEnabled(false);
        tipo_mov="Alta";
        if(producto.isSelectionEmpty())
             JOptionPane.showMessageDialog(null,"No hay Mobiliario en la lista favor de agregar","Advertencia",JOptionPane.ERROR_MESSAGE); 
        
        provedor="";
    }//GEN-LAST:event_altaActionPerformed

    private void bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaActionPerformed
        // TODO add your handling code here:
        this.provedores.setEnabled(false);
        tipo_mov="Reubicada";
        if(producto.isSelectionEmpty())
             JOptionPane.showMessageDialog(null,"No hay Mobiliario en la lista favor de agregar","Advertencia",JOptionPane.ERROR_MESSAGE);
        
        provedor="";
    }//GEN-LAST:event_bajaActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        if(Cantidad.getText().equals("")||date.getCalendar()==null||buttonGroup1.isSelected(null)||producto.isSelectionEmpty())
        {
            JOptionPane.showMessageDialog(null,"Error Favor de ingresar todos los datos","Error Movimiento",JOptionPane.ERROR_MESSAGE);
            return;
        }
        int cant=Cantpro(producto.getSelectedValue().toString());
        if(this.baja.isSelected() || this.reparacion.isSelected()){
            if(Integer.parseInt(this.Cantidad.getText())>cant)
            {
                JOptionPane.showMessageDialog(null,"No hay suficiente existencia en el producto","Error",JOptionPane.ERROR_MESSAGE);
                return;
            }
            
        }
       
        Date fecha = this.date.getDate();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
        String fechaformato=formato.format(fecha);
        String datosmov[]={tipo_mov,fechaformato,this.Cantidad.getText(),producto.getSelectedValue().toString(),user,provedor};
        table2.addRow(datosmov);
        
        LimpiarCampos();
    }//GEN-LAST:event_nuevoActionPerformed
    private void LimpiarJTable(){
        int a =table.getRowCount()-1;  //Índices van de 0 a n-1
        //System.out.println("Tabla "+a);   //Para mostrar por consola el resultado
        for(int i=a;i>=0;i--){ 

            //System.out.println("i "+i);    //Para mostrar por consola el resultado
            table.removeRow(i);
        }
   }
    private void Limpiar(){
        int a =table2.getRowCount()-1;  //Índices van de 0 a n-1
        //System.out.println("Tabla "+a);   //Para mostrar por consola el resultado
        for(int i=a;i>=0;i--){ 

            //System.out.println("i "+i);    //Para mostrar por consola el resultado
            table2.removeRow(i);
        }
   }
//fecha valida con formato  dd/mm/yyyy
    private void dateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_dateKeyTyped

    private void CantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CantidadKeyTyped
        // TODO add your handling code here:
          char c=evt.getKeyChar();
        String cadena=this.Cantidad.getText();    
          if(cadena.length()>9) {
             
              evt.consume();
              
              JOptionPane.showMessageDialog(null,"Longitu maxima de 10 digitos","Error Validacion",JOptionPane.ERROR_MESSAGE);
              
          }
          if(Character.isLetter(c))
            {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(this, "Ingrese solo numeros","Error Validacion",JOptionPane.ERROR_MESSAGE);
                Cantidad.setCursor(null);
            }
            else if(c>32 &&c<=47||c>=58 && c<=64|| c>=91 && c<=96||c>=123 && c<=255)
           {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(this, "Ingrese solo numeros","Error Validacion",JOptionPane.ERROR_MESSAGE);
                Cantidad.setCursor(null);
            }
    }//GEN-LAST:event_CantidadKeyTyped

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
    
    public void llama_excel()
	 {
		 try {
				Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+file.getText()+".xls");
				} catch (IOException e) {
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

    private void fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
        String query;
        int band=0;
        
         query= "SELECT tipo_mov,fecha_mov,cantidad_mov,producto,usuario,provedor FROM query_movimiento WHERE "; 
        if(datebus1.getCalendar()!=null && datebus2.getCalendar()==null || datebus2.getCalendar()!=null && datebus1.getCalendar()==null ){
                    JOptionPane.showMessageDialog(null, "Ingresar datos de fecha incial y final ","Error Busqueda",JOptionPane.ERROR_MESSAGE);
         }
       
        if(datebus1.getCalendar()!=null && datebus2.getCalendar()!=null){
            //validacion fechas
            if(datebus2.getDate().before(datebus1.getDate())){
              JOptionPane.showMessageDialog(null, "Fecha 1 debe ser menor que Fecha 2","Error Busqueda",JOptionPane.ERROR_MESSAGE);
                    return;
            }
            Date fecha = this.datebus1.getDate();
            SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
            String fechaformato=formato.format(fecha);
            String fechainicial=fechaformato.replaceAll("/", "-");

            Date fecha2 = this.datebus2.getDate();
            SimpleDateFormat formato2 = new SimpleDateFormat("yyyy/MM/dd");
            String fechaformato2=formato2.format(fecha2);
            String fechafinal=fechaformato2.replaceAll("/", "-");          
            query +="fecha_mov >='"+fechainicial+"' AND fecha_mov <= '"+fechafinal+"' ";
            band=1;
        }
        if(!busqueda.getText().equals("")){
            if(band==1)  
                query += "AND ";
            
            query +="(producto LIKE '%"+busqueda.getText()+"%' OR provedor LIKE '%"+busqueda.getText()+"%'\n" +
                    "OR usuario LIKE '%"+busqueda.getText()+"%' OR tipo_mov = '"+busqueda.getText()+"') ";
        }
        if(datebus1.getCalendar()==null && datebus2.getCalendar()==null && busqueda.getText().equals("")){
            query = "SELECT tipo_mov,fecha_mov,cantidad_mov,producto,usuario,provedor FROM query_movimiento ";
        }                      
                    try {                 
                        //Limpiar tabla
                        LimpiarJTable();
                        //fecha inicial formato sql
                      
                        query += "GROUP BY id_mov";
                       miConexion = conexion.Connection().getConnection();
                        Statement st = miConexion.createStatement();
                        ResultSet rs = st.executeQuery(query);
                        int cont=0;
                        while(rs.next()){
                            cont++;
                            String numero= Integer.toString(cont);
                            //ingresar los nuevos datos a la tabla
                            String datos[]={numero,rs.getString("tipo_mov"),rs.getString("fecha_mov"),rs.getString("cantidad_mov"),rs.getString("producto"),rs.getString("usuario"),rs.getString("provedor")};
                            table.addRow(datos);
                        }
                    
                    } catch (SQLException ex) {
                        Logger.getLogger(ReporteMov.class.getName()).log(Level.SEVERE, null, ex);
                    }finally{
                        Mysqlconector.liberaConexion(miConexion);
                    }
                 
                                            
    }//GEN-LAST:event_jButton4ActionPerformed

    private void productoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productoMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_productoMouseClicked

    private void consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaActionPerformed
       if(rol.equals("administrador")){    
           iniciar();
            try {

                miConexion = conexion.Connection().getConnection();
                actualizar();
                jFrame1.pack();
                jFrame1.setSize(jFrame1.getWidth(), jFrame1.getHeight());
                jFrame1.setLocationRelativeTo(this);
                jFrame1.setTitle("Consulta de Movimientos");
                jFrame1.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(ReporteMov.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                Mysqlconector.liberaConexion(miConexion);
            }
       }else
           tabla.setEnabled(false);       
    }//GEN-LAST:event_consultaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        llamarJDialogExcel();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void quitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitarActionPerformed
        // TODO add your handling code here:
        if(table2.getRowCount()==0){
            JOptionPane.showMessageDialog(null,"No hay ningun registro","Movimientos",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(tabla2.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(null,"Selecciona fila a eliminar","Movimientos",JOptionPane.ERROR_MESSAGE);
            return;
        }
        int row =tabla2.getSelectedRow();
        table2.removeRow(row);
        tabla2.repaint();
       
        
    }//GEN-LAST:event_quitarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaMouseClicked

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
            java.util.logging.Logger.getLogger(ReporteMov.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
              // new ReporteMov().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cantidad;
    private javax.swing.JRadioButton alta;
    private javax.swing.JRadioButton baja;
    private javax.swing.JTextField busqueda;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton consulta;
    private com.toedter.calendar.JDateChooser date;
    private com.toedter.calendar.JDateChooser datebus1;
    private com.toedter.calendar.JDateChooser datebus2;
    private javax.swing.JTextField file;
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDialog jDialog;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton nuevo;
    private javax.swing.JList producto;
    private javax.swing.JComboBox provedores;
    private javax.swing.JButton quitar;
    private javax.swing.JRadioButton reparacion;
    private javax.swing.JButton save;
    private javax.swing.JButton seleccionar;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla2;
    // End of variables declaration//GEN-END:variables
}
