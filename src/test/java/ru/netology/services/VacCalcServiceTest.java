package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class VacCalcServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/examples.csv")
    /*

    @CsvSource({
            "3, 10000, 3000, 20000",
            "2, 100000, 60000, 150000"
    })

     */
    public void examples(int expected, int income, int expenses, int threshold) {
        VacCalcService service = new VacCalcService();

        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);

    }

    /*

    @Test
    public void example1(){
        VacCalcService service = new VacCalcService();

        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        VacCalcService service = new VacCalcService();

        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);
        Assertions.assertEquals(expected, actual);
    }

     */

}