package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.CarLineup;

import java.util.List;

public class OutputView {

    public static void printRoundResult(CarLineup carLineup){
        List<String> results = carLineup.getCarInfo();

        for(String result: results) {
            System.out.println(result);
        }
        System.out.println();
    }

    public static void printWinner(List<Car> cars){

        String result = "최종 우승자 : ";

        for (Car car : cars) {
            result += car.getName();
            result += ", ";
        }

        System.out.println(result.substring(0, result.length()-2));
    }

}
