package codingbat_tests.jyldyzbek_tests.warmup1_tests;

import codingbat.jyldyzbek.warmup1.BackAround;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BackAroundTest {

    @DataProvider(name = "backAroundData")
    public Object[][] backAroundData() {
        return new Object[][] {
                {"cat", "tcatt"},
                {"Hello", "oHelloo"},
                {"a", "aaa"},
                {"abc", "cabcc"},
                {"read", "dreadd"},
                {"boo", "obooo"}
        };
    }

    @Test(dataProvider = "backAroundData")
    public void testBackAround(String input, String expected) {
        BackAround backAround = new BackAround();
        String result = backAround.backAround(input);
        System.out.println("Тест с вводом: \"" + input + "\" -> Ожидается: \"" + expected + "\", Результат: \"" + result + "\"");
        Assert.assertEquals(result, expected);
    }
}

