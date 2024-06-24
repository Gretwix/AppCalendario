/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author alehe
 */
@Entity
@Table(name = "curso")
public class Courses implements Serializable{
    private static final long serialVersionUID = 1L;
    
   @Id
   @Column(name = "sigla")
    private String acronnyms;
    @Column(name = "nombre")
    private String name;
    @Column(name = "cantidad_creditos")
    private int credits;
    @Column(name = "horas_laborales")
    private int work;
    @Column(name = "horas_lectivas")
    private int clas;
    @Column(name = "bloque")
    private String block;
    @Column(name = "modalidad")
    private String modality;
    @Column(name = "descripcion")
    private String description;

    public Courses(String acronnyms, String name, int credits, int work, int clas, String block, String modality, String description) {
        this.acronnyms = acronnyms;
        this.name = name;
        this.credits = credits;
        this.work = work;
        this.clas = clas;
        this.block = block;
        this.modality = modality;
        this.description = description;
    }

    public Courses() {
    }
    

    public String getAcronnyms() {
        return acronnyms;
    }

    public void setAcronnyms(String acronnyms) {
        this.acronnyms = acronnyms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getWork() {
        return work;
    }

    public void setWork(int work) {
        this.work = work;
    }

    public int getClas() {
        return clas;
    }

    public void setClas(int clas) {
        this.clas = clas;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    @Override
    public String toString() {
        return "Courses{" + "acronnyms=" + acronnyms + ", name=" + name + ", credits=" + credits + ", work=" + work + ", clas=" + clas + ", block=" + block + ", modality=" + modality + ", description=" + description + '}';
    }
    
}

   