package com.challenge;

public class Main {
//    Write a function that takes an integer minutes and converts it to seconds.
public static void main(String[] args) {
    System.out.println("Hello");

    System.out.println(minToSeconds(5));
    System.out.println(minToSeconds(3));
    System.out.println(minToSeconds(2));
}
public static int minToSeconds(int min){
    return min * 60;
}
}
