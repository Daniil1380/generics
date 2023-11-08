import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<String> stringList = new ArrayList<>();
        stringList.add("123");
        stringList.add("4566");
        stringList.add("6778");

        //Car car = new Jeep();

        //Object object = "123";
        Object object1 = 1;
        Object obj = new Scanner(System.in);
        Object obj1 = new ArrayList<>();


        Object[] objects = new Object[10];
        objects[0] = 1;
        objects[1] = "12334";
        objects[2] = new Scanner(System.in);
        objects[3] = objects;
        objects[4] = obj;

        List tutTolkoStroki = new ArrayList(); //кладите пожалуйста в этот лист только строки

        tutTolkoStroki.add("12");
        tutTolkoStroki.add("qwert");
        tutTolkoStroki.add("asddf");
        tutTolkoStroki.add(1);



        test(tutTolkoStroki);

        for (int i = 0; i < tutTolkoStroki.size(); i++) {
            String str = (String) tutTolkoStroki.get(i); //явное приведение типов
        }

        //list.add(12);
        //list.add(new ArrayList<>());
        //list.add(new Object());
        //list.add('a');
        //list.add(true);
        //list.add(2.4);


        //list.add("12");
        //list.add("5667");
        //list.add("345565");
        //list.add(1);
        //list.add(23);
        //list.add(123);
        //

        //list.add(new Scanner(System.in));
    }


    public static void test(List tutTolkoChisla) {
        tutTolkoChisla.add(1);
    }
}