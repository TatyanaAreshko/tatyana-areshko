package Employees;

public class Employee {
        private String fio;
        private String job;
        public String email;
        public String tel;
        private int salary;
        private int age;

    public Employee(String fio, String job, String email, String tel, int salary, int age) {
        this.fio = fio;
        this.job = job;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public String getFio() {
        return fio;
    }

    public String getJob() {
        return job;
    }

    public int getSalary() {
        return salary;
    }

    public void setAge(int age) {
        if (this.age>age){
            System.out.println("Please, enter a valid age");
        }
        else {
            this.age = age;
        }
    }

}
