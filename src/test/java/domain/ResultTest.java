package domain;

import nextstep.test.NSTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ResultTest extends NSTest {

    Result result;

    @BeforeEach
    void beforeEach() {
        super.setUp();
        this.result = new Result();
    }

    @DisplayName("스트라이크")
    @ParameterizedTest
    @CsvSource(value = {"999:999", "293:293", "123:123"}, delimiter = ':')
    void 스트라이크(String userBaseNumber, String randomBaseNumber) {
        result.checkCount(Integer.parseInt(userBaseNumber), Integer.parseInt(randomBaseNumber));
        result.printResult();
        verify("3스트라이크");
    }

    @DisplayName("볼")
    @ParameterizedTest
    @CsvSource(value = {"123:312", "843:384"}, delimiter = ':')
    void 볼(String userBaseNumber, String randomBaseNumber) {
        result.checkCount(Integer.parseInt(userBaseNumber), Integer.parseInt(randomBaseNumber));
        result.printResult();
        verify("3볼");
    }

    @DisplayName("스트라이크1볼2")
    @ParameterizedTest
    @CsvSource(value = {"384:348", "974:794"}, delimiter = ':')
    void 스트라이크1볼2(String userBaseNumber, String randomBaseNumber) {
        result.checkCount(Integer.parseInt(userBaseNumber), Integer.parseInt(randomBaseNumber));
        result.printResult();
        verify("1스트라이크 2볼");
    }

    @AfterEach
    void tearDown() {
        outputStandard();
    }


    @Override
    public void runMain() {
        result.printResult();
    }
}