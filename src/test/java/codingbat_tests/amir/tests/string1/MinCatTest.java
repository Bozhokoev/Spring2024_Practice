package codingbat_tests.amir.tests.string1;

import codingbat.amir.string1.MinCat;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MinCatTest {

    // DataProvider для передачи тестовых данных
    @DataProvider(name = "MiniCatData")
    public Object[][] miniCatData() {
        return new Object[][] {
                {"Hello", "Hi", "loHi"},
                {"Hello", "java", "ellojava"},
                {"java", "Hello", "javaello"}
        };
    }

    // Метод теста, который использует DataProvider
    @Test(dataProvider = "MiniCatData")
    public void miniCatTest(String a, String b, String expected) {
        MinCat minCat = new MinCat();
        String result = minCat.minCat(a, b);
        assertEquals(result, expected);

    }
}
