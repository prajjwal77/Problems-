package com.prajjwal.HbDemo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
       // Saving object data.........
    	
    	 Student stud=new Student();
        stud.setRollNo(102);
        stud.setName("Navneet");
        stud.setMarks(90);
        
        Configuration config=new Configuration().configure().addAnnotatedClass(Student.class);
        SessionFactory sf=config.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        
        session.save(stud);
        tx.commit();
        System.out.println(stud);
        
    	
//    	// fetching data .........
//    	Student stud=null;
//    	Student stud1=null;
//       
//        
//        Configuration config=new Configuration().configure().addAnnotatedClass(Student.class);
//        SessionFactory sf=config.buildSessionFactory();
//        Session session=sf.openSession();
//        //Transaction tx=session.beginTransaction();
//        
//       stud= session.get(Student.class,102);
//        //tx.commit();
//        System.out.println(stud);
//        session.close();
//        
//        Session session1=sf.openSession();
//        stud1=session1.get(Student.class,102);
//        System.out.println(stud1);
//        session1.close();
        
    }
}
