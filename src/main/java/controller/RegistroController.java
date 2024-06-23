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
import view.registroGUI;

/**
 *
 * @author Jeikol
 */
public class RegistroController implements ActionListener {
    private registroGUI registroGUI;
    private UsersJpaController usersJpaController;

    public RegistroController() {
        this.registroGUI = new registroGUI();
        this.registroGUI.setVisible(true);
        this.registroGUI.addJoinButtonListener(this);
        this.usersJpaController = new UsersJpaController();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registroGUI.getBtnRegistrarse()) {
            String nombre = registroGUI.getNombre();
            String apellido = registroGUI.getApellido();
            String email = registroGUI.getEmail();
            String username = registroGUI.getUsername();
            String password = registroGUI.getPassword();
            String carnet = registroGUI.getCarnet();
            String number = registroGUI.getNumber();
            
            // Obtener el ID ingresado manualmente por el usuario
            String idStr = registroGUI.getId();
            int id = 0; // Valor por defecto si no se ingresa ningún ID válido

            try {
                // Intentar convertir el ID ingresado a un entero
                id = Integer.parseInt(idStr);
            } catch (NumberFormatException ex) {
                // Manejar la excepción si el ID ingresado no es un número válido
                JOptionPane.showMessageDialog(registroGUI, "Please enter a valid ID.", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Salir del método actionPerformed si hay un error
            }

            Users nuevoUsuario = new Users(id, nombre, number, apellido, email, username, password, carnet);

            try {
                usersJpaController.create(nuevoUsuario);
                JOptionPane.showMessageDialog(registroGUI, "Successful registration", "Success", JOptionPane.INFORMATION_MESSAGE);
                registroGUI.dispose();
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(registroGUI, "Error registering user", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
