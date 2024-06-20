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

        jMenu1.setText("File");

        MiExit.setText("Exit");
        jMenu1.add(MiExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Menu");

        MiUser.setText("User");
        jMenu2.add(MiUser);

        MiCourses.setText("Courses");
        jMenu2.add(MiCourses);

        MiMajors.setText("Majors");
        jMenu2.add(MiMajors);

        MiPlan.setText("Degree plan");
        jMenu2.add(MiPlan);

        MiReport.setText("Report");
        jMenu2.add(MiReport);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
