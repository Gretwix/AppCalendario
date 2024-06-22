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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jeikol
 */
@Entity
@Table(name = "carrera")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carrera.findAll", query = "SELECT c FROM Carrera c"),
    @NamedQuery(name = "Carrera.findByCodigo", query = "SELECT c FROM Carrera c WHERE c.codigo = :codigo"),
    @NamedQuery(name = "Carrera.findByNombre", query = "SELECT c FROM Carrera c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Carrera.findByDescripcion", query = "SELECT c FROM Carrera c WHERE c.descripcion = :descripcion"),
    @NamedQuery(name = "Carrera.findByPerfilProfecional", query = "SELECT c FROM Carrera c WHERE c.perfilProfecional = :perfilProfecional"),
    @NamedQuery(name = "Carrera.findByMercadoLaboral", query = "SELECT c FROM Carrera c WHERE c.mercadoLaboral = :mercadoLaboral")})
public class Carrera implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "perfil_profecional")
    private String perfilProfecional;
    @Basic(optional = false)
    @Column(name = "mercado_laboral")
    private String mercadoLaboral;

    public Carrera(String codigo, String nombre, String descripcion, String perfilProfecional, String mercadoLaboral) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.perfilProfecional = perfilProfecional;
        this.mercadoLaboral = mercadoLaboral;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPerfilProfecional() {
        return perfilProfecional;
    }

    public void setPerfilProfecional(String perfilProfecional) {
        this.perfilProfecional = perfilProfecional;
    }

    public String getMercadoLaboral() {
        return mercadoLaboral;
    }

    public void setMercadoLaboral(String mercadoLaboral) {
        this.mercadoLaboral = mercadoLaboral;
    }

    @Override
    public String toString() {
        return "Carrera{" + "codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", perfilProfecional=" + perfilProfecional + ", mercadoLaboral=" + mercadoLaboral + '}';
    }

   
    
}
