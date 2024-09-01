package com.project.demo.dto;

public class ItemsDTO {

    private int Id;
    private String itemName;
    private int ItemPrice;
    private int itemQty;

    public ItemsDTO() {
    }

    public ItemsDTO(int id, String itemName, int itemPrice, int itemQty) {
        Id = id;
        this.itemName = itemName;
        ItemPrice = itemPrice;
        this.itemQty = itemQty;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return ItemPrice;
    }

    public void setItemPrice(int itemPrice) {
        ItemPrice = itemPrice;
    }

    public int getItemQty() {
        return itemQty;
    }

    public void setItemQty(int itemQty) {
        this.itemQty = itemQty;
    }
}
