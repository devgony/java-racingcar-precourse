package racingcar.view;

import racingcar.model.Car;
import racingcar.model.Cars;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Input {

    public static String scan() {
        Output.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return readLine();
    }

    public static Cars parseCars(String scanned) {
        String[] names = scanned.split("\\s*,\\s*");
        Cars cars = new Cars();
        for (String name : names) {
            cars.add(new Car(name));

        }
        return cars;
    }
}
