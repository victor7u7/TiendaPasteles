/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasteleria;
import main.main;
import conexion.ConexionDB;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author israe
 */

public class login extends javax.swing.JFrame {

    
    private ConexionDB cx;
    public login() {
        
        initComponents();
        oculta.setVisible(false);
        cx=new ConexionDB();
        cx.conectar();   
        
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
        txtUsuario = new javax.swing.JTextField();
        labelUsuario1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelPastel = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        labelBtnCancelar = new javax.swing.JLabel();
        labelBtnIngresar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        ver = new javax.swing.JLabel();
        oculta = new javax.swing.JLabel();
        jLabelFondoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 562));

        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 560));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 290, 40));

        labelUsuario1.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        labelUsuario1.setForeground(new java.awt.Color(0, 0, 0));
        labelUsuario1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUsuario1.setText("CONTRASEÑA:");
        jPanel1.add(labelUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 240, 290, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo icono pastel.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, 80));

        jLabelPastel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pastel login.png"))); // NOI18N
        jPanel1.add(jLabelPastel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 260, 250));

        labelUsuario.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(0, 0, 0));
        labelUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUsuario.setText("USUARIO: ");
        jPanel1.add(labelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 70, 290, -1));

        labelBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buttoncancelar.png"))); // NOI18N
        labelBtnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBtnCancelarMouseClicked(evt);
            }
        });
        jPanel1.add(labelBtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 130, 50));

        labelBtnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buttonIngresa.png"))); // NOI18N
        labelBtnIngresar.setText("jLabel13");
        labelBtnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBtnIngresarMouseClicked(evt);
            }
        });
        jPanel1.add(labelBtnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 130, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo icono pastel.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo icono pastel.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, -1, 80));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo icono pastel.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, -1, 80));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo icono pastel.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 220, -1, 80));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo icono pastel.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, 80));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo icono pastel.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, 80));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo icono pastel 2.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 290, -1, 80));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo icono pastel 2.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, 80));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo icono pastel 2.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, -1, 80));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo icono pastel 2.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, -1, 80));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo icono pastel 2.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 440, -1, 80));

        passwordTxt.setBackground(new java.awt.Color(255, 255, 255));
        passwordTxt.setColumns(2);
        passwordTxt.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        passwordTxt.setForeground(new java.awt.Color(0, 0, 0));
        passwordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtActionPerformed(evt);
            }
        });
        jPanel1.add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 230, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ver.setBackground(new java.awt.Color(255, 255, 255));
        ver.setForeground(new java.awt.Color(255, 255, 255));
        ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eyeVER.png"))); // NOI18N
        ver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verMouseClicked(evt);
            }
        });
        jPanel2.add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        oculta.setBackground(new java.awt.Color(255, 255, 255));
        oculta.setForeground(new java.awt.Color(255, 255, 255));
        oculta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/EyeOculta.png"))); // NOI18N
        oculta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        oculta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultaMouseClicked(evt);
            }
        });
        jPanel2.add(oculta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 60, 40));

        jLabelFondoLogin.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelFondoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoPantallaLogin.jpg"))); // NOI18N
        jLabelFondoLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelFondoLogin.setMinimumSize(new java.awt.Dimension(100, 562));
        jLabelFondoLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFondoLoginMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelFondoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelFondoLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFondoLoginMouseClicked

    }//GEN-LAST:event_jLabelFondoLoginMouseClicked

    private void passwordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtActionPerformed
        // TODO add your handling code here:
  
    }//GEN-LAST:event_passwordTxtActionPerformed

    private void verMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseClicked
        // TODO add your handling code here:
        ver.setVisible(false);
        oculta.setVisible(true);
        passwordTxt.setEchoChar((char)0);
    }//GEN-LAST:event_verMouseClicked

    private void ocultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultaMouseClicked
        // TODO add your handling code here:
        ver.setVisible(true);
        oculta.setVisible(false);
        passwordTxt.setEchoChar('●');
    }//GEN-LAST:event_ocultaMouseClicked

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
        passwordTxt.requestFocus(); // Cambia el foco al siguiente componente
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void labelBtnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBtnCancelarMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_labelBtnCancelarMouseClicked

    private void labelBtnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBtnIngresarMouseClicked
        // TODO add your handling code here:
      try {
    String usuario = txtUsuario.getText();
    String password = String.valueOf(passwordTxt.getPassword());
    String query = "SELECT * FROM USUARIOS WHERE CORREO='" + usuario + "' AND CONTRASENA ='" + password + "'";
    Connection con = cx.conectar();
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(query);
    
    if (rs.next()) {
        String tipoUsuario = rs.getString("TIPO_USUARIO");
        if ("ADMIN".equals(tipoUsuario)) {
            //System.out.println("Acceso como administrador");
            String nombreCompleto = rs.getString("NOMBRE") + " " + rs.getString("APELLIDO_PATERNO") + " " + rs.getString("APELLIDO_MATERNO");
            String correoUsuario = rs.getString("CORREO");
           
            
            // Mostrar en un JOptionPane
            String mensaje = "Acceso como administrador\nNombre completo: " + nombreCompleto + "\nCorreo: " + correoUsuario;
            JOptionPane.showMessageDialog(null, mensaje);
            
            // Abre la ventana de administrador
            new ventanaAdmin().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Bienvenido Usuario");
            System.out.println("Acceso como usuario");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Usuario no encontrado en la base de datos");
    }
} catch (SQLException ex) {
    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
}

    }//GEN-LAST:event_labelBtnIngresarMouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private transient javax.swing.JLabel jLabelFondoLogin;
    private javax.swing.JLabel jLabelPastel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelBtnCancelar;
    private javax.swing.JLabel labelBtnIngresar;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JLabel labelUsuario1;
    private javax.swing.JLabel oculta;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JLabel ver;
    // End of variables declaration//GEN-END:variables
}
