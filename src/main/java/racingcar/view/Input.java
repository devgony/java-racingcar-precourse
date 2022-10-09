package racingcar.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Input {

    public static String scan() {
        Output.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return readLine();
    }

    public static String[] parseNames(String scanned) {
        return scanned.split("\\s*,\\s*");
    }
}
