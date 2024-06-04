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
            case "User":
                System.out.println("User");
                break;
            case "Students":
                System.out.println("Students");
                break;
            case "Teachers":
                System.out.println("Teachers");
                break;
            case "Reminders":
                System.out.println("Reminders");
                break;
            case "Programs":
                System.out.println("Programs");
                break;
            case "Reports":
                System.out.println("Reports");
                break;
            case "Exit":
                System.exit(0);
                break;
        }
    }
}
