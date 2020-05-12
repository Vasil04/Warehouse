package com.company;

public class Warehouse {
    public Product array[][] = new Product[10][10];


    public void placeProduct (Product product, int row, int column, int neededSpace) {
        for (int i = 0; i < neededSpace; i++) {
            array[column][row] = product;
            row++;
        }

    }
}
