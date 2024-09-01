package com.project.demo.service;

import com.project.demo.dto.ItemsDTO;

import java.util.List;

public interface ItemService {

    public String saveItems(ItemsDTO itemsDTO);

    public List<ItemsDTO> getAllItems();
}
