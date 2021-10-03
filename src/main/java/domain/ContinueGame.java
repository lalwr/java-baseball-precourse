package domain;

import nextstep.utils.Console;
import ui.Input;

public class ContinueGame {
    public static final int CONTINUE = 1;
    public static final int EXIT = 2;

    private int continueGame;

    private boolean valid() {
        if(!(continueGame == CONTINUE || continueGame == EXIT)){
            Input.errorInputContinueMessage();
            return true;
        }
        return false;
    }

    public boolean isContinue() {
        do {
            inputContinueGame();
        }while (valid());

        if (continueGame == CONTINUE) {
            return true;
        }
        return false;
    }

    public void inputContinueGame() {
        continueGame = Integer.parseInt(Console.readLine());
    }
}
