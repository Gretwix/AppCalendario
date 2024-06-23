/*
 
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
*/
package ucr.ac.cr.appcalendario;

import controller.CoursesJpaController;
import controller.LoginController;
import controller.MainController;
import controller.MajorsJpaController;
import controller.PlanJpaController;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.persistence.Persistence;
import modelo.Courses;
import modelo.Majors;
import modelo.Plan;
import modelo.User;

/**
 *
 
@author alehe*/
public class AppCalendario {

    public static void main(String[] args) {
         // Crea un ArrayList para almacenar los usuarios registrados


        // Pasa el ArrayList a LoginController
         //LoginController loginController = new LoginController();
         try{
             PlanJpaController planJPA = new PlanJpaController();
            int startDateInt = 20240203;  // Formato YYYYMMDD
            int endDateInt = 20240104;    // Formato YYYYMMDD
            LocalDate startDate = intToLocalDate(startDateInt);
            LocalDate endDate = intToLocalDate(endDateInt);
            String careerCode = "aa";

        Plan plan = new Plan(1, startDate, "jeikol@hotmail.com", 1, endDate);
            planJPA.create(plan);
         //planJPA.findPlan(12);

    }catch(Exception ex){
    System.err.println("Error al agregar."+ ex.getMessage());
    }
//
    }
    public static LocalDate intToLocalDate(int dateInt) {
        int year = dateInt / 10000;
        int month = (dateInt % 10000) / 100;
        int day = dateInt % 100;
        return LocalDate.of(year, month, day);
    }
}