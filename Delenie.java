public class Delenie {
    public static void main(String[] args) {
        int len = 5;
        int mas1[] = new int[len];
        int mas2[] = new int [len];
        int mas3[] = new int [len];

        for (int i = 0; i<len; i++) {
            mas1[i] = (int) (Math.random() * 100);
            mas2[i] = (int) (Math.random() * 5);
            System.out.printf(mas1[i] + " разделим на " + mas2[i]);

            try { mas3[i] = mas1[i] / mas2[i];
                System.out.println(" Получим " + mas3[i]);
            } catch (ArithmeticException e) {
                System.out.println(" Делить на ноль нельзя!");
            }
        }

    }
}