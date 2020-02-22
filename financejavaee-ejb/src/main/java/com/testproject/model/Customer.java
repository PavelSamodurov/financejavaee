package com.testproject.model;
// Generated Feb 22, 2020 2:17:55 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Customer generated by hbm2java
 */
public class Customer  implements java.io.Serializable {


     private int id;
     private String name;
     private String address;
     private Set<Account> accounts = new HashSet<Account>(0);

    public Customer() {
    }

	
    public Customer(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public Customer(int id, String name, String address, Set<Account> accounts) {
       this.id = id;
       this.name = name;
       this.address = address;
       this.accounts = accounts;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public Set<Account> getAccounts() {
        return this.accounts;
    }
    
    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }




}

