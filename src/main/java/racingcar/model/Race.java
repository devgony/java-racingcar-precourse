package racingcar.model;

public class Race {
    private final Cars cars;
    private final RollStrategy rollStrategy;

    public Race(RandomStrategy randomStrategy, Cars cars) {
        this.rollStrategy = randomStrategy;
        this.cars = cars;
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