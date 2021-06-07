package ExceptionHomework;

public class App {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String[][] massiv = {
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}};

        String[][] massiv2 = {
                {"abc", "byy", "cuu", "dss"},
                {"qwe", "ert", "ybb", "nnn"},
                {"eee", "ttt", "jjj"},
                {"rrr", "hhh", "mmm"}};


        try {
            int sum2 = method(massiv);
            int sum = method(massiv2);

        } catch (MyArraySizeException e) {
            System.out.println("Неправильное значение массива!");
        } catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }
    }

        /*for (int i = 0; i < 4; i++) {  //идём по строкам
            for (int j = 0; j < 4; j++) {//идём по столбцам
                System.out.print(" " + massiv[i][j] + " ");
            }
            System.out.println();//перенос строки
        }
            System.out.println("------------------------------ Вывод массива 1");


        for (int i = 0; i < 4; i++) {  //идём по строкам
            for (int j = 0; j < 4; j++) {//идём по столбцам
                System.out.print(" " + massiv2[i][j] + " ");
            }
            System.out.println();
        }
            System.out.println("------------------------------ Вывод массива 2");

       */

    public static int method(String[][] massiv2) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (massiv2.length != 4) {
            throw new MyArraySizeException("Неверный размер массива");
        }
        for (int i = 0; i < massiv2.length; i++) {
            if (massiv2[i].length != 4) {
                throw new MyArraySizeException("Неверное количество элементов");
            }
            for (int j = 0; j < massiv2[i].length; j++) {
                try {
                    sum = sum + Integer.parseInt(massiv2[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return sum;
    }


}
