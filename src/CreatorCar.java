import java.util.ArrayList;
import java.util.List;

public class CreatorCar {

    public void createAll(List<? extends Car> list) { //producer - ИЗ него берем данные, добавлять в него строго запрещено
        Car car = list.get(0); //нормально смотрим, положить не получится
    }

    public void fillList(List<? super Car> list) { //consumer - В него можно складывать, смотреть можно только на Object
        list.add(new Car()); //плохо удается посмотреть объекты, но можно положить объекты
    }
}


