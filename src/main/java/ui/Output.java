package ui;

public class Output {
    private static final String STRIKE_MESSAGE = "스트라이크";
    private static final String BALL_MESSAGE = "볼";
    private static final String END_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 끝";
    private static final String NO_STRIKE_NO_BALL_MESSAGE = "낫싱";

    public static void strikeMessage(int strikeCount){
        System.out.print(strikeCount + STRIKE_MESSAGE);
    }

    public static void ballMessage(int ballCount){
        System.out.print(ballCount + BALL_MESSAGE);
    }

    public static void endMessage(){
        System.out.print(END_MESSAGE);
    }

    public static void noStrikeNoBall() {
        System.out.println(NO_STRIKE_NO_BALL_MESSAGE);

    }
}
