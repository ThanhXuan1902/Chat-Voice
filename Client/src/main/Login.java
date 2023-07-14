package main;

import function.FileChooser;
import function.Method;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.filechooser.FileFilter;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        open();
    }

    private void open() {
        setIconImage(new ImageIcon(getClass().getResource("/icon/64.png")).getImage());
        Method.setTextFieldSyle(txtUser, "User Name");
        Method.setTextFieldSyle(txtIP, "IP Address");
        Method.setTextFieldSyle(txtPassword, "Password");
        showStatus(ms);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtIP = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        btnLogin = new my_swing.Button();
        lbStatus = new javax.swing.JLabel();
        btnSignUp = new my_swing.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        border = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox_showPass = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log in");
        setBackground(new java.awt.Color(255, 102, 102));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIP.setBackground(new java.awt.Color(255, 102, 102));
        txtIP.setFont(new java.awt.Font("Asap Condensed SemiBold", 1, 18)); // NOI18N
        txtIP.setForeground(new java.awt.Color(255, 255, 255));
        txtIP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        txtIP.setSelectionColor(new java.awt.Color(131, 188, 227));
        txtIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIPActionPerformed(evt);
            }
        });
        txtIP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIPKeyTyped(evt);
            }
        });
        jPanel1.add(txtIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 260, 40));

        txtUser.setBackground(new java.awt.Color(255, 102, 102));
        txtUser.setFont(new java.awt.Font("Asap Condensed SemiBold", 1, 18)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        txtUser.setSelectionColor(new java.awt.Color(131, 188, 227));
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserKeyTyped(evt);
            }
        });
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 260, 40));

        btnLogin.setBackground(new java.awt.Color(101, 167, 232));
        btnLogin.setBorder(null);
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Log in");
        btnLogin.setColorClick(new java.awt.Color(152, 196, 239));
        btnLogin.setColorOver(new java.awt.Color(31, 121, 208));
        btnLogin.setFillBorder(20);
        btnLogin.setFocusable(false);
        btnLogin.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 101, 37));

        lbStatus.setBackground(new java.awt.Color(255, 255, 255));
        lbStatus.setFont(new java.awt.Font("Asap Condensed SemiBold", 1, 18)); // NOI18N
        lbStatus.setForeground(new java.awt.Color(255, 255, 255));
        lbStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbStatus.setText("Báo Lỗi");
        jPanel1.add(lbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 270, 40));

        btnSignUp.setBackground(new java.awt.Color(101, 167, 232));
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setText("Sign Up");
        btnSignUp.setColorClick(new java.awt.Color(152, 196, 239));
        btnSignUp.setColorOver(new java.awt.Color(31, 121, 208));
        btnSignUp.setFillBorder(20);
        btnSignUp.setFocusable(false);
        btnSignUp.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 101, 37));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 50, 380, 370));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Login");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 130, 60));

        jLayeredPane1.setLayout(new javax.swing.OverlayLayout(jLayeredPane1));
        jPanel1.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 24, -1, -1));

        border.setBackground(new java.awt.Color(255, 255, 255));
        border.setForeground(new java.awt.Color(255, 204, 204));
        border.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        border.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/border.png"))); // NOI18N
        border.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        border.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borderMouseClicked(evt);
            }
        });
        jPanel1.add(border, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));

        profile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/profile.png"))); // NOI18N
        jPanel1.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));

        txtPassword.setBackground(new java.awt.Color(255, 102, 102));
        txtPassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.setText("jPasswordField1");
        txtPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 260, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("User Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 80, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("IP");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 80, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 80, -1));

        jCheckBox_showPass.setBackground(new java.awt.Color(255, 102, 102));
        jCheckBox_showPass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jCheckBox_showPass.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox_showPass.setText("Show Password");
        jCheckBox_showPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_showPassActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox_showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        new SignUp().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void borderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borderMouseClicked
        if (evt.getClickCount() == 2 && SwingUtilities.isLeftMouseButton(evt)) {
            JFileChooser ch = new JFileChooser();
            FileChooser preview = new FileChooser();
            ch.setAccessory(preview);
            ch.addPropertyChangeListener(preview);
            ch.setFileFilter(new FileFilter() {
                @Override
                public boolean accept(File file) {
                    String name = file.getName();
                    return file.isDirectory() || name.endsWith(".png") || name.endsWith(".PNG") || name.endsWith("jpg") || name.endsWith("JPG");
                }

                @Override
                public String getDescription() {
                    return "png,jpg";
                }
            });
            int opt = ch.showOpenDialog(this);
            if (opt == JFileChooser.APPROVE_OPTION) {
                ImageIcon image = new ImageIcon(ch.getSelectedFile().getAbsolutePath());
                Image img;
                if (image.getIconWidth() > image.getIconHeight()) {
                    img = image.getImage().getScaledInstance(100, -1, Image.SCALE_SMOOTH);
                } else {
                    img = image.getImage().getScaledInstance(-1, 100, Image.SCALE_SMOOTH);
                }
                profile_pic = new ImageIcon(img);
                profile.setIcon(profile_pic);
            }
        }
    }//GEN-LAST:event_borderMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        PreparedStatement ps;
        ResultSet rs;
        String inputname = txtUser.getText();
        String pass = String.valueOf(txtPassword.getPassword());

        String query = "SELECT * FROM `sign_up` WHERE `InputName` =? AND `Password` =?";

        try {
            ps = MyConnection.getConnection().prepareStatement(query);

            ps.setString(1, inputname);
            ps.setString(2, pass);

            rs = ps.executeQuery();

            if (rs.next()) {
                try {
                    if (txtUser.getText().equals("") || !txtUser.getName().equals("have")) {
                        txtUser.grabFocus();
                        showStatus("Please input your user name");
                    } else {
                        if (txtUser.getText().trim().length() > 15) {
                            txtUser.grabFocus();
                            showStatus("User name must less than 15 character");

                        } else {
                            String IP = txtIP.getText().trim();
                            if (txtIP.getText().equals("") || !txtIP.getName().equals("have")) {
                                IP = "localhost";
                                System.err.println("have");
                            }
                            String userName = txtUser.getText().trim();
                            Method.connect(profile_pic, userName, IP);
                            this.dispose();
                            Main.main(null);
                        }

                    }
                } catch (UnknownHostException e) {
                    showStatus("Unknown host : " + txtIP.getText());
                } catch (java.rmi.UnknownHostException e) {
                    showStatus("Unknown host : " + txtIP.getText());
                } catch (ConnectException e) {
                    showStatus("Server not found");
                } catch (java.rmi.ConnectException e) {
                    showStatus("Server not found");
                } catch (Exception e) {
                    showStatus("Network is unreachable : connect");
                    System.out.println(e);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Tên Đăng Nhập hay Mật Khẩu nhập không đúng", "Đăng Nhập Thất Bại", 2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
        if (evt.getKeyChar() == 10) {
            txtIP.grabFocus();
        }
        if (txtUser.getText().trim().length() >= 15) {
            evt.consume();
        }
    }//GEN-LAST:event_txtUserKeyTyped

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtIPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIPKeyTyped
        if (evt.getKeyChar() == 10) {
            btnLoginActionPerformed(null);
        }
    }//GEN-LAST:event_txtIPKeyTyped

    private void txtIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIPActionPerformed

    private void jCheckBox_showPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_showPassActionPerformed
        if (jCheckBox_showPass.isSelected()) {
            txtPassword.setEchoChar((char) 0);
        } else {
            txtPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox_showPassActionPerformed

    private ImageIcon profile_pic;
    private Timer timer = new Timer(5000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            lbStatus.setText("");
            timer.stop();
        }
    });

    private void showStatus(String error) {
        if (timer.isRunning()) {
            lbStatus.setText("");
            timer.stop();
        }
        timer.start();
        lbStatus.setText(error);
    }

    private static String ms = "";

    public static void main(String args[]) {
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                if (args.length == 1) {
                    ms = args[0];
                }
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel border;
    private my_swing.Button btnLogin;
    private my_swing.Button btnSignUp;
    private javax.swing.JCheckBox jCheckBox_showPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JLabel profile;
    private javax.swing.JTextField txtIP;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
