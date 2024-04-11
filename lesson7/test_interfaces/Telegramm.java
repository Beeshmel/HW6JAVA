package lesson7.test_interfaces;

public class Telegramm implements IMessager {
    private String title;

    public Telegramm(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void getMessage() {

    }

    @Override
    public void sendMessage() {
        System.out.println("Отправлено сообщение через " + title);
    }
}
