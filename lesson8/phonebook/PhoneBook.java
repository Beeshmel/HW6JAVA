package lesson8.phonebook;

import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        Map<Abonent, List<String>> phones = new HashMap();

        Abonent abonentFirst = new Abonent(1,"Иванов");
        Abonent abonentSecond = new Abonent(2,"Петров");
        Abonent abonentThird = new Abonent(3,"Сидоров");

        List<String>abonentFirstPhones = new ArrayList<>();
        Collections.addAll(abonentFirstPhones,"+7942424247","+7942554241");

        List<String>abonentSecondPhones = new ArrayList<>();
        Collections.addAll(abonentSecondPhones,"+794476542","+7949786543");

//        Добавление элемента в Map осуществляется методом put
        phones.put(abonentFirst,abonentFirstPhones);
        phones.put(abonentSecond,abonentSecondPhones);

//        Обход коллекции Map
        for(var item : phones.entrySet()){
            //через entrySet мы получаем объект, у которого можно получить
            // и ключ и значение через специальные методы
            System.out.println("Абонент " +
                    item.getKey().getFio() + " имеет телефоны: " +
                    "" + item.getValue());

        }


    }
}
