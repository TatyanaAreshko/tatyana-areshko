package phonebook;


import java.util.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Runner extends PhoneBook{

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Ivan", "123", "555");

        phoneBook.add("Petr", "456");
        phoneBook.add("Max", "777");
        phoneBook.add("Ivan", "123");


        System.out.println(getPhones());
        System.out.println("___________________");
        System.out.println(phoneBook.get("Max"));








    }
}
