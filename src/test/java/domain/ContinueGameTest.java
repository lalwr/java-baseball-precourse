package domain;

import nextstep.test.NSTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ui.Input;

import static org.junit.jupiter.api.Assertions.*;

class ContinueGameTest extends NSTest {

    ContinueGame continueGame;
    String CONTINUE = String.valueOf(ContinueGame.CONTINUE);
    String EXIT = String.valueOf(ContinueGame.EXIT);

    @BeforeEach
    void beforeEach() {
        super.setUp();
        this.continueGame = new ContinueGame();
    }

    @Test
    @DisplayName("게임계속_이상한숫자")
    void 게임계속_이상한숫자() {
        run("3", CONTINUE);
        verify(Input.ERROR_INPUT_CONTINUE_MESSAGE);
    }

    @Test
    @DisplayName("게임계속")
    void 게임계속() {
        command(CONTINUE);
        assertTrue(continueGame.isContinue());
    }

    @Test
    @DisplayName("게임종료")
    void 게임종료() {
        command(EXIT);
        assertFalse(continueGame.isContinue());
    }

    @AfterEach
    void tearDown() {
        outputStandard();
    }


    @Override
    public void runMain() {
        continueGame.isContinue();
    }
}