/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTAS;

import DATOS.vestudio;
import DATOS.vestudiosInstitucion;
import LOGICA.conexion;
import LOGICA.fbaremo;
import LOGICA.festudio;
import static VISTAS.frmestudio.txtcodigoCategoria;
import static VISTAS.frmrecibo.txtnumeroFactura;
import java.io.File;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author user
 */
public class frmbaremo extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmbaremo
     */
    public frmbaremo() {
        initComponents();
        comboCategoria("categoriaestudios","nombreCategoria");
        txtcodigoCategorias.setVisible(false);
        txtcodigoInstitucion.setVisible(false);
        btnActualizar.setVisible(false);
        lblcodigo.setVisible(false);
        lblcodigo1.setVisible(false);
        
    }
    
        void cargarCategoria (String nombre){
         try {
            DefaultTableModel modelo;
            festudio func= new festudio();
            vestudio dts= new vestudio();
            dts.setNombreEstudio(nombre);
            modelo=func.cargaCategoria(dts.getNombreEstudio());
            txtcodigoCategorias.setText(modelo.getValueAt(0,0).toString());
        } catch (Exception e) {
            //JOptionPane.showConfirmDialog(rootPane, "Error en el procedimiento cargarCategoria");
            
        }
 }
    void comboCategoria(String tabla, String nombrecol){
        try {
            festudio func= new festudio();
            Object[] nombre = func.comboCategoria(tabla,nombrecol);
            cbcategoria.removeAllItems();
            for(int i=0;i<nombre.length;i++){
            cbcategoria.addItem(nombre[i]);    
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error en comboCategoria");
        }
        
   }

        private void mostrar (String codigoInstitucion,String categoria){
        try {
            DefaultTableModel modelo;
            fbaremo func= new fbaremo();
            modelo=func.mostrarBaremoInstitucion(codigoInstitucion,categoria);
            tbbaremo.setModel(modelo);
            lblTotal.setText(""+ Integer.toString(func.totalRegistros));   
            //sizetable();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, "Error al cargar los registros en la tabla");
            JOptionPane.showConfirmDialog(rootPane, e);

        }
 }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbbaremo = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        btnmenu = new javax.swing.JButton();
        cbcategoria = new javax.swing.JComboBox();
        lblcodigo4 = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        txtnombreInstitucion = new javax.swing.JTextField();
        btnmodificar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        txtcodigoInstitucion = new javax.swing.JTextField();
        txtcodigoCategorias = new javax.swing.JTextField();
        lblcodigo = new javax.swing.JLabel();
        lblcodigo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(920, 620));
        setMinimumSize(new java.awt.Dimension(920, 620));
        setPreferredSize(new java.awt.Dimension(920, 620));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONSULTA DE BAREMO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(960, 450));
        jPanel1.setMinimumSize(new java.awt.Dimension(960, 450));
        jPanel1.setLayout(null);

        tbbaremo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "CODIGO", "NOMBRE"
            }
        ));
        tbbaremo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbbaremoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbbaremoMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(tbbaremo);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(10, 20, 870, 450);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("TOTAL DE REGISTROS:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(700, 470, 140, 30);

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 0, 0));
        lblTotal.setText("0");
        jPanel1.add(lblTotal);
        lblTotal.setBounds(850, 470, 90, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 80, 900, 500);

        panel2.setBackground(new java.awt.Color(0, 102, 153));
        panel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel2.setLayout(null);

        btnmenu.setBackground(new java.awt.Color(255, 255, 255));
        btnmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ARCHIVOS/salida.png"))); // NOI18N
        btnmenu.setText("MENU");
        btnmenu.setToolTipText("IR A MENU");
        btnmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuActionPerformed(evt);
            }
        });
        panel2.add(btnmenu);
        btnmenu.setBounds(770, 0, 130, 50);

        cbcategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbcategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbcategoriaItemStateChanged(evt);
            }
        });
        cbcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcategoriaActionPerformed(evt);
            }
        });
        panel2.add(cbcategoria);
        cbcategoria.setBounds(100, 50, 430, 30);

        lblcodigo4.setBackground(new java.awt.Color(255, 255, 255));
        lblcodigo4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblcodigo4.setForeground(new java.awt.Color(255, 255, 255));
        lblcodigo4.setText("CATEGORIA");
        panel2.add(lblcodigo4);
        lblcodigo4.setBounds(20, 50, 80, 30);

        lblnombre.setBackground(new java.awt.Color(255, 255, 255));
        lblnombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblnombre.setForeground(new java.awt.Color(255, 255, 255));
        lblnombre.setText("NOMBRE");
        panel2.add(lblnombre);
        lblnombre.setBounds(20, 10, 60, 30);

        txtnombreInstitucion.setEnabled(false);
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
        });
        panel2.add(txtnombreInstitucion);
        txtnombreInstitucion.setBounds(100, 10, 430, 30);

        btnmodificar.setBackground(new java.awt.Color(255, 255, 255));
        btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ARCHIVOS/archivo-nuevo.png"))); // NOI18N
        btnmodificar.setToolTipText("MODIFICAR REGISTROS");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        panel2.add(btnmodificar);
        btnmodificar.setBounds(540, 0, 50, 50);

        btncancelar.setBackground(new java.awt.Color(255, 255, 255));
        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ARCHIVOS/expediente.png"))); // NOI18N
        btncancelar.setToolTipText("CANCELAR MODIFICACION");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        panel2.add(btncancelar);
        btncancelar.setBounds(590, 0, 50, 50);

        btnReporte.setBackground(new java.awt.Color(255, 255, 255));
        btnReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ARCHIVOS/impresora-3.png"))); // NOI18N
        btnReporte.setText("Reporte");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        panel2.add(btnReporte);
        btnReporte.setBounds(640, 0, 130, 50);

        getContentPane().add(panel2);
        panel2.setBounds(0, 0, 1060, 80);

        btnActualizar.setText("buscar");
        btnActualizar.setToolTipText("IR A MENU");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar);
        btnActualizar.setBounds(910, 110, 100, 30);

        txtcodigoInstitucion.setText(" ");
        getContentPane().add(txtcodigoInstitucion);
        txtcodigoInstitucion.setBounds(960, 160, 30, 20);

        txtcodigoCategorias.setText(" ");
        getContentPane().add(txtcodigoCategorias);
        txtcodigoCategorias.setBounds(960, 190, 30, 20);

        lblcodigo.setText("inst");
        getContentPane().add(lblcodigo);
        lblcodigo.setBounds(920, 160, 17, 14);

        lblcodigo1.setText("cate");
        getContentPane().add(lblcodigo1);
        lblcodigo1.setBounds(920, 190, 21, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbbaremoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbbaremoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbbaremoMouseClicked

    private void tbbaremoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbbaremoMousePressed
        // TODO add your handling code here:
        if (evt.getClickCount()==2){
            //habilar los elementos para su modificacion

            try {
                int fila =tbbaremo.rowAtPoint(evt.getPoint());
                frminstitucion.txtcodigoInstitucion.setText(tbbaremo.getValueAt(fila, 0).toString());
                frminstitucion.txtnombreInstitucion.setText(tbbaremo.getValueAt(fila, 1).toString());
                frminstitucion.txtcargoContacto.setText(tbbaremo.getValueAt(fila, 2).toString());
                frminstitucion.txttelefono.setText(tbbaremo.getValueAt(fila, 3).toString());
                frminstitucion.txtdireccion.setText(tbbaremo.getValueAt(fila, 4).toString());
                frminstitucion.txtcontactoOrganizacion.setText(tbbaremo.getValueAt(fila, 5).toString());
                frminstitucion.txtrif.setText(tbbaremo.getValueAt(fila, 6).toString());
                frminstitucion.txttelefonoContacto.setText(tbbaremo.getValueAt(fila, 7).toString());
                frminstitucion.btnhabilitar.doClick();
                this.dispose();
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_tbbaremoMousePressed

    private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnmenuActionPerformed

    private void cbcategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbcategoriaItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbcategoriaItemStateChanged

    private void cbcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcategoriaActionPerformed
        Object dato =(String)cbcategoria.getSelectedItem();
        String nombre= String.valueOf(dato);
        cargarCategoria(nombre);
        mostrar(txtcodigoInstitucion.getText(),txtcodigoCategorias.getText());
    }//GEN-LAST:event_cbcategoriaActionPerformed

    private void txtnombreInstitucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreInstitucionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreInstitucionActionPerformed

    private void txtnombreInstitucionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreInstitucionKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtnombreInstitucionKeyPressed

    private void txtnombreInstitucionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreInstitucionKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreInstitucionKeyReleased

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        
        mostrar(txtcodigoInstitucion.getText(),txtcodigoCategorias.getText());
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        int limite=Integer.parseInt(lblTotal.getText());
        boolean estado=false;
        for (int i=0;i<limite;i++){      
        try {
            vestudiosInstitucion dts= new vestudiosInstitucion();
            fbaremo func=new fbaremo();

            dts.setNombre(tbbaremo.getValueAt(i, 1).toString());
            System.out.println(tbbaremo.getValueAt(i, 1).toString());
            dts.setPrecios(Double.parseDouble(tbbaremo.getValueAt(i, 2).toString()));
            dts.setNumeroEstudio(Integer.parseInt(tbbaremo.getValueAt(i, 0).toString()));
            estado=func.modificar(dts);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error al intentar modificar el registro.");
            JOptionPane.showMessageDialog(rootPane, e);
        }
        }
        if(estado==true){
        JOptionPane.showMessageDialog(rootPane, "Registros modificados exitosamente.");
        }
        
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncancelarActionPerformed
private Connection connection= new conexion().conectar();  
    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        Map p= new HashMap();
        p.put("codigoInstitucion", Integer.parseInt(txtcodigoInstitucion.getText()));
        JasperReport report;
        JasperPrint print;
        
        try {
            report=JasperCompileManager.compileReport(new File("").getAbsolutePath()+
            "/src/REPORTES/rptBaremo.jrxml");
            
            print=JasperFillManager.fillReport(report, p,connection);
            
            JasperViewer view= new JasperViewer(print, false);
            view.setTitle("Baremo de institucion");
            view.setVisible(true);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnReporteActionPerformed

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
            java.util.logging.Logger.getLogger(frmbaremo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmbaremo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmbaremo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmbaremo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmbaremo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnmenu;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JComboBox cbcategoria;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblcodigo;
    private javax.swing.JLabel lblcodigo1;
    private javax.swing.JLabel lblcodigo4;
    private javax.swing.JLabel lblnombre;
    private java.awt.Panel panel2;
    public static javax.swing.JTable tbbaremo;
    public static javax.swing.JTextField txtcodigoCategorias;
    public static javax.swing.JTextField txtcodigoInstitucion;
    public static javax.swing.JTextField txtnombreInstitucion;
    // End of variables declaration//GEN-END:variables
}