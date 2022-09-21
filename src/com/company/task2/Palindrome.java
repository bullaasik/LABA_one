package com.company.task2;

public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0 ; i < args.length; i++) {
            String s = args[i];
            System.out.println(s + " " + isPalindrome(s));
        }
    }
    public static String reverseString(String myString) { //myString - строка, которая будет перевернута
        char[] array = myString.toCharArray();
        String myNewString = ""; //myNewString - результат после переворота
        for (int i = array.length - 1; i >= 0; i--) {
            myNewString = myNewString + array[i];
        }
        return myNewString;
    }

    public static boolean isPalindrome(String str) {
        String myNewStr = reverseString(str);
        return str.equals(myNewStr);
    }
    
}


