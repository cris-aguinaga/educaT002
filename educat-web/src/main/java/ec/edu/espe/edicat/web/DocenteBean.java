/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.edicat.web;

import ec.edu.espe.educat.model.Docente;

import ec.edu.espe.educat.services.DocentesServices;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author CRIS
 */
@ManagedBean
@ViewScoped

public class DocenteBean {

    @EJB
    private DocentesServices docenteService;
    private List<Docente> docentes;

    @PostConstruct
    public void inicio() {
        this.docentes = this.docenteService.obtenerDocente();
    }

    public List<Docente> getDocentes() {
        return docentes;
    }

}
