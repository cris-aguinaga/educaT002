/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.educat.services;

import ec.edu.espe.educat.dao.DocenteFacade;
import ec.edu.espe.educat.model.Docente;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author CRIS
 */
@Stateless
@LocalBean
public class DocentesServices {

    @EJB

    private DocenteFacade obj;

    public List<Docente> obtenerDocente() {
        return this.obj.findAll();
    }

}
