package codingbat_tests.akbar_tests.warmup1_tests;

import codingbat.akbar.warmup1.IntMax;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IntMax_Test {
    IntMax intMax = new IntMax();

    @DataProvider(name = "intMax")
    public Object[][] dpIntMax(){
        return new Object[][]{
                {1, 2, 3, 3	},
                {-3, -1, -2,-1},
                {6, 2, 5, 6	},
                {8, 2, 3, 8	},
                {3, 9, 3,9	},
        };
    }

    @Test(description = "Verify IntMax function", dataProvider = "intMax")
    public void intMaxTest(int a, int b, int c, int exp){
        Assert.assertEquals(intMax.intMax(a,b,c),exp);
    }
}
