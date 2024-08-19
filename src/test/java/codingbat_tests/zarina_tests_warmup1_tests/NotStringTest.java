<<<<<<< HEAD:src/test/java/codingbat_tests/zarina_tests_warmup1_tests/NotStringTest.java
package codingbat_tests.zarina_tests_warmup1_tests;

import codingbat.zarina.warmup1.NotString;
=======
package codingbat_tests.jyldyzbek_tests.warmup1_tests;

import codingbat.jyldyzbek.warmup1.NotString;
>>>>>>> origin/master:src/test/java/codingbat_tests/jyldyzbek_tests/warmup1_tests/NotStringTest.java
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NotStringTest {
<<<<<<< HEAD:src/test/java/codingbat_tests/zarina_tests_warmup1_tests/NotStringTest.java
    NotString notString = new NotString();

    @DataProvider(name = "notString")
    public Object [][] dpNotString(){
=======

    @DataProvider(name = "notStringData")
    public Object[][] notStringData() {
>>>>>>> origin/master:src/test/java/codingbat_tests/jyldyzbek_tests/warmup1_tests/NotStringTest.java
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

<<<<<<< HEAD:src/test/java/codingbat_tests/zarina_tests_warmup1_tests/NotStringTest.java
    @Test(description = "Verify Not String", dataProvider = "notString")
    public void notString_test(String str, String res){
        Assert.assertEquals(notString.notString(str),res);
}
=======
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
>>>>>>> origin/master:src/test/java/codingbat_tests/jyldyzbek_tests/warmup1_tests/NotStringTest.java
}
