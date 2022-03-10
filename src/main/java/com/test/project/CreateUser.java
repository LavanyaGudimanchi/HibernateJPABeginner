package com.test.project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class CreateUser
{
    public static void main( String[] args )
    {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session= factory.openSession();
        Transaction t= session.beginTransaction();

        User uone=new User();
        uone.setEmail("Praneeth@gmail.com");
        uone.setAge(20);
        uone.setCity("Hyderabad");
        uone.setSalary(20000);
        uone.setPassword("@1234");

        User uTwo = new User();
        uTwo.setEmail("James@gmail.com");
        uTwo.setFullname("James Santana");
        uTwo.setPassword("James123");
        uTwo.setSalary(2060.69);
        uTwo.setAge(25);
        uTwo.setCity("Dallas");

        User uThree = new User();
        uThree.setEmail("Shahparan@gmail.com");
        uThree.setFullname("AH Shahparan");
        uThree.setPassword("Shahparan123");
        uThree.setSalary(3060.69);
        uThree.setAge(30);
        uThree.setCity("Chicago");
User uFour=new User("Deepika","deepika@gmail.com",
        "@12345",25,45000.56,"Mubai");

        User ufive = new User("Sid", "Sid", "s258", 29, 4000.36, "LA");
        Integer  userid = null;
        session.save(uone);
        session.save(uTwo);
        session.save(uThree);
        session.save(uFour);
        session.save(ufive);
         t.commit();
        System.out.println("Successfully saved");
        factory.close();
        session.close();






        System.out.println( "Hello World!" );
    }
}
