package codingbat_tests.jyldyzbek_tests.warmup1_tests;

import codingbat.jyldyzbek.warmup1.LoneTeen;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoneTeenTest {

    @DataProvider(name = "loneTeenData")
    public Object[][] loneTeenData() {
        return new Object[][]{
                {13, 99, true},
                {21, 19, true},
                {13, 13, false},
                {14, 20, true},
                {20, 15, true},
                {16, 17, false},
                {16, 9, true},
                {16, 18, false},
                {13, 19, false},
                {13, 20, true},
                {6, 18, true},
                {99, 13, true},
                {99, 99, false}
        };
    }

    @Test(dataProvider = "loneTeenData")
    public void testLoneTeen(int a, int b, boolean expected) {
        LoneTeen loneTeen = new LoneTeen();
        boolean result = loneTeen.loneTeen(a, b);
        System.out.println("Запуск теста с a: " + a + ", b: " + b + " -> Ожидалось: " + expected + ", Результат: " + result);
        Assert.assertEquals(result, expected, "Метод loneTeen не прошел тест для a: " + a + ", b: " + b);
    }
}
