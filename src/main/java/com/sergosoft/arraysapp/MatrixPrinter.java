package com.sergosoft.arraysapp;

public class MatrixPrinter {

    public void print(float[][] matrix) {
        if(matrix == null) {
            throw new IllegalArgumentException("Input matrix cannot be null.");
        }

        for (float[] rows : matrix) {
            for (float element : rows) {
                System.out.printf("%12.2e\t", element);
            }
            System.out.println();
        }
    }
}
