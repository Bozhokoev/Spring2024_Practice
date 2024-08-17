package codingbat_tests.jyldyzbek_tests.warmup1_tests;

import codingbat.jyldyzbek.warmup1.MissingChar;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MissingCharTest {

    @DataProvider(name = "missingCharData")
    public Object[][] missingCharData() {
        return new Object[][]{
                {"kitten", 1, "ktten"},
                {"kitten", 0, "itten"},
                {"kitten", 4, "kittn"},
                {"Hi", 0, "i"},
                {"Hi", 1, "H"},
                {"code", 0, "ode"},
                {"code", 1, "cde"},
                {"code", 2, "coe"},
                {"code", 3, "cod"},
                {"chocolate", 8, "chocolat"}
        };
    }

    @Test(dataProvider = "missingCharData")
    public void testMissingChar(String input, int index, String expected) {
        MissingChar missingChar = new MissingChar();
        String result = missingChar.missingChar(input, index);
        System.out.println("Тест с вводом: \"" + input + "\", индекс: " + index + " -> Ожидается: \"" + expected + "\", Результат: \"" + result + "\"");
        Assert.assertEquals(result, expected);
    }

}
