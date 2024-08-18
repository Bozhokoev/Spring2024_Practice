package codingbat_tests.jyldyzbek_tests.warmup1_tests;

import codingbat.jyldyzbek.warmup1.StartHi;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StartHiTest {

    @DataProvider(name = "startHiData")
    public Object[][] startHiData() {
        return new Object[][]{
                {"hi there", true},
                {"hi", true},
                {"hello hi", false},
                {"he", false},
                {"h", false},
                {"", false},
                {"ho hi", false},
                {"hi ho", true}
        };
    }

    @Test(dataProvider = "startHiData")
    public void testStartHi(String input, boolean expected) {
        StartHi startHi = new StartHi();
        boolean result = startHi.startHi(input);
        System.out.println("Тест с вводом: \"" + input + "\" -> Ожидается: " + expected + ", Результат: " + result);
        Assert.assertEquals(result, expected);
    }
}
