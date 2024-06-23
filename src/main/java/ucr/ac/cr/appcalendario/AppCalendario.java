/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ucr.ac.cr.appcalendario;

import controller.CoursesJpaController;
import controller.LoginController;
import controller.MainController;
import controller.MajorsJpaController;
import controller.PlanJpaController;
import java.util.ArrayList;
import modelo.Courses;
import modelo.Majors;
import modelo.Plan;
import modelo.User;

/**
 *
 * @author alehe
 */
public class AppCalendario {

    public static void main(String[] args) {
         // Crea un ArrayList para almacenar los usuarios registrados
        ArrayList<User> listaUsuarios = new ArrayList<>();

        // Pasa el ArrayList a LoginController
        LoginController loginController = new LoginController(listaUsuarios);
//        try {
//            PlanJpaController planJPA = new PlanJpaController();
//            planJPA.create(new Plan(
//                1, 2, "J", 4, 4
//            ));
//            System.out.print("agg exitosos");
//        } catch (Exception ex) {
//            System.err.println("Error al agregar.");
//            ex.printStackTrace(); // Imprime la pila de la excepción
//        }

    }
}
