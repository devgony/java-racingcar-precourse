package racingcar;

import racingcar.model.Cars;
import racingcar.model.Race;
import racingcar.model.RandomStrategy;
import racingcar.view.Input;
import racingcar.view.Output;

public class Application {
    public static void main(String[] args) {
        String[] names = Input.scanNames();
        int tryNumber = Input.scanTryNumber();
        Race race = new Race(new RandomStrategy());
        race.enrollCars(names);
        for (int i = 0; i < tryNumber; i++) {
            race.rolls();
            Output.printCars(race.cars());
        }
        Cars winners = race.yieldWinner();
        Output.printWinners(winners);
    }
}
