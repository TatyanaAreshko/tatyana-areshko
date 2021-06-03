package Employees;

import java.util.Arrays;

public class EmpArray {
    public static void main(String[] args) {
        Sotrudnik[] sotr = new Sotrudnik[5];
        sotr[0] = new Sotrudnik("Ivanov","QA","test1", "123", 18);
        sotr[1] = new Sotrudnik("Petrov","QA","test2", "456", 20);
        sotr[2] = new Sotrudnik("Sidorov","QA","test3", "789", 50);
        sotr[3] = new Sotrudnik("Kovalev","QA","test4", "789", 48);
        sotr[4] = new Sotrudnik("Areshko","QA","test5", "777", 31);

        for (int i = 0; i < sotr.length; i++){
            if (sotr[i].getAge()>40){
                sotr[i].info();
            }
            else{

            }

        }




    }


}
