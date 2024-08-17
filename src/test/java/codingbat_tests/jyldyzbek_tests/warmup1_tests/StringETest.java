package codingbat_tests.jyldyzbek_tests.warmup1_tests;

import codingbat.jyldyzbek.warmup1.StringE;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringETest {

    @DataProvider(name = "stringEDataProvider")
    public Object[][] stringEDataProvider() {
        return new Object[][]{
                {"Hello", true},
                {"Heelle", true},
                {"Heelele", false},
                {"Hll", false},
                {"e", true},
                {"", false}
        };
    }

    @Test(dataProvider = "stringEDataProvider")
    public void testStringE(String str, boolean expected) {
        StringE stringE = new StringE();
        boolean result = stringE.stringE(str);
        System.out.println("Тестирование stringE с входной строкой: \"" + str + "\" | Ожидаемый результат: " + expected + " | Фактический результат: " + result);
        Assert.assertEquals(result, expected, "Тест не пройден для строки: \"" + str + "\". Ожидалось: " + expected + ", но получено: " + result);
    }
}
