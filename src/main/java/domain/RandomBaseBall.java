package domain;

import nextstep.utils.Randoms;
import ui.Input;
import ui.Output;

public class RandomBaseBall {
    private static final int RANGE_MIN_NUMBER = 100;
    private static final int RANGE_MAX_NUMBER = 999;
    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 9;
    private static final int LENGTH = 3;

    private int randomBaseBallNumber;

    public int getNumber() {
        do {
            settingRandomNumber();
        }while (valid());

        return randomBaseBallNumber;
    }

    private boolean valid() {
        if(maxLength() || rangeNumber()){
            Output.noStrikeNoBall();
            return true;
        }
        return false;
    }

    private boolean rangeNumber() {
        int number = randomBaseBallNumber;
        if(!((RANGE_MIN_NUMBER <= number) && (number <= RANGE_MAX_NUMBER))) {
            Input.errorInputRangeMessageMessage();
            return true;
        }
        return false;
    }

    private boolean maxLength() {
        if(String.valueOf(randomBaseBallNumber).length() != LENGTH) {
            Input.errorInputMessage();
            return true;
        }
        return false;
    }

    private void settingRandomNumber() {
        String randomNumber = "";
        for (int i = 0; i < 3; i++) {
            randomNumber += Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
        }
        this.randomBaseBallNumber = Integer.parseInt(randomNumber);
    }
}
