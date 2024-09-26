package com.sergosoft.arraysapp;

public class Main {
    public static void main(String[] args) {
        MatrixProcessor matrixProcessor = new MatrixProcessor();
        MatrixPrinter matrixPrinter = new MatrixPrinter();

        float[][] a = {
                {1.0f, 2.5f, 3.1f},
                {4.2f, 5.6f, 6.8f},
                {7.9f, 8.3f, 9.7f}
        };

        float[][] b = {
                {9.0f, 8.5f, 7.1f},
                {6.2f, 5.1f, 4.8f},
                {3.9f, 2.7f, 1.4f}
        };

        float[][] c = matrixProcessor.xorMatrices(a, b);

        System.out.println("The first matrix (A): ");
        matrixPrinter.print(a);
        System.out.println();

        System.out.println("The second matrix (B): ");
        matrixPrinter.print(b);
        System.out.println();

        System.out.println("==================== ACTION 1 ====================");
        System.out.println("Calculating the result of A (+) B operation (xor)...");
        matrixPrinter.print(c);
        System.out.println();

        System.out.println("==================== ACTION 2 ====================");
        System.out.println("""
                Calculating the sum of the largest elements in the columns of the matrix with odd numbers and\s
                the smallest elements in the columns of the matrix with even numbers...
                """);
        System.out.println("Sum = " + matrixProcessor.calculateSum(c));
    }
}