/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Usuario;
import view.registroGUI;

/**
 *
 * @author Jeikol
 */
public class RegistroController implements ActionListener {
    private registroGUI registroGUI;
    private ArrayList<Usuario> listaUsuarios;

    public RegistroController(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
        this.registroGUI = new registroGUI();
        this.registroGUI.setVisible(true);
        this.registroGUI.addJoinButtonListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Registrarse")) {
            String nombre = registroGUI.getNombre();
            String apellido = registroGUI.getApellido();
            String email = registroGUI.getEmail();
            String contraseña = registroGUI.getContraseña();
            String tipoUsuario = registroGUI.getTipoUsuario();

            // Verificar si el usuario ya está registrado
            boolean usuarioExiste = false;
            for (Usuario usuario : listaUsuarios) {
                if (usuario.getEmail().equals(email)) {
                    usuarioExiste = true;
                    break;
                }
            }

            if (usuarioExiste) {
                JOptionPane.showMessageDialog(registroGUI, "El usuario ya está registrado", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                // Agregar el nuevo usuario a la lista
                Usuario nuevoUsuario = new Usuario(nombre, apellido, email, contraseña, tipoUsuario);
                listaUsuarios.add(nuevoUsuario);
                JOptionPane.showMessageDialog(registroGUI, "Registro exitoso", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                registroGUI.dispose();
            }
        }
    }
}
