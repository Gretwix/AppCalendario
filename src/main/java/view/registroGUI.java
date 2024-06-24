/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.event.ActionListener;
import modelo.Users;

/**
 *
 * @author Jeikol
 */
public class registroGUI extends javax.swing.JFrame {

    /**
     * Creates new form registroGUI
     */
    public registroGUI() {
          initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    public void addJoinButtonListener(ActionListener listener) {
        btnRegistrarse.addActionListener(listener);
    }

    public String getNombre() {
        return txtName.getText();
    }

    public String getApellido() {
        return txtLastname.getText();
    }

    public String getEmail() {
        return txtEmail.getText();
    }

    public String getUsername() {
        return txtUsername.getText();
    }
    
    public String getNumber() {
    return txtNumber.getText();
}

     public String getId() {
    return txtId.getText();
}
    public String getPassword() {
        return new String(jpPassword.getPassword()); // Obtener la contraseña como String
    }

    public String getCarnet() {
        return txtCarnet.getText();
    }

   public javax.swing.JButton getBtnRegistrarse() {
        return btnRegistrarse;
    }
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtLastname = new javax.swing.JTextField();
        txtNumber = new javax.swing.JTextField();
        txtCarnet = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        btnRegistrarse = new javax.swing.JButton();
        jpPassword = new javax.swing.JPasswordField();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnLoginR = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel10.setText("Please Fill out form to Register!");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 260, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Other 03.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 90, 260, -1));

        jPanel1.setBackground(new java.awt.Color(235, 239, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.setBackground(new java.awt.Color(235, 239, 255));
        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(101, 110, 211), 3, true));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 310, 30));

        txtEmail.setBackground(new java.awt.Color(235, 239, 255));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(101, 110, 211), 3, true));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 310, 30));

        txtLastname.setBackground(new java.awt.Color(235, 239, 255));
        txtLastname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtLastname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(101, 110, 211), 3, true));
        jPanel1.add(txtLastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 310, 30));

        txtNumber.setBackground(new java.awt.Color(235, 239, 255));
        txtNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(101, 110, 211), 3, true));
        jPanel1.add(txtNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 310, 30));

        txtCarnet.setBackground(new java.awt.Color(235, 239, 255));
        txtCarnet.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCarnet.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(101, 110, 211), 3, true));
        jPanel1.add(txtCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 310, 30));

        txtUsername.setBackground(new java.awt.Color(235, 239, 255));
        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(101, 110, 211), 3, true));
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 310, 30));

        btnRegistrarse.setBackground(new java.awt.Color(101, 110, 211));
        btnRegistrarse.setFont(new java.awt.Font("Corbel", 1, 15)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(175, 179, 255));
        btnRegistrarse.setText("Register");
        btnRegistrarse.setBorder(null);
        jPanel1.add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 310, 30));

        jpPassword.setBackground(new java.awt.Color(235, 239, 255));
        jpPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jpPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(101, 110, 211), 3, true));
        jPanel1.add(jpPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 310, 30));

        txtId.setBackground(new java.awt.Color(235, 239, 255));
        txtId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(101, 110, 211), 3, true));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 310, 30));

        jLabel2.setFont(new java.awt.Font("Corbel Light", 1, 14)); // NOI18N
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 70, -1));

        jLabel3.setFont(new java.awt.Font("Corbel Light", 1, 14)); // NOI18N
        jLabel3.setText("Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, -1));

        jLabel4.setFont(new java.awt.Font("Corbel Light", 1, 14)); // NOI18N
        jLabel4.setText("Email:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 50, -1));

        jLabel5.setFont(new java.awt.Font("Corbel Light", 1, 14)); // NOI18N
        jLabel5.setText("Carnet:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 50, -1));

        jLabel6.setFont(new java.awt.Font("Corbel Light", 1, 14)); // NOI18N
        jLabel6.setText("Username:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 80, -1));

        jLabel7.setFont(new java.awt.Font("Corbel Light", 1, 14)); // NOI18N
        jLabel7.setText("Lastname:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, -1));

        jLabel8.setFont(new java.awt.Font("Corbel Light", 1, 14)); // NOI18N
        jLabel8.setText("Number:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 90, -1));

        jLabel9.setFont(new java.awt.Font("Corbel Light", 1, 14)); // NOI18N
        jLabel9.setText("ID:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 50, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 330, 540));

        btnLoginR.setFont(new java.awt.Font("Corbel Light", 1, 14)); // NOI18N
        btnLoginR.setText("Login");
        btnLoginR.setBorderPainted(false);
        btnLoginR.setContentAreaFilled(false);
        btnLoginR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginRActionPerformed(evt);
            }
        });
        getContentPane().add(btnLoginR, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 610, -1, 20));

        jLabel13.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        jLabel13.setText("Yes I have an account?");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 610, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 6.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, -1, 160));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 5.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, -1, 170));

        jLabel1.setBackground(new java.awt.Color(235, 239, 255));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnLoginRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginRActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginRActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoginR;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jpPassword;
    private javax.swing.JTextField txtCarnet;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
