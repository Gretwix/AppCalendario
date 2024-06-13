/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.RemindersGUI;


/**
 *
 * @author alehe
 */
public class RemindersController implements ActionListener{
    
    private RemindersGUI remindersGUI;

    public RemindersController() {
        this.remindersGUI = new RemindersGUI();
        this.remindersGUI.listen(this);
        this.remindersGUI.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "Consultar":
                System.out.println("Consultar");
            break;
            case "Agregar":
                 System.out.println("Agregar");
            break;
            case "Modificar":
                 System.out.println("Modificar");
            break;
            case "Eliminar":
                 System.out.println("Eliminar");
            break;

        }
    }
    
}
