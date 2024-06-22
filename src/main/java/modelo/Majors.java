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
@Table(name = "carrera")
public class Majors implements Serializable{

  private static final long serialVersionUID = 1L;
   @Id
   @Column(name = "codigo")
    private String code;
   @Column(name = "nombre")
    private String name;
   @Column(name = "mercado_laboral")
    private String market;
   @Column(name = "descripcion")
    private String description;
   @Column(name = "perfil_profecional")
    private String profile;

    public Majors(String code, String name, String market, String description, String profile) {
        this.code = code;
        this.name = name;
        this.market = market;
        this.description = description;
        this.profile = profile;
    }

    public Majors() {
    }
    

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "Majors{" + "code=" + code + ", name=" + name + ", market=" + market + ", description=" + description + ", profile=" + profile + '}';
    }
 
    
    
}
