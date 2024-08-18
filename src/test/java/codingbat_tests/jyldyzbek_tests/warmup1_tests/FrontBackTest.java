package codingbat_tests.jyldyzbek_tests.warmup1_tests;

import codingbat.jyldyzbek.warmup1.FrontBack;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FrontBackTest {

    @DataProvider(name = "frontBackData")
    public Object[][] frontBackData() {
        return new Object[][]{
                {"code", "eodc"},
                {"a", "a"},
                {"ab", "ba"},
                {"abc", "cba"},
                {"", ""},
                {"Chocolate", "ehocolatC"},
                {"aavJ", "Java"},
                {"hello", "oellh"}
        };
    }

    @Test(dataProvider = "frontBackData")
    public void testFrontBack(String input, String expected) {
        FrontBack frontBack = new FrontBack();
        String result = frontBack.frontBack(input);
        System.out.println("Тест с вводом: \"" + input + "\" -> Ожидается: \"" + expected + "\", Результат: \"" + result + "\"");
        Assert.assertEquals(result, expected);
    }
}
