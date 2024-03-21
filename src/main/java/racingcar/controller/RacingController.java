package racingcar.controller;

import racingcar.domain.CarLineup;
import racingcar.domain.Round;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingController {

    public void startRacing() {

        // 문제 출력하고 자동차 이름을 입력받는 함수
        CarLineup carLineup = InputView.inputCarName();

        // 문제 출력하고 시도회수를 입력받는 함수
        Round round = InputView.inputround();

        // 라운드가 실행 및 출력되는 함수
        round.gameStart(carLineup);

        // 우승자를 출력하는 함수
        OutputView.printWinner(carLineup.getWinners());

    }
}
