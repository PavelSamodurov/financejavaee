/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testproject.controller;

import com.testproject.facade.CustomerFacadeLocal;
import com.testproject.model.Customer;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Pavel Samodurov ps07t447@gmail.com
 */
@Named
@SessionScoped
public class CustomerController implements CustomerFacadeLocal, Serializable {

    
    @EJB
    private com.testproject.facade.CustomerFacadeLocal customerFacade;

    @Override
    public void create(Customer customer) {
        customerFacade.create(customer);
    }

    @Override
    public void edit(Customer customer) {
        customerFacade.edit(customer);
    }

    @Override
    public void remove(Customer customer) {
        customerFacade.remove(customer);
    }

    @Override
    public Customer find(Object id) {
        return customerFacade.find(id);
    }

    @Override
    public List<Customer> findAll() {
        return customerFacade.findAll();
    }

    @Override
    public List<Customer> findRange(int[] range) {
        return customerFacade.findRange(range);
    }

    @Override
    public int count() {
        return customerFacade.count();
    }
    
    public String test(){
        return "Test";
    }
}
