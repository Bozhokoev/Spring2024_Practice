package codingbat_tests.jyldyzbek_tests.warmup1_tests;

import codingbat.jyldyzbek.warmup1.Or35;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Or35Test {

    @DataProvider(name = "or35Data")
    public Object[][] or35Data() {
        return new Object[][]{
                {3, true},
                {10, true},
                {8, false},
                {15, true},
                {5, true},
                {9, true},
                {4, false},
                {7, false},
                {6, true},
                {17, false},
                {18, true},
                {29, false},
                {20, true},
                {21, true},
                {22, false},
                {45, true},
                {99, true},
                {100, true},
                {101, false},
                {121, false},
                {122, false},
                {123, true}
        };
    }

    @Test(dataProvider = "or35Data")
    public void testOr35(int input, boolean expected) {
        Or35 or35 = new Or35();
        boolean result = or35.or35(input);
        System.out.println("Тест с вводом: " + input + " -> Ожидается: " + expected + ", Результат: " + result);
        Assert.assertEquals(result, expected);
    }
}
