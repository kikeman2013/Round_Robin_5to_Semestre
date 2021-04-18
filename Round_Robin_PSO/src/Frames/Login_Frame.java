
package Frames;

import Clases.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Login_Frame extends javax.swing.JFrame {

   String usr = "",pwd="";
   Usuario admin, moder, user;
   ArrayList<String> usrs = new ArrayList<>();
   ArrayList<String> pwds = new ArrayList<>();
   Arbolito ar = new Arbolito();
   int modo;
    public Login_Frame() {
        initComponents();
        admin = new Usuario("Administrador", "123456", 0);
        moder = new Usuario("Moderador", "654321", 1);
        user = new Usuario("Usuario", "000000", 2);
        ar.lf = this;
        setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxfUser = new javax.swing.JTextField();
        jbtnSalir = new javax.swing.JButton();
        jbtnSesion = new javax.swing.JButton();
        jpwdPwd = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Contraseña:");

        jtxfUser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jbtnSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnSalir.setText("Salir");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });

        jbtnSesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnSesion.setText("Iniciar Sesion");
        jbtnSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSesionActionPerformed(evt);
            }
        });

        jpwdPwd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Unidad VI : Seguridad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jbtnSesion)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbtnSalir)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jtxfUser, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jpwdPwd, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxfUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpwdPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnSesion)
                .addGap(18, 18, 18)
                .addComponent(jbtnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSesionActionPerformed
        usr = jtxfUser.getText();
        pwd = jpwdPwd.getText();
        if(!usr.trim().equalsIgnoreCase("")&&!pwd.trim().equalsIgnoreCase("")){
            System.out.println("holaaa");
            switch(usr){
                case "Administrador": if(pwd.equals("123456")){ 
                    ar.setVisible(true);
                    modo=0;
                    ar.rr.recmodo(modo);
                    //System.out.println("modo LF= " + modo);
                    this.dispose();
                }
                break;
                  case "Moderador": if(pwd.equals("654321")){ 
                    ar.setVisible(true);
                    modo=1;
                    ar.rr.recmodo(modo);
                    //System.out.println("modo LF= " + modo);
                    this.dispose();
                  }
                break;
                  case "Usuario": if(pwd.equals("000000")){ 
                    ar.setVisible(true);
                    modo=2;
                    ar.rr.recmodo(modo);
                    //System.out.println("modo LF= " + modo);
                    this.dispose();
                  }
                break;
                
                  default: JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
                           jtxfUser.setText("");
                           jpwdPwd.setText("");
                           break;
            }
        
        }
    }//GEN-LAST:event_jbtnSesionActionPerformed

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JButton jbtnSesion;
    private javax.swing.JPasswordField jpwdPwd;
    private javax.swing.JTextField jtxfUser;
    // End of variables declaration//GEN-END:variables
}
