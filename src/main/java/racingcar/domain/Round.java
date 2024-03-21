package racingcar.domain;

import racingcar.view.OutputView;

public class Round {

    private final int round;

    public Round(String input) {
        this.round = Integer.parseInt(input);
    }

    public void gameStart(CarLineup carLineup){
        System.out.println("실행 결과");
        for (int i = 0; i < round; i++) {
            carLineup.moveCar();
            OutputView.printRoundResult(carLineup);
        }
    }




}
