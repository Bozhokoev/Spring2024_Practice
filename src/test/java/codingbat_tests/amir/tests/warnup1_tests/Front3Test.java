package codingbat_tests.amir.tests.warnup1_tests;

import codingbat.amir.warmup1.Front3;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Front3Test {

    @DataProvider(name = "Front3Data")
    public Object [][] frontData() {
        return new Object[][]{
                {"Java", "JavJavJav"},
                {"Chocolate", "ChoChoCho"},
                {"abc", "abcabcabc"}
        };
    }

    @Test(dataProvider = "Front3Data")
    public void testFront3(String str, String except) {
        Front3 front3 = new Front3();
        String result = front3.front3(str);
        assertEquals(result, except);
    }
}
