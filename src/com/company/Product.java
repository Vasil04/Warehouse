package com.company;

public class Product {
    public String name, description, expirationDate, dateOfDeliveryInWarehouse, makerName, unit, availability, position, comment;
    public int maxProductCountOnOneShelf;

    public Product(String name, String description, String expirationDate, String dateOfDeliveryInWarehouse, String makerName, String unit, String availability, String position, String comment, int maxProductCountOnOneShelf) {
        this.name = name;
        this.description = description;
        this.expirationDate = expirationDate;
        this.dateOfDeliveryInWarehouse = dateOfDeliveryInWarehouse;
        this.makerName = makerName;
        this.unit = unit;
        this.availability = availability;
        this.position = position;
        this.comment = comment;
        this.maxProductCountOnOneShelf = maxProductCountOnOneShelf;
    }
    public Product() {
        this.name = "Test";
        this.description = "Testing";
        this.expirationDate = "13/06/2021";
        this.dateOfDeliveryInWarehouse = "12/05/2020";
        this.makerName = "test.inc";
        this.unit = "kg";
        this.availability = "5";
        this.position = "something";
        this.comment = "Nothing to say";
        this.maxProductCountOnOneShelf = 3;
    }
}
