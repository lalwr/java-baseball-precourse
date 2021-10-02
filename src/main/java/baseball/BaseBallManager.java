package baseball;

import domain.Baseball;
import domain.ContinueGame;
import domain.RandomBaseBall;
import domain.Result;
import ui.Input;

public class BaseBallManager {

    private int userBaseBall;
    private int randomBaseBall;

    private void randomNumberSetting() {
        RandomBaseBall randomBase = new RandomBaseBall();
        randomBaseBall = randomBase.getNumber();
    }

    public void play() {
        randomNumberSetting();
        Result result = new Result();
        do{
            Baseball baseball = new Baseball();
            this.userBaseBall = baseball.start();
            result.checkCount(userBaseBall, randomBaseBall);
            result.printResult();
        }while (result.stop());
        retry();
    }

    public void retry() {
        Input.retryMessage();
        ContinueGame continueGame = new ContinueGame();
        if(continueGame.isContinue()){
            play();
        }
    }
}
