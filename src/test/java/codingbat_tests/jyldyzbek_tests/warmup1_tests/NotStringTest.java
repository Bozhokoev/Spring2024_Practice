package codingbat_tests.jyldyzbek_tests.warmup1_tests;

import codingbat.jyldyzbek.warmup1.NotString;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NotStringTest {

    @DataProvider(name = "notStringData")
    public Object[][] notStringData() {
        return new Object[][]{
                {"candy", "not candy"},
                {"x", "not x"},
                {"not bad", "not bad"},
                {"bad", "not bad"},
                {"not", "not"},
                {"is not", "not is not"},
                {"no", "not no"}
        };
    }

    @Test(dataProvider = "notStringData")
    public void NotStringTest(String input, String expected) {
        NotString notString = new NotString();
        String[] inputs = input.split(",");
        String[] expectedResults = expected.split(",");

        for (int i = 0; i < inputs.length; i++) {
            String result = notString.notString(inputs[i]);
            System.out.println("Выполняется тест с вводом: " + inputs[i] + " -> Ожидается: " + expectedResults[i] + ", Результат: " + result);
            Assert.assertEquals(result, expectedResults[i], "Метод notString не прошел для ввода: " + inputs[i]);
        }
    }
}
