/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.event.ActionListener;

/**
 *
 * @author alehe
 */
public class MainGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    public void listen(ActionListener controller) {
        this.MiExit.addActionListener(controller);
        this.MiPlan.addActionListener(controller);
        this.MiUser.addActionListener(controller);
        this.MiMajors.addActionListener(controller);
        this.MiCourses.addActionListener(controller);
        this.MiReport.addActionListener(controller);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MiExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MiUser = new javax.swing.JMenuItem();
        MiCourses = new javax.swing.JMenuItem();
        MiMajors = new javax.swing.JMenuItem();
        MiPlan = new javax.swing.JMenuItem();
        MiReport = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 9.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, -10, 200, 160));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 10.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, -10, 200, 170));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 6.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 180, -1, 160));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 5.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 170, -1, 170));

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel2.setText("Welcome!");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 110, 30));

        jLabel1.setBackground(new java.awt.Color(235, 239, 255));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 490, 350));

        jMenuBar1.setBackground(new java.awt.Color(131, 140, 241));
        jMenuBar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(131, 140, 241), 2, true));
        jMenuBar1.setOpaque(true);

        jMenu1.setBackground(new java.awt.Color(131, 140, 241));
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jMenu1.setOpaque(true);

        MiExit.setBackground(new java.awt.Color(113, 122, 213));
        MiExit.setFont(new java.awt.Font("Corbel", 1, 17)); // NOI18N
        MiExit.setForeground(new java.awt.Color(255, 255, 255));
        MiExit.setText("Exit");
        jMenu1.add(MiExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(131, 140, 241));
        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Menu");
        jMenu2.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jMenu2.setOpaque(true);

        MiUser.setBackground(new java.awt.Color(113, 122, 213));
        MiUser.setFont(new java.awt.Font("Corbel", 1, 17)); // NOI18N
        MiUser.setForeground(new java.awt.Color(255, 255, 255));
        MiUser.setText("User");
        jMenu2.add(MiUser);

        MiCourses.setBackground(new java.awt.Color(113, 122, 213));
        MiCourses.setFont(new java.awt.Font("Corbel", 1, 17)); // NOI18N
        MiCourses.setForeground(new java.awt.Color(255, 255, 255));
        MiCourses.setText("Courses");
        jMenu2.add(MiCourses);

        MiMajors.setBackground(new java.awt.Color(113, 122, 213));
        MiMajors.setFont(new java.awt.Font("Corbel", 1, 17)); // NOI18N
        MiMajors.setForeground(new java.awt.Color(255, 255, 255));
        MiMajors.setText("Majors");
        jMenu2.add(MiMajors);

        MiPlan.setBackground(new java.awt.Color(113, 122, 213));
        MiPlan.setFont(new java.awt.Font("Corbel", 1, 17)); // NOI18N
        MiPlan.setForeground(new java.awt.Color(255, 255, 255));
        MiPlan.setText("Degree plan");
        jMenu2.add(MiPlan);

        MiReport.setBackground(new java.awt.Color(113, 122, 213));
        MiReport.setFont(new java.awt.Font("Corbel", 1, 17)); // NOI18N
        MiReport.setForeground(new java.awt.Color(255, 255, 255));
        MiReport.setText("Report");
        jMenu2.add(MiReport);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MiCourses;
    private javax.swing.JMenuItem MiExit;
    private javax.swing.JMenuItem MiMajors;
    private javax.swing.JMenuItem MiPlan;
    private javax.swing.JMenuItem MiReport;
    private javax.swing.JMenuItem MiUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
