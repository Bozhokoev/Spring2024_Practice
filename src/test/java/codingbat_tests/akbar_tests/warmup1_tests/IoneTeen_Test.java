package codingbat_tests.akbar_tests.warmup1_tests;

import codingbat.akbar.warmup1.IoneTeen;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IoneTeen_Test {
    IoneTeen ioneTeen = new IoneTeen();

    @DataProvider(name = "ioneTeen")
    public Object[][] dpioneTeen(){
        return new Object[][]{
                {13, 99,true},
                {13, 13, false},
                {14, 20, true},
                {16, 17, false},
                {99, 13,true},
        };
    }

    @Test(description = "Verify IoneTeen function", dataProvider = "ioneTeen")
    public void ioneTeenTest(int a, int b, boolean exp){
        Assert.assertEquals(ioneTeen.loneTeen(a,b),exp);
    }
}
