package domain;

import nextstep.utils.Console;
import ui.Input;

public class ContinueGame {
    private static final int CONTINUE = 1;
    private static final int EXIT = 2;

    private int continueGame;

    public ContinueGame() {
    }

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
