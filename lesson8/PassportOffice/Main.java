package lesson8.PassportOffice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private List<Passport> passportList;
    private String series;

    /**
     *
     * @param count - количество паспортов, которые нужно создать
     */
    Main(int count) throws IOException {
        passportList = new ArrayList<Passport>();
        createSeries();
        String fio = "";
        Passport newPassport = null;
        while (count > 0){
            String numberPassport = generateNumber(6);
            if(isDublicatePassport(numberPassport)){
                System.out.println("Дубликат!");
                continue;
            }else{
                System.out.println("Введите имя владельца для паспорта " + series + " " + numberPassport);
                fio = reader.readLine();
                newPassport = new Passport(fio,series,numberPassport);
                passportList.add(newPassport);
                System.out.println("Паспорт сохранен");
            }
            count--;
        }


    }

    private boolean isDublicatePassport(String number) {
        for (Passport passport : passportList) {
            if(passport.getNumber().equalsIgnoreCase(number) && passport.getSeries().equalsIgnoreCase(series)){
                return true;
            }
        }
        return false;
    }

    private String findFioByNumberAndSeries(String number,String series) {
        for (Passport passport : passportList) {
            if(passport.getNumber().equalsIgnoreCase(number) && passport.getSeries().equalsIgnoreCase(series)){
                return passport.getFio();
            }
        }
        return "Паспорт не найден!";
    }

    /**
     * Метод для проверки серии паспорта на формат NN-NN
     * @param series - строка с серией
     * @return
     */
    private static boolean isSeries(String series){
//        Для преобразования строки в массив строк используем метод split.
//        В качестве параметра метод принимает подстроку(символ), который является
//        разделителем между элементами строки
        String mas[] = series.split("-");//получили массив из двух элементов
        boolean isCorrect = true;//считаем, что ввели корректное значение
        if(mas.length == 2){
            for (String item : mas) {//item - строка, состоящая из двух цифр
                if(item.length() == 2){//если в каждом элементе массива 2 символа
                    char masChar[] = item.toCharArray();//преобразование строки в массив символов
                    for (char c : masChar) {
                        if(!Character.isDigit(c)){//если хотя бы один символ не явлется цифрой
                            isCorrect = false;
                        }
                    }
                }else{
                    isCorrect = false;
                }
            }
        }else{
            isCorrect = false;
        }
        return isCorrect;
    }

    /**
     * Метод для рандомного заполнения числа цифрами в количесе count штук
     * @param count
     */
    private static String generateNumber(int count){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append(new Random().nextInt(10));
        }
        return builder.toString();
    }

    /**
     * Создаем серию паспорта вручную или автоматически на основе выбора администратора
     * @throws IOException
     */
    private void createSeries() throws IOException {
        System.out.println("Введите \"a\", если серию необходимо заполнить" +
                " автоматически, либо \"h\", если заполняем вручную");
        if(reader.readLine().equalsIgnoreCase("h")){
            System.out.println("Введите серию паспорта в формате NN-NN");
            String series = reader.readLine();//нужно проверить введенную серию паспорта
            if(isSeries(series)){//проверили введенное значение на соответствие формату NN-NN
                this.series = series;
            }
        }else{
            series = generateNumber(4);
        }
        System.out.println("Серия паспорта " + series);
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Сколько паспортов необходимо создать?");
        Main obj = new Main(Integer.parseInt(reader.readLine()));//при вызове создали коллекцию паспортов

        System.out.println("Для поиска владельца паспорта введите серию и номер паспорта через пробел");

        String info[] = reader.readLine().split(" ");
        System.out.println(obj.findFioByNumberAndSeries(info[1],info[0]));
    }
}
