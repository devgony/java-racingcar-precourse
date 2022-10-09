package racingcar.view;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class InputTest {
    @Test
    void parseNames() {
        String[] actual = Input.parseNames("a,b,c");
        String[] expected = {"a", "b", "c"};
        assertThat(actual).isEqualTo(expected);
    }

//    @Test
//    void IllegalArgumentInputThrowException() {
//        assertThatThrownBy(() -> Input.parseNames("123, 123456")).isInstanceOf(IllegalArgumentException.class);
//    }
}
