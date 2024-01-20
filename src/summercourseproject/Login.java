/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summercourseproject;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Login extends javax.swing.JFrame {

    private String name, selected;

    /**
     * Creates new form Login
     */
    public Login() {
        this.setTitle("Summer course project");
        this.setResizable(false);
        this.setLocation(500, 200);
        this.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_userName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_log = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        com = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        eye = new javax.swing.JLabel();
        txt_pass = new javax.swing.JPasswordField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 81, 128));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UserName : ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password : ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 225, -1, -1));

        txt_userName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userNameActionPerformed(evt);
            }
        });
        jPanel1.add(txt_userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 243, 29));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Login");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 152, 33));

        btn_log.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_log.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\icons\\lock1.png")); // NOI18N
        btn_log.setText("Login");
        btn_log.setEnabled(false);
        btn_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logActionPerformed(evt);
            }
        });
        jPanel1.add(btn_log, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 284, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 70, 10));

        com.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        com.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "Admin", "Users" }));
        com.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comActionPerformed(evt);
            }
        });
        jPanel1.add(com, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 109, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Role :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        show.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        show.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 284, 103, 42));

        eye.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eye.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\icons\\eyeoff.png")); // NOI18N
        eye.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eyeMouseClicked(evt);
            }
        });
        jPanel1.add(eye, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 30, -1));

        txt_pass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passActionPerformed(evt);
            }
        });
        jPanel1.add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 228, 243, -1));

        jMenu1.setText("About");

        jMenuItem1.setText("Details");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new About().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void txt_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passActionPerformed

    private void eyeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyeMouseClicked
        // TODO add your handling code here:
        String open = "C:\\Users\\Lenovo\\Desktop\\icons\\eyeopen.png";
        String off = "C:\\Users\\Lenovo\\Desktop\\icons\\eyeoff.png";
        if ((eye.getIcon() + "").equals(off)) {
            eye.setIcon(new ImageIcon(open));
            txt_pass.setEchoChar((char) 0);
        } else {
            eye.setIcon(new ImageIcon(off));
            txt_pass.setEchoChar('*');
        }
    }//GEN-LAST:event_eyeMouseClicked

    private void comActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comActionPerformed
        selected = "";
        selected = com.getSelectedItem().toString();
        if (!selected.equals("Default")) {
            btn_log.setEnabled(true);
        } else {
            btn_log.setEnabled(false);
        }
    }//GEN-LAST:event_comActionPerformed

    private void btn_logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logActionPerformed
        try {
            String userName = txt_userName.getText();
            String pass = String.valueOf(txt_pass.getPassword());
            if (!userName.isEmpty() && !pass.isEmpty()) {
                boolean check = DataBase.login(userName, pass, selected);
                if (check) {
                    if (selected.equals("Admin")) {
                        new ControlUser().setVisible(true);
                        this.dispose();
                    } else if (selected.equals("Users")) {
                        new BooksControl().setVisible(true);
                        this.dispose();
                    } else {
                        show.setText("");
                    }
                } else {
                    show.setText("Error");
                    JOptionPane.showMessageDialog(null, "Account Not Found");
                    txt_userName.setText("");
                    txt_pass.setText("");
                    return;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please Fill Inputs");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error text \n" + ex.getMessage());
        }
    }//GEN-LAST:event_btn_logActionPerformed

    private void txt_userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_userNameActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_log;
    private javax.swing.JComboBox<String> com;
    private javax.swing.JLabel eye;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel show;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_userName;
    // End of variables declaration//GEN-END:variables
}