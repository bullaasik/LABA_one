package com.company.task1;


public class Primes {

    /*public static void main(String[] args) {

        for (int i = 2; i < 100; i++) {
            boolean result = isPrime(i);
            if (result) {
                System.out.print(i + " ");
            }
        }
    } */

    public static boolean isPrime(int n) {
        int numberOfDivisors = 0; //переменная, отвечающая за количетво делителей
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                 numberOfDivisors++;
            }
        }
        return numberOfDivisors <= 0;
    }
}
