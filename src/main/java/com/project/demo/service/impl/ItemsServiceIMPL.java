package com.project.demo.service.impl;

import com.project.demo.dto.ItemsDTO;
import com.project.demo.entity.Items;
import com.project.demo.repo.ItemsRepo;
import com.project.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemsServiceIMPL implements ItemService {

    @Autowired
    ItemsRepo itemsRepo;

    @Override
    public String saveItems(ItemsDTO itemsDTO){
        Items item = new Items(
                itemsDTO.getId(),
                itemsDTO.getItemName(),
                itemsDTO.getItemPrice(),
                itemsDTO.getItemQty()
        );
        itemsRepo.save(item);
        return "Added new Item!";
    }

    @Override
    public List<ItemsDTO> getAllItems(){
        List<ItemsDTO> itemsDTOS = new ArrayList<>();

        List<Items> items = itemsRepo.findAll();

        for(Items items1: items){
            ItemsDTO itemsDTO1 = new ItemsDTO(
                    items1.getId(),
                    items1.getItemName(),
                    items1.getItemPrice(),
                    items1.getItemQty()
            );
            itemsDTOS.add(itemsDTO1);
        }
        return itemsDTOS;
    }

}
