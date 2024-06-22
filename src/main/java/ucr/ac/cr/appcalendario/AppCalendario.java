/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ucr.ac.cr.appcalendario;

import controller.CoursesJpaController;
import controller.LoginController;
import controller.MainController;
import controller.MajorsJpaController;
import java.util.ArrayList;
import modelo.Courses;
import modelo.Majors;
import modelo.User;

/**
 *
 * @author alehe
 */
public class AppCalendario {

    public static void main(String[] args) {
         // Crea un ArrayList para almacenar los usuarios registrados
       // ArrayList<User> listaUsuarios = new ArrayList<>();

        // Pasa el ArrayList a LoginController
        //LoginController loginController = new LoginController(listaUsuarios);
        try {
            MajorsJpaController majorsJPA = new MajorsJpaController();
            majorsJPA.create(new Majors(
                "fgf", "sqsq", "J", "P", "DSSSD"
            ));
            System.out.print("agg exitosos");
        } catch (Exception ex) {
            System.err.println("Error al agregar.");
            ex.printStackTrace(); // Imprime la pila de la excepción
        }

    }
}
