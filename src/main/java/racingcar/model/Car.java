package racingcar.model;

import java.util.Objects;

public class Car {
    private String name;
    private Spot spot;

    public Car(String name, Spot spot) {
        validate(name);
        this.name = name;
        this.spot = spot;
    }

    public Car(String name) {
        this(name, new Spot());
    }

    private void validate(String name) {
        int length = name.length();
        if (length > 5) {
            throw new IllegalArgumentException("name should be less than 5 but: " + length);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(spot, car.spot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, spot);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", spot=" + spot +
                '}';
    }

    public Spot spot() {
        return this.spot;
    }

    public boolean isFasterThan(Spot maxSpot) {
        return this.spot.isFartherThan(maxSpot);
    }

    public boolean isAtIdenticalSpot(Spot maxSpot) {
        return this.spot.isAtIdenticalSpot(maxSpot);
    }

    public void move() {
        this.spot = this.spot.move();
    }

    public String name() {
        return this.name;
    }
}
