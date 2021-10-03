package domain;

import nextstep.utils.Console;
import ui.Input;

public class Baseball {
    private static final int LENGTH = 3;
    private static final int MIN_NUMBER = 100;
    private static final int MAX_NUMBER = 999;

    private String baseballNumber;

    public int start(){
        inputBaseBall();
        while (valid()){
            inputBaseBall();
        }
        int number = getNumber();
        return number;
    }

    private int getNumber() {
        return Integer.parseInt(baseballNumber);
    }

    private boolean valid() {
        if(rangeNumber()){
            return true;
        }
        return false;
    }

    private boolean rangeNumber() {
        int number = getNumber();
        if(!((MIN_NUMBER <= number) && (number <= MAX_NUMBER))) {
            Input.errorInputRangeMessageMessage();
            return true;
        }
        return false;
    }

    private void inputBaseBall(){
        Input.baseballNumber();
        this.baseballNumber = Console.readLine();
    }
}
