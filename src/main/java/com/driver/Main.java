package com.driver;

public class Main {

    // task 1 = create a class product inside main
    static class product {
        // tassk 3 = : Create a method
        public int product(int x, int y) {
            return x * y;
        }
        // task 4 = overloading method
        public int product(int x, int y, int z) {
            return x * y * z;
        }
        // task 5 = overloading method
        public double product(double x, double y) {
            return x * y;
        }


    }

    // task 2 = Create object of Product in Main function called p
    public static void main(String[] args) {
        product p = new product();

        // call the method with two integer
        int result1 = p.product(5,6);
        System.out.println("product of 5 and 6 : " + result1);


        // call the method
        int result2 = p.product(2,5,6);
        System.out.println("product of 2 , 5,6 : " + result2);

        // call the method
        double result3 = p.product(5.55,5.88);
        System.out.println("product of 5.55 and 5.88 : " + result3);




    }
}
