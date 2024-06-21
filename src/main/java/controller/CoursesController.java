/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
    
    public CoursesController(CoursesGUI coursesGUI) {
       this.coursesGUI = new CoursesGUI();
        
        this.buttonPanel = this.coursesGUI.getButtonPanel();
        this.buttonPanel.listen(this);

        this.coursesGUI.setVisible(true);
    }
public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Create":
                
                break;
            case "Modify":

                

                break;
            case "Consult":
            {
                
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


