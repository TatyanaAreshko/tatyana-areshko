package work1;

// простой метод для вывода слов Orange, Banana, Apple
public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

// просуммировать 2 числа и проверить больше или меньше оно 0
    public static void checkSumSign(){
        int a = 10;
        int b = 66;
        int c = a+b;
        if (c>=0){
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

//вывести цвет в зависимости от диапазона значений
    public static void printColor(){
        int i = 0;
        if (i<=0){
            System.out.println("Красный");
        }
        else if (i>0 && i<=100){
            System.out.println("Желтый");
        }
        else if (i>100){
            System.out.println("Зеленый");
        }
    }

// Сравнение двух переменных а и b
    public static void compareNumbers(){
        int a = -10;
        int b = 5;
        if (a>=b){
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
    }
}

