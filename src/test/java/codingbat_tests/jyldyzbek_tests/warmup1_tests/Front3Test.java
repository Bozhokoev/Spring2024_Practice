package codingbat_tests.jyldyzbek_tests.warmup1_tests;

import codingbat.jyldyzbek.warmup1.Front3;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Front3Test {

    @DataProvider(name = "front3Data")
    public Object[][] front3Data() {
        return new Object[][]{
                {"Java", "JavJavJav"},
                {"Chocolate", "ChoChoCho"},
                {"abc", "abcabcabc"},
                {"abcXYZ", "abcabcabc"},
                {"ab", "ababab"},
                {"a", "aaa"},
                {"", ""}
        };
    }

    @Test(dataProvider = "front3Data")
    public void testFront3(String input, String expected) {
        Front3 front3 = new Front3();
        String result = front3.front3(input);
        System.out.println("Тест с вводом: \"" + input + "\" -> Ожидается: \"" + expected + "\", Результат: \"" + result + "\"");
        Assert.assertEquals(result, expected);
    }
}
