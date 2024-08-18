package codingbat_tests.jyldyzbek_tests.warmup1_tests;

import codingbat.jyldyzbek.warmup1.EveryNth;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EveryNthTest {

    @DataProvider(name = "everyNthDataProvider")
    public Object[][] everyNthDataProvider() {
        return new Object[][] {
                {"Miracle", 2, "Mrce"},
                {"abcdefg", 2, "aceg"},
                {"abcdefg", 3, "adg"},
                {"Chocolate", 3, "Cca"},
                {"Chocolates", 3, "Ccas"},
                {"Chocolates", 4, "Coe"},
                {"Chocolates", 100, "C"}
        };
    }

    @Test(dataProvider = "everyNthDataProvider")
    public void testEveryNth(String str, int n, String expected) {
        EveryNth everyNth = new EveryNth();
        String result = everyNth.everyNth(str, n);
        System.out.println("Тестирование everyNth с входной строкой: \"" + str + "\", n = " + n + " | Ожидаемый результат: \"" + expected + "\" | Фактический результат: \"" + result + "\"");
        Assert.assertEquals(result, expected, "Тест не пройден для строки: \"" + str + "\" с n = " + n + ". Ожидалось: \"" + expected + "\", но получено: \"" + result + "\"");
    }
}
