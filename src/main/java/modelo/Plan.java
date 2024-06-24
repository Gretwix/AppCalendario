/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.time.LocalDate;
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
@Table(name = "plan_de_estudios")
public class Plan implements Serializable {
   private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
   private int id; 
   @Column(name = "fecha_vigor", nullable = false)
   private LocalDate startDate;
   @Column(name = "descripcion")
   private String description;
   @Column(name = "cantidad_creditos")
   private int credits;
   @Column(name = "fecha_aprobacion", nullable = false)
   private LocalDate endDate;
   @Column(name = "carrera_codigo", nullable = false)
   private int carrera;
    
    public Plan() {
    }
    public Plan(int id, LocalDate startDate, String description, int credits, LocalDate endDate,int carrera) {
        this.id = id;
        this.startDate = startDate;
        this.description = description;
        this.credits = credits;
        this.endDate = endDate;
        this.carrera = carrera;
    }

    public int getCarrera() {
        return carrera;
    }

    public void setCarrera(int carrera) {
        this.carrera = carrera;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
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

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }


    

}


    
