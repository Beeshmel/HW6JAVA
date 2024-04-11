package lesson7.test_exceptions;

import java.util.Scanner;

public class DemoFinally {
//    Оператор finally гаранитирует выполнение какого-либо блока кода. То есть, если мы хотим,
//    чтобы какой-либо код выполнялся в любом случае, то данный код помещаем в блок finally.
//    Данный оператор обязательно идет в связке с try, то есть можшно использовать
//            try-finally без catch, либо try-catch-finally

    public static void main(String[] args) throws Exception{
        var sc = new Scanner(System.in);
        try {
            int x = 10 / 0;
            System.out.println("Введите число");
            sc.nextInt();
            return;
        }catch (Exception e) {
            System.out.println("На 0 делить нельзя");
        }
        finally{
            System.out.println("До выхода из метода Вы увидите этот текст");
            sc.close();
        }

    }
}
