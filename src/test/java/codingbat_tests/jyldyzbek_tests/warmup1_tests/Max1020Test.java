package codingbat_tests.jyldyzbek_tests.warmup1_tests;

import codingbat.jyldyzbek.warmup1.Max1020;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Max1020Test {

    @DataProvider(name = "max1020DataProvider")
    public Object[][] max1020DataProvider() {
        return new Object[][]{
                {11, 19, 19},
                {19, 11, 19},
                {11, 9, 11},
                {9, 21, 0},
                {10, 21, 10},
                {21, 10, 10},
                {9, 11, 11},
                {23, 10, 10},
                {20, 10, 20},
                {7, 20, 20},
                {17, 16, 17}
        };
    }

    @Test(dataProvider = "max1020DataProvider")
    public void testMax1020(int a, int b, int expected) {
        Max1020 max1020 = new Max1020();
        int result = max1020.max1020(a, b);
        System.out.println("Тестирование max1020 с входными данными: a = " + a + ", b = " + b + " | Ожидаемый результат: " + expected + " | Фактический результат: " + result);
        Assert.assertEquals(result, expected, "Тест не пройден для входных данных: (" + a + ", " + b + "). Ожидалось: " + expected + ", но получено: " + result);
    }
}
