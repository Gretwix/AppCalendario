/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import modelo.Majors;

/**
 *
 * @author alehe
 */
public class MajorsGUI extends javax.swing.JFrame {

    TableRowSorter<TableModel> sorter;
    /**
     * Creates new form MajorsGUI
     */
    public MajorsGUI() {
        initComponents();
        jTable1.setVisible(false);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        
         jTable1 = new JTable();
    JScrollPane scrollPane = new JScrollPane(jTable1);
    this.add(scrollPane, BorderLayout.CENTER); 
    }
    public ButtonPanel getButtonPanel(){
        return buttonPanel1;
     }
    public String getTxtName(){
        return txtName.getText();
    }
    
    public String getTxtCode(){
        return txtCode.getText();
    }
    
    public Majors getMajors(){
        return new Majors(
                this.txtCode.getText(), 
                this.txtName.getText(),
                this.txaDescrpition.getText(),
                this.txaMarket.getText(),
                this.txaProfile.getText());
    }
    
    public void setMajors(Majors majors){
        this.txtName.setText(majors.getName());
        this.txtCode.setText(majors.getCode());
        this.txaDescrpition.setText(majors.getDescription());
        this.txaMarket.setText(majors.getMarket());
        this.txaProfile.setText(majors.getProfile());
    }
    
    public void clean(){
        this.txtName.setText("");
        this.txtCode.setText("");
        this.txaDescrpition.setText("");
        this.txaMarket.setText("");
        this.txaProfile.setText("");
    }
    
    public boolean emply(){
        boolean emply = false;
        if(txtCode.getText().isEmpty()){
            emply=true;}
        if(txaDescrpition.getText().isEmpty()){
            emply=true;}
        if(txaMarket.getText().isEmpty()){
            emply=true;}
        if(txaProfile.getText().isEmpty()){
            emply=true;}
        if(txtName.getText().isEmpty()){
            emply=true;}
        
        return emply;
    }
    public void listButton(ActionListener controller){
         btnReport.addActionListener(controller);
     }
    
    public void setjCourses(String[] header, String[][] data) {
        DefaultTableModel model = new DefaultTableModel(data, header);
        this.jTable1.setModel(model);
        this.jTable1.setAutoCreateRowSorter(true);
        this.sorter=new TableRowSorter<>(model);
        this.jTable1.setRowSorter(sorter);
        
        this.jScrollPane1.setViewportView(this.jTable1);
    }
    
    public void table(boolean muestra){
        
        if(!muestra){
            jTable1.setVisible(true);
            txtCode.setVisible(false);
            txtName.setVisible(false);
            txaMarket.setVisible(false);
            txaProfile.setVisible(false);
            txaDescrpition.setVisible(false);
            jLabel1.setVisible(false);
            jLabel2.setVisible(false);
            jLabel3.setVisible(false);
            jLabel4.setVisible(false);
            jLabel5.setVisible(false);
            buttonPanel1.setVisible(false);
        }
        if(muestra){
            jTable1.setVisible(false);
            txtCode.setVisible(true);
            txtName.setVisible(true);
            txaMarket.setVisible(true);
            txaProfile.setVisible(true);
            txaDescrpition.setVisible(true);
            jLabel1.setVisible(true);
            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            buttonPanel1.setVisible(true);
        }
    }
    
   public static void main(String[] args) {
  MajorsGUI majorsGUI=new MajorsGUI();
    }  
    private void setupUI() {
        // Configurar el layout del JFrame
      this.setTitle("Majors Report");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        // Agregar el panel con la tabla al centro del JFrame
        this.add(jTable1, BorderLayout.CENTER);

        // Configurar la ventana
        this.pack(); // Ajustar tamaño automáticamente según los componentes
        this.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
    }

    public void setjTableData(String[] header, Object[][] data) {
        DefaultTableModel model = new DefaultTableModel(data, header);
        jTable1.setModel(model); // Configura el modelo de la JTable

        // Configurar sorter si es necesario
        jTable1.setAutoCreateRowSorter(true);
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(model);
        jTable1.setRowSorter(sorter);
    }

    

public void showTable(boolean show) {
    this.jTable1.setVisible(show); // Ajusta la visibilidad de la JTable
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonPanel1 = new view.ButtonPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescrpition = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaProfile = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaMarket = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnReport = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(buttonPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 548, -1, -1));

        jLabel1.setText("Code:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 93, -1, -1));

        jLabel2.setText("Description:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 224, -1, -1));
        getContentPane().add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 90, 181, -1));

        txaDescrpition.setColumns(20);
        txaDescrpition.setRows(5);
        jScrollPane1.setViewportView(txaDescrpition);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 224, -1, 72));

        jLabel3.setText("Profile:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 343, -1, -1));

        txaProfile.setColumns(20);
        txaProfile.setRows(5);
        jScrollPane2.setViewportView(txaProfile);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 343, -1, 70));

        jLabel4.setText("Market:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 450, -1, -1));

        txaMarket.setColumns(20);
        txaMarket.setRows(5);
        jScrollPane3.setViewportView(txaMarket);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 450, -1, 67));

        jLabel5.setText("Name:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 161, -1, -1));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 158, 181, -1));

        btnReport.setText("Report");
        getContentPane().add(btnReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 610, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReport;
    private view.ButtonPanel buttonPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea txaDescrpition;
    private javax.swing.JTextArea txaMarket;
    private javax.swing.JTextArea txaProfile;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
