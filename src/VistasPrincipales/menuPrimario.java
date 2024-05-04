package VistasPrincipales;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
/**
 *
 * @author Laura Pineda
 */
public class menuPrimario extends javax.swing.JFrame {

  
    public menuPrimario() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnBorrar = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnModificar = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btnConsultar = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnAgregar1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btnListar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        alumno1 = new javax.swing.JLabel();
        alumno2 = new javax.swing.JLabel();
        alumno3 = new javax.swing.JLabel();
        alumno4 = new javax.swing.JLabel();
        alumno5 = new javax.swing.JLabel();
        alumno6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 100, 150));

        jPanel5.setBackground(new java.awt.Color(0, 98, 147));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBorrar.setText("BORRAR MATERIAL");
        btnBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBorrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBorrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(0, 98, 147));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel6MouseExited(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnModificar.setText("MODIFICAR MATERIAL");
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(0, 98, 147));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
        });

        btnConsultar.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnConsultar.setText("CONSULTAR MATERIAL");
        btnConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsultarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsultarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(0, 98, 147));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel8MouseExited(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSalir.setText("SALIR");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 98, 147));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });

        btnAgregar1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnAgregar1.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAgregar1.setText("AGREGAR MATERIAL");
        btnAgregar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregar1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(0, 98, 147));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel9MouseExited(evt);
            }
        });

        btnListar.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnListar.setForeground(new java.awt.Color(255, 255, 255));
        btnListar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnListar.setText("LISTAR MATERIAL");
        btnListar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnListarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnListarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnListar, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jPanel2.setBackground(new java.awt.Color(134, 143, 146));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MEDIATECA");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("INTEGRANTES:");

        alumno1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        alumno1.setForeground(new java.awt.Color(255, 255, 255));
        alumno1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alumno1.setText("LAURA SOFÍA PINEDA CASTRO");
        alumno1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                alumno1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                alumno1MouseExited(evt);
            }
        });

        alumno2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        alumno2.setForeground(new java.awt.Color(255, 255, 255));
        alumno2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alumno2.setText("KEVIN OSWALDO ÁLVAREZ ROSALES");
        alumno2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                alumno2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                alumno2MouseExited(evt);
            }
        });

        alumno3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        alumno3.setForeground(new java.awt.Color(255, 255, 255));
        alumno3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alumno3.setText("DIEGO JOSUÉ PADILLA ARÉVALO");
        alumno3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                alumno3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                alumno3MouseExited(evt);
            }
        });

        alumno4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        alumno4.setForeground(new java.awt.Color(255, 255, 255));
        alumno4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alumno4.setText("JOSÉ ABRAHAM VÁSQUEZ RAMOS");
        alumno4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                alumno4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                alumno4MouseExited(evt);
            }
        });

        alumno5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        alumno5.setForeground(new java.awt.Color(255, 255, 255));
        alumno5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alumno5.setText("LUIS GUSTAVO HERNÁNDEZ RIVAS");
        alumno5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                alumno5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                alumno5MouseExited(evt);
            }
        });

        alumno6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        alumno6.setForeground(new java.awt.Color(255, 255, 255));
        alumno6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alumno6.setText("RONALD ALEXANDER MARTÍNEZ GUTIÉRREZ");
        alumno6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                alumno6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                alumno6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alumno2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alumno1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alumno3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alumno6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alumno4, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alumno5, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(32, 32, 32)
                .addComponent(alumno1)
                .addGap(40, 40, 40)
                .addComponent(alumno2)
                .addGap(39, 39, 39)
                .addComponent(alumno3)
                .addGap(36, 36, 36)
                .addComponent(alumno4)
                .addGap(34, 34, 34)
                .addComponent(alumno5)
                .addGap(31, 31, 31)
                .addComponent(alumno6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alumno1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alumno1MouseEntered
        alumno1.setForeground(new Color(0,0,0));
        alumno1.setFont(new Font( "Tahoma", Font.BOLD, 18));
    }//GEN-LAST:event_alumno1MouseEntered

    private void alumno1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alumno1MouseExited
        alumno1.setForeground(new Color(255,255,255));
        alumno1.setFont(new Font( "Tahoma", Font.BOLD, 14));
    }//GEN-LAST:event_alumno1MouseExited

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        Object[] opciones = {"Aceptar", "Cancelar"};
        Component rootPane = null;
        int eleccion = JOptionPane.showOptionDialog(rootPane, "¿Desea cerrar la aplicacion?",
                "Mensaje de confirmacion", JOptionPane.YES_NO_OPTION,
                QUESTION_MESSAGE, null, opciones, "Aceptar");

        if (eleccion == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {

        }
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        jPanel8.setBackground(new Color(5,124,222));
        btnSalir.setFont(new Font( "Rockwell", Font.BOLD, 18));
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        jPanel8.setBackground(new Color(0,100,150));
        btnSalir.setFont(new Font( "Rockwell", Font.BOLD, 14));
    }//GEN-LAST:event_btnSalirMouseExited

    private void alumno2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alumno2MouseEntered
        alumno2.setForeground(new Color(0,0,0));
        alumno2.setFont(new Font( "Tahoma", Font.BOLD, 18));
    }//GEN-LAST:event_alumno2MouseEntered

    private void alumno2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alumno2MouseExited
        alumno2.setForeground(new Color(255,255,255));
        alumno2.setFont(new Font( "Tahoma", Font.BOLD, 14));
    }//GEN-LAST:event_alumno2MouseExited

    private void alumno3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alumno3MouseEntered
        alumno3.setForeground(new Color(0,0,0));
        alumno3.setFont(new Font( "Tahoma", Font.BOLD, 18));
    }//GEN-LAST:event_alumno3MouseEntered

    private void alumno3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alumno3MouseExited
        alumno3.setForeground(new Color(255,255,255));
        alumno3.setFont(new Font( "Tahoma", Font.BOLD, 14));
    }//GEN-LAST:event_alumno3MouseExited

    private void alumno4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alumno4MouseEntered
        alumno4.setForeground(new Color(0,0,0));
        alumno4.setFont(new Font( "Tahoma", Font.BOLD, 18));
    }//GEN-LAST:event_alumno4MouseEntered

    private void alumno4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alumno4MouseExited
        alumno4.setForeground(new Color(255,255,255));
        alumno4.setFont(new Font( "Tahoma", Font.BOLD, 14));
    }//GEN-LAST:event_alumno4MouseExited

    private void alumno5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alumno5MouseEntered
        alumno5.setForeground(new Color(0,0,0));
        alumno5.setFont(new Font( "Tahoma", Font.BOLD, 18));
    }//GEN-LAST:event_alumno5MouseEntered

    private void alumno5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alumno5MouseExited
        alumno5.setForeground(new Color(255,255,255));
        alumno5.setFont(new Font( "Tahoma", Font.BOLD, 14));
    }//GEN-LAST:event_alumno5MouseExited

    private void alumno6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alumno6MouseEntered
        alumno6.setForeground(new Color(0,0,0));
        alumno6.setFont(new Font( "Tahoma", Font.BOLD, 18));
    }//GEN-LAST:event_alumno6MouseEntered

    private void alumno6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alumno6MouseExited
        alumno6.setForeground(new Color(255,255,255));
        alumno6.setFont(new Font( "Tahoma", Font.BOLD, 14));
    }//GEN-LAST:event_alumno6MouseExited

    private void btnBorrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseEntered
        jPanel5.setBackground(new Color(5,124,222));
        btnBorrar.setFont(new Font( "Rockwell", Font.BOLD, 18));
    }//GEN-LAST:event_btnBorrarMouseEntered

    private void btnBorrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseExited
        jPanel5.setBackground(new Color(0,100,150));
        btnBorrar.setFont(new Font( "Rockwell", Font.BOLD, 14));
    }//GEN-LAST:event_btnBorrarMouseExited

    private void btnModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseEntered
        jPanel6.setBackground(new Color(5,124,222));
        btnModificar.setFont(new Font( "Rockwell", Font.BOLD, 18));
    }//GEN-LAST:event_btnModificarMouseEntered

    private void btnModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseExited
        jPanel6.setBackground(new Color(0,100,150));
        btnModificar.setFont(new Font( "Rockwell", Font.BOLD, 14));
    }//GEN-LAST:event_btnModificarMouseExited

    private void btnConsultarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMouseEntered
        jPanel7.setBackground(new Color(5,124,222));
        btnConsultar.setFont(new Font( "Rockwell", Font.BOLD, 18));
    }//GEN-LAST:event_btnConsultarMouseEntered

    private void btnConsultarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMouseExited
        jPanel7.setBackground(new Color(0,100,150));
        btnConsultar.setFont(new Font( "Rockwell", Font.BOLD, 14));
    }//GEN-LAST:event_btnConsultarMouseExited

    private void btnBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseClicked
        menuBorrar borrar = new menuBorrar();
        borrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBorrarMouseClicked

    private void btnAgregar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregar1MouseClicked
        menuAgregar agregar = new menuAgregar();
        agregar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregar1MouseClicked

    private void btnAgregar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregar1MouseEntered
        btnAgregar1.setFont(new Font( "Rockwell", Font.BOLD, 18));
        jPanel3.setBackground(new Color(5,124,222));
    }//GEN-LAST:event_btnAgregar1MouseEntered

    private void btnAgregar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregar1MouseExited
        jPanel3.setBackground(new Color(0,100,150));
        btnAgregar1.setFont(new Font( "Rockwell", Font.BOLD, 14));
    }//GEN-LAST:event_btnAgregar1MouseExited

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        jPanel5.setBackground(new Color(5,124,222));
        btnBorrar.setFont(new Font( "Rockwell", Font.BOLD, 18));
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
        jPanel6.setBackground(new Color(5,124,222));
        btnModificar.setFont(new Font( "Rockwell", Font.BOLD, 18));
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        jPanel7.setBackground(new Color(5,124,222));
        btnConsultar.setFont(new Font( "Rockwell", Font.BOLD, 18));
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered
        jPanel8.setBackground(new Color(5,124,222));
        btnSalir.setFont(new Font( "Rockwell", Font.BOLD, 18));
    }//GEN-LAST:event_jPanel8MouseEntered

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        jPanel3.setBackground(new Color(5,124,222));
        btnAgregar1.setFont(new Font( "Rockwell", Font.BOLD, 18));
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        jPanel3.setBackground(new Color(0,100,150));
         btnAgregar1.setFont(new Font( "Rockwell", Font.BOLD, 14));
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        jPanel5.setBackground(new Color(0,100,150));
        btnBorrar.setFont(new Font( "Rockwell", Font.BOLD, 14));
    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
        jPanel6.setBackground(new Color(0,100,150));
        btnModificar.setFont(new Font( "Rockwell", Font.BOLD, 14));
    }//GEN-LAST:event_jPanel6MouseExited

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        jPanel7.setBackground(new Color(0,100,150));
        btnConsultar.setFont(new Font( "Rockwell", Font.BOLD, 14));
    }//GEN-LAST:event_jPanel7MouseExited

    private void jPanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseExited
        jPanel8.setBackground(new Color(0,100,150));
        btnSalir.setFont(new Font( "Rockwell", Font.BOLD, 14));
    }//GEN-LAST:event_jPanel8MouseExited

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        menuModificar modificar = new menuModificar();
        modificar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnModificarMouseClicked

    private void btnConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMouseClicked
        menuConsultar consultar = new menuConsultar();
        consultar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConsultarMouseClicked

    private void btnListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarMouseClicked
        menuListar Listar = new menuListar();
        Listar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListarMouseClicked

    private void btnListarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarMouseEntered
        jPanel9.setBackground(new Color(5,124,222));
        btnListar.setFont(new Font( "Rockwell", Font.BOLD, 18));
    }//GEN-LAST:event_btnListarMouseEntered

    private void btnListarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarMouseExited
        jPanel9.setBackground(new Color(0,100,150));
        btnListar.setFont(new Font( "Rockwell", Font.BOLD, 14));
    }//GEN-LAST:event_btnListarMouseExited

    private void jPanel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseEntered
         jPanel9.setBackground(new Color(5,124,222));
        btnListar.setFont(new Font( "Rockwell", Font.BOLD, 18));
    }//GEN-LAST:event_jPanel9MouseEntered

    private void jPanel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseExited
        jPanel9.setBackground(new Color(0,100,150));
        btnListar.setFont(new Font( "Rockwell", Font.BOLD, 14));
    }//GEN-LAST:event_jPanel9MouseExited

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
            java.util.logging.Logger.getLogger(menuPrimario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPrimario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPrimario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPrimario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrimario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alumno1;
    private javax.swing.JLabel alumno2;
    private javax.swing.JLabel alumno3;
    private javax.swing.JLabel alumno4;
    private javax.swing.JLabel alumno5;
    private javax.swing.JLabel alumno6;
    private javax.swing.JLabel btnAgregar1;
    private javax.swing.JLabel btnBorrar;
    private javax.swing.JLabel btnConsultar;
    private javax.swing.JLabel btnListar;
    private javax.swing.JLabel btnModificar;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
