/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eventos.ifms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Gabriel
 */
@Entity
@Table(name = "campus")
public class campusModel {

    @Id
    @GeneratedValue
    private Long idCampus;

    @Column(nullable = false, length = 80)
    private String campusNome;
    private int campusCidadeId;
    private int campusEstadoId;

    public campusModel() {

        this.campusNome = "";
        this.campusCidadeId = 0;
        this.campusEstadoId = 0;

    }

    public String getCampusNome() {
        return campusNome;
    }

    public void setCampusNome(String campusNome) {
        this.campusNome = campusNome;
    }

    public int getCampusCidadeId() {
        return campusCidadeId;
    }

    public void setCampusCidadeId(int campusCidadeId) {
        this.campusCidadeId = campusCidadeId;
    }

    public int getCampusEstadoId() {
        return campusEstadoId;
    }

    public void setCampusEstadoId(int campusEstadoId) {
        this.campusEstadoId = campusEstadoId;
    }

    public Long getIdCampus() {
        return idCampus;
    }

    public void setIdCampus(Long idCampus) {
        this.idCampus = idCampus;
    }
    
}
