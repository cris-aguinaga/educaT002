/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.edicat.web;

import ec.edu.espe.educat.model.Alumno;
import ec.edu.espe.educat.model.Curso;
import ec.edu.espe.educat.services.AlumnoServices;
import ec.edu.espe.educat.services.CursoServices;
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

public class CursoBean {

    @EJB
    private CursoServices cursoService;
    private List<Curso> curso;

    @PostConstruct
    public void inicio() {
        this.curso = this.cursoService.obtenerCursos();
    }

    public List<Curso> getCurso() {
        return curso;
    }
}
