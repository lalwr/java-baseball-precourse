package domain;

import ui.Output;

public class Result {
    private static final int STOP_STRIKE_COUNT = 3;

    private String userBaseNumber;
    private String randomBaseNumber;
    private int strike;
    private int ball;

    public void checkCount(int userBaseNumber, int randomBaseNumber) {
        this.userBaseNumber = String.valueOf(userBaseNumber);
        this.randomBaseNumber = String.valueOf(randomBaseNumber);
        strike();
        ball();
    }

    public void strike() {
        strike = 0;
        for (int i = 0; i < 3; i++) {
            strikeCount(userBaseNumber.charAt(i), randomBaseNumber.charAt(i));
        }
    }

    private void strikeCount(char userNumber, char randomNumber) {
        if(userNumber == randomNumber) {
            strike++;
        }
    }

    public void ball() {
        ball = 0;
        String[] splitUserNumber = userBaseNumber.split("");
        for (int i = 1; i <= 3; i++) {
            ballCount(splitUserNumber[i-1], i);
        }
    }

    private void ballCount(String splitUserNumber, int deleteLocation) {
        StringBuffer randomBaseNumberBuffer = new StringBuffer(randomBaseNumber);
        String deleteLocationRandomNumber = randomBaseNumberBuffer.delete(deleteLocation - 1, deleteLocation).toString();
        if(deleteLocationRandomNumber.contains(splitUserNumber)){
            ball++;
        }
    }

    public void printResult(){
        if(strike > 0) {
            Output.strikeMessage(strike);
            System.out.print(" ");
        }
        Output.ballMessage(ball);
        System.out.println();
    }

    public boolean stop() {
        if(strike == STOP_STRIKE_COUNT){
            Output.endMessage();
            return false;
        }
        return true;
    }
}
