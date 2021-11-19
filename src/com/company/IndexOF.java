package com.company;

public class IndexOF {
    public static void main(String[] args) {
        String  x = "hello my little friend. let me tell you a story";
        System.out.println(x.length());
        for (int i=0; i < x.length(); i++){
           int index = x.indexOf('l', i);
            System.out.print( index + " ");
            }
        }
    }
