package codingbat_tests.jyldyzbek_tests.warmup1_tests;

import codingbat.jyldyzbek.warmup1.Front22;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Front22Test {

    @DataProvider(name = "front22Data")
    public Object[][] front22Data() {
        return new Object[][]{
                {"kitten", "kikittenki"},
                {"Ha", "HaHaHa"},
                {"abc", "ababcab"},
                {"ab", "ababab"},
                {"a", "aaa"},
                {"", ""},
                {"Logic", "LoLogicLo"}
        };
    }

    @Test(dataProvider = "front22Data")
    public void testFront22(String input, String expected) {
        Front22 front22 = new Front22();
        String result = front22.front22(input);
        System.out.println("Тест с вводом: \"" + input + "\" -> Ожидается: \"" + expected + "\", Результат: \"" + result + "\"");
        Assert.assertEquals(result, expected);
    }
}
