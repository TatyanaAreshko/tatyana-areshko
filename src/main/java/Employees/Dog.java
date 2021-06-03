package Employees;

public class Dog extends Animal {

    static int  sumDog;

    public Dog(String name, int runDistance, int swimDistance) {
        super(name, runDistance, swimDistance);
        sumDog++;
    }

}
