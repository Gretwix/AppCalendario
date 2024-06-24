/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.MainGUI;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import controller.UserController;
import modelo.Users;
import view.MainGUI;
import view.UserGUI;
import controller.CoursesController;
import view.CoursesGUI;
import view.MajorsGUI;
import modelo.Majors;
import controller.MajorsController;
import view.PlanGUI;
import modelo.Plan;
import controller.PlanController;

/**
 *
 * @author alehe
 */
public class MainController implements ActionListener {

    private MainGUI mainGUI;
    private UserController userController;
    private UserGUI userGUI;
    private Users users;
    private CoursesController coursesController;
    private CoursesGUI coursesGUI;
    private MajorsGUI majorsGUI;
    private MajorsController majorsController;
    private PlanController planController;
    private PlanGUI planGUI;
    private ReportController reportController;
    
    public MainController() {
        this.mainGUI = new MainGUI();
        this.mainGUI.setVisible(true);
        this.mainGUI.listen(this);
        UserGUI userGUI = new UserGUI();
        CoursesGUI coursesGUI = new CoursesGUI();
        MajorsGUI majorsGUI = new MajorsGUI();
        PlanGUI planGUI = new PlanGUI();
    }

    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {

            case "Degree plan":
                this.planController = new PlanController(planGUI);
                System.out.println("Degree Plan");
                break;
            case "User":
                
           this.userController = new UserController(userGUI);
                System.out.println("User");
                break;
            case "Majors":
                this.majorsController = new MajorsController (majorsGUI);
                System.out.println("Majors");
                break;
            case "Courses":
                this.coursesController = new CoursesController (coursesGUI);
                System.out.println("Courses");
                break;
            case "Report":
                this.reportController=new ReportController();
                System.out.println("Report");
                break;
            case "Exit":
                System.exit(0);
                break;
        }
    }
}
