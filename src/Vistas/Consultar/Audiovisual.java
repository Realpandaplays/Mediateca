/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Consultar;
import Clases.MaterialCDClases;
import Clases.MaterialDVDClases;
import Clases.MaterialLibroClases;
import Clases.MaterialRevistaClases;
import Logico.ConexionMySQL;
import Logico.MaterialCD;
import Logico.MaterialDVD;
import Logico.MaterialLibro;
import Logico.MaterialRevista;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kevin
 */
//**Master bueno**/

public class Audiovisual extends javax.swing.JFrame {

    private MaterialDVD MaterialDVD = new MaterialDVD ((Connection) ConexionMySQL.obtenerConexion());
    private MaterialDVDClases dvd = null;
    
    private MaterialCD MaterialCD = new MaterialCD ((Connection) ConexionMySQL.obtenerConexion());
    private MaterialCDClases CD = null;
    
    /**
     * Creates new form Escrito
     */
    public Audiovisual() {
        initComponents();
        cargarTableDVD();
        cargarTableCD();
    }
    
     private void cargarTableCD(){
        
         try{
         Connection con = ConexionMySQL.obtenerConexion();
         
         Statement st = con.createStatement();
         
         String sql = "Select IdInterno, titulo, artista, genero, numCanciones, uniDisp from cd";
         ResultSet rs = st.executeQuery(sql);
         
         while(rs.next()){
             
         String id = rs.getString("idInterno");
         String titulo = rs.getString("titulo");
         String artista = rs.getString("artista");
         String genero = rs.getString("genero");
         String numCanciones = String.valueOf(rs.getInt("numCanciones"));
         String uniDispo = String.valueOf(rs.getInt("uniDisp"));
         //Arreglo de datos
         String tbData[] = {id, titulo, artista, genero, numCanciones, uniDispo};
         DefaultTableModel tblModelCD = (DefaultTableModel)jTableCD.getModel();
         
         //Agregando arreglo a la tabla
         tblModelCD.addRow(tbData);  
         }
        con.close();
         
         }
         catch(Exception e){
         
         JOptionPane.showMessageDialog(null, "un error ha ocurrido"
                    + e,
                    "Error", JOptionPane.ERROR_MESSAGE);
         }
    }
    
     private void cargarTableDVD(){
        
         try{
         Connection con = ConexionMySQL.obtenerConexion();
         
         Statement st = con.createStatement();
         
         String sql = "Select * from DVD";
         ResultSet rs = st.executeQuery(sql);
         
         while(rs.next()){
             
         String id = String.valueOf(rs.getInt("idInterno"));
         String titulo = rs.getString("titulo");
         String genero = rs.getString("genero");
         String director = rs.getString("director");
         
         //Arreglo de datos
         String tbData[] = {id, titulo, genero, director};
         DefaultTableModel tblModelRevistas = (DefaultTableModel)jTableDVD.getModel();
         
         //Agregando arreglo a la tabla
         tblModelRevistas.addRow(tbData);  
         }
         }
         catch(Exception e){
         
         JOptionPane.showMessageDialog(null, "un error ha ocurrido"
                    + e,
                    "Error", JOptionPane.ERROR_MESSAGE);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCD = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtAgregar = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnBuscarCD = new javax.swing.JButton();
        txtCodigoCD = new javax.swing.JTextField();
        jBusquedaL = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        btnReiniciarCD = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDVD = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnBuscarDVD = new javax.swing.JButton();
        jBusquedaR = new javax.swing.JLabel();
        txtCodigoDVD = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnReiniciarDVD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableCD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Titulo", "Artista", "Genero", "Numero canciones", "UniDisponibles"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableCD);

        jPanel2.setBackground(new java.awt.Color(134, 143, 146));

        txtAgregar.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        txtAgregar.setForeground(new java.awt.Color(255, 255, 255));
        txtAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAgregar.setText("MATERIAL AUDIOVISUAL");
        txtAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtAgregarMouseExited(evt);
            }
        });

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/regreso (1).png"))); // NOI18N
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegresarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(txtAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnBuscarCD.setText("Buscar  CD");
        btnBuscarCD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarCDMouseClicked(evt);
            }
        });
        btnBuscarCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCDActionPerformed(evt);
            }
        });

        jBusquedaL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBusquedaL.setText("Busqueda CD");

        label1.setText("Se busca atraves de codigo");

        btnReiniciarCD.setText("Reiniciar Lista");
        btnReiniciarCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarCDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBusquedaL)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnReiniciarCD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscarCD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoCD, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBusquedaL)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnReiniciarCD)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        jTableDVD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Titulo", "Genero", "Director"
            }
        ));
        jScrollPane2.setViewportView(jTableDVD);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setText("CD");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setText("DVD");

        btnBuscarDVD.setText("Buscar DVD");
        btnBuscarDVD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarDVDMouseClicked(evt);
            }
        });

        jBusquedaR.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBusquedaR.setText("Busqueda DVD");

        jLabel8.setText("Se busca atraves de codigo");

        btnReiniciarDVD.setText("Reiniciar Lista");
        btnReiniciarDVD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReiniciarDVDMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBusquedaR)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnReiniciarDVD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscarDVD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtCodigoDVD, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBusquedaR)
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarDVD)
                    .addComponent(txtCodigoDVD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(29, 29, 29)
                .addComponent(btnReiniciarDVD)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel7))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(218, 218, 218)
                            .addComponent(jLabel6))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgregarMouseEntered

    }//GEN-LAST:event_txtAgregarMouseEntered

    private void txtAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgregarMouseExited

    }//GEN-LAST:event_txtAgregarMouseExited

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        VistasPrincipales.menuPrimario principal = new VistasPrincipales.menuPrimario();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void btnRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseEntered
        btnRegresar.setBackground(new Color(134,143,146));
    }//GEN-LAST:event_btnRegresarMouseEntered

    private void btnRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseExited
        btnRegresar.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnRegresarMouseExited

    private void btnBuscarCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCDActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_btnBuscarCDActionPerformed

    private void btnBuscarDVDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarDVDMouseClicked
       /** if (txtCodigoDVD.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo Codigo no puede estar en blanco.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else if (!MaterialDVD.localizarMaterialRevista(txtCodigoDVD.getText().trim())) {
            JOptionPane.showMessageDialog(null, "No existe este codigo, resgistrado"
                    + "\n Imposible buscar",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Revista = MaterialRevista.seleccionarMaterialRevista(txtCodigoDVD.getText().trim());
            cargartablebusquedaRevistas(Revista);
            txtCodigoDVD.setText(null);
    }//GEN-LAST:event_btnBuscarDVDMouseClicked
    **/}
    
    private void btnReiniciarDVDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReiniciarDVDMouseClicked
        // TODO add your handling code here:
         DefaultTableModel tblModelDVD = (DefaultTableModel)jTableDVD.getModel();
         while (tblModelDVD.getRowCount()>0)
          {
             tblModelDVD.removeRow(0);
          }
         cargarTableDVD();
         txtCodigoDVD.setText(null);
    }//GEN-LAST:event_btnReiniciarDVDMouseClicked

    private void btnReiniciarCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarCDActionPerformed
        // TODO add your handling code here:
        
         DefaultTableModel tblModelCD = (DefaultTableModel)jTableCD.getModel();
         while (tblModelCD.getRowCount()>0)
          {
             tblModelCD.removeRow(0);
          }
       cargarTableCD();
       txtCodigoCD.setText(null);
    }//GEN-LAST:event_btnReiniciarCDActionPerformed

    private void btnBuscarCDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarCDMouseClicked
        // TODO add your handling code here:
        if (txtCodigoCD.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo Codigo no puede estar en blanco.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else if (!MaterialCD.localizarMaterialCD(txtCodigoCD.getText().trim())) {
            JOptionPane.showMessageDialog(null, "No existe este codigo, resgistrado"
                    + "\n Imposible buscar",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            
            CD = MaterialCD.seleccionarMaterialCD(txtCodigoCD.getText().trim());
            cargartablebusquedaCD(CD);
             txtCodigoCD.setText(null);
    }//GEN-LAST:event_btnBuscarCDMouseClicked
    }
    
    
     private void cargartablebusquedaCD(MaterialCDClases CD){
        String id = CD.getidInterno();
        String titulo = CD.gettitulo();
        String artista = CD.getartista();
        String genero = CD.getgenero();
        String numCanciones = String.valueOf(CD.getnumCanciones());
        String UniDispo = String.valueOf(CD.getuniDisp());
         //Arreglo de datos
         String tbData[] = {id, titulo, artista, genero, numCanciones, UniDispo};
         DefaultTableModel CdMostrar = (DefaultTableModel)jTableCD.getModel();
         
         //Agregando arreglo a la tabla
         CdMostrar.setRowCount(0);
         CdMostrar.addRow(tbData);  
    }
    
    private void cargartablebusquedaRevistas(MaterialRevistaClases Revista){
            String id = Revista.getidInterno();
         String titulo = Revista.gettitulo();
         String editorial = Revista.geteditorial();
         String disponibles = String.valueOf(Revista.getuniDispo());
         String fecha = Revista.getfechaPubli();
         
         //Arreglo de datos
         String tbData[] = {id, titulo, editorial, fecha, disponibles};
         DefaultTableModel tblModelRevistas = (DefaultTableModel)jTableDVD.getModel();
         
         //Agregando arreglo a la tabla
         tblModelRevistas.setRowCount(0);
         tblModelRevistas.addRow(tbData);  
    }
    
   
    
    
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
            java.util.logging.Logger.getLogger(Audiovisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Audiovisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Audiovisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Audiovisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Audiovisual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCD;
    private javax.swing.JButton btnBuscarDVD;
    private javax.swing.JLabel btnRegresar;
    private javax.swing.JButton btnReiniciarCD;
    private javax.swing.JButton btnReiniciarDVD;
    private javax.swing.JLabel jBusquedaL;
    private javax.swing.JLabel jBusquedaR;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCD;
    private javax.swing.JTable jTableDVD;
    private java.awt.Label label1;
    private javax.swing.JLabel txtAgregar;
    private javax.swing.JTextField txtCodigoCD;
    private javax.swing.JTextField txtCodigoDVD;
    // End of variables declaration//GEN-END:variables
}
