package lesson8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        String cities[] = {"Москва","Омск","Казань"};
        List<String> list = new ArrayList<>();
//        list = Arrays.asList(cities);
        Collections.addAll(list,cities);
        list.add("Волгоград");
        for (String s : list) {
            System.out.println(s);
        }

        List<String> newCities = new ArrayList<>();
        Collections.addAll(newCities,"Томск","Королев");
//        Collections.addAll(newCities,list);//работать не будет! Коллекцию в коллекцию так добавить нельзя
    }
}
