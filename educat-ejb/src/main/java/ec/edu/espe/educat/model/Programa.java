/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.educat.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Sofia Gomez
 */
@Entity
@Table(name = "programa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Programa.findAll", query = "SELECT p FROM Programa p")
    , @NamedQuery(name = "Programa.findByCodPrograma", query = "SELECT p FROM Programa p WHERE p.codPrograma = :codPrograma")
    , @NamedQuery(name = "Programa.findByNombre", query = "SELECT p FROM Programa p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Programa.findByDescripcion", query = "SELECT p FROM Programa p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "Programa.findByDuracion", query = "SELECT p FROM Programa p WHERE p.duracion = :duracion")
    , @NamedQuery(name = "Programa.findByFechaInicio", query = "SELECT p FROM Programa p WHERE p.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "Programa.findByFechaFin", query = "SELECT p FROM Programa p WHERE p.fechaFin = :fechaFin")})
public class Programa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "COD_PROGRAMA", nullable = false, length = 8)
    private String codPrograma;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;
    @Size(max = 4000)
    @Column(name = "DESCRIPCION", length = 4000)
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DURACION", nullable = false)
    private short duracion;
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "FECHA_FIN")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "programa")
    private List<ProgramaCurso> programaCursoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "programa")
    private List<ProgramaAlumno> programaAlumnoList;

    public Programa() {
    }

    public Programa(String codPrograma) {
        this.codPrograma = codPrograma;
    }

    public Programa(String codPrograma, String nombre, short duracion) {
        this.codPrograma = codPrograma;
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public String getCodPrograma() {
        return codPrograma;
    }

    public void setCodPrograma(String codPrograma) {
        this.codPrograma = codPrograma;
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

    public short getDuracion() {
        return duracion;
    }

    public void setDuracion(short duracion) {
        this.duracion = duracion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    @XmlTransient
    public List<ProgramaCurso> getProgramaCursoList() {
        return programaCursoList;
    }

    public void setProgramaCursoList(List<ProgramaCurso> programaCursoList) {
        this.programaCursoList = programaCursoList;
    }

    @XmlTransient
    public List<ProgramaAlumno> getProgramaAlumnoList() {
        return programaAlumnoList;
    }

    public void setProgramaAlumnoList(List<ProgramaAlumno> programaAlumnoList) {
        this.programaAlumnoList = programaAlumnoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPrograma != null ? codPrograma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Programa)) {
            return false;
        }
        Programa other = (Programa) object;
        if ((this.codPrograma == null && other.codPrograma != null) || (this.codPrograma != null && !this.codPrograma.equals(other.codPrograma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.edicat.Programa[ codPrograma=" + codPrograma + " ]";
    }
    
}
