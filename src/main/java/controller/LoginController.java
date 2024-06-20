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
import view.loginGUI;

/**
 *
 * @author Jeikol
 */
public class LoginController implements ActionListener {
    private loginGUI loginGUI;
    private ArrayList<User> listaUsuarios;

    public LoginController(ArrayList<User> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
        this.loginGUI = new loginGUI();
        this.loginGUI.setVisible(true);
        this.loginGUI.addJoinButtonListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getActionCommand().equals("Iniciar sesion")) {
            String user = loginGUI.getUsername();
            String contraseña = loginGUI.getPassword();

            // Verificar las credenciales
            boolean credencialesValidas = true;
            for (User usuario : listaUsuarios) {
    if ((usuario.getEmail().equals(user) || usuario.getNombre().equals(user)) && usuario.getContraseña().equalsIgnoreCase(contraseña))  {
        credencialesValidas = true;
        break;
                }
            }

            if (credencialesValidas) {
                JOptionPane.showMessageDialog(loginGUI, "Inicio de sesión exitoso", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                loginGUI.dispose();
                MainController mainController = new MainController();
            } else {
                JOptionPane.showMessageDialog(loginGUI, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getActionCommand().equals("Registrarse")) {
            RegistroController registroController = new RegistroController(listaUsuarios);
        }
    }
}
