package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao{


    EntityManagerFactory emf;
    EntityManager em;

    public CustomerDaoImpl(){
        emf = Persistence.createEntityManagerFactory("lab4");
        em = emf.createEntityManager();
    }


    @Override
    public void createCustomer(Customer customer) {
        em.getTransaction().begin();
        em.persist(customer);
        em.getTransaction().commit();
    }

    @Override
    public List<Customer> showAllCustomers() {
        TypedQuery<Customer> query = em.createQuery("SELECT s FROM Customer s",Customer.class);
        return query.getResultList();
    }







}
