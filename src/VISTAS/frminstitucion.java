/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTAS;

import DATOS.vinstitucion;
import LOGICA.finstitucion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class frminstitucion extends javax.swing.JInternalFrame {

    /**
     * Creates new form frminstitucion
     */
    public frminstitucion() {
        initComponents();
        
        inhabilitar();
        
    }


    private void nuevoCodigo(){
       int codigo=0;
       finstitucion funcion= new finstitucion();
       codigo=funcion.asignarCodigo();
       codigo=codigo+1; 
       txtcodigoInstitucion.setText(String.valueOf(codigo));
       System.out.println(codigo);
   }
    
   private void inhabilitar (){
       //deshabilitar cajas de texto
        txtcodigoInstitucion.setEnabled(false);
        txtrif.setEnabled(false);
        txtcargoContacto.setEnabled(false);
        txtcontactoOrganizacion.setEnabled(false);
        txtnombreInstitucion.setEnabled(false);
        txtdireccion.setEnabled(false);
        txttelefono.setEnabled(false);
        txttelefonoContacto.setEnabled(false);
        

        //deshabilitar botones
        btnguardar.setEnabled(false);
        btneliminar.setEnabled(false);
        btnmodificar.setEnabled(false);
        btncancelar.setEnabled(false);
        
      
        
    }
    void vaciasCajas(){
          //vaciar cajas de texto
        txtcodigoInstitucion.setText("");
        txtrif.setText("");
        txtcargoContacto.setText("");
        txtcontactoOrganizacion.setText("");
        txtnombreInstitucion.setText("");
        txtdireccion.setText("");
        txttelefono.setText("");
        txttelefonoContacto.setText("");
    }
    void habilitar (){
        //habilitar cajas de texto
        txtcodigoInstitucion.setEnabled(true);
        txtrif.setEnabled(true);
        txtcargoContacto.setEnabled(true);
        txtcontactoOrganizacion.setEnabled(true);
        txtnombreInstitucion.setEnabled(true);
        txtdireccion.setEnabled(true);
        txttelefono.setEnabled(true);
        txttelefonoContacto.setEnabled(true);
        //habilitar botones
        btnguardar.setEnabled(true);
        btnmodificar.setEnabled(true);
        btncancelar.setEnabled(true);
        btnmenu.setEnabled(true);
        btneliminar.setEnabled(true);
    }
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new java.awt.Panel();
        btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnmenu = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblcodigo = new javax.swing.JLabel();
        txtcodigoInstitucion = new javax.swing.JTextField();
        txtnombreInstitucion = new javax.swing.JTextField();
        lblnombre = new javax.swing.JLabel();
        txtrif = new javax.swing.JTextField();
        lblcodigo2 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        lblcodigo3 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        lblcodigo4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblcontacto = new javax.swing.JLabel();
        txtcontactoOrganizacion = new javax.swing.JTextField();
        lblcodigo6 = new javax.swing.JLabel();
        txttelefonoContacto = new javax.swing.JTextField();
        txtcargoContacto = new javax.swing.JTextField();
        lblcodigo7 = new javax.swing.JLabel();
        btnhabilitar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("INSTITUCION");
        setMaximumSize(new java.awt.Dimension(630, 430));
        setMinimumSize(new java.awt.Dimension(630, 430));
        setPreferredSize(new java.awt.Dimension(630, 430));
        getContentPane().setLayout(null);

        panel2.setBackground(new java.awt.Color(0, 102, 153));
        panel2.setLayout(null);

        btnnuevo.setBackground(new java.awt.Color(255, 255, 255));
        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ARCHIVOS/agregar-documento-simbolo-delineado.png"))); // NOI18N
        btnnuevo.setToolTipText("NUEVO REGISTRO");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        panel2.add(btnnuevo);
        btnnuevo.setBounds(0, 0, 50, 50);

        btnguardar.setBackground(new java.awt.Color(255, 255, 255));
        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ARCHIVOS/guardar.png"))); // NOI18N
        btnguardar.setToolTipText("GUARDAR REGISTRO");
        btnguardar.setNextFocusableComponent(btnmodificar);
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        panel2.add(btnguardar);
        btnguardar.setBounds(50, 0, 50, 50);

        btnmodificar.setBackground(new java.awt.Color(255, 255, 255));
        btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ARCHIVOS/archivo-nuevo.png"))); // NOI18N
        btnmodificar.setToolTipText("MODIFICAR REGISTRO");
        btnmodificar.setNextFocusableComponent(btncancelar);
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        panel2.add(btnmodificar);
        btnmodificar.setBounds(100, 0, 50, 50);

        btncancelar.setBackground(new java.awt.Color(255, 255, 255));
        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ARCHIVOS/expediente.png"))); // NOI18N
        btncancelar.setToolTipText("CANCELAR REGISTRO");
        btncancelar.setNextFocusableComponent(btneliminar);
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        panel2.add(btncancelar);
        btncancelar.setBounds(150, 0, 50, 50);

        btneliminar.setBackground(new java.awt.Color(255, 255, 255));
        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ARCHIVOS/cubo-de-basura.png"))); // NOI18N
        btneliminar.setToolTipText("ELIMINAR REGISTRO");
        btneliminar.setNextFocusableComponent(btnbuscar);
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        panel2.add(btneliminar);
        btneliminar.setBounds(200, 0, 50, 50);

        btnmenu.setBackground(new java.awt.Color(255, 255, 255));
        btnmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ARCHIVOS/salida.png"))); // NOI18N
        btnmenu.setText("MENU");
        btnmenu.setToolTipText("IR A MENU");
        btnmenu.setNextFocusableComponent(txtcodigoInstitucion);
        btnmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuActionPerformed(evt);
            }
        });
        panel2.add(btnmenu);
        btnmenu.setBounds(480, 0, 130, 50);

        btnbuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ARCHIVOS/buscar.png"))); // NOI18N
        btnbuscar.setToolTipText("BUSCAR REGISTRO");
        btnbuscar.setNextFocusableComponent(btnmenu);
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        panel2.add(btnbuscar);
        btnbuscar.setBounds(250, 0, 50, 50);

        getContentPane().add(panel2);
        panel2.setBounds(0, 0, 670, 50);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DETALLE DE INSTITUCION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel1.setLayout(null);

        lblcodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblcodigo.setText("CODIGO ");
        jPanel1.add(lblcodigo);
        lblcodigo.setBounds(10, 20, 60, 30);

        txtcodigoInstitucion.setNextFocusableComponent(txtrif);
        txtcodigoInstitucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoInstitucionActionPerformed(evt);
            }
        });
        txtcodigoInstitucion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcodigoInstitucionKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcodigoInstitucionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodigoInstitucionKeyTyped(evt);
            }
        });
        jPanel1.add(txtcodigoInstitucion);
        txtcodigoInstitucion.setBounds(90, 20, 80, 30);

        txtnombreInstitucion.setNextFocusableComponent(txttelefono);
        txtnombreInstitucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreInstitucionActionPerformed(evt);
            }
        });
        txtnombreInstitucion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnombreInstitucionKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnombreInstitucionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreInstitucionKeyTyped(evt);
            }
        });
        jPanel1.add(txtnombreInstitucion);
        txtnombreInstitucion.setBounds(90, 60, 490, 30);

        lblnombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblnombre.setText("NOMBRE");
        jPanel1.add(lblnombre);
        lblnombre.setBounds(10, 60, 60, 30);

        txtrif.setNextFocusableComponent(txtnombreInstitucion);
        txtrif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrifActionPerformed(evt);
            }
        });
        txtrif.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtrifKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtrifKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrifKeyTyped(evt);
            }
        });
        jPanel1.add(txtrif);
        txtrif.setBounds(220, 20, 240, 30);

        lblcodigo2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblcodigo2.setText("RIF");
        jPanel1.add(lblcodigo2);
        lblcodigo2.setBounds(190, 20, 60, 30);

        txtdireccion.setNextFocusableComponent(txtcontactoOrganizacion);
        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });
        txtdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdireccionKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdireccionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdireccionKeyTyped(evt);
            }
        });
        jPanel1.add(txtdireccion);
        txtdireccion.setBounds(90, 140, 490, 30);

        lblcodigo3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblcodigo3.setText("DIRECCION");
        jPanel1.add(lblcodigo3);
        lblcodigo3.setBounds(10, 140, 80, 30);

        txttelefono.setNextFocusableComponent(txtdireccion);
        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttelefonoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(txttelefono);
        txttelefono.setBounds(90, 100, 490, 30);

        lblcodigo4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblcodigo4.setText("TELEFONO");
        jPanel1.add(lblcodigo4);
        lblcodigo4.setBounds(10, 100, 60, 30);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONTACTO EN LA ORGANIZACION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel2.setLayout(null);

        lblcontacto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblcontacto.setText("CONTACTO");
        jPanel2.add(lblcontacto);
        lblcontacto.setBounds(10, 30, 70, 30);

        txtcontactoOrganizacion.setNextFocusableComponent(txttelefonoContacto);
        txtcontactoOrganizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontactoOrganizacionActionPerformed(evt);
            }
        });
        txtcontactoOrganizacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcontactoOrganizacionKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcontactoOrganizacionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcontactoOrganizacionKeyTyped(evt);
            }
        });
        jPanel2.add(txtcontactoOrganizacion);
        txtcontactoOrganizacion.setBounds(90, 30, 480, 30);

        lblcodigo6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblcodigo6.setText("TELEFONO ");
        jPanel2.add(lblcodigo6);
        lblcodigo6.setBounds(10, 70, 80, 30);

        txttelefonoContacto.setNextFocusableComponent(txtcargoContacto);
        txttelefonoContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoContactoActionPerformed(evt);
            }
        });
        txttelefonoContacto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttelefonoContactoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttelefonoContactoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoContactoKeyTyped(evt);
            }
        });
        jPanel2.add(txttelefonoContacto);
        txttelefonoContacto.setBounds(90, 70, 480, 30);

        txtcargoContacto.setNextFocusableComponent(btnguardar);
        txtcargoContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcargoContactoActionPerformed(evt);
            }
        });
        txtcargoContacto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcargoContactoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcargoContactoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcargoContactoKeyTyped(evt);
            }
        });
        jPanel2.add(txtcargoContacto);
        txtcargoContacto.setBounds(90, 110, 480, 30);

        lblcodigo7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblcodigo7.setText("CARGO");
        jPanel2.add(lblcodigo7);
        lblcodigo7.setBounds(10, 110, 60, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 180, 590, 150);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 50, 610, 340);

        btnhabilitar.setText("habilitar");
        btnhabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhabilitarActionPerformed(evt);
            }
        });
        getContentPane().add(btnhabilitar);
        btnhabilitar.setBounds(680, 130, 71, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed

        habilitar();
        vaciasCajas();
        txtcodigoInstitucion.requestFocus();
        btnmodificar.setEnabled(false);
        btnmenu.setEnabled(false);
        btnnuevo.setEnabled(false);
        btneliminar.setEnabled(false);
        btncancelar.setEnabled(true);
        btnguardar.setEnabled(true);
        nuevoCodigo();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        if (txtcodigoInstitucion.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar un Codigo para la Institucion");
            txtcodigoInstitucion.requestFocus();
            return;
        }
        if (txtrif.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar un Rif para la Institucion");
            txtrif.requestFocus();
            return;
        }
        if (txtnombreInstitucion.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar un Nombre para la Institucion");
            txtnombreInstitucion.requestFocus();
            return;
        }
        if (txttelefono.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar un telefono para la Institucion");
            txttelefono.requestFocus();
            return;
        }
        if (txtdireccion.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar una direccion para la Institucion");
            txtdireccion.requestFocus();
            return;
        }
        if (txtcontactoOrganizacion.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar un nombre de contacto para la Institucion");
            txtcontactoOrganizacion.requestFocus();
            return;
        }
        if (txttelefonoContacto.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar un telefono para el Contacto de la Institucion");
            txttelefonoContacto.requestFocus();
            return;
        }
        if (txtcargoContacto.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar un Cargo para el Contacto de la Institucion");
            txtcargoContacto.requestFocus();
            return;
        }
        try {
            vinstitucion dts1 = new vinstitucion();
            finstitucion func = new finstitucion();

            vinstitucion dts = new vinstitucion();

            dts.setCodigoInstitucion(Integer.parseInt(txtcodigoInstitucion.getText()));
            dts.setNombreInstitucion(txtnombreInstitucion.getText());
            dts.setRif(txtrif.getText());
            dts.setDireccion(txtdireccion.getText());
            dts.setTelefono(txttelefono.getText());
            dts.setContactoOrganizacion(txtcontactoOrganizacion.getText());
            dts.setTelefonoContacto(txttelefonoContacto.getText());
            dts.setCargoContacto(txtcargoContacto.getText());

            func.insertar(dts);

            dts1.setCodigoInstitucion(Integer.parseInt(txtcodigoInstitucion.getText()));
            func.insertarEstudiosInstitucion(dts1);
         
            inhabilitar();
            //habilitar botones
            btnmenu.setEnabled(true);
            btnnuevo.setEnabled(true);
            //ihabilitar botones
            btnguardar.setEnabled(false);
        } catch (Exception e) {
        }
            
        
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        if (txtcodigoInstitucion.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar un Codigo para la Institucion");
            txtcodigoInstitucion.requestFocus();
            return;
        }
        if (txtrif.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar un Rif para la Institucion");
            txtrif.requestFocus();
            return;
        }
        if (txtnombreInstitucion.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar un Nombre para la Institucion");
            txtnombreInstitucion.requestFocus();
            return;
        }
        if (txttelefono.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar un telefono para la Institucion");
            txttelefono.requestFocus();
            return;
        }
        if (txtdireccion.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar una direccion para la Institucion");
            txtdireccion.requestFocus();
            return;
        }
        if (txtcontactoOrganizacion.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar un nombre de contacto para la Institucion");
            txtcontactoOrganizacion.requestFocus();
            return;
        }
        if (txttelefonoContacto.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar un telefono para el Contacto de la Institucion");
            txttelefonoContacto.requestFocus();
            return;
        }
        if (txtcargoContacto.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar un Cargo para el Contacto de la Institucion");
            txtcargoContacto.requestFocus();
            return;
        }
        try {
            vinstitucion dts= new vinstitucion();
        finstitucion func=new finstitucion();


        dts.setCodigoInstitucion(Integer.parseInt(txtcodigoInstitucion.getText()));
        dts.setNombreInstitucion(txtnombreInstitucion.getText());
        dts.setRif(txtrif.getText());
        dts.setDireccion(txtdireccion.getText());
        dts.setTelefono(txttelefono.getText());
        dts.setContactoOrganizacion(txtcontactoOrganizacion.getText());
        dts.setTelefonoContacto(txttelefonoContacto.getText());
        dts.setCargoContacto(txtcargoContacto.getText());
        func.modificar(dts);
        inhabilitar();
        btnmenu.setEnabled(true);
        } catch (Exception e) {
        }
        
       
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
        inhabilitar ();
        btnmenu.setEnabled(true);
        btnnuevo.setEnabled(true);
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        if (!txtcodigoInstitucion.getText().equals("")) {

            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Seguro que quiere eliminar este registro?", "Confirmar", 2);

            if (confirmacion==0) {
                finstitucion func= new finstitucion();
                vinstitucion dts= new vinstitucion ();

                dts.setCodigoInstitucion(Integer.parseInt(txtcodigoInstitucion.getText()));
                func.eliminar(dts);
                //mostrar("");
                inhabilitar ();
                btnmenu.setEnabled(true);
                //sizetable();
            }
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnmenuActionPerformed

    private void txtcodigoInstitucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoInstitucionActionPerformed
        // TODO add your handling code here:
        txtnombreInstitucion.grabFocus();
    }//GEN-LAST:event_txtcodigoInstitucionActionPerformed

    private void txtcodigoInstitucionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoInstitucionKeyPressed
        
    }//GEN-LAST:event_txtcodigoInstitucionKeyPressed

    private void txtcodigoInstitucionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoInstitucionKeyReleased

    }//GEN-LAST:event_txtcodigoInstitucionKeyReleased

    private void txtnombreInstitucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreInstitucionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreInstitucionActionPerformed

    private void txtnombreInstitucionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreInstitucionKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtnombreInstitucionKeyPressed

    private void txtnombreInstitucionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreInstitucionKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreInstitucionKeyReleased

    private void txtrifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrifActionPerformed

    private void txtrifKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrifKeyPressed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtrifKeyPressed

    private void txtrifKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrifKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrifKeyReleased

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionActionPerformed

    private void txtdireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdireccionKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtdireccionKeyPressed

    private void txtdireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdireccionKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionKeyReleased

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoActionPerformed

    private void txttelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoKeyPressed

    private void txttelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoKeyReleased

    private void txtcontactoOrganizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontactoOrganizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontactoOrganizacionActionPerformed

    private void txtcontactoOrganizacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontactoOrganizacionKeyPressed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_txtcontactoOrganizacionKeyPressed

    private void txtcontactoOrganizacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontactoOrganizacionKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontactoOrganizacionKeyReleased

    private void txttelefonoContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoContactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoContactoActionPerformed

    private void txttelefonoContactoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoContactoKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txttelefonoContactoKeyPressed

    private void txttelefonoContactoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoContactoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoContactoKeyReleased

    private void txtcargoContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcargoContactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcargoContactoActionPerformed

    private void txtcargoContactoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcargoContactoKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtcargoContactoKeyPressed

    private void txtcargoContactoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcargoContactoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcargoContactoKeyReleased

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        frmconsultaInstitucion form= new  frmconsultaInstitucion();
        form.toFront();
        frmmenu.escritorio.add(form);
        form.setSize(830, 550);
        form.setVisible(true);
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnhabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhabilitarActionPerformed
        // TODO add your handling code here:
        habilitar();
        btnguardar.setEnabled(false);
        btnmenu.setEnabled(false);
    }//GEN-LAST:event_btnhabilitarActionPerformed

    private void txtcodigoInstitucionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoInstitucionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoInstitucionKeyTyped

    private void txtrifKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrifKeyTyped
        Character c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            evt.setKeyChar(Character.toUpperCase(c));
        }
    }//GEN-LAST:event_txtrifKeyTyped

    private void txtnombreInstitucionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreInstitucionKeyTyped
        Character c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            evt.setKeyChar(Character.toUpperCase(c));
        }
    }//GEN-LAST:event_txtnombreInstitucionKeyTyped

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
        Character c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            evt.setKeyChar(Character.toUpperCase(c));
        }
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void txtdireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdireccionKeyTyped
        Character c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            evt.setKeyChar(Character.toUpperCase(c));
        }
    }//GEN-LAST:event_txtdireccionKeyTyped

    private void txtcontactoOrganizacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontactoOrganizacionKeyTyped
        Character c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            evt.setKeyChar(Character.toUpperCase(c));
        }
    }//GEN-LAST:event_txtcontactoOrganizacionKeyTyped

    private void txttelefonoContactoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoContactoKeyTyped
        Character c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            evt.setKeyChar(Character.toUpperCase(c));
        }
    }//GEN-LAST:event_txttelefonoContactoKeyTyped

    private void txtcargoContactoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcargoContactoKeyTyped
        Character c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            evt.setKeyChar(Character.toUpperCase(c));
        }
    }//GEN-LAST:event_txtcargoContactoKeyTyped

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frminstitucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frminstitucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frminstitucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frminstitucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frminstitucion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    public static javax.swing.JButton btnhabilitar;
    private javax.swing.JButton btnmenu;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblcodigo;
    private javax.swing.JLabel lblcodigo2;
    private javax.swing.JLabel lblcodigo3;
    private javax.swing.JLabel lblcodigo4;
    private javax.swing.JLabel lblcodigo6;
    private javax.swing.JLabel lblcodigo7;
    private javax.swing.JLabel lblcontacto;
    private javax.swing.JLabel lblnombre;
    private java.awt.Panel panel2;
    public static javax.swing.JTextField txtcargoContacto;
    public static javax.swing.JTextField txtcodigoInstitucion;
    public static javax.swing.JTextField txtcontactoOrganizacion;
    public static javax.swing.JTextField txtdireccion;
    public static javax.swing.JTextField txtnombreInstitucion;
    public static javax.swing.JTextField txtrif;
    public static javax.swing.JTextField txttelefono;
    public static javax.swing.JTextField txttelefonoContacto;
    // End of variables declaration//GEN-END:variables
}