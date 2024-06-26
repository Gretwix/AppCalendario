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
import javax.swing.JOptionPane;
import view.UserGUI;
import modelo.User;
import modelo.Users;
import view.ButtonPanel;
/**
 *
 * @author alehe
 */
public class UserController implements ActionListener, MouseListener{
    private UserGUI userGUI;
    private User user;
    private ButtonPanel buttonPanel;
     private Users users;
    private UsersJpaController usersJpa;
    public UserController(UserGUI userGUI) {
       this.userGUI = new UserGUI();
        this.usersJpa = new UsersJpaController();
        this.buttonPanel = this.userGUI.getButtonPanel();
        this.buttonPanel.listen(this);
        
        this.userGUI.setVisible(true);
    }
public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Create":{
            if(!userGUI.emply()){
                    try {
                        usersJpa.create(userGUI.getUsers());
                        userGUI.clean();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(userGUI, "\"Error adding.\"", "Error", JOptionPane.INFORMATION_MESSAGE);
                        ex.printStackTrace(); 
                    }
                }else{JOptionPane.showMessageDialog(userGUI, "\"Do not leave any blank space\"", "Error", JOptionPane.INFORMATION_MESSAGE);
                }
            }
                break;
            
                
               
            case "Modify":
                {
                if(!userGUI.emply()){
                    try {
                        usersJpa.edit(userGUI.getUsers());
                        userGUI.clean();
                        buttonPanel.ofM();
                    } catch (Exception ex) {
                        Logger.getLogger(CoursesController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{JOptionPane.showMessageDialog(userGUI, "\"Do not leave any blank space\"", "Error", JOptionPane.INFORMATION_MESSAGE);
                }
            }
                

                break;
            case "Consult":
            {
                     if(!userGUI.getTextId().isEmpty()){
                userGUI.setUsers(usersJpa.findUsers(Integer.parseInt(userGUI.getTextId())));
                buttonPanel.onM();
                }else{
                    JOptionPane.showMessageDialog(userGUI, "\"an identifier is needed to be able to search for the object\"", "Error", JOptionPane.INFORMATION_MESSAGE);
                     }
            }
            break;

            case "Exit":
                this.userGUI.dispose();
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


