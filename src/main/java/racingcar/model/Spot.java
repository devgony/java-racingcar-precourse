package racingcar.model;

import java.util.Objects;

public class Spot {
    int at;

    public Spot(int at) {
        this.at = at;
    }

    public Spot() {
        this(0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spot spot = (Spot) o;
        return at == spot.at;
    }

    @Override
    public int hashCode() {
        return Objects.hash(at);
    }

    public Spot move() {
        return new Spot(this.at + 1);
    }
}
