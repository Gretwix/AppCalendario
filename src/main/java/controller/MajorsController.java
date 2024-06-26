/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.MajorsGUI;
import modelo.Majors;
import view.ButtonPanel;
/**
 *
 * @author UCR
 */
public class MajorsController implements ActionListener, MouseListener{
    private MajorsGUI majorsGUI;
    private Majors majors;
    private ButtonPanel buttonPanel;
    private MajorsJpaController majorsJpa;
    boolean muestra=false;
    
    public MajorsController(MajorsGUI majorsGUI) {
       this.majorsGUI = new MajorsGUI();
       this.majorsJpa = new MajorsJpaController();
        this.buttonPanel = this.majorsGUI.getButtonPanel();
        this.buttonPanel.listen(this);
        this.majorsGUI.listButton(this);
        this.buttonPanel.ofM();
        this.majorsGUI.setVisible(true);
    }
public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Create":
                {
                if(!majorsGUI.emply()){
                    try {
                        majorsJpa.create(majorsGUI.getMajors());
                        majorsGUI.clean();
                    } catch (Exception ex) {
                        System.err.println("Error al agregar.");
                        ex.printStackTrace(); 
                    }
                }else{System.err.println("No dejar nungun espacio en blanco");
                }
            }
                break;
            case "Modify":

                  
            {
                if(!majorsGUI.emply()){
                    try {
                        majorsJpa.edit(majorsGUI.getMajors());
                        majorsGUI.clean();
                        buttonPanel.ofM();
                    } catch (Exception ex) {
                        Logger.getLogger(CoursesController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{System.err.println("No dejar nungun espacio en blanco");
                }
            }
                

                break;
                
            case "Consult":
            {
                //en este caso se pueden usar tanto los nombres o el codigo
            if(!majorsGUI.getTxtCode().isEmpty()){
                majorsGUI.setMajors(majorsJpa.findMajors(majorsGUI.getTxtCode()));
                buttonPanel.onM();
                }else{
                    System.err.println("se nesecita un identificador para poder buscar el objeto");
                }
            }
                break;
            case "Report":
                 if (!muestra) {
        try {
            // Obtener los datos de la base de datos
            List<Majors> allMajors = majorsJpa.findMajorsEntities();
            // Preparar los datos para mostrar en la tabla
            Object[][] data = majorsJpa.getMatrix(allMajors, MajorsJpaController.HEADER_MAJORS);
            // Mostrar la tabla en la interfaz gráfica majorsGUI
            majorsGUI.setjTableData(MajorsJpaController.HEADER_MAJORS, data);
            majorsGUI.showTable(true); // Mostrar la tabla
            muestra = true;
        } catch (Exception ex) {
            System.err.println("Error al obtener o mostrar los datos:");
            ex.printStackTrace();
        }
    } else {
        majorsGUI.showTable(false); // Ocultar la tabla
        muestra = false;
    }
            break;
        
        case "Exit":
            this.majorsGUI.dispose();
          
                break;
                
            
        }
    }
    
    private String[][] convertToObjectStringArray(Object[][] data) {
        if (data == null) {
            return null;
        }
        String[][] stringData = new String[data.length][];
        for (int i = 0; i < data.length; i++) {
            stringData[i] = new String[data[i].length];
            for (int j = 0; j < data[i].length; j++) {
                stringData[i][j] = String.valueOf(data[i][j]);
            }
        }
        return stringData;
    }
    
  


    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
      
}
