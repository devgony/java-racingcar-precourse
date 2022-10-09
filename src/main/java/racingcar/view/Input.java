package racingcar.view;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static java.lang.Integer.parseInt;

public class Input {

    public static String scan() {
        return readLine();
    }

    public static String[] parseNames(String scanned) {
        return scanned.split("\\s*,\\s*");
    }

    public static String[] scanNames() {
        Output.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return parseNames(scan());
    }

    public static int scanTryNumber() {
        Output.println("시도할 회수");
        return parseInt(scan());
    }
}
