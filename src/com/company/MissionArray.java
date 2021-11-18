package com.company;

public class MissionArray {

    public static void main(String[] args) {
        int year = 100;
        int summ = 0;
        for (int i=1; i <= year; i++ ) {
            if (((i % 4 == 0) && (i % 100 !=0)) || (i % 400 == 0)) {
                summ++;
            }
        }
        System.out.println("summ = " + summ);
        //return year;
    }
}
























/*
        int[] array1 = {20,8,-7,75,45,60,94};
        int[] array2 = {-3, 0, 1, 3, 10};
        int sumNumbersAr1 = 0;
        int sumNumbersAr2 = 0;
        double averageArray1;
        double averageArray2;
        for (int i =0;i < array1.length;i++) {
            sumNumbersAr1 = sumNumbersAr1 +array1[i];
        }
        averageArray1 = (double) sumNumbersAr1 / array1.length;
        System.out.println("averageArray1 =" + averageArray1);

        for (int i =0;i < array2.length;i++) {
            sumNumbersAr2 = sumNumbersAr2 +array2[i];
        }
        averageArray2 = (double) sumNumbersAr2 / array2.length;
        System.out.println("averageArray2 =" + averageArray2);

        int quantity1 = 0;
        int quantity2 = 0;

        if (averageArray1 >= averageArray2) {
            for (int i=0; i < array1.length; i++) {
                if ((averageArray2 <= array1[i]) && (array1[i]<=averageArray1)) {
                    quantity1++;
                }
            }
            for (int i=0; i < array2.length; i++) {
                if ((averageArray2 <= array2[i]) && (array2[i]<=averageArray1)) {
                    quantity2++;
                }
            }
        } else {
                for (int i = 0; i < array1.length; i++) {
                    if ((averageArray1 <= array1[i]) && (array1[i] <= averageArray2)) {
                        quantity1++;
                    }
                }
                for (int i = 0; i < array2.length; i++) {
                    if ((averageArray1 <= array2[i]) && (array2[i] <= averageArray2)) {
                        quantity2++;
                    }
                }
        }
        System.out.println("quantity1 =" + quantity1);
        System.out.println("quantity2 =" + quantity2);

        int [] array3 = new int [quantity1 + quantity2];
        int j = 0;
        int x = 0;

        if (averageArray1>=averageArray2) {
            for (int i = 0; i < array1.length; i++) {
                if ((averageArray2 <= array1[i]) && (array1[i] <= averageArray1)) {
                    array3[j++] = array1[i];
                }
            }
        } else {
                for (int i = 0; i < array1.length; i++) {
                    if ((averageArray1 <= array1[i]) && (array1[i] <= averageArray2)) {
                        array3[j++] = array1[i];
                    }
                }
        }

        if (averageArray1>=averageArray2) {
            for (int i = 0; i < array2.length; i++) {
                if ((averageArray2 <= array2[i]) && (array2[i] <= averageArray1)) {
                    array3[quantity1 + x++] = array2[i];
                }
            }
        } else {
                for (int i = 0; i < array2.length; i++) {
                    if ((averageArray1 <= array2[i]) && (array2[i] <= averageArray2)) {
                        array3[quantity1 + x++] = array2[i];
                    }
                }
        }
        System.out.print("array3 =");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(" " + array3[i]);
        }
    }
}
*/







    /*int [] array1 = {-3,4,-3,-3,-3,10,1,10,10};
    int quantityMax =0;
    int quantityMin =0;

        int min = (int)Double.POSITIVE_INFINITY;
        int max = (int)Double.NEGATIVE_INFINITY;
        for (int i =0;i< array1.length;i++) {
            if (max<array1[i]) {
                max=array1[i];
            } else {
                if (min>array1[i]) {
                    min=array1[i];
                }
            }
        }
        System.out.println("max =" + max);
        System.out.println("min =" + min);
        for (int i =0;i< array1.length;i++) {
            if (array1[i] == max) {
                quantityMax++;
            } else {
                if (array1[i] == min) {
                    quantityMin++;
                }
            }
        }
        System.out.println("quantityMax =" + quantityMax);
        System.out.println("quantityMin =" + quantityMin);

        int [] noRepeat = new int[array1.length-(quantityMax-1)-(quantityMin-1)];
        int nR = 0;
        int repeatMax = 0;
        int repeatMin = 0;
        for (int i =0;i< array1.length;i++) {
            if ((array1[i] != max) && (array1[i] != min)) {
                noRepeat [nR++] = array1[i];
            } else {
                if (array1[i] == max) {
                    repeatMax++;
                    if (repeatMax<2) {
                        noRepeat [nR++] = array1[i];
                    }
                } else {
                    if (array1[i] == min) {
                        repeatMin++;
                        if (repeatMin < 2) {
                            noRepeat[nR++] = array1[i];
                        }
                    }
                }
            }
        }
        System.out.print("noRepeat =");
        for (int i =0;i< noRepeat.length;i++) {
            System.out.print(" " + noRepeat[i]);
        }
    }
}*/
