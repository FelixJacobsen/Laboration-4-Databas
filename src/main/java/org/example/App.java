package org.example;


public class App 
{
    public static void main( String[] args )
    {
        CustomerDao customerDao = new CustomerDaoImpl();

        // customerDao.createCustomer(new Customer("Lum","Shabani",31,73673));
       // customerDao.showAllCustomers().forEach(System.out::println);
        customerDao.createCustomer(new Customer("Felix","Jacobsen",23,73673));
    }
}
