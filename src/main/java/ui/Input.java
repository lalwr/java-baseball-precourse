package ui;

public class Input {

    private static final String INPUT_MESSAGE = "숫자를 입력해주세요 :";
    private static final String ERROR_INPUT_MESSAGE = "[ERROR] 숫자를 잘못입력하였습니다.";
    private static final String ERROR_INPUT_RANGE_MESSAGE = "[ERROR] 숫자는 100부터 999까지만 입력 가능합니다.";

    public static void errorInputMessage(){
        System.out.println(ERROR_INPUT_MESSAGE);
    }

    public static void errorInputRangeMessageMessage(){
        System.out.println(ERROR_INPUT_RANGE_MESSAGE);
    }

    public static void baseballNumber(){
        System.out.println(INPUT_MESSAGE);
    }
}
