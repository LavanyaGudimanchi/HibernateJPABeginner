package com.test.project;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class UpdateUser {

    public static void main( String[] args ){

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        User u = new User();
        u.setId(3);
        u.setEmail("mhaseeb@perscholas");
        u.setFullname("M haseeb");
        u.setPassword("123456");
        session.merge(u);
        System.out.println("Sucessfully Updated");
        session.getTransaction().commit();
        session.close();




    }
}
