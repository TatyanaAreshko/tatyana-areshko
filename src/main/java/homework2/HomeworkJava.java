package homework2;

import java.util.Arrays;

public class HomeworkJava {
    public static void main(String[] args) {
        sumRange();
        inputNumber();
        int testNumber = -10;
        boolean testResult = inputNumber2(testNumber);
        System.out.println(testResult);
        //inputText();
        inputText2("Hello!", 10);
        int testYear = 1999;
        boolean testResul = fiveTask(testYear);
        System.out.println(testResul);
        replaceNumber();
        fillArray();
        multiplicationArray();
        minMAxArray();
        argument(10, 5);
        matrix();
        //noMatrixArray();
        //int[] array = {2, 2, 2, 1, 2, 2, 10, 1};
        //System.out.println(sumArray(array));
    }

    /* 1. Написать метод, принимающий на вход два целых числа и проверяющий,
    что их сумма лежит в пределах от 10 до 20 (включительно),
    если да – вернуть true, в противном случае – false.*/
    public static void sumRange() {
        int a = 10;
        int b = 15;
        int c = (a + b);
        if (c >= 10 && c <= 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    //задание 2
    public static void inputNumber() {
        int cheslo = -10;
        if (cheslo >= 0) {
            System.out.println(cheslo + " - это положительное число");
        } else {
            System.out.println(cheslo + " - это отрицательное число");
        }
    }

    //задание 3
    public static boolean inputNumber2(int a) {
        if (a >= 0) {
            return true;
        } else {
            return false;
        }
    }

    //задание 4
    /*public static void inputText() {
        String s = "This is number";
        int a = 10;
        //System.out.println(s);
        //System.out.println(a);
        for (int i = 0; i < a; i += 2) {
            System.out.println(s);
        }
    }*/
    public static void inputText2(String string,int times){
        for (int i = 0; i < times; i ++){
            System.out.println(string);
        }

    }

    //задание 5 ---------------------------------
    public static boolean fiveTask(int year) {
        if ((year % 4 == 0) && year % 100 != 0) {
            return true;
        } else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    //задание 6
    public static void replaceNumber() {
        int[] intArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 1) {
                intArray[i] = 0;
            } else {
                intArray[i] = 1;
            }
            //System.out.println(Arrays.toString(intArray));
            System.out.print(intArray[i]);
        }
    }

    //задание 7
    public static void fillArray() {
        int[] intArray = new int[100];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i+1;
            System.out.println(intArray[i]);
        }
    }

    //задание 8
    public static void multiplicationArray() {
        int[] intArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < 6) {
                intArray[i] *= 2; // посмотреть, почему не работает без сокращения
            } else {
                intArray[i] = i;
            }
            System.out.print(intArray[i] + " ");
        }
    }

    //задание 9.1
    public static void minMAxArray() {
        int[] intArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        Arrays.sort(intArray);
        System.out.println(intArray[0] + " - минимальное значение массива");
        int max = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            max = Math.max(max, intArray[i]);
        }
        System.out.println(max + " - максимальное значение массива");
    }

    //задание 9
    /*public static void argument() {
        int len = 5;
        int initialValue = 1;
        int[] mas = new int[len];
        System.out.println(Arrays.toString(mas));
        for (int i = 0; i < mas.length; i++) {
            mas[i] = initialValue;
            System.out.print(mas[i]);
        }
    }*/
    public static int[] argument(int len, int initialValue) {
        int[] result = new int[len];
        for (int i = 0; i < len; i += 2){
            result[i] = initialValue;
            System.out.println(result[i]);
        }
        return result;
    }

    //задание 8.1
    public static void matrix() {
        int[][] mas = {
                {2, 2, 2},
                {2, 2, 2},
                {2, 2, 2}
        };
        for (int i = 0; i < 3; i++) { //строки и столбцы
            for (int j = 0; j < 3; j++) {
                System.out.print(mas[i][j]);
            }
            System.out.println(); //вывод изначального массива
        }
        for (int i = 0; i < mas.length; i++) { //строки и столбцы
            for (int j = 0; j < mas[0].length; j++) {
                if ((i + j) % 2 == 0) { //проверяем четность и нечетность клетки матрицы
                    mas[i][j] = 1;
                } else {
                    mas[i][j] = mas[i][j];
                }
                System.out.print(" " + mas[i][j]);
            }
            System.out.println(); //вывод конечного массива
        }
    }

    //задание 10
    /*public static boolean sumArray(int[] mas) {
        int sumLeft = 0;
        int sumRight = 0;
        for (int i : mas) { //???
            sumRight = sumRight + i;
        }
        for (int i = 0; i < mas.length; i++) {
            if (sumLeft == sumRight) {
                return true;
            }
            sumLeft = sumLeft + mas[i];
            sumRight = sumRight - mas[i];
        }
        return false;
    }*/


}

