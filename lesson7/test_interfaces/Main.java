package lesson7.test_interfaces;

public class Main {
    public static void main(String[] args) {
//        Viber viber = new Viber("Вайбер");
//        viber.sendMessage();
//        viber.showInfoAboutMessager(viber.getTitle());
//
//        Telegramm telegramm = new Telegramm("Телеграмм");
//        telegramm.sendMessage();
//        telegramm.showInfoAboutMessager(telegramm.getTitle());

        IMessager viber = new Viber("Вайбер");
        IMessager telega = new Telegramm("Телеграмм");

        IMessager mas[] = {viber,telega};

        for (IMessager item : mas) {
            item.sendMessage();
        }

//        Если перед объектом написан интерфейс, то с помощью этого объекта Вы можете вызывать
//        только переопределенные методы интерфейса, то есть собственные методы класса
//        Вам недоступны

//        viber.sendMessage();
//        viber.ownMethod();
    }

}
