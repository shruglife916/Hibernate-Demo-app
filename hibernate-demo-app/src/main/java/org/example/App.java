package org.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) {
        //create a configuration object
        Configuration config = new Configuration();

        //read the configuration object
        config.configure("hibernate.cfg.xml");

        //create session factory
        SessionFactory sessionFactory = config.buildSessionFactory();

        //open the start
        Session session = sessionFactory.openSession();

        //begin transaction
        Transaction transaction = session.beginTransaction();

        // add employee, create employee object
        /*
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("John");
        employee.setEmail("j@gmail.com");

        //save the object
        session.save(employee);

        //commit
        transaction.commit();


         retrieving the data
        /*
         * get() - it return null if the object doesn't exit
         * it affect the performance of the application
         *
         *
         * load() - it throw ObjectNotFoundException if object does not exit
         * it result in a better performance
         *
         *  Employee employee = session.get(Employee.class, 1);
         *  System.out.println(employee);
         *
         *
         *
         */


        // update
        /*
           Employee employee =get(Employee.class, 1);
           employee.setName(Mark);
           session.save(employee);
           transaction.commit();

         */



        // delete
        /*
           Employee employee =get(Employee.class, 1);
           session.delete(employee);
           transaction.commit();
         */





        //close the connection
        session.close();



    }
}
