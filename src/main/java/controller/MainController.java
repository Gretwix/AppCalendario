/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.MainGUI;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author alehe
 */
public class MainController implements ActionListener {
    
    private MainGUI mainGUI;
    
    public MainController() {        
        this.mainGUI = new MainGUI();
        this.mainGUI.setVisible(true);
        this.mainGUI.listen(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            
            case "Activities":
                System.out.println("Activities");
                break;
            case "Exit":
                System.exit(0);
                break;
        }
    }
}
