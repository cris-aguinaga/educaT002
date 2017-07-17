/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.edicat.web;

import ec.edu.espe.educat.model.Alumno;
import ec.edu.espe.educat.services.AlumnoServices;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Steven
 */
@ManagedBean
@ViewScoped

public class AlumnoBean {

    @EJB
    private AlumnoServices alumnoService;
    private List<Alumno> alumnos;

    @PostConstruct
    public void inicio() {
        this.alumnos = this.alumnoService.obtenerAlumno();
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }
}
