/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testproject.repository;

import com.testproject.model.Customer;
import com.testproject.util.HibernateUtil;
import java.util.List;
import javax.ejb.Stateless;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Pavel Samodurov ps07t447@gmail.com
 */
@Stateless
public class CustomerRepository {
    
    Session session = null;

    public CustomerRepository() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public List getCustomers() {
    List<Customer> customerList = null;
    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery ("from Customer as customer");
        customerList = (List<Customer>) q.list();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return customerList;
}
    
    
}
