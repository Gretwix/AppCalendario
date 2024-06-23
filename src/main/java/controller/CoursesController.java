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
import view.CoursesGUI;
import modelo.Courses;
import view.ButtonPanel;
/**
 *
 * @author alehe
 */
public class CoursesController implements ActionListener, MouseListener{
    private CoursesGUI coursesGUI;
    private Courses courses;
    private ButtonPanel buttonPanel;
    private CoursesJpaController coursesJpa;
    
    public CoursesController(CoursesGUI coursesGUI) {
       this.coursesGUI = new CoursesGUI();
       this.coursesJpa= new CoursesJpaController(); 
        this.buttonPanel = this.coursesGUI.getButtonPanel();
        this.buttonPanel.listen(this);
        this.buttonPanel.ofM();
        this.coursesGUI.setVisible(true);
    }
public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Create":
            {
                if(!coursesGUI.emply()){
                    try {
                        coursesJpa.create(coursesGUI.getCourses());
                        coursesGUI.clean();
                    } catch (Exception ex) {
                        System.err.println("Error al agregar.");
                        ex.printStackTrace(); 
                    }
                }else{System.err.println("No dejar ningun espacio en blanco");
                }
            }
                break;

            case "Modify":
                
            {
                if(!coursesGUI.emply()){
                    try {
                        coursesJpa.edit(coursesGUI.getCourses());
                        coursesGUI.clean();
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
                 if(!coursesGUI.getTextIdNumber().isEmpty()){
                coursesGUI.setCourses(coursesJpa.findCourses(coursesGUI.getTextIdNumber()));
                buttonPanel.onM();
                }else{
                    System.err.println("se nesecita un identificador para poder buscar el objeto");
                }
            }
                break;

            case "Exit":
                this.coursesGUI.dispose();
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


