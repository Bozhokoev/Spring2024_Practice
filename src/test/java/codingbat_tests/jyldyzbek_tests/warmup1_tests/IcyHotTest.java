package codingbat_tests.jyldyzbek_tests.warmup1_tests;

import codingbat.jyldyzbek.warmup1.IcyHot;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IcyHotTest {

    @DataProvider(name = "icyHotData")
    public Object[][] icyHotData() {
        return new Object[][]{
                {120, -1, true},
                {-1, 120, true},
                {2, 120, false},
                {-1, 100, false},
                {-2, -2, false},
                {120, 120, false}
        };
    }

    @Test(dataProvider = "icyHotData")
    public void testIcyHot(int temp1, int temp2, boolean expected) {
        IcyHot icyHot = new IcyHot();
        boolean result = icyHot.icyHot(temp1, temp2);
        System.out.println("Тест с температурой: temp1 = " + temp1 + ", temp2 = " + temp2 + " -> Ожидается: " + expected + ", Результат: " + result);
        Assert.assertEquals(result, expected);
    }
}
