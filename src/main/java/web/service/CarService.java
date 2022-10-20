package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {
    private List<Car> car;

    {
        car = new ArrayList<>();

        car.add(new Car(1, "bmw","green"));
        car.add(new Car(2, "faw","red"));
        car.add(new Car(3, "oka","white"));
        car.add(new Car(4, "lada","black"));
        car.add(new Car(5, "ford","blue"));

    }
    public List<Car> index(int count) {
        return car.subList(0, count);
    }

}
