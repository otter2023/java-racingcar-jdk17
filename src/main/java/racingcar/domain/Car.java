package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public String getName() {
        return this.name;
    }

    public void isMove(int random) {
        if (random >= 4) {
            this.position++;
        }
    }

    public String getCarPosition() {
        StringBuilder result = new StringBuilder(name);
        result.append(" : ");

        for (int i = 0; i < position; i++) {
            result.append('-');
        }

        return result.toString();
    }

    public int getPosition() {
        return this.position;
    }
}
