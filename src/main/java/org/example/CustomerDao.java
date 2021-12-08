package org.example;

import java.util.List;

public interface CustomerDao {
    void createCustomer(Customer customer);
    List<Customer> showAllCustomers();



}
