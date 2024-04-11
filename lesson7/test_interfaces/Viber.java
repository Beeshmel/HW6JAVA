package lesson7.test_interfaces;

public class Viber implements IMessager,IUser {
    private String title;

    public Viber(String title) {
        this.title = title;
    }

    @Override
    public void getMessage() {

    }

    @Override
    public void sendMessage() {
        auth();
        System.out.println("Отправлено сообщение через " + title);
    }
    public String getTitle() {
        return title;
    }
    @Override
    public void auth() {
        System.out.println("Авторизация прошла успешно");
    }

    @Override
    public void reg() {

    }

    @Override
    public void logOut() {

    }

    void ownMethod(){
        System.out.println("test");
    }
}
