/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.User;
import modelo.Users;
import view.loginGUI;

/**
 *
 * @author Jeikol
 */
public class LoginController implements ActionListener {
    private loginGUI loginGUI;
    private UsersJpaController usersController;

    public LoginController() {
        this.usersController = new UsersJpaController();
        this.loginGUI = new loginGUI();
        this.loginGUI.setVisible(true);
        this.loginGUI.addJoinButtonListener(this); // Asigna este mismo controlador como listener del botón
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Login")) {
            String username = loginGUI.getUsername();
            String password = loginGUI.getPassword();

            try {
                Users user = usersController.findUserName(username);

                if (user != null && user.getPassword().equals(password)) {
                    JOptionPane.showMessageDialog(loginGUI, "Successful login", "Success", JOptionPane.INFORMATION_MESSAGE);
                    loginGUI.dispose();
                    // Aquí podrías abrir la ventana principal de tu aplicación
                    MainController mainController = new MainController();
                } else {
                    JOptionPane.showMessageDialog(loginGUI, "Incorrect username or password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(loginGUI, "Authentication failed", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getActionCommand().equals("Register")) {
            // Aquí podrías abrir la ventana de registro si fuera necesario
            RegistroController registroController = new RegistroController();
        }
    }
}