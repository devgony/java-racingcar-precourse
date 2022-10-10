package racingcar.view;

import racingcar.model.Car;
import racingcar.model.Cars;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static java.lang.Integer.parseInt;

public class Input {

    public static String scan() {
        return readLine();
    }

    public static String[] parseNames(String scanned) {
        return scanned.split("\\s*,\\s*");
    }

    public static Cars scanCars() {
        try {
            Output.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
            String scanned = scan();
            return parseCars(scanned);
        } catch (IllegalArgumentException e) {
            Output.println(e.getMessage());
            return scanCars();
        }
    }

    public static Cars parseCars(String scanned) {
        String[] names = parseNames(scanned);
        Cars cars = new Cars();
        for (String name : names) {
            cars.add(new Car(name));
        }
        return cars;
    }

    public static int scanTryNumber() {
        try {
            Output.println("시도할 회수");
            return parseTryNumber(scan());
        } catch (IllegalArgumentException e) {
            Output.println(e.getMessage());
            return scanTryNumber();
        }
    }

    public static int parseTryNumber(String scanned) {
        try {
            return parseInt(scanned);
        } catch (Exception e) {
            throw new IllegalArgumentException("[ERROR] 시도 횟수는 숫자여야 한다.");
        }
    }
}
