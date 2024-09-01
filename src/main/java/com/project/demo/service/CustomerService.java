package com.project.demo.service;

import com.project.demo.dto.CustomerDTO;
import com.project.demo.dto.request.CustomerUpdateDTO;

import java.util.List;

public interface CustomerService {

    public String saveCustomer(CustomerDTO customerDTO);

    public List<CustomerDTO> getAllCustomers();

    public CustomerDTO getCustomerById(int Id);

    public CustomerUpdateDTO updateCustomer(CustomerUpdateDTO customerUpdateDTO);

//    public List<CustomerDTO> getCustomerByNameandStatus(String name);
}
