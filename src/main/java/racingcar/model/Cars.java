package racingcar.model;

import java.util.*;

public class Cars implements Iterable<Car> {
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

    public GameResult yieldFinalResult() {
        Spot maxSpot = new Spot();
        Cars winners = new Cars();
        GameResult winnerResult = new GameResult(maxSpot, winners);
        for (Car car : cars) {
            winnerResult = yieldRoundResult(car, winnerResult);
        }
        return winnerResult;
    }

    private GameResult yieldRoundResult(Car car, GameResult winnerResult) {
        if (car.isFasterThan(winnerResult.maxSpot())) {
            Cars cars = new Cars();
            cars.add(car);
            return new GameResult(car.spot(), cars);
        }
        if (car.isAtIdenticalSpot(winnerResult.maxSpot())) {
            winnerResult.addWinner(car);
        }
        return winnerResult;
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

    public String names() {
        String result = "";
        ListIterator<Car> it = this.cars.listIterator();
        while (it.hasNext()) {
            result += it.next().name();
            result += separator(it);
        }
        return result;
    }

    private String separator(ListIterator<Car> it) {
        if (it.hasNext()) {
            return ",";
        }
        return "";
    }

    @Override
    public Iterator<Car> iterator() {
        return this.cars.iterator();
    }
}
