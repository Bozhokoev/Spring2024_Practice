package codingbat_tests.amir.tests.warnup1_tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDoubleTest {

    @DataProvider(name = "SumDoubleData")
    public Object[][] sumDoubleData() {
        return new Object[][]{
                {1,2},
                {2,3} ,
                {2, 2}
        };
    }

    @Test(dataProvider = "SumDoubleData")
    public void testSumData(int a, int b){
        System.out.println("a: " + a + "b: " + b);
    }
}
