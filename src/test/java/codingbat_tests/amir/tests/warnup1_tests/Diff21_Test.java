package codingbat_tests.amir.tests.warnup1_tests;

import codingbat.amir.warmup1.Diff21;
import codingbat_tests.jyldyzbek_tests.warmup1_tests.Diff21Test;
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
