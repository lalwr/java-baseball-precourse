package baseball;

import domain.Baseball;
import domain.Result;
import nextstep.utils.Randoms;

public class BaseBallManager {
    private static final int MIN_NUMBER = 100;
    private static final int MAX_NUMBER = 999;

    private int userBaseBall;
    private int randomBaseBall;

    public BaseBallManager() {
        this.randomBaseBall = Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
        System.out.println("random : " + randomBaseBall);
    }

    public void play() {
        Result result = new Result();
        do{
            Baseball baseball = new Baseball();
            this.userBaseBall = baseball.start();
            result.checkCount(userBaseBall, randomBaseBall);
            result.printResult();
        }while (result.stop());
    }

}
