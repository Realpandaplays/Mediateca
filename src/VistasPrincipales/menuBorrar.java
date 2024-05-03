
package VistasPrincipales;

import Vistas.libro.Borrar;
import Vistas.revista.BorrarR;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Laura Pineda
 */
public class menuBorrar extends javax.swing.JFrame {

    /**
     * Creates new form menuBorrar
     */
    public menuBorrar() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtEliminar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnLibro = new javax.swing.JLabel();
        btnRevista = new javax.swing.JLabel();
        btnCd = new javax.swing.JLabel();
        btnDvd = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtLibro = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtRevista = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtCd = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        txtDvd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(134, 143, 146));

        txtEliminar.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        txtEliminar.setForeground(new java.awt.Color(255, 255, 255));
        txtEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEliminar.setText("ELIMINAR MATERIAL");
        txtEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtEliminarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnLibro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/libro 124x124.png"))); // NOI18N
        btnLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLibroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLibroMouseExited(evt);
            }
        });

        btnRevista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/revista.jpg"))); // NOI18N
        btnRevista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRevista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRevistaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRevistaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRevistaMouseExited(evt);
            }
        });

        btnCd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cd.jpg"))); // NOI18N
        btnCd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCdMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCdMouseExited(evt);
            }
        });

        btnDvd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/dvd.jpg"))); // NOI18N
        btnDvd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDvd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDvdMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDvdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDvdMouseExited(evt);
            }
        });

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/regreso (1).png"))); // NOI18N
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });

        txtLibro.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        txtLibro.setForeground(new java.awt.Color(100, 100, 100));
        txtLibro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLibro.setText("LIBRO");
        txtLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtLibroMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
        });

        txtRevista.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        txtRevista.setForeground(new java.awt.Color(100, 100, 100));
        txtRevista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRevista.setText("REVISTA");
        txtRevista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtRevistaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtRevistaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtRevista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtRevista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel6MouseExited(evt);
            }
        });

        txtCd.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        txtCd.setForeground(new java.awt.Color(100, 100, 100));
        txtCd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCd.setText("CD");
        txtCd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtCdMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCd, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
        });

        txtDvd.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        txtDvd.setForeground(new java.awt.Color(100, 100, 100));
        txtDvd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDvd.setText("DVD");
        txtDvd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtDvdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtDvdMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDvd, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(txtDvd)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRevista, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(btnCd, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(btnDvd, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))))
                .addGap(34, 34, 34))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCd, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRevista, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDvd, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEliminarMouseEntered
       
    }//GEN-LAST:event_txtEliminarMouseEntered

    private void txtEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEliminarMouseExited
       
    }//GEN-LAST:event_txtEliminarMouseExited

    private void btnLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLibroMouseEntered
        txtLibro.setForeground(new Color(0,0,0));
        jPanel4.setBackground(new Color(219,211,211));
        txtLibro.setFont(new Font( "Rockwell", Font.BOLD, 18));
    }//GEN-LAST:event_btnLibroMouseEntered

    private void btnLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLibroMouseExited
        txtLibro.setFont(new Font( "Rockwell", Font.BOLD, 14));
        jPanel4.setBackground(new Color(255,255,255));
        txtLibro.setForeground(new Color(100,100,100));
    }//GEN-LAST:event_btnLibroMouseExited

    private void btnRevistaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRevistaMouseEntered
        txtRevista.setForeground(new Color(0,0,0));
        jPanel5.setBackground(new Color(219,211,211));
        txtRevista.setFont(new Font( "Rockwell", Font.BOLD, 18));
    }//GEN-LAST:event_btnRevistaMouseEntered

    private void btnRevistaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRevistaMouseExited
        txtRevista.setFont(new Font( "Rockwell", Font.BOLD, 14));
        jPanel5.setBackground(new Color(255,255,255));
        txtRevista.setForeground(new Color(100,100,100));
    }//GEN-LAST:event_btnRevistaMouseExited

    private void btnCdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCdMouseEntered
        txtCd.setForeground(new Color(0,0,0));
        jPanel6.setBackground(new Color(219,211,211));
        txtCd.setFont(new Font( "Rockwell", Font.BOLD, 18));
    }//GEN-LAST:event_btnCdMouseEntered

    private void btnCdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCdMouseExited
        txtCd.setFont(new Font( "Rockwell", Font.BOLD, 14));
        jPanel6.setBackground(new Color(255,255,255));
        txtCd.setForeground(new Color(100,100,100));
    }//GEN-LAST:event_btnCdMouseExited

    private void btnDvdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDvdMouseEntered
        txtDvd.setForeground(new Color(0,0,0));
        jPanel7.setBackground(new Color(219,211,211));
        txtDvd.setFont(new Font( "Rockwell", Font.BOLD, 18));
    }//GEN-LAST:event_btnDvdMouseEntered

    private void btnDvdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDvdMouseExited
        txtDvd.setFont(new Font( "Rockwell", Font.BOLD, 14));
        jPanel7.setBackground(new Color(255,255,255));
        txtDvd.setForeground(new Color(100,100,100));
    }//GEN-LAST:event_btnDvdMouseExited

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        menuPrimario principal = new menuPrimario();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void btnRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseEntered
        btnRegresar.setBackground(new Color(134,143,146));
    }//GEN-LAST:event_btnRegresarMouseEntered

    private void btnRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseExited
        btnRegresar.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnRegresarMouseExited

    private void txtLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLibroMouseEntered
        txtLibro.setForeground(new Color(0,0,0));
        jPanel4.setBackground(new Color(219,211,211));
        txtLibro.setFont(new Font( "Rockwell", Font.BOLD, 18));
    }//GEN-LAST:event_txtLibroMouseEntered

    private void txtLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLibroMouseExited
        txtLibro.setFont(new Font( "Rockwell", Font.BOLD, 14));
        jPanel4.setBackground(new Color(255,255,255));
        txtLibro.setForeground(new Color(100,100,100));
    }//GEN-LAST:event_txtLibroMouseExited

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        jPanel4.setBackground(new Color(219,211,211));
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        jPanel4.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jPanel4MouseExited

    private void txtRevistaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRevistaMouseEntered
        txtRevista.setForeground(new Color(0,0,0));
        jPanel5.setBackground(new Color(219,211,211));
        txtRevista.setFont(new Font( "Rockwell", Font.BOLD, 18));
    }//GEN-LAST:event_txtRevistaMouseEntered

    private void txtRevistaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRevistaMouseExited
        txtRevista.setFont(new Font( "Rockwell", Font.BOLD, 14));
        jPanel5.setBackground(new Color(255,255,255));
        txtRevista.setForeground(new Color(100,100,100));
    }//GEN-LAST:event_txtRevistaMouseExited

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        jPanel5.setBackground(new Color(219,211,211));
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        jPanel5.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jPanel5MouseExited

    private void txtCdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCdMouseEntered
        txtCd.setForeground(new Color(0,0,0));
        jPanel6.setBackground(new Color(219,211,211));
        txtCd.setFont(new Font( "Rockwell", Font.BOLD, 18));
    }//GEN-LAST:event_txtCdMouseEntered

    private void txtCdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCdMouseExited
        txtCd.setFont(new Font( "Rockwell", Font.BOLD, 14));
        jPanel6.setBackground(new Color(255,255,255));
        txtCd.setForeground(new Color(100,100,100));
    }//GEN-LAST:event_txtCdMouseExited

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
        jPanel6.setBackground(new Color(219,211,211));
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
        jPanel6.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jPanel6MouseExited

    private void txtDvdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDvdMouseEntered
        txtDvd.setForeground(new Color(0,0,0));
        jPanel7.setBackground(new Color(219,211,211));
        txtDvd.setFont(new Font( "Rockwell", Font.BOLD, 18));
    }//GEN-LAST:event_txtDvdMouseEntered

    private void txtDvdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDvdMouseExited
        txtDvd.setFont(new Font( "Rockwell", Font.BOLD, 14));
        jPanel7.setBackground(new Color(255,255,255));
        txtDvd.setForeground(new Color(100,100,100));
    }//GEN-LAST:event_txtDvdMouseExited

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        jPanel7.setBackground(new Color(219,211,211));
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        jPanel7.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jPanel7MouseExited

    private void btnLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLibroMouseClicked
        Borrar libro = new Borrar();
        libro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLibroMouseClicked

    private void btnRevistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRevistaMouseClicked
        BorrarR revista = new BorrarR();
        revista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRevistaMouseClicked

    private void btnCdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCdMouseClicked

    private void btnDvdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDvdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDvdMouseClicked

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
            java.util.logging.Logger.getLogger(menuBorrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuBorrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuBorrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuBorrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuBorrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCd;
    private javax.swing.JLabel btnDvd;
    private javax.swing.JLabel btnLibro;
    private javax.swing.JLabel btnRegresar;
    private javax.swing.JLabel btnRevista;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel txtCd;
    private javax.swing.JLabel txtDvd;
    private javax.swing.JLabel txtEliminar;
    private javax.swing.JLabel txtLibro;
    private javax.swing.JLabel txtRevista;
    // End of variables declaration//GEN-END:variables
}
