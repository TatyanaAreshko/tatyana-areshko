package Employees;

public abstract class Animal {
    private String name;
    private int runDistance;
    private int swimDistance;

    public Animal (String name, int runDistance, int swimDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
    }

    public String getName() {
        return name;
    }


    public String swim(int length) {
        if (length <= swimDistance) {
            return ("проплыл(а) " + length + " метров");
        } else {
            return ("не может проплыть такую дистанцию");
        }
    }

    public String run(int length) {
        if (length <= runDistance) {
            return ("пробежал(а) " + length + " метров");
        } else {
            return ("не может пробежать такую дистанцию");
        }
    }


}
