package codingbat_tests.janybek_test_warmup1_tests;

import codingbat.janybek.warmup1.Diff21;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Diff21_Test {

    @DataProvider(name = "Diff21_Data")
    public Object[][] diff21Data(){
        return new Object[][]{
                {19, 2},
                {10, 11},
                {21, 0}
        };
    }

    @Test(dataProvider = "Diff21_Data")
    public void testDiff21(int n, int expected) {
        int result = Diff21.diff21(n);
        System.out.println();

        assertEquals(result, expected, "Метод diff21 не вернул ожидаемый результат\n");
    }
}
