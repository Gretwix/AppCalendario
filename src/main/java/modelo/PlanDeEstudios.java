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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jeikol
 */
@Entity
@Table(name = "plan de estudios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlanDeEstudios.findAll", query = "SELECT p FROM PlanDeEstudios p"),
    @NamedQuery(name = "PlanDeEstudios.findById", query = "SELECT p FROM PlanDeEstudios p WHERE p.id = :id"),
    @NamedQuery(name = "PlanDeEstudios.findByFechaAprobacion", query = "SELECT p FROM PlanDeEstudios p WHERE p.fechaAprobacion = :fechaAprobacion"),
    @NamedQuery(name = "PlanDeEstudios.findByCantidadCreditos", query = "SELECT p FROM PlanDeEstudios p WHERE p.cantidadCreditos = :cantidadCreditos"),
    @NamedQuery(name = "PlanDeEstudios.findByDescripcion", query = "SELECT p FROM PlanDeEstudios p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "PlanDeEstudios.findByFechaVigor", query = "SELECT p FROM PlanDeEstudios p WHERE p.fechaVigor = :fechaVigor")})
public class PlanDeEstudios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "fecha_aprobacion")
    @Temporal(TemporalType.DATE)
    private Date fechaAprobacion;
    @Basic(optional = false)
    @Column(name = "cantidad_creditos")
    private int cantidadCreditos;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "fecha_vigor")
    @Temporal(TemporalType.DATE)
    private Date fechaVigor;

    public PlanDeEstudios() {
    }

    public PlanDeEstudios(Integer id) {
        this.id = id;
    }

    public PlanDeEstudios(Integer id, Date fechaAprobacion, int cantidadCreditos, String descripcion, Date fechaVigor) {
        this.id = id;
        this.fechaAprobacion = fechaAprobacion;
        this.cantidadCreditos = cantidadCreditos;
        this.descripcion = descripcion;
        this.fechaVigor = fechaVigor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaAprobacion() {
        return fechaAprobacion;
    }

    public void setFechaAprobacion(Date fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }

    public int getCantidadCreditos() {
        return cantidadCreditos;
    }

    public void setCantidadCreditos(int cantidadCreditos) {
        this.cantidadCreditos = cantidadCreditos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaVigor() {
        return fechaVigor;
    }

    public void setFechaVigor(Date fechaVigor) {
        this.fechaVigor = fechaVigor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlanDeEstudios)) {
            return false;
        }
        PlanDeEstudios other = (PlanDeEstudios) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.PlanDeEstudios[ id=" + id + " ]";
    }
    
}
