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

        jLabel1.setText("Class hours:");

        jLabel2.setText("Acronyms:");

        jLabel3.setText("Work hours:");

        jLabel4.setText("Block:");

        jLabel5.setText("Credits:");

        jLabel6.setText("Modality:");

        jLabel7.setText("Description:");

        txaDescription.setColumns(20);
        txaDescription.setRows(5);
        jScrollPane1.setViewportView(txaDescription);

        jLabel8.setText("Course Name:");

        btnReport.setText("Report");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2)
                .addGap(123, 123, 123)
                .addComponent(txtAcronyms, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel8)
                .addGap(105, 105, 105)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel3)
                .addGap(116, 116, 116)
                .addComponent(txtWork, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(117, 117, 117)
                .addComponent(txtClas, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel5)
                .addGap(140, 140, 140)
                .addComponent(txtCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel6)
                .addGap(130, 130, 130)
                .addComponent(txtModality, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel4)
                .addGap(148, 148, 148)
                .addComponent(txtBlock, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel7)
                .addGap(117, 117, 117)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(buttonPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(570, 570, 570)
                .addComponent(btnReport))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtAcronyms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtWork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtClas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5))
                    .addComponent(txtCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtModality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtBlock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(buttonPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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
