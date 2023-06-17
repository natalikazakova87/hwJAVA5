package ru.netology.VacationTime.Service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationTimeServiceTest {
    @Test
    public void VacationTimeService() {
        VacationTimeService service = new VacationTimeService();

        int count = 0;
        int money = 0;
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 6;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}

