package racingcar.model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class RaceTest {
    @Test
    void RollShouldMoveOrStay() {
        Car car = new Car("a");
        Cars cars = new Cars(Arrays.asList(car));
        Race race = new Race(new RandomStrategy(), cars);
        RollResult rollResult = race.roll(car);
        if (rollResult.isMoved) {
            assertThat(rollResult.car).isEqualTo(new Car("a", new Spot(1)));
        } else {
            assertThat(rollResult.car).isEqualTo(new Car("a", new Spot(0)));
        }
    }
}
