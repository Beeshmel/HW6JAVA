package car;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
public class Main {
    public static void main(String args[]) throws IOException {
        System.out.println("Сколько номеров необходимо создать?");
        Main spisok = new Main(Integer.parseInt(reader.readLine()));
        spisok.findFio();
        spisok.showALL();
        spisok.isNomerGood();
    }
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private List<Nomer> nomerList;
    String seria;
    String number;
    Main(int count) throws IOException {
        nomerList = new ArrayList<>();
        String fio;
        String region;
        Nomer newNomer = null;
        while (count > 0){
            createSeriaNomer();
                System.out.println("Введите имя владельца номера ");
                fio = reader.readLine();
                    System.out.println("Введите номер Региона");
                    region = reader.readLine();
            newNomer = new Nomer(seria,number,region,fio);
            nomerList.add(newNomer);
            System.out.println("Номер " + newNomer.showNomer()+ " сохранен");
            count--;
            }
        }

        private void createSeriaNomer() throws IOException {
            System.out.println("Введите \"a\", если СЕРИЮ необходимо заполнить" +
                    " автоматически, либо \"h\", если заполняем вручную");
                if(reader.readLine().equalsIgnoreCase("h")){
                System.out.println("Введите СЕРИЮ в формате ABC");
                seria = reader.readLine();//нужно проверить введенную серию паспорта
                }else{
                seria = generateSeria(3);
                }
            number = generateNumber(3);
        }

        private String generateSeria(int i) {
            String alph[] = {"А", "В", "Е", "К","М", "Н", "О", "Р", "С", "Т", "У"};
            String seria = "";
                for (int j=0; j<i;j++){
                    seria = seria + alph[(int) Math.floor(Math.random() * alph.length)];
                }
            return seria;
        }

        private static String generateNumber(int count){
            StringBuilder builder = new StringBuilder();
                for (int i = 0; i < count; i++) {
                    builder.append(new Random().nextInt(10));
                }
            return builder.toString();
        }

        private void isNomerGood() throws IOException {
            System.out.println("Введите номер для проверки на Красивость в формате А111АА");
            String stroka = reader.readLine();
            String [] strNomer = stroka.split("");
                if ((strNomer[0].equalsIgnoreCase(strNomer[4])&&strNomer[4].equalsIgnoreCase(strNomer[5]))|(strNomer[1]==strNomer[2]&&strNomer[2]==strNomer[3])){
                    System.out.println("Номер красивый");
                }else {
                    System.out.println("Номер некрасивый. Купите новый");
                }
        }

        private void findFio() throws IOException{
            System.out.println("Введите номер для поиска владельца в формате А111АА11 (рус. язык)");
            String str = reader.readLine();
            int i = 0;
                    for (Nomer nomer1 : nomerList) {
                        if (nomer1.showNomer().equals(str)) {
                            System.out.println("ФИО владельца: " + nomer1.getFio());
                            i++;
                        }
                    }
                if (i == 0) {
                    System.out.println("Номер не найден");
                }
        }

        private void showALL() {
            System.out.println("Полный список номеров");
                for (Nomer nomer: nomerList){
                    System.out.println(nomer.toString());
                }
        }

}
