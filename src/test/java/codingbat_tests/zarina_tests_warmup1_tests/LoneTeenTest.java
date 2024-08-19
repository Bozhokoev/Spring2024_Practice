<<<<<<< HEAD:src/test/java/codingbat_tests/zarina_tests_warmup1_tests/LoneTeenTest.java
package codingbat_tests.zarina_tests_warmup1_tests;

import codingbat.zarina.warmup1.LoneTeen;
=======
package codingbat_tests.jyldyzbek_tests.warmup1_tests;

import codingbat.jyldyzbek.warmup1.LoneTeen;
>>>>>>> origin/master:src/test/java/codingbat_tests/jyldyzbek_tests/warmup1_tests/LoneTeenTest.java
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoneTeenTest {
<<<<<<< HEAD:src/test/java/codingbat_tests/zarina_tests_warmup1_tests/LoneTeenTest.java
    LoneTeen loneTeen = new LoneTeen();

    @DataProvider (name = "Lone Teen")
    public Object [][] dpLoneTeen(){
        return new Object[][]{
                {13,99,true},
                {21,19,true},
                {13,13,false},
                {20,15,true},
                {16,9,true}
        };
    }

    @Test(description = "Verify Lone Teen Test", dataProvider = "Lone Teen")
            public void loneTeenTest (int a, int b, boolean exp){
        Assert.assertEquals(loneTeen.loneTeen(a,b),exp);
=======

    @DataProvider(name = "loneTeenData")
    public Object[][] loneTeenData() {
        return new Object[][]{
                {13, 99, true},
                {21, 19, true},
                {13, 13, false},
                {14, 20, true},
                {20, 15, true},
                {16, 17, false},
                {16, 9, true},
                {16, 18, false},
                {13, 19, false},
                {13, 20, true},
                {6, 18, true},
                {99, 13, true},
                {99, 99, false}
        };
    }

    @Test(dataProvider = "loneTeenData")
    public void testLoneTeen(int a, int b, boolean expected) {
        LoneTeen loneTeen = new LoneTeen();
        boolean result = loneTeen.loneTeen(a, b);
        System.out.println("Запуск теста с a: " + a + ", b: " + b + " -> Ожидалось: " + expected + ", Результат: " + result);
        Assert.assertEquals(result, expected, "Метод loneTeen не прошел тест для a: " + a + ", b: " + b);
>>>>>>> origin/master:src/test/java/codingbat_tests/jyldyzbek_tests/warmup1_tests/LoneTeenTest.java
    }
}
