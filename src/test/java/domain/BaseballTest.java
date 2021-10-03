package domain;

import nextstep.test.NSTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ui.Input;

class BaseballTest extends NSTest {

    @BeforeEach
    void beforeEach() {
        super.setUp();
    }

    @ParameterizedTest
    @ValueSource(strings = {"1", "99", "1000", "0"})
    @DisplayName("숫자_범위_아님")
    void 숫자_범위_아님(String number) {
        run(number, "123");
        verify(Input.ERROR_INPUT_RANGE_MESSAGE);
    }

    @AfterEach
    void tearDown() {
        outputStandard();
    }


    @Override
    public void runMain() {
        Baseball baseball = new Baseball();
        baseball.start();
    }
}