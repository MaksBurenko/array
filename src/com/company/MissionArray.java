package com.company;

public class MissionArray {
    public static void main(String[] args) {
        int[] a1 = {20, 75, -7, 82};
        int[] a2 = {-8, 50, 5, -60, 90};
        int[] a3 = new int[a1.length + a2.length];
        for (int i = a1.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a1[j] > a1[j + 1]) {
                    int x;
                    x = a1[j];
                    a1[j] = a1[j + 1];
                    a1[j + 1] = x;
                }
            }
        }
        for (int i = a2.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a2[j] > a2[j + 1]) {
                    int x;
                    x = a2[j];
                    a2[j] = a2[j + 1];
                    a2[j + 1] = x;
                }
            }
        }
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a2.length; i++) {
            System.out.print(a2[i] + " ");
        }
        //  слияние упорядоченых массивов а1 и а2 по возрастанию

        if (a1.length == 0) {
            for (int i = 0; i < a2.length; i++) {
                a3 [i] = a2[i];
            }
        } else {
            if (a2.length == 0) {
                for (int i = 0; i < a1.length; i++) {
                    a3 [i] = a1[i];
            }
        } else {
                int b = a1[0];
                int x = 0;

                for (int j = 0; j < a2.length; j++) {
                    if (a2[j] <= b) {
                        a3[x++] = a2[j];
                    } else {
                        a3[x++] = b;
                        b = a2[j];
                    }
                }

                for (int i = 1; i < a1.length; i++) {
                    if (a1[i] <= b) {
                        a3[x++] = a1[i];
                    } else {
                        a3[x++] = b;
                        b = a1[i];
                    }
                }

                if (x == a3.length - 1) {
                    a3[x] = b;
                }
            }
        }

        System.out.println();
        for (int i = 0; i < a3.length; i++) {
            System.out.print(a3[i] + " ");
        }
    }
}





        /*

        int[] arr = {20, 75, -7, 75, 75, 60, 94};
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}*/

/*
String x = text.toLowerCase();
        x = x.replaceAll("[^A-Za-z0-9]", "");

        char [] array1Text = x.toCharArray();
        char [] array2Text = new char [array1Text.length];
        for (int i=0; i<array1Text.length; i++) {
            array2Text [(array2Text.length-1) - i] = array1Text [i];
        }

        boolean result = Arrays.equals(array1Text,array2Text);

    return result;
 */
/*
String Text = "Madam, I'm Adam!";
        String x = Text.toLowerCase();
        x = x.replaceAll("[^A-Za-z0-9]", "");
        StringBuilder sb1 = new StringBuilder(x);
        sb1.reverse();
        System.out.println(sb1);
        StringBuilder sb2 = new StringBuilder(x);
        System.out.println(sb2);
        System.out.println("result = " + sb1.toString().equals(sb2.toString()));
 */

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
