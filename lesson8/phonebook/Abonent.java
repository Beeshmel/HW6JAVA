package lesson8.phonebook;

import java.util.List;

public class Abonent {
    private int id;
    private String fio;
    public Abonent(int id, String fio) {
        this.id = id;
        this.fio = fio;
    }

    public int getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }


}
