/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import view.UserGUI;
import modelo.User;
/**
 *
 * @author alehe
 */
public class UserController {
    private UserGUI userGUI;
    private User user;
    
    
    public UserController(UserGUI userGUI) {
        this.userGUI = new UserGUI();
        //this.dataCustomerPanel = this.customerGUI.getDataCustomerPanel();
        //this.buttonPanel = this.userGUI.getButtonPanel();
        //this.buttonPanel.listen(this);
        //this.dataCustomerPanel.listen(this);
        this.userGUI.setVisible(true);
        
    }
    
}


