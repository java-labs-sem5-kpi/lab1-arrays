package com.sergosoft.arraysapp;

public class MatrixProcessor {

    public float[][] xorMatrices(float[][] a, float[][] b) {
        if(a == null || b == null) {
            throw new IllegalArgumentException("Input matrices cannot be null.");
        }

        if(a.length != b.length || a[0].length != b[0].length) {
            throw new IllegalArgumentException("Input matrices must contain equal amount of rows and columns.");
        }

        int rows = a.length;
        int columns = a[0].length;

        float[][] c = new float[rows][columns];

        for(int row = 0; row < rows; row++) {
            for(int column = 0; column < columns; column++) {
                int aBits = Float.floatToIntBits(a[row][column]);
                int bBits = Float.floatToIntBits(b[row][column]);
                int xorResult = aBits ^ bBits;
                c[row][column] = Float.intBitsToFloat(xorResult);
            }
        }
        return c;
    }

    public float calculateSum(float[][] matrix) {
        if(matrix == null) {
            throw new IllegalArgumentException("Input matrix cannot be null.");
        }

        if(matrix.length == 0 || matrix[0].length < 2) {
            throw new IllegalArgumentException("Input matrix must contain at least 1 row and 2 columns.");
        }

        float sum = 0;
        for(int column = 0; column < matrix[0].length; column++) {
            float columnExtreme = matrix[0][column];

            for(int row = 0; row < matrix.length; row++) {
                float currentElement = matrix[row][column];

                if(column % 2 == 0) {
                    if(currentElement < columnExtreme) {
                        columnExtreme = currentElement;
                    }
                } else {
                    if(currentElement > columnExtreme) {
                        columnExtreme = currentElement;
                    }
                }
            }
            sum += columnExtreme;
        }
        return sum;
    }
}
