package com.example.enum_arraylist_01;

public class Producto {

    String name;
    int prize;
    int stock;

    public Producto(String name, int prize, int stock) {
        this.name = name;
        this.prize = prize;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
