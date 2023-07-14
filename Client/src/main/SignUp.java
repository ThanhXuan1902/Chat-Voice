package main;

import function.Method;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Thanh Xuan
 */
public class SignUp extends javax.swing.JFrame {

    public SignUp() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/icon/64.png")).getImage());
    }

    private void open() {
        setIconImage(new ImageIcon(getClass().getResource("/icon/64.png")).getImage());
        Method.setTextFieldSyle(txtFullName, "Full Name");
        Method.setTextFieldSyle(txtInputName, "Input Name");
        Method.setTextFieldSyle(txtPassword, "Password");
        Method.setTextFieldSyle(txtPasswordConfirm, "Password");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtInputName = new javax.swing.JTextField();
        txtFullName = new javax.swing.JTextField();
        txtPasswordConfirm = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();
        btnSignUp = new javax.swing.JButton();
        btngoBackLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox_showPass = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up");
        setBackground(new java.awt.Color(255, 102, 102));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(740, 400));
        setPreferredSize(new java.awt.Dimension(741, 480));

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setMinimumSize(new java.awt.Dimension(690, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Signup.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 400));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sign Up");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 170, 70));

        txtInputName.setBackground(new java.awt.Color(255, 102, 102));
        txtInputName.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        txtInputName.setForeground(new java.awt.Color(255, 255, 255));
        txtInputName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtInputName, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 260, 30));

        txtFullName.setBackground(new java.awt.Color(255, 102, 102));
        txtFullName.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        txtFullName.setForeground(new java.awt.Color(255, 255, 255));
        txtFullName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFullName.setCaretColor(new java.awt.Color(255, 255, 255));
        txtFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 260, 30));

        txtPasswordConfirm.setBackground(new java.awt.Color(255, 102, 102));
        txtPasswordConfirm.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtPasswordConfirm.setForeground(new java.awt.Color(255, 255, 255));
        txtPasswordConfirm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtPasswordConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 260, 30));

        txtPassword.setBackground(new java.awt.Color(255, 102, 102));
        txtPassword.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 260, 30));

        btnSignUp.setBackground(new java.awt.Color(255, 102, 102));
        btnSignUp.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setText("Sign Up");
        btnSignUp.setBorder(null);
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 110, 30));

        btngoBackLogin.setBackground(new java.awt.Color(255, 102, 102));
        btngoBackLogin.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        btngoBackLogin.setForeground(new java.awt.Color(255, 255, 255));
        btngoBackLogin.setText("Login");
        btngoBackLogin.setBorder(null);
        btngoBackLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngoBackLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btngoBackLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 50, 20));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("If you already have an account, please come back");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 260, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password Confirm");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 150, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Full Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 80, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("User Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 80, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 80, -1));

        jCheckBox_showPass.setBackground(new java.awt.Color(255, 102, 102));
        jCheckBox_showPass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jCheckBox_showPass.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox_showPass.setText("Show Password");
        jCheckBox_showPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_showPassActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox_showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btngoBackLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngoBackLoginActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btngoBackLoginActionPerformed

    public boolean checkUsername(String inputname) {
        PreparedStatement ps;
        ResultSet rs;
        boolean checkUser = false;
        String query = "SELECT * FROM `sign_up` WHERE `InputName`=?";

        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, inputname);

            rs = ps.executeQuery();

            if (rs.next()) {
                checkUser = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return checkUser;
    }

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed

        String fullname = txtFullName.getText();
        String inputname = txtInputName.getText();
        String pass = String.valueOf(txtPassword.getPassword());
        String re_pass = String.valueOf(txtPasswordConfirm.getPassword());

        if (fullname.equals("")) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập full name");
        } else if (inputname.equals("")) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập user name");
        } else if (pass.equals("")) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập mật khẩu");
        } else if (!pass.equals(re_pass)) {
            JOptionPane.showMessageDialog(null, "Bạn hãy kiểm tra lại mật khẩu");
        } else if (checkUsername(inputname)) {
            JOptionPane.showMessageDialog(null, "Tài Khoản Đã Tồn Tại");
        } else {

            PreparedStatement ps;
            String query = "INSERT INTO `sign_up`(`FullName`, `InputName`, `Password`, `PassConfirm`) VALUES (?,?,?,?)";

            try {
                ps = MyConnection.getConnection().prepareStatement(query);
                ps.setString(1, fullname);
                ps.setString(2, inputname);
                ps.setString(3, pass);
                ps.setString(4, re_pass);

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Tạo Tài Khoản Thành Công, Hãy Đăng Nhập Ngay!!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("thanh cadbajsd");
            }
        }

    }//GEN-LAST:event_btnSignUpActionPerformed

    private void txtFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullNameActionPerformed

    }//GEN-LAST:event_txtFullNameActionPerformed

    private void jCheckBox_showPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_showPassActionPerformed
        if (jCheckBox_showPass.isSelected()) {
            txtPassword.setEchoChar((char) 0);
            txtPasswordConfirm.setEchoChar((char) 0);
        } else {
            txtPassword.setEchoChar('*');
            txtPasswordConfirm.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox_showPassActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignUp;
    private javax.swing.JButton btngoBackLogin;
    private javax.swing.JCheckBox jCheckBox_showPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtInputName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPasswordConfirm;
    // End of variables declaration//GEN-END:variables

}
