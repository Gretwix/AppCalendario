/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author alehe
 */

//Se necesita implementarlo con Date pero no pude fecha aprovacion y fecha vigor, si no no se pueden editar los cambios 
@Entity
@Table(name = "plan de estudios")
public class Plan implements Serializable {
   private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
   private int id; 
   @Column(name = "fecha_vigor")
   private int valid;
   @Column(name = "descripcion")
   private String description;
   @Column(name = "cantidad_creditos")
   private int credits;
   @Column(name = "fecha_aprobacion")
   private int approval;

    public Plan(int id, int valid, String description, int credits, int approval) {
        
    }

    public Plan(Integer id, int valid, String description, int credits, int approval) {
        this.id = id;
        this.valid = valid;
        this.description = description;
        this.credits = credits;
        this.approval = approval;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getValid() {
        return valid;
    }

    public void setValid(int valid) {
        this.valid = valid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getApproval() {
        return approval;
    }

    public void setApproval(int approval) {
        this.approval = approval;
    }

    @Override
    public String toString() {
        return "Plan{" + "id=" + id + ", valid=" + valid + ", description=" + description + ", credits=" + credits + ", approval=" + approval + '}';
    }
    
    }
