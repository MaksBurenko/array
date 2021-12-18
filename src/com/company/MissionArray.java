package com.company;

public class MissionArray {
    public static void main(String[] args) {
        int[] a1 = null;
        int[] a2 = {1, 2};

        // проверка массивов на 0 и null
        if (a1 == null || a1.length == 0) {
            return a2;
        } else {
            if (a2 == null || a2.length == 0) {
                return a1;
            } else {

                // внесение отсортированных данных в массив a3
                int[] a3 = new int[a1.length + a2.length];

                int x = 0;
                int y = 0;

                for (int i = 0; ; i++) {
                    if (i == a1.length-1) {
                        ?????
                    } else {
                        if (i == a2.length-1) {
                            ?????
                        }
                        else {
                            if (a1[x] < a2[y]) {
                                a3[i] = a1[x];

                                x++;
                            } else {
                                a3[i] = a2[y];
                                y++;
                            }
                        }
                    }
                }
                return a3;
            }
        }
    }
}


/*
        // проверка массивов на 0 и null
        if (a2 == null & a1 == null) {
            // return a1;
            System.out.print("null");

        } else {
            if (a2 == null && a1.length == 0) {
                // return a1;
                System.out.print(a1.length);

            } else {
                if (a1 == null && a2.length == 0) {
                    // return a2;
                    System.out.print(a2.length);

                }  else {
                        if (((a1 == null) || (a1.length == 0)) && ((a2 != null) && (a2.length != 0))) {
                            for (int i = a2.length - 1; i > 0; i--) {
                                for (int j = 0; j < i; j++) {
                                    if (a2[j] > a2[j + 1]) {
                                        int tmp = a2[j];
                                        a2[j] = a2[j + 1];
                                        a2[j + 1] = tmp;
                                    }
                                }
                            }
                            // return a2;
                            for (int z = 0; z < a2.length; z++) {
                                System.out.print(a2[z] + " ");
                            }
                        } else {

                            if (((a2 == null) || (a2.length == 0)) && ((a1 != null) && (a1.length != 0))) {
                                for (int i = a1.length - 1; i > 0; i--) {
                                    for (int j = 0; j < i; j++) {
                                        if (a1[j] > a1[j + 1]) {
                                            int tmp = a1[j];
                                            a1[j] = a1[j + 1];
                                            a1[j + 1] = tmp;
                                        }
                                    }
                                }
                                // return a1;
                                for (int z = 0; z < a1.length; z++) {
                                    System.out.print(a1[z] + " ");
                                }
                            } else {
                                    if (a2.length == 0 && a1.length == 0) {
                                        // return a1;
                                        System.out.print(a1.length);

                                    } else {

                                int[] a3 = new int[a1.length + a2.length];

                                // сортировка массива a1
                                for (int i = a1.length - 1; i > 0; i--) {
                                    for (int j = 0; j < i; j++) {
                                        if (a1[j] > a1[j + 1]) {
                                            int tmp = a1[j];
                                            a1[j] = a1[j + 1];
                                            a1[j + 1] = tmp;
                                        }
                                    }
                                }
                                for (int i = 0; i < a1.length; i++) {
                                    System.out.print(a1[i] + " ");
                                }
                                // сортировка массива a2
                                for (int i = a2.length - 1; i > 0; i--) {
                                    for (int j = 0; j < i; j++) {
                                        if (a2[j] > a2[j + 1]) {
                                            int tmp = a2[j];
                                            a2[j] = a2[j + 1];
                                            a2[j + 1] = tmp;
                                        }
                                    }
                                }
                                System.out.println();
                                for (int i = 0; i < a2.length; i++) {
                                    System.out.print(a2[i] + " ");
                                }
                                // внесение отсортированных данных в массив a3
                                int x = 0;
                                int y = 0;

                                for (int i = 0; i < a3.length - 1; i++) {
                                    if (a1[x] < a2[y]) {
                                        a3[i] = a1[x];

                                        x++;
                                    } else {
                                        a3[i] = a2[y];

                                        y++;
                                    }
                                    // вычисление последнего элемента и его запись
                                    if (i == a3.length - 2) {
                                        if (a1[a1.length - 1] >= a2[a2.length - 1]) {
                                            a3[i + 1] = a1[a1.length - 1];

                                        } else {
                                            a3[i + 1] = a2[a2.length - 1];

                                        }
                                    }
                                }
                                System.out.println();
                                for (int z = 0; z < a3.length; z++) {
                                    System.out.print(a3[z] + " ");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}*/









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
