package lesson7.nested_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoInner {
    private int k;

    public DemoInner(int k) {
        this.k = k;
    }



    void cikl(){

        class Inner{
            private int v1,v2;

            public Inner(int v1, int v2) {
                this.v1 = v1;
                this.v2 = v2;
            }


            void printValue(){
                System.out.printf("%d * %d = %d\n",v1,v2,v1 * v2);
            }
        }


        for (int i = 1; i <= 10; i++) {
//            new Inner(i,k).printValue();
            Inner inner = new Inner(i,k);
            inner.printValue();
        }
    }

    public static void main(String[] args) {
        new DemoInner(new Scanner(System.in).nextInt()).cikl();
    }
}
