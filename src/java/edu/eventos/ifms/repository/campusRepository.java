/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eventos.ifms.repository;

import edu.eventos.ifms.model.campusModel;
import edu.eventos.ifms.util.HibernateConector;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Gabriel
 */
public class campusRepository {

    private Session session;
    private Transaction transaction;

    public void salvar(campusModel campus) {

        this.session = HibernateConector.getSessionFactory().openSession();
        this.transaction = session.beginTransaction();

        this.session.save(campus);

        this.transaction.commit();
        this.session.close();

    }

}
