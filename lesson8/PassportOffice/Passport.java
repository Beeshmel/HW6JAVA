package lesson8.PassportOffice;

public class Passport {
    private String fio;
    private String series;
    private String number;

    public Passport(String fio, String series, String number) {
        this.fio = fio;
        this.series = series;
        this.number = number;
    }

    public String getFio() {
        return fio;
    }

    public String getSeries() {
        return series;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "fio='" + fio + '\'' +
                ", series='" + series + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
