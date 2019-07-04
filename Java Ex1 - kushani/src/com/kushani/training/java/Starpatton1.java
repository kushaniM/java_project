package com.kushani.training.java;

public class Starpatton1 {

    public static void main(String[] args) {
        int n = 8;


        for (int x = 0; x <= n; x++) {//steps
            for (int y = n - x; y > 0; y--) {//spaces
                System.out.print(" ");
            }

            for (int z = 0; x > z; z++) {
                System.out.print("* ");
            }

            System.out.println();

        }

        for (int x = 0; x < n; x++) {
            for (int y = 0; y <= x; y++) {

                System.out.print(" ");

            }

            for (int z = n - x - 1; z > 0; z--) {
                System.out.print("* ");
            }

            System.out.println();

        }
    }

}

