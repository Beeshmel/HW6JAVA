package lesson7.test_exceptions;

import java.util.Scanner;

public class DemoThrow {
//    Оператор throw используется для генерации ошибок. То есть если наш пользователь
//    допустил ошибку, например, вввел некорректное значение, то можем напугать его ошибкой
//    Если в методе есть инструкции, в которых выполняется генерация ошибки, то об этом нужно
//            информировать через оператор throws

    public static void main(String[] args) throws Exception{
        System.out.println("Введите число от 20 до 40");
        var age = new Scanner(System.in).nextInt();
        if(age < 20 || age > 40){
            throw new Exception("Вы ввели недопустимое значение");
        }
    }
}
