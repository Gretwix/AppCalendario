/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
                if(!muestra){
                    this.majorsGUI.table(majorsJpa.getMatrix(majorsJpa.findMajorsEntities(), MajorsJpaController.HEADER_MAJORS),  MajorsJpaController.HEADER_MAJORS,muestra);
                    muestra=true;
                }
                if(muestra){
                    this.majorsGUI.table(majorsJpa.getMatrix(majorsJpa.findMajorsEntities(), MajorsJpaController.HEADER_MAJORS),  MajorsJpaController.HEADER_MAJORS,muestra);
                    muestra=false;
                }
                break;
                
            case "Exit":
                this.majorsGUI.dispose();
                break;
        }
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
