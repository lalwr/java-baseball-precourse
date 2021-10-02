package ui;

public class Input {

    private static final String INPUT_RETRY_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    private static final String INPUT_NUMBER_MESSAGE = "숫자를 입력해주세요 :";
    private static final String ERROR_INPUT_MESSAGE = "[ERROR] 숫자를 잘못입력하였습니다.";
    private static final String ERROR_INPUT_RANGE_MESSAGE = "[ERROR] 숫자는 100부터 999까지만 입력 가능합니다.";
    private static final String ERROR_INPUT_CONTINUE_MESSAGE = "[ERROR] 숫자는 1 또는 2만 입력 가능합니다.";

    public static void errorInputMessage(){
        System.out.println(ERROR_INPUT_MESSAGE);
    }

    public static void errorInputRangeMessageMessage(){
        System.out.println(ERROR_INPUT_RANGE_MESSAGE);
    }

    public static void baseballNumber(){
        System.out.println(INPUT_NUMBER_MESSAGE);
    }

    public static void retryMessage(){
        System.out.println(INPUT_RETRY_MESSAGE);
    }

    public static void errorInputContinueMessage(){
        System.out.println(ERROR_INPUT_CONTINUE_MESSAGE);
    }
}
