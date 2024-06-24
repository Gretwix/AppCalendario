/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author alehe
 */
public class ReportGUI extends javax.swing.JFrame {
    boolean siguiente= false;
    TableRowSorter<TableModel> sorter;
     TableRowSorter<TableModel> sorterMajors; 
    TableRowSorter<TableModel> sorterCourses;
    
    /**
     * Creates new form ReportGUI
     */
    public ReportGUI() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        inicio();
        setupFilter();
    }
    private void setupFilter() {
        jTFiltro.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filterTable(jtMajors);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filterTable(jtMajors);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                filterTable(jtMajors);
            }
        });
    }

    private void filterTable(JTable table) {
        String text = jTFiltro.getText().trim();
        TableRowSorter<TableModel> sorter = null;
        if (table == jtMajors) {
            sorter = sorterMajors;
        } else if (table == jCourses) {
            sorter = sorterCourses;
        }

        if (sorter != null) {
            if (text.length() == 0) {
                sorter.setRowFilter(null);
            } else {
                try {
                    sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text, 0));
                } catch (Exception ex) {
                    System.err.println("Error al filtrar la tabla: " + ex.getMessage());
                }
            }
        }
    }

    public void inicio(){
            jtMajors.setVisible(true);
        jLMajors.setVisible(true);
        jScrollPane1.setVisible(true);
        jCourses.setVisible(false);
        jLCourses.setVisible(false);
        jScrollPane2.setVisible(false);
    }
   
    public void setJtMajors(String[] header, String[][] data) {
        DefaultTableModel model = new DefaultTableModel(data, header);
        this.jtMajors.setModel(model);
        this.jtMajors.setAutoCreateRowSorter(true);
        this.sorterMajors = new TableRowSorter<>(model);
        this.jtMajors.setRowSorter(sorterMajors);
        this.jScrollPane1.setViewportView(this.jtMajors);
    }

    public void setjCourses(String[] header, String[][] data) {
       DefaultTableModel model = new DefaultTableModel(data, header);
        this.jCourses.setModel(model);
        this.jCourses.setAutoCreateRowSorter(true);
        this.sorterCourses = new TableRowSorter<>(model);
        this.jCourses.setRowSorter(sorterCourses);
        this.jScrollPane2.setViewportView(this.jCourses);
    }
    //hola

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMajors = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jCourses = new javax.swing.JTable();
        Sig = new javax.swing.JButton();
        jLCourses = new javax.swing.JLabel();
        X = new javax.swing.JButton();
        jLMajors = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFiltro = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtMajors.setBackground(new java.awt.Color(101, 110, 211));
        jtMajors.setFont(new java.awt.Font("Corbel Light", 1, 14)); // NOI18N
        jtMajors.setForeground(new java.awt.Color(255, 255, 255));
        jtMajors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtMajors);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 650, 350));

        jCourses.setBackground(new java.awt.Color(101, 110, 211));
        jCourses.setFont(new java.awt.Font("Corbel Light", 1, 14)); // NOI18N
        jCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jCourses);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 650, 350));

        Sig.setBackground(new java.awt.Color(101, 110, 211));
        Sig.setFont(new java.awt.Font("Corbel", 1, 15)); // NOI18N
        Sig.setForeground(new java.awt.Color(255, 255, 255));
        Sig.setText("Next");
        Sig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SigActionPerformed(evt);
            }
        });
        getContentPane().add(Sig, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, -1, -1));

        jLCourses.setBackground(new java.awt.Color(101, 110, 211));
        jLCourses.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLCourses.setText("Courses list");
        getContentPane().add(jLCourses, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        X.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        X.setForeground(new java.awt.Color(101, 110, 211));
        X.setText("X");
        X.setBorderPainted(false);
        X.setContentAreaFilled(false);
        X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XActionPerformed(evt);
            }
        });
        getContentPane().add(X, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, -1));

        jLMajors.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLMajors.setText("Majors list");
        getContentPane().add(jLMajors, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Corbel Light", 1, 15)); // NOI18N
        jLabel3.setText("Filter:");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));
        jLabel3.getAccessibleContext().setAccessibleName("Filter");

        getContentPane().add(jTFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 120, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 130, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 2.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 160, -1));

        jLabel1.setBackground(new java.awt.Color(235, 239, 255));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 810, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SigActionPerformed
        
        if(!siguiente){
            jtMajors.setVisible(false);
            jLMajors.setVisible(false);
            jScrollPane1.setVisible(false);
            jCourses.setVisible(true);
            jLCourses.setVisible(true);
            jScrollPane2.setVisible(true);
            jTFiltro.setVisible(false);
            jLabel2.setVisible(false);
            jLabel3.setVisible(false);
            
        }
        if(siguiente){
            jtMajors.setVisible(true);
            jLMajors.setVisible(true);
            jScrollPane1.setVisible(true);
            jCourses.setVisible(false);
            jLCourses.setVisible(false);
            jScrollPane2.setVisible(false);
            jTFiltro.setVisible(true);
            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
        }
        siguiente = !siguiente;
    }//GEN-LAST:event_SigActionPerformed

    private void XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XActionPerformed
        dispose();
    }//GEN-LAST:event_XActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Sig;
    private javax.swing.JButton X;
    private javax.swing.JTable jCourses;
    private javax.swing.JLabel jLCourses;
    private javax.swing.JLabel jLMajors;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFiltro;
    private javax.swing.JTable jtMajors;
    // End of variables declaration//GEN-END:variables
}
