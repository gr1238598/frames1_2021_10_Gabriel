/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eventos.ifms.controller;

import edu.eventos.ifms.model.areaModel;
import edu.eventos.ifms.repository.areaRepository;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Gabriel
 */
@ManagedBean
@ViewScoped
public class areaController {

    private areaModel areaModel  = new areaModel();;
    private areaRepository areaRepository = new areaRepository();;



    public void salvar() {
        this.areaRepository.salvar(areaModel);
    }

    public areaModel getAreaModel() {
        return areaModel;
    }

    public void setAreaModel(areaModel areaModel) {
        this.areaModel = areaModel;
    }

    public areaRepository getAreaRepository() {
        return areaRepository;
    }

    public void setAreaRepository(areaRepository areaRepository) {
        this.areaRepository = areaRepository;
    }

   
}
