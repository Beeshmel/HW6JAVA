package lesson7.nested_classes;

public class Main {
    public static void main(String[] args) {
//       var pc = new PC("ACER","DDR-3","CORE I7",8,3);
//       pc.on();//запускаем ПК
//       pc.off();

//        new PC().new RAM("DDR-4",8).on(false);
        PC pc = new PC();
        PC.RAM ram = pc.new RAM("DDR-4",8);
        ram.on(false);
    }

}
