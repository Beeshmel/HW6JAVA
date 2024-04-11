package lesson7.nested_classes;

//Вложенные классы могут вызывать поля и методы внешнего класса напрямую, то есть без объекта.
//Внешний класс может обращаться к свойствам и методам вложенного класса только через объект
//вложенного класса.

public class PC {
    private String titlePC;
    private RAM ram;
    private Processor proc;

    public PC(String titlePC,String ram,String proc,int sizeRam,int sizeProc) {
        this.titlePC = titlePC;
        this.ram = new RAM(ram,sizeRam);//описываем объект RAM
        this.proc = new Processor(proc,sizeProc);//описываем объект RAM
    }

    public PC() {

    }

    public String getTitlePC() {
        return titlePC;
    }

    public RAM getRam() {
        return ram;
    }

    public Processor getProcessor() {
        return proc;
    }

    /**
     * Включение ПК
     */
    void on(){
        ram.on(true);
        proc.on();
    }

    void off(){
        ram.off();
        proc.off();
    }

    class RAM{
        private String titleRam;
        private int size;

        public RAM(String titleRam, int size) {
            this.titleRam = titleRam;
            this.size = size;
        }

        void on(boolean isPc){
            System.out.println(isPc ? "Модуль RAM запущен для ПК " + titlePC :
                    "Модуль RAM запущен в тестовом режиме");



//            if(isService)
//                System.out.printf("Модуль RAM %s запущен для ПК %s\n",titleRam,titlePC);
//            else
//                System.out.printf("Модуль RAM %s запущен в тестовом режиме %s\n",titleRam);
        }


        void off(){
            System.out.printf("Модуль RAM %s выключен для ПК %s\n",titleRam,titlePC);
        }
    }
    class Processor{
        private String titleProc;
        private int size;

        public Processor(String titleProc, int size) {
            this.titleProc = titleProc;
            this.size = size;
        }

        void on(){
            System.out.printf("Модуль Proc %s запущен для ПК %s\n",titleProc,titlePC);
        }
        void off(){
            System.out.printf("Модуль Proc %s выключен для ПК %s\n",titleProc,titlePC);
        }
    }
}
