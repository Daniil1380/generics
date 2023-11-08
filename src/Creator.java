import java.util.List;

public class Creator <T> {

    public void createAll(List<? extends T> list) { //producers - переменные, которые мы используем для
        //получения данных
        T value = list.get(0);
        System.out.println("Успешно создано");
    }

    public void fillList(List<? super T> list) {
        //list.add(); //плохо удается посмотреть объекты, но можно положить объекты
    }
}
