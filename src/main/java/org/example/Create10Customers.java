package org.example;

import java.util.List;

public class Create10Customers {
    CustomerDao customerDao = new CustomerDaoImpl();


    public void create10Customers(){
        customerDao.createCustomer(new Customer("Daniel", "Andersson", 44,41892));
        customerDao.createCustomer(new Customer("Emma", "Svensson", 19,98721));
        customerDao.createCustomer(new Customer("Gunnar","Pettersson",102,82732));
        customerDao.createCustomer(new Customer("Thomas","Olsson",77,92901));
        customerDao.createCustomer(new Customer("Josefin","Bengtsson",66,41789));
        customerDao.createCustomer(new Customer("Julia","Strömstedt",17,98212));
        customerDao.createCustomer(new Customer("Hakim","Jakobsson",21,74821));
        customerDao.createCustomer(new Customer("Patrik","Lindgren",33,12932));
        customerDao.createCustomer(new Customer("Erik","Lindgren",23,32893));
        customerDao.createCustomer(new Customer("Mathilda","Frisk",44,48923));
    }
}
