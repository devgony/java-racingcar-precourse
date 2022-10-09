package racingcar.model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class RaceTest {
    @Test
    void createThreeCars() {
        Race race = new Race(new RandomStrategy());
        String[] names = {"a", "b", "c"};
        Cars actual = race.enrollCars(names);
        Cars expected = new Cars(Arrays.asList(new Car("a"), new Car("b"), new Car("c")));
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void RollShouldMoveOrStay() {
        Race race = new Race(new RandomStrategy());
        Car car = new Car("a");
        RollResult rollResult = race.roll(car);
        if (rollResult.isMoved) {
            assertThat(rollResult.car).isEqualTo(new Car("a", new Spot(2)));
        } else {
            assertThat(rollResult.car).isEqualTo(new Car("a", new Spot(1)));
        }
    }
}
