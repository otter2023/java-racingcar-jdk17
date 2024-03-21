package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class CarLineup {

    private final List<Car> cars;

    public CarLineup(String input) {
        this.cars = createCars(input);
    }

    private List<Car> createCars(String input) {

        List<String> carNames = List.of(input.split(","));

        List<Car> car = new ArrayList<>();

        for (String name : carNames) {
            car.add(new Car(name));
        }

        return car;
    }

    public void moveCar() {

        for (Car car : cars) {
            int random = Randoms.pickNumberInRange(0, 9);
            car.isMove(random);
        }

    }

    public List<String> getCarInfo() {
        List<String> results = new ArrayList<>();
        for (Car car : cars) {
            results.add(car.getCarPosition());
        }

        return results;
    }

    public List<Car> getWinners() {

        List<Car> winners = new ArrayList<>();

        int winnerPosition = getWinnerPosition();

        for (Car car : cars) {
            if (winnerPosition == car.getPosition()) {
                winners.add(car);
            }
        }

        return winners;
    }

    private int getWinnerPosition() {
        int max = 0;
        for(Car car: cars) {
            if (car.getPosition() > max) {
                max = car.getPosition();
            }
        }

        return max;
    }
}
