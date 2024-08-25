package codingbat_tests.jyldyzbek_tests.warmup1_tests;

import codingbat.jyldyzbek.warmup1.LastDigit;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LastDigitTest {

    @DataProvider(name = "lastDigitDataProvider")
    public Object[][] lastDigitDataProvider() {
        return new Object[][] {
                {7, 17, true},
                {6, 17, false},
                {3, 113, true},
                {114, 113, false},
                {114, 4, true},
                {10, 0, true},
                {11, 0, false}
        };
    }

    @Test(dataProvider = "lastDigitDataProvider")
    public void testLastDigit(int a, int b, boolean expected) {
        LastDigit lastDigit = new LastDigit();
        boolean result = lastDigit.lastDigit(a, b);
        System.out.println("Тестирование lastDigit с входными данными: a = " + a + ", b = " + b + " | Ожидаемый результат: " + expected + " | Фактический результат: " + result);
        Assert.assertEquals(result, expected, "Тест не пройден для входных данных: a = " + a + ", b = " + b + ". Ожидалось: " + expected + ", но получено: " + result);
    }
}
