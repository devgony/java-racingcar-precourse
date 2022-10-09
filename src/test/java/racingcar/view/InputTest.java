package racingcar.view;

import org.junit.jupiter.api.Test;
import racingcar.model.Car;
import racingcar.model.Cars;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;


public class InputTest {
    @Test
    void parseCars() {
        Cars actual = Input.parseCars("a,b,c");
        Cars expected = new Cars(Arrays.asList(new Car("a"), new Car("b"), new Car("c")));
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void IllegalArgumentInputThrowException() {
        assertThatThrownBy(() -> Input.parseCars("123, 123456")).isInstanceOf(IllegalArgumentException.class);
    }
}
