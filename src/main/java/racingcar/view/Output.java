package racingcar.view;

import racingcar.model.Car;
import racingcar.model.Cars;

public class Output {

    public static void println(String payload) {
        System.out.println(payload);
    }

    public static void printWinners(Cars winners) {
        String names = winners.names();
        println("최종 우승자: " + names);
    }

    public static void printCars(Cars cars) {
        for (Car car : cars) {
            println(car.name() + ": " + car.spot().at());
        }
        println("");
    }
}
