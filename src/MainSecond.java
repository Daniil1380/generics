public class MainSecond {

    public static void main(String[] args) {
        Car car = new Jeep(); //не явное приведение
        Jeep jeep = (Jeep) car; //явное приведение типов

        System.out.println(jeep);
    }
}
