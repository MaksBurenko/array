package com.company;

public class BitArray {

    public static void main(String[] args) {
        int value = 0;
        int bitIndex = 1;
        int x = value ^ (1 << bitIndex);
        System.out.println(Integer.toBinaryString(value));
        System.out.println(Integer.toBinaryString(x));
    }
}
