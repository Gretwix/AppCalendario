/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.PlanGUI;
import modelo.Plan;
import view.ButtonPanel;

/**
 *
 * @author alehe
 */
public class PlanController implements ActionListener, MouseListener {

    private PlanGUI planGUI;
    private Plan plan;
    private ButtonPanel buttonPanel;
    private PlanJpaController planJpa;

    public PlanController(PlanGUI planGUI) {
        this.planGUI = new PlanGUI();
        this.planJpa = new PlanJpaController();
        this.buttonPanel = this.planGUI.getButtonPanel();
        this.buttonPanel.listen(this);

        this.planGUI.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Create": {
                if (!planGUI.emply()) {
                    try {
                        planJpa.create(planGUI.getPlan());
                        planGUI.clean();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(planGUI, "\"Error loading\"", "Error", JOptionPane.INFORMATION_MESSAGE);
                        ex.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(planGUI, "\"Do not leave any blank space\"", "Error", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            break;
            case "Modify": {
                if (!planGUI.emply()) {
                    try {
                        planJpa.edit(planGUI.getPlan());
                        planGUI.clean();
                        buttonPanel.ofM();
                    } catch (Exception ex) {
                        Logger.getLogger(CoursesController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(planGUI, "\"Do not leave any blank space\"", "Error", JOptionPane.INFORMATION_MESSAGE);
                }
            }

            break;
            case "Consult": {
                if (!planGUI.getTextId().isEmpty()) {
                    planGUI.setPlan(planJpa.findPlan(Integer.parseInt(planGUI.getTextId())));
                    buttonPanel.onM();
                } else {
                    JOptionPane.showMessageDialog(planGUI, "\"an identifier is needed to be able to search for the object\"", "Error", JOptionPane.INFORMATION_MESSAGE);
                    System.err.println("se nesecita un identificador para poder buscar el objeto");
                }
            }
            break;

            case "Exit":
                this.planGUI.dispose();
                break;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
