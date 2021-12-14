package org.example;


public class App {
    public static void main(String[] args) {
        CustomerDao customerDao = new CustomerDaoImpl();
        Create10Customers create10Customers = new Create10Customers();

        //Creates 10 customers to use as demo data
       // create10Customers.create10Customers();

        //Prints all current customers in the list
        //  customerDao.showAllCustomers().forEach(System.out::println);

        //Create a new customer with optional values
        //  customerDao.createCustomer(new Customer("Felix","Jacobsen",23,73673));


        //Search for a customer with a specific first name
        // customerDao.selectWithName("Felix").forEach(System.out::println);


        //Order all customers by their age in descending order
       // customerDao.orderByAge().forEach(System.out::println);

        //Find a customer based on their postal code
        //customerDao.findByPostalCode().forEach(System.out::println);


        customerDao.findBetweenAge(20,25).forEach(System.out::println);
    }
}
