/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.ReportGUI;

/**
 *
 * @author alehe
 */
public class ReportController {

    private ReportGUI reportGui;
    private MajorsJpaController majorsJpa;
    private CoursesJpaController coursesJpa;
    
    public ReportController() {
        this.reportGui=new ReportGUI();
        this.majorsJpa=new MajorsJpaController();
        this.coursesJpa=new CoursesJpaController();
        reportGui.setJtMajors(MajorsJpaController.HEADER_MAJORS, majorsJpa.getMatrix(majorsJpa.findMajorsEntities(), MajorsJpaController.HEADER_MAJORS));
        reportGui.setjCourses(CoursesJpaController.HEADER_COURSES, coursesJpa.getMatrix(coursesJpa.findCoursesEntities(), CoursesJpaController.HEADER_COURSES));
        reportGui.setVisible(true);
        
    }
    
    
    
}
