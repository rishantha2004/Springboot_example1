package com.project.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Items {

    @Id
    @Column(name = "_id", length = 45)
    private int Id;

    @Column(name = "item_name", length = 100, nullable = false)
    private String itemName;

    @Column(name = "item_price", length = 100, nullable = false)
    private int itemPrice;

    @Column(name = "item_qty", length = 100, nullable = false)
    private int itemQty;

    public Items() {
    }

    public Items(int id, String itemName, int itemPrice, int itemQty) {
        Id = id;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
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
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemQty() {
        return itemQty;
    }

    public void setItemQty(int itemQty) {
        this.itemQty = itemQty;
    }
}
