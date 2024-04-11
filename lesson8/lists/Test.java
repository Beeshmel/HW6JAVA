package lesson8.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> langs = new ArrayList<String>();

        langs.add("Java");
        langs.add("JS");

//        Добавление нескольких элементов
        Collections.addAll(langs,"Python","C#");

//        System.out.println(langs);

//        Обход коллекции по значению через forEach
//        int i = 1;
//        for (String lang : langs) {
//            System.out.println(i + ")" + lang);
//            i++;
//        }

        langs.add(2,"PHP");//добавление элемента по индексу

//        Удаление элемента из коллекции

        String removedLang = langs.remove(0);//удалили первый элемент
        System.out.println(removedLang + " был удален!");

        if(langs.remove("PHP")){
            System.out.println("Элемент удален!");
        }

        for (int i = 0; i < langs.size(); i++) {
            System.out.println(langs.get(i));
        }
    }
}
