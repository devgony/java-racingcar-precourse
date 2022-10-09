package racingcar;

import racingcar.model.Cars;
import racingcar.model.Race;
import racingcar.model.RandomStrategy;
import racingcar.view.Input;
import racingcar.view.Output;

public class Application {
    public static void main(String[] args) {
        String scanned = Input.scan();
        String[] names = Input.parseNames(scanned);
        Race race = new Race(new RandomStrategy());
        race.enrollCars(names);
        Cars winners = race.yieldWinner();
        Output.printWinners(winners);
    }
}
