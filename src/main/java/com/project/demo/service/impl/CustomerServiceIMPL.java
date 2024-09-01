package com.project.demo.service.impl;

import com.project.demo.dto.CustomerDTO;
import com.project.demo.dto.request.CustomerUpdateDTO;
import com.project.demo.entity.Customer;
import com.project.demo.repo.CustomerRepo;
import com.project.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceIMPL implements CustomerService {

    @Autowired
    CustomerRepo customerRepo;

    @Override
    public String saveCustomer(CustomerDTO customerDTO){
        Customer customer = new Customer(
                customerDTO.getId(),
                customerDTO.getCustomerName(),
                customerDTO.getCustomerAdderss(),
                customerDTO.getCustomerNumbers(),
                customerDTO.getCustomerNIC(),
                customerDTO.getCustomerSalary(),
                customerDTO.isActive()
        );
        customerRepo.save(customer);
        return "Added new Customer!";
    }

    @Override
    public List<CustomerDTO> getAllCustomers(){
        List<Customer> customers = customerRepo.findAll();
        List<CustomerDTO> customerDTOS = new ArrayList<>();

        for(Customer customer: customers){
            CustomerDTO customerDTO = new CustomerDTO(
                    customer.getId(),
                    customer.getCustomerName(),
                    customer.getCustomerAddress(),
                    customer.getContactNumbers(),
                    customer.getCustomerSalary(),
                    customer.getCustomerNIC(),
                    customer.isActive()
            );
            customerDTOS.add(customerDTO);
        }
        return customerDTOS;
    }

    @Override
    public CustomerDTO getCustomerById(int Id){
        if(customerRepo.existsById(Id)){
            Customer customer = customerRepo.getReferenceById(Id);
            CustomerDTO customerDTO = new CustomerDTO(
                    customer.getId(),
                    customer.getCustomerName(),
                    customer.getCustomerAddress(),
                    customer.getContactNumbers(),
                    customer.getCustomerSalary(),
                    customer.getCustomerNIC(),
                    customer.isActive()
            );
            return customerDTO;
        } else {
            throw new RuntimeException("Not Found!");
        }
    }

    @Override
    public CustomerUpdateDTO updateCustomer(CustomerUpdateDTO customerUpdateDTO){
        if(customerRepo.existsById(customerUpdateDTO.getId())){
            Customer customer = customerRepo.getReferenceById(customerUpdateDTO.getId());
            customer.setCustomerName(customerUpdateDTO.getCustomerName());
            customer.setCustomerAddress(customerUpdateDTO.getCustomerAdderss());
            customer.setContactNumbers(customerUpdateDTO.getCustomerNumbers());
            customer.setCustomerSalary(customerUpdateDTO.getCustomerSalary());
            customer.setCustomerNIC(customerUpdateDTO.getCustomerNIC());

            customerRepo.save(customer);

            CustomerUpdateDTO customerUpdateDTO1 = new CustomerUpdateDTO(
                    customer.getId(),
                    customer.getCustomerName(),
                    customer.getCustomerAddress(),
                    customer.getContactNumbers(),
                    customer.getCustomerSalary(),
                    customer.getCustomerNIC()
            );
            return customerUpdateDTO1;
        } else {
            throw new RuntimeException("Customer not Found!");
        }
    }

//    @Override
//    public List<CustomerDTO> getCustomerByNameandStatus(String name){
//        boolean status = false;
//
//        List<Customer> customers = customerRepo.sdmvkldkldm(name, status);
//    }

}
