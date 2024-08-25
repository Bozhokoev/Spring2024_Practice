package codingbat_tests.akbar_tests.warmup1_tests;

import codingbat.akbar.warmup1.NearHundred;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NearHundred_Test {
    NearHundred nearHundred = new NearHundred();

    @DataProvider(name = "nearHundred")
    public Object[][] near100(){
        return new Object[][]{
                {93,true},
                {90,true},
                {89,false},
                {-101,false},
                {0,false},
        };
    }
    @Test(description = "Verify near hundred function", dataProvider = "nearHundred")
        public void near100Test(int a, boolean exp){
            Assert.assertEquals(nearHundred.nearHundred(a),exp);
        }
    }



