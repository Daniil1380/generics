public class MainBox {

    public static void main(String[] args) {
        Box<Integer, String> box = new Box<>();

        System.out.println(box.value);
        System.out.println(box.secondValue);
    }

}
