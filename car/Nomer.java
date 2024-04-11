package car;
public class Nomer {
    private String seria;
    private String number;
    private String region;
    private String fio;
        public Nomer(String seria, String number, String region, String fio) {
            this.seria = seria;
            this.number = number;
            this.region = region;
            this.fio = fio;
        }
        public String getRegion() {
            return region;
        }
        public String getFio() {
            return fio;
        }
        public  String getNumber() {
            return number;
        }
        public String getSeria() { return seria; }
        public String showNomer() {
            String [] strArr = getSeria().split("");
            String str = strArr[0]+getNumber()+strArr[1]+strArr[2]+getRegion();
            return str;
        }
        @Override
        public String toString() {
            return "Номер: " +  showNomer() + " Владелец: " + getFio();
        }
    }

