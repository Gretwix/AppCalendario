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
 * @author Jason
 */
@Entity
@Table(name = "curso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Curso.findAll", query = "SELECT c FROM Curso c"),
    @NamedQuery(name = "Curso.findBySigla", query = "SELECT c FROM Curso c WHERE c.sigla = :sigla"),
    @NamedQuery(name = "Curso.findByNombre", query = "SELECT c FROM Curso c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Curso.findByModalidad", query = "SELECT c FROM Curso c WHERE c.modalidad = :modalidad"),
    @NamedQuery(name = "Curso.findByBloque", query = "SELECT c FROM Curso c WHERE c.bloque = :bloque"),
    @NamedQuery(name = "Curso.findByDescripcion", query = "SELECT c FROM Curso c WHERE c.descripcion = :descripcion"),
    @NamedQuery(name = "Curso.findByHorasLaborales", query = "SELECT c FROM Curso c WHERE c.horasLaborales = :horasLaborales"),
    @NamedQuery(name = "Curso.findByHorasLectivas", query = "SELECT c FROM Curso c WHERE c.horasLectivas = :horasLectivas"),
    @NamedQuery(name = "Curso.findByCantidadCreditos", query = "SELECT c FROM Curso c WHERE c.cantidadCreditos = :cantidadCreditos")})
public class Curso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "sigla")
    private String sigla;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "modalidad")
    private String modalidad;
    @Basic(optional = false)
    @Column(name = "bloque")
    private String bloque;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "horas_laborales")
    private int horasLaborales;
    @Basic(optional = false)
    @Column(name = "horas_lectivas")
    private int horasLectivas;
    @Basic(optional = false)
    @Column(name = "cantidad_creditos")
    private int cantidadCreditos;

    public Curso() {
    }

    public Curso(String sigla) {
        this.sigla = sigla;
    }

    public Curso(String sigla, String nombre, String modalidad, String bloque, String descripcion, int horasLaborales, int horasLectivas, int cantidadCreditos) {
        this.sigla = sigla;
        this.nombre = nombre;
        this.modalidad = modalidad;
        this.bloque = bloque;
        this.descripcion = descripcion;
        this.horasLaborales = horasLaborales;
        this.horasLectivas = horasLectivas;
        this.cantidadCreditos = cantidadCreditos;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getBloque() {
        return bloque;
    }

    public void setBloque(String bloque) {
        this.bloque = bloque;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getHorasLaborales() {
        return horasLaborales;
    }

    public void setHorasLaborales(int horasLaborales) {
        this.horasLaborales = horasLaborales;
    }

    public int getHorasLectivas() {
        return horasLectivas;
    }

    public void setHorasLectivas(int horasLectivas) {
        this.horasLectivas = horasLectivas;
    }

    public int getCantidadCreditos() {
        return cantidadCreditos;
    }

    public void setCantidadCreditos(int cantidadCreditos) {
        this.cantidadCreditos = cantidadCreditos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sigla != null ? sigla.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Curso)) {
            return false;
        }
        Curso other = (Curso) object;
        if ((this.sigla == null && other.sigla != null) || (this.sigla != null && !this.sigla.equals(other.sigla))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Curso[ sigla=" + sigla + " ]";
    }
    
}
