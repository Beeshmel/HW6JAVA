package lesson7.test_exceptions;

public class DemoTryCatch {
    public static void main(String[] args) {
        int a = 0;
        int arr[] = {1,2,3};
        try{//внутри блока try записываем инструкции, которые могут при выполнени выдавать ошибку
            a = 10 / (Math.round((int)(Math.random() * 2)));
            System.out.println(a);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            System.out.println(arr[(int) (Math.random() * 3 + 2)]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        System.out.println(a);
       System.out.println("Текст после ошибки");
    }
}
