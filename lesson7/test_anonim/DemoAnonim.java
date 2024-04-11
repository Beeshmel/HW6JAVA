package lesson7.test_anonim;

public class DemoAnonim {
    void g(){
//        Test test = new Test(){
//            @Override
//            void f() {
//                super.f();
//                System.out.println("Дополнительная информация");
//            }
//        };
//        test.f();

//        Анонимные классы позволяют изменить поведение методов других классов через объект
//        То есть часть методов нас устраивает в классе, который используем, а часть не устраивает и
//                та часть, которая нас не устраивает, мы ее меняем, то есть переопределяем.
        Test obj1 = new Test(){//есть возможность изменять методы класса
            @Override
            void f() {
                super.f();
                System.out.println("Дополнительная информация\n\n");
            }
        };

        Test obj2 = new Test(){//есть возможность изменять методы класса
            @Override
            void f() {
                System.out.println("Дополнительная информация 2");
            }
        };
        obj1.f();
        obj2.f();
    }

    public static void main(String[] args) {
        new DemoAnonim().g();
    }
}
