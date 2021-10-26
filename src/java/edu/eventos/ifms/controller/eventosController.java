/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eventos.ifms.controller;

/**
 *
 * @author Gabriel
 */

import edu.eventos.ifms.model.eventosModel;
import edu.eventos.ifms.repository.eventosRepository;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class eventosController {
    
     private eventosModel eventosModel = new eventosModel();
     private eventosRepository eventosRepository  = new eventosRepository();

  
    public void salvar(){
        this.eventosRepository.salvar(this.eventosModel);
    }
    public eventosModel getEventosModel() {
        return eventosModel;
    }

    public void setEventosModel(eventosModel eventosModel) {
        this.eventosModel = eventosModel;
    }

    public eventosRepository getEventosRepository() {
        return eventosRepository;
    }

    public void setEventosRepository(eventosRepository eventosRepository) {
        this.eventosRepository = eventosRepository;
    }
     
   
   
}
