/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.educat.services;

import ec.edu.espe.educat.dao.AlumnoFacade;
import ec.edu.espe.educat.model.Alumno;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Steven
 */
@Stateless
@LocalBean
public class AlumnoServices {

    @EJB

    private AlumnoFacade obj;

    public List<Alumno> obtenerAlumno() {
        return this.obj.findAll();
    }

}
