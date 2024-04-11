package lesson8;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Notarius {
    public static void main(String[] args) throws IOException {
        List<String> men = new ArrayList<>();
        int countClients = 0;//количество клиентов
        String fio = "";
        var reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            if(countClients > 10){
                System.out.println("Нотариус завершает работу");
                break;
            }

            System.out.printf("Клиент №%d, введите имя\n",++countClients);
            fio = reader.readLine();
            men.add(fio);
            if(men.size() > 5){
                System.out.println("Может войти " + men.remove(0) + "," +
                        "следующий: " + men.get(0));
            }
        }
    }
}
