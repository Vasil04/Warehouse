package com.company;

public class Product{

    private String name;
    private String description;
    private String expiryDate;
    private String entryDate;
    private String nameOfMaker;
    private String weight;
    private int availability;
    private String location;
    private String comment;
    private int maxCountOfProductOnOneShelf;

    public Product(String name, String description, String expiryDate, String entryDate, String nameOfMaker, String weight, int availability, String location, String comment, int maxCountOfProductOnOneShelf) {
        this.name = name;
        this.description = description;
        this.expiryDate = expiryDate;
        this.entryDate = entryDate;
        this.nameOfMaker = nameOfMaker;
        this.weight = weight;
        this.availability = availability;
        this.location = location;
        this.comment = comment;
        this.maxCountOfProductOnOneShelf = maxCountOfProductOnOneShelf;
    }

    public Product(){
        this.name = "Test";
        this.description = "Testing";
        this.expiryDate = "13/06/2021";
        this.entryDate = "12/05/2020";
        this.nameOfMaker = "test.inc";
        this.weight = "kg";
        this.availability =10;
        this.location="something";
        this.comment="Nothing to say";
        this.maxCountOfProductOnOneShelf = 4;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getNameOfMaker() {
        return nameOfMaker;
    }

    public void setNameOfMaker(String nameOfMaker) {
        this.nameOfMaker = nameOfMaker;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getMaxCountOfProductOnOneShelf() {
        return maxCountOfProductOnOneShelf;
    }

    public void setMaxCountOfProductOnOneShelf(int maxCountOfProductOnOneShelf) {
        this.maxCountOfProductOnOneShelf = maxCountOfProductOnOneShelf;
    }
}
