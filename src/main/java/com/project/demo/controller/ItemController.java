package com.project.demo.controller;

import com.project.demo.dto.ItemsDTO;
import com.project.demo.service.ItemService;
import com.project.demo.utils.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("api/v1/items")
public class ItemController {

    @Autowired
    ItemService itemService;

    @PostMapping("/add")
    public ResponseEntity<StandardResponse> saveItems(@RequestBody ItemsDTO itemsDTO){
        String message = itemService.saveItems(itemsDTO);

        ResponseEntity<StandardResponse> response = new ResponseEntity<StandardResponse>(
                new StandardResponse(201, "Success", message), HttpStatus.CREATED
        );
        return response;
    }

    @GetMapping("/get")
    public ResponseEntity<StandardResponse> getAllItems(){
        List<ItemsDTO> itemsDTOS = itemService.getAllItems();
        ResponseEntity<StandardResponse> response = new ResponseEntity<StandardResponse>(
                new StandardResponse(200, "Success", itemsDTOS), HttpStatus.FOUND
        );
        return response;
    }
}
