package Employees;

    public class Cat extends Animal{

        static int  sumCat;

    public Cat(String name, int runDistance, int swimDistance) {
        super(name, runDistance, swimDistance);
        sumCat++;
    }


}
