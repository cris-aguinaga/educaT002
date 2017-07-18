/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.educat.services;

import ec.edu.espe.educat.dao.CursoFacade;
import ec.edu.espe.educat.model.Curso;
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
public class CursoServices {

    @EJB

    private CursoFacade obj;

    public List<Curso> obtenerCursos() {
        return this.obj.findAll();
    }

}
