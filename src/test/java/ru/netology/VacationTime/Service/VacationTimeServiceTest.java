package ru.netology.VacationTime.Service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class VacationTimeServiceTest {
    @ParameterizedTest
    @CsvSource({
            "10000, 3000, 20000, 6",
            "100000, 60000, 150000, 5"
    })
    public void VacationTimeService(int income, int expenses, int threshold, int expected) {
        VacationTimeService service = new VacationTimeService();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}

