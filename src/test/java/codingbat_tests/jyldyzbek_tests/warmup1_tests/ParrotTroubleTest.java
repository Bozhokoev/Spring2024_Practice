package codingbat_tests.jyldyzbek_tests.warmup1_tests;
import codingbat.jyldyzbek.warmup1.ParrotTrouble;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParrotTroubleTest {

    @DataProvider(name = "parrotTroubleData")
    public Object[][] parrotTroubleData() {
        return new Object[][]{
                {true, 6, true},
                {true, 7, false},
                {false, 6, false},
                {true, 21, true},
                {false, 21, false},
                {false, 20, false},
                {true, 23, true},
                {false, 23, false},
                {true, 20, false},
                {false, 12, false}
        };
    }

    @Test(dataProvider = "parrotTroubleData")
    public void testParrotTrouble(boolean talking, int hour, boolean expected) {
        ParrotTrouble parrotTrouble = new ParrotTrouble();
        boolean result = parrotTrouble.parrotTrouble(talking, hour);
        System.out.println("Running test with talking: " + talking + ", hour: " + hour + " -> Expected: " + expected + ", Result: " + result);
        Assert.assertEquals(result, expected, "The parrotTrouble method failed for talking: " + talking + ", hour: " + hour);
    }
}
