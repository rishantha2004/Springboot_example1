package com.project.demo.entity;

import com.vladmihalcea.hibernate.type.json.JsonType;

import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
@TypeDefs({
        @TypeDef(name = "json", typeClass = JsonType.class)
})
public class Customer {

    @Id
    @Column(name =  "_id", length = 45)
    private int Id;

    @Column(name = "customer_name", length = 100, nullable = false)
    private String customerName;

    @Column(name = "customer_address", length = 255, nullable = false)
    private String customerAddress;

    @Type(type = "json")
    @Column(name = "customer_numbers", columnDefinition = "json")
    private ArrayList<String> contactNumbers;

    @Column(name = "customer_nic", length = 45)
    private String customerNIC;

    @Column(name = "customer_salary", length = 45)
    private int customerSalary;

    @Column(name= "active_states", columnDefinition = "TINYINT default 0")
    private boolean isActive;

    public Customer() {
    }

    public Customer(int id, String customerName, String customerAddress, ArrayList<String> contactNumbers, String customerNIC, int customerSalary, boolean isActive) {
        Id = id;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.contactNumbers = contactNumbers;
        this.customerNIC = customerNIC;
        this.customerSalary = customerSalary;
        this.isActive = isActive;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public ArrayList<String> getContactNumbers() {
        return contactNumbers;
    }

    public void setContactNumbers(ArrayList<String> contactNumbers) {
        this.contactNumbers = contactNumbers;
    }

    public String getCustomerNIC() {
        return customerNIC;
    }

    public void setCustomerNIC(String customerNIC) {
        this.customerNIC = customerNIC;
    }

    public int getCustomerSalary() {
        return customerSalary;
    }

    public void setCustomerSalary(int customerSalary) {
        this.customerSalary = customerSalary;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
