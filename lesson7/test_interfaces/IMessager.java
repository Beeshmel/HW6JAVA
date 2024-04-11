package lesson7.test_interfaces;

public interface IMessager {
    void getMessage();
    void sendMessage();

    default void showInfoAboutMessager(String info){
        System.out.println(info);
    }
}
