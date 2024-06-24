/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import modelo.Courses;

/**
 *
 * @author alehe
 */
public class CoursesGUI extends javax.swing.JFrame {

    TableRowSorter<TableModel> sorter;
    /**
     * Creates new form CoursesGUI
     */
    public CoursesGUI() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        jTable1.setVisible(false);
    }
     public ButtonPanel getButtonPanel(){
        return buttonPanel1;
     }
//     public void listButton(ActionListener controller){
//         btnReport.addActionListener(controller);
//     }
     public String getTextIdNumber(){
        return txtAcronyms.getText();
    }
    
    public Courses getCourses(){
        return new Courses(this.txtAcronyms.getText(), 
                this.txtName.getText(),
                Integer.parseInt(this.txtCredits.getText()),
                Integer.parseInt(this.txtWork.getText()),
                Integer.parseInt( this.txtClas.getText()),
                this.txtBlock.getText(),
                this.txtModality.getText(),
               this.txaDescription.getText());
    }
    
    public void setCourses(Courses courses){
        this.txtAcronyms.setText(courses.getAcronnyms());
        this.txtName.setText(courses.getName());
        this.txtBlock.setText(courses.getBlock());
        this.txtClas.setText(String.valueOf(courses.getClas()));
        this.txtCredits.setText(String.valueOf(courses.getCredits()));
        this.txtModality.setText(courses.getModality());
        this.txtWork.setText(String.valueOf(courses.getWork()));
        this.txaDescription.setText(courses.getDescription());
    }
    
    public void clean(){
        this.txtAcronyms.setText("");
        this.txtBlock.setText("");
        this.txtClas.setText("");
        this.txtCredits.setText("");
        this.txtModality.setText("");
        this.txtWork.setText("");
        this.txaDescription.setText("");
        this.txtName.setText("");
        this.txtWork.setText("");
        
    }
    public boolean emply(){
        boolean emply = false;
        if(txtAcronyms.getText().isEmpty()){
            emply=true;}
        if(txtName.getText().isEmpty()){
            emply=true;}
        if(txtBlock.getText().isEmpty()){
            emply=true;}
        if(txtClas.getText().isEmpty()){
            emply=true;}
        if(txtCredits.getText().isEmpty()){
            emply=true;}
        if(txtModality.getText().isEmpty()){
            emply=true;}
        if(txaDescription.getText().isEmpty()){
            emply=true;}
        if(txtWork.getText().isEmpty()){
            emply=true;}
        
        return emply;
    }
    
    public void setjCourses(String[] header, String[][] data) {
        DefaultTableModel model = new DefaultTableModel(data, header);
        this.jTable1.setModel(model);
        this.jTable1.setAutoCreateRowSorter(true);
        this.sorter=new TableRowSorter<>(model);
        this.jTable1.setRowSorter(sorter);
        
        this.jScrollPane1.setViewportView(this.jTable1);
    }
    
    public void table(String[][] matrix,String[] header,boolean muestra){
        
        setjCourses(header, matrix);
        
        if(!muestra){
            jTable1.setVisible(true);
            txtAcronyms.setVisible(muestra);
            txtName.setVisible(muestra);
            txtBlock.setVisible(muestra);
            txtClas.setVisible(muestra);
            txtCredits.setVisible(muestra);
            txtModality.setVisible(muestra);
            txaDescription.setVisible(muestra);
            txtWork.setVisible(muestra);
            jLabel1.setVisible(muestra);
            jLabel2.setVisible(muestra);
            jLabel3.setVisible(muestra);
            jLabel4.setVisible(muestra);
            jLabel5.setVisible(muestra);
            jLabel6.setVisible(muestra);
            jLabel7.setVisible(muestra);
            jLabel8.setVisible(muestra);
            buttonPanel1.setVisible(muestra);
        }
        if(muestra){
            jTable1.setVisible(false);
            txtAcronyms.setVisible(muestra);
            txtName.setVisible(muestra);
            txtBlock.setVisible(muestra);
            txtClas.setVisible(muestra);
            txtCredits.setVisible(muestra);
            txtModality.setVisible(muestra);
            txaDescription.setVisible(muestra);
            txtWork.setVisible(muestra);
            jLabel1.setVisible(muestra);
            jLabel2.setVisible(muestra);
            jLabel3.setVisible(muestra);
            jLabel4.setVisible(muestra);
            jLabel5.setVisible(muestra);
            jLabel6.setVisible(muestra);
            jLabel7.setVisible(muestra);
            jLabel8.setVisible(muestra);
            buttonPanel1.setVisible(muestra);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPanel1 = new view.ButtonPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAcronyms = new javax.swing.JTextField();
        txtClas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtWork = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCredits = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtBlock = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtModality = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescription = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnReport = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(buttonPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 490, -1));

        jLabel1.setText("Class hours:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel2.setText("Acronyms:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));
        getContentPane().add(txtAcronyms, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 198, -1));
        getContentPane().add(txtClas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 198, -1));

        jLabel3.setText("Work hours:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));
        getContentPane().add(txtWork, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 198, -1));

        jLabel4.setText("Block:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));
        getContentPane().add(txtCredits, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 198, -1));

        jLabel5.setText("Credits:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));
        getContentPane().add(txtBlock, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 198, -1));

        jLabel6.setText("Modality:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));
        getContentPane().add(txtModality, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 198, -1));

        jLabel7.setText("Description:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        txaDescription.setColumns(20);
        txaDescription.setRows(5);
        jScrollPane1.setViewportView(txaDescription);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        jLabel8.setText("Course Name:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 198, -1));

        btnReport.setText("Report");
        getContentPane().add(btnReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 500, -1, 30));

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
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 560, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReport;
    private view.ButtonPanel buttonPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea txaDescription;
    private javax.swing.JTextField txtAcronyms;
    private javax.swing.JTextField txtBlock;
    private javax.swing.JTextField txtClas;
    private javax.swing.JTextField txtCredits;
    private javax.swing.JTextField txtModality;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtWork;
    // End of variables declaration//GEN-END:variables
}
