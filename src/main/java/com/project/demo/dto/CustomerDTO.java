package com.project.demo.dto;

import java.util.ArrayList;

public class CustomerDTO {

    private int Id;
    private String customerName;
    private String customerAdderss;
    private ArrayList<String> customerNumbers;
    private int customerSalary;
    private String customerNIC;
    private boolean isActive;

    public CustomerDTO() {
    }

    public CustomerDTO(int id, String customerName, String customerAdderss, ArrayList<String> customerNumbers, int customerSalary, String customerNIC, boolean isActive) {
        Id = id;
        this.customerName = customerName;
        this.customerAdderss = customerAdderss;
        this.customerNumbers = customerNumbers;
        this.customerSalary = customerSalary;
        this.customerNIC = customerNIC;
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

    public String getCustomerAdderss() {
        return customerAdderss;
    }

    public void setCustomerAdderss(String customerAdderss) {
        this.customerAdderss = customerAdderss;
    }

    public ArrayList<String> getCustomerNumbers() {
        return customerNumbers;
    }

    public void setCustomerNumbers(ArrayList<String> customerNumbers) {
        this.customerNumbers = customerNumbers;
    }

    public int getCustomerSalary() {
        return customerSalary;
    }

    public void setCustomerSalary(int customerSalary) {
        this.customerSalary = customerSalary;
    }

    public String getCustomerNIC() {
        return customerNIC;
    }

    public void setCustomerNIC(String customerNIC) {
        this.customerNIC = customerNIC;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
