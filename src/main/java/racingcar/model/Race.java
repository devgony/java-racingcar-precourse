package racingcar.model;

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
}
