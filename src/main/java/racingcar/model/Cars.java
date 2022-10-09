package racingcar.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cars {
    private List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public Cars() {
        this.cars = new ArrayList<>();
    }

    public void add(Car car) {
        this.cars.add(car);
    }

    public Cars yieldWinner() {
        Spot maxSpot = new Spot();
        Cars winners = new Cars();
        for (Car car : cars
        ) {
            // Todo: car.isEqual()
            if (car.isAtIdenticalSpot(maxSpot)) {
                winners.add(car);
                continue;
            }
            if (car.isFasterThan(maxSpot)) {
                Cars cars = new Cars();
                cars.add(car);
                winners = cars;
                // Todo: getter vs mutate outer context
                maxSpot = car.spot();
            }
        }
        return winners;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars1 = (Cars) o;
        return Objects.equals(cars, cars1.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cars);
    }

    @Override
    public String toString() {
        return "Cars{" +
                "cars=" + cars +
                '}';
    }
}
