package racingcar;

import racingcar.model.Cars;
import racingcar.model.GameResult;
import racingcar.model.Race;
import racingcar.model.RandomStrategy;
import racingcar.view.Input;
import racingcar.view.Output;

public class Application {
    public static void main(String[] args) {
        Cars cars = Input.scanCars();
        int tryNumber = Input.scanTryNumber();
        Race race = new Race(new RandomStrategy(), cars);
        Output.println("\n실행 결과");
        for (int i = 0; i < tryNumber; i++) {
            race.rolls();
            Output.printCars(race.cars());
        }
        GameResult gameResult = race.yieldFinalResult();
        Output.printWinners(gameResult);
    }
}
