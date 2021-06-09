package hashMaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class MyArray {

    public static void main(String[] args) {
        String[] arr = new String[10];
        arr[0] = "Барсик";
        arr[1] = "Мурзик";
        arr[2] = "Барсик";
        arr[3] = "Рыжик";
        arr[4] = "Тимофей";
        arr[5] = "Эммануил";
        arr[6] = "Чудо";
        arr[7] = "Чудо";
        arr[8] = "Вельзевул";
        arr[9] = "Стингер";

        for (int i = 0; i< arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("-----------------------------");

        //Установленный интерфейс гарантирует уникальность значений.
        //TreeSet дополнительно сортирует эти значения.

        Set<String> uniqValue = new TreeSet<String>();
        uniqValue.addAll(Arrays.asList(arr));
        System.out.println("uniqValue: " + uniqValue);

        System.out.println("-----------------------------");

        //Для упрощения подсчета количества вхождений каждого слова
        // можно хранить пары "слово - количество" в HashMap.

        HashMap<String, Integer> wordToCount = new HashMap<>();
        for (String word : arr){
            if (!wordToCount.containsKey(word))
            {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }
        for (String word : wordToCount.keySet())
        {
            System.out.println(word + " " + wordToCount.get(word));
        }



    }
}
