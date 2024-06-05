/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ucr.ac.cr.appcalendario;

import controller.LoginController;
import controller.MainController;
import java.util.ArrayList;
import modelo.Usuario;

/**
 *
 * @author alehe
 */
public class AppCalendario {

    public static void main(String[] args) {
         // Crea un ArrayList para almacenar los usuarios registrados
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();

        // Pasa el ArrayList a LoginController
        LoginController loginController = new LoginController(listaUsuarios);
        

    }
}
