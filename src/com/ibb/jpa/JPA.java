/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibb.jpa;

import com.ibb.model.Customer;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.eclipse.persistence.exceptions.TransactionException;

/**
 *
 * @author Admin
 */
public class JPA {

    public static void main(String[] args) {
        Customer person = new Customer();
        person.setFirstname("Uli");
        person.setLastname("Hoeness");
        person.setStreet("Paulstr.");
        person.setHouseNo("12");
        person.setPostcode("94587");
        person.setTown("Plattling");
        person.setPhone("02587");
        person.setEmail("Stefanie.Langhammer@web.de");
//        person.setEmails(new ArrayList<>());
//        EmailAddress em1 = new EmailAddress("uli@hoeness.de");
//        EmailAddress em2 = new EmailAddress("uli@uli.de");
//        person.getEmails().add(em1);
//        person.getEmails().add(em2);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pizza_JPA");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = null;
        try {
            et = em.getTransaction();
            et.begin();
            //myPerson.setPersonId(0);
            em.persist(person);
            em.flush();
            System.out.println("Key::::" + person.getCustomerId());
            et.commit();
//            for(EmailAddress emai:myPerson.getEmails()){
//            Primary Key des PersonenObjektes muss händisch eingetragen werden   
            //emai.set
//                em.persist(emai);
//            }
            System.out.println("Vergebene ID::" + person.getCustomerId());

//            //lesender Zugriff auf Tabelle gaestebuch
//            Query q = em.createQuery("Select m FROM MyPerson m ", MyPerson.class);//createNamedQuery("Gaestebuch.findAll");
//            //q=q.setParameter("var", "Franz Josef ");
//            List<MyPerson> list = q.getResultList();
//            for (MyPerson t : list) {
//                System.out.println("Name:" + t.getLastname());
//                System.out.println("Vorname" + t.getFirstname());
//                if (t != null && t.getEmails() != null) {
//                    for (EmailAddress e : t.getEmails()) {
//                        System.out.println(e.getEmailId() + "Email:" + e.getAddress() + "\n");
//                    }
//                }
//            }
            em.close();
        } catch (TransactionException ex) {
            et.rollback();
        }
    }
    
}


