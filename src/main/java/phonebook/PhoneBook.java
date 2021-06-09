package phonebook;

import java.util.*;

public class PhoneBook {

    private static final Map<String, Set<String>> phones = new HashMap<>();

    public static Map<String, Set<String>> getPhones() {
        return phones;
    }

    public void add(String name, String... number) {
        //присваиваем значение поля имя переменной numbers
        Set<String> numbers;
        if (phones.get(name) == null){
            numbers = new HashSet<>(Arrays.asList(number));
            phones.put(name, numbers);
        } else {
            phones.get(name).addAll(Arrays.asList(number));
        }

    }

    //создаем список имен сотрудников
    public Set<String> get(String name) {
        return phones.get(name);
    }

    // проверка
   /* public void check(String name, String number) {
        List<String> num = new ArrayList<>();
        if (this.phones.containsKey(name)) {
            num = this.phones.get(name);
            num.add(name);
            this.phones.put(name, phones.get(number));
        } else {
            num.add(name);
            this.phones.put(name, phones.get(number));
        }
        System.out.println(phones);

    }*/
}
