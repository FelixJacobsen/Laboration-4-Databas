package org.example;

import java.util.List;

public interface CustomerDao {
    void createCustomer(Customer customer);
    List<Customer> selectWithName(String first_name);
    List<Customer> showAllCustomers();
    List<Customer> orderByAge();
    List<Customer> findByPostalCode(int postalCode);
    List<Customer> findBetweenAge(int minAge, int maxAge);
}
