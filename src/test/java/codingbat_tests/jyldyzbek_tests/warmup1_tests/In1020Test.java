package codingbat_tests.jyldyzbek_tests.warmup1_tests;

import codingbat.jyldyzbek.warmup1.In1020;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class In1020Test {

    @DataProvider(name = "in1020Data")
    public Object[][] in1020Data() {
        return new Object[][]{
                {12, 99, true},
                {21, 12, true},
                {8, 99, false},
                {99, 10, true},
                {20, 20, true},
                {21, 21, false},
                {9, 9, false}
        };
    }

    @Test(dataProvider = "in1020Data")
    public void testIn1020(int a, int b, boolean expected) {
        In1020 in1020 = new In1020();
        boolean result = in1020.in1020(a, b);
        System.out.println("Тест с числами: a = " + a + ", b = " + b + " -> Ожидается: " + expected + ", Результат: " + result);
        Assert.assertEquals(result, expected);
    }
}
