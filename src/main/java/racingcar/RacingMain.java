package racingcar;

import racingcar.controller.RacingController;

public class RacingMain {

    public static void main(String[] args) {
        // TODO: MVC 패턴을 기반으로 자동차 경주 미션 구현해보기
        RacingController racingController = new RacingController();
        racingController.startRacing();
    }
}
