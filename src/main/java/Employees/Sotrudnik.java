package Employees;

public class Sotrudnik {

        private String fio;
        private String job;
        private String email;
        private String tel;
        private int age;

    public Sotrudnik(String fio, String job, String email, String tel, int age) {
        this.fio = fio;
        this.job = job;
        this.email = email;
        this.tel = tel;
        this.age = age;
    }

    public String getFio() {
        return fio;
    }

    public String getJob() {
        return job;
    }

    public String getEmail() {
        return email;
    }

    public String getTel() {
        return tel;
    }

    public int getAge() {
        return age;
    }

    public void info(){
        System.out.println(fio+" / "+job + " / " +email+" / " + tel+ " / " + age);
    }
}
