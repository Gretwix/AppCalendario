/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
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
        jTable1 = new JTable();
       
        JScrollPane scrollPane = new JScrollPane(jTable1);
    this.add(scrollPane, BorderLayout.CENTER); 
    }
     public ButtonPanel getButtonPanel(){
        return buttonPanel1;
     }
     public void listButton(ActionListener controller){
         btnReport.addActionListener(controller);
     }
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
    
    public void table(boolean muestra){
        
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
      private void setupUI() {
        this.setTitle("Courses Report");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        // Agregar la tabla al centro del JFrame usando BorderLayout.CENTER
        this.add(jScrollPane1, BorderLayout.CENTER);

        // Configurar la ventana
        this.pack(); // Ajustar tamaño automáticamente según los componentes
        this.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
    }

    public void setjTableData(String[] header, Object[][] data) {
        DefaultTableModel model = new DefaultTableModel(data, header);
        jTable1.setModel(model); // Configura el modelo de la JTable

        // Configurar sorter si es necesario
        jTable1.setAutoCreateRowSorter(true);
        sorter = new TableRowSorter<>(model);
        jTable1.setRowSorter(sorter);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
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
        jLabel9 = new javax.swing.JLabel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel10.setText("Courses");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 100, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 120, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 2.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 160, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Other 07reg.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 250, -1));
        getContentPane().add(buttonPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 630, 490, -1));

        jLabel1.setFont(new java.awt.Font("Corbel Light", 1, 14)); // NOI18N
        jLabel1.setText("Class hours:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel2.setFont(new java.awt.Font("Corbel Light", 1, 14)); // NOI18N
        jLabel2.setText("Acronyms:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        txtAcronyms.setBackground(new java.awt.Color(235, 239, 255));
        txtAcronyms.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAcronyms.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(101, 110, 211), 3, true));
        getContentPane().add(txtAcronyms, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 310, 30));

        txtClas.setBackground(new java.awt.Color(235, 239, 255));
        txtClas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtClas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(101, 110, 211), 3, true));
        getContentPane().add(txtClas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 310, 30));

        jLabel3.setFont(new java.awt.Font("Corbel Light", 1, 14)); // NOI18N
        jLabel3.setText("Work hours:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        txtWork.setBackground(new java.awt.Color(235, 239, 255));
        txtWork.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtWork.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(101, 110, 211), 3, true));
        getContentPane().add(txtWork, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 310, 30));

        jLabel4.setFont(new java.awt.Font("Corbel Light", 1, 14)); // NOI18N
        jLabel4.setText("Block:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        txtCredits.setBackground(new java.awt.Color(235, 239, 255));
        txtCredits.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCredits.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(101, 110, 211), 3, true));
        getContentPane().add(txtCredits, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 310, 30));

        jLabel5.setFont(new java.awt.Font("Corbel Light", 1, 14)); // NOI18N
        jLabel5.setText("Credits:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        txtBlock.setBackground(new java.awt.Color(235, 239, 255));
        txtBlock.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBlock.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(101, 110, 211), 3, true));
        getContentPane().add(txtBlock, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 310, 30));

        jLabel6.setFont(new java.awt.Font("Corbel Light", 1, 14)); // NOI18N
        jLabel6.setText("Modality:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        txtModality.setBackground(new java.awt.Color(235, 239, 255));
        txtModality.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtModality.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(101, 110, 211), 3, true));
        getContentPane().add(txtModality, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 310, 30));

        jLabel7.setFont(new java.awt.Font("Corbel Light", 1, 14)); // NOI18N
        jLabel7.setText("Description:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, -1, -1));

        txaDescription.setBackground(new java.awt.Color(235, 239, 255));
        txaDescription.setColumns(20);
        txaDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txaDescription.setRows(5);
        txaDescription.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(101, 110, 211), 3, true));
        jScrollPane1.setViewportView(txaDescription);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 320, 120));

        jLabel8.setFont(new java.awt.Font("Corbel Light", 1, 14)); // NOI18N
        jLabel8.setText("Course Name:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        txtName.setBackground(new java.awt.Color(235, 239, 255));
        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(101, 110, 211), 3, true));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 310, 30));

        btnReport.setBackground(new java.awt.Color(101, 110, 211));
        btnReport.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnReport.setForeground(new java.awt.Color(255, 255, 255));
        btnReport.setText("Report");
        getContentPane().add(btnReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 690, 90, 30));

        jLabel9.setBackground(new java.awt.Color(235, 239, 255));
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReport;
    private view.ButtonPanel buttonPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
