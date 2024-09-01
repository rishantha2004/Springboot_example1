package com.project.demo.controller;

import com.project.demo.dto.CustomerDTO;
import com.project.demo.utils.StandardResponse;
import com.project.demo.dto.request.CustomerUpdateDTO;
import com.project.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;


    @PostMapping("/add")
    public ResponseEntity<StandardResponse> saveCustomer(@RequestBody CustomerDTO customerDTO){
        String message = customerService.saveCustomer(customerDTO);
        ResponseEntity<StandardResponse> response = new ResponseEntity<StandardResponse>(
                new StandardResponse(201, "Success", message), HttpStatus.CREATED
        );
        return response;
    }

    @GetMapping("/get-all-customers")
    public List<CustomerDTO> getAllcustomers(){
        List<CustomerDTO> customerDTOS = customerService.getAllCustomers();
        return customerDTOS;
    }

    @GetMapping(
            path="/getById",
            params = "id"
    )
    public CustomerDTO getCustomerById(@RequestParam(value = "id") int Id){
        CustomerDTO customerDTO = customerService.getCustomerById(Id);
        return customerDTO;
    }

//    @GetMapping(
//            path="getByName",
//            params = "name"
//    )
//    public List<CustomerDTO> getCustomerByNameandStatus(@RequestParam(value = "name") String name){
//        List<CustomerDTO> customerDTO = customerService.getCustomerByNameandStatus(name);
//        return customerDTO;
//    }

    @PutMapping("/update")
    public CustomerUpdateDTO updateCustomer(@RequestBody CustomerUpdateDTO customerUpdateDTO){
        CustomerUpdateDTO customerUpdateDTO1= customerService.updateCustomer(customerUpdateDTO);
        return customerUpdateDTO1;
    }


}
