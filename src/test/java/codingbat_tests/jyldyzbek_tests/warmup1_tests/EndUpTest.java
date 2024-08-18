package codingbat_tests.jyldyzbek_tests.warmup1_tests;

import codingbat.jyldyzbek.warmup1.EndUp;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EndUpTest {

    @DataProvider(name = "endUpDataProvider")
    public Object[][] endUpDataProvider() {
        return new Object[][] {
                {"Hello", "HeLLO"},
                {"hi there", "hi thERE"},
                {"hi", "HI"},
                {"woo hoo", "woo HOO"},
                {"xyz12", "xyZ12"},
                {"x", "X"},
                {"", ""}
        };
    }

    @Test(dataProvider = "endUpDataProvider")
    public void testEndUp(String str, String expected) {
        EndUp endUp = new EndUp();
        String result = endUp.endUp(str);
        System.out.println("Тестирование endUp с входной строкой: \"" + str + "\" | Ожидаемый результат: \"" + expected + "\" | Фактический результат: \"" + result + "\"");
        Assert.assertEquals(result, expected, "Тест не пройден для строки: \"" + str + "\". Ожидалось: \"" + expected + "\", но получено: \"" + result + "\"");
    }
}
