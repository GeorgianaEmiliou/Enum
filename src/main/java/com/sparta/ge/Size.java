package com.sparta.ge;

public enum Size {
    SMALL("Small", 5),
    MEDIUM("Medium", 10),
    LARGE("Large", 15);

    private String name;
    private int price;

    Size(String name, int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Size{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
