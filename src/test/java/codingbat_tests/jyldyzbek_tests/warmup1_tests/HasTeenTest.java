package codingbat_tests.jyldyzbek_tests.warmup1_tests;

import codingbat.jyldyzbek.warmup1.HasTeen;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HasTeenTest {

    @DataProvider(name = "hasTeenData")
    public Object[][] hasTeenData() {
        return new Object[][]{
                {13, 20, 10, true},
                {20, 19, 10, true},
                {20, 10, 13, true},
                {1, 20, 12, false},
                {19, 20, 12, true},
                {12, 20, 19, true},
                {12, 9, 20, false},
                {12, 18, 20, true},
                {14, 2, 20, true},
                {4, 2, 20, false},
                {11, 22, 22, false}
        };
    }

    @Test(dataProvider = "hasTeenData")
    public void testHasTeen(int a, int b, int c, boolean expected) {
        HasTeen instance = new HasTeen();
        boolean result = instance.hasTeen(a, b, c);
        System.out.println("Тест с числами: a = " + a + ", b = " + b + ", c = " + c + " -> Ожидается: " + expected + ", Результат: " + result);
        Assert.assertEquals(result, expected);
    }
}
