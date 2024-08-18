package codingbat_tests.aidana_test_warmup1_tests;

import codingbat.aidana.warmup1.Or35;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


    public class Or35Test {
        Or35 or35 = new Or35();

        @DataProvider(name = "or35")
        public Object[][] dpOr35() {
            return new Object[][]{
                    {3, true},
                    {10, true},
                    {15, true},
                    {45, true},
                    {180, true},
                    {1890, true},
                    {180, true},
                    {22, false}
            };
        }

        @Test(description = "Verify Or35 function", dataProvider = "or35")
        public void or35Test(int n, boolean exp) {
            Assert.assertEquals(or35.or35(n), exp);
        }
    }







