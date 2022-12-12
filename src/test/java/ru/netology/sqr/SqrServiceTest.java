package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SqrServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/square.csv")
    public void testCalcSqrtThreeSqr(int expected, int minLimit, int maxLimit) {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(minLimit, maxLimit);

        Assertions.assertEquals(expected, actual);
    }
}
