package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private final Cars cars;
    private final RollStrategy rollStrategy;

    public Race(RandomStrategy randomStrategy) {
        this.rollStrategy = randomStrategy;
        this.cars = new Cars();
    }

    public Cars enrollCars(String[] names) {
        for (String name : names) {
            this.cars.add(new Car(name));
        }
        return this.cars;
    }

    public RollResult roll(Car car) {
        return this.rollStrategy.roll(car);
    }

    public Cars yieldWinner() {
        return this.cars.yieldWinner();
    }

    public void rolls() {
        for (Car car : this.cars) {
            roll(car);
        }
    }

    public Cars cars() {
        return this.cars;
    }
}