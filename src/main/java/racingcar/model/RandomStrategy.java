package racingcar.model;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class RandomStrategy implements RollStrategy {
    public RollResult roll(Car car) {
        int number = pickNumberInRange(0, 9);
        if (number < 4) {
            return new RollResult(false, car);
        }
        car.move();
        return new RollResult(true, car);
    }
}
