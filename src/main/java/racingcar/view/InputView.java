package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.CarLineup;
import racingcar.domain.Round;

public class InputView {

    public static CarLineup inputCarName() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분");
        String input = Console.readLine();
        return new CarLineup(input);
    }

    public static Round inputround() {
        System.out.println("시도할 회수는 몇회인가요?");
        String input = Console.readLine();
        return new Round(input);
    }
}
