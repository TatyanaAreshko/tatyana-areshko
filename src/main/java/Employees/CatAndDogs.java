package Employees;

public class CatAndDogs {
    public static void main(String[] args) {

        Cat cat = new Cat("Barsik", 200, 0);
        Cat cat2 = new Cat("Murzik", 300, 0);
        Dog dog = new Dog("Bobik", 300,10);
        System.out.println("Кот " + cat.getName() + " " + (cat.run(200)) + " и " + (cat.swim(2)));
        System.out.println("Кот " + cat2.getName() + " " + (cat2.run(400)) + " и " + (cat2.swim(2)));
        System.out.println("Собака " + dog.getName() + " " + (dog.run(330)) + " и " + (dog.swim(5)));
        System.out.println("Количество котов: " + Cat.sumCat);
        System.out.println("Количество собак: " + Dog.sumDog);
    }

}
