package Employees;

public class App {
    public static void main(String[] args) {
        Employee emp = new Employee(
            "Areshko Tatyana",
            "QA",
            "t.areshko@andersenlab.com",
            "+375293602218",
             100,
             18);
        emp.getFio();
        emp.getJob();
        emp.getSalary();
        emp.setAge(20);
        System.out.println("Description employee: " + " / " + emp.getFio() + " / " + emp.getJob() + " / " + emp.email + " / " +
                           emp.tel + " / " + emp.getSalary() + " / ");
    }



}
