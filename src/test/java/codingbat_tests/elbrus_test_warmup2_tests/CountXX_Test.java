package codingbat_tests.elbrus_test_warmup2_tests;

import codingbat.elbrus.warmup2.CountXX;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CountXX_Test {
    CountXX countXX = new CountXX();

    @DataProvider(name = "data-CountXX")
    public Object[][] dpCountXX(){
        return new Object[][] {
                {"abcxx", 1},
        };
    }
    @DataProvider(name = "data-CountXX2")
    public Object[][] dpCountXX2(){
        return new Object[][] {
                {"xxx", 2},
                {"Hexxo thxxe", 2},
                {"Kittensxxx", 2},

        };
    }
    @DataProvider(name = "data-CountXX3")
    public Object[][] dpCountXX3(){
        return new Object[][] {
                {"xxxx", 3},
        };
    }
    @DataProvider(name = "data-CountXX4")
    public Object[][] dpCountXX4(){
        return new Object[][] {
                {"abc", 0},
                {"Hello there", 0},
                {"", 0},
                {"Kittens", 0},
        };
    }

    @Test (description = "verify count in function", dataProvider = "data-CountXX")
    public void countXXTest (String str, int n){
        Assert.assertEquals(countXX.countXX(str), 1);
    }
    @Test (description = "verify count in function", dataProvider = "data-CountXX2")
    public void countXXTest2 (String str, int n){
        Assert.assertEquals(countXX.countXX(str), 2);
    }
    @Test (description = "verify count in function", dataProvider = "data-CountXX3")
    public void countXXTest3 (String str, int n){
        Assert.assertEquals(countXX.countXX(str), 3);
    }
    @Test (description = "verify count in function", dataProvider = "data-CountXX4")
    public void countXXTest4 (String str, int n){
        Assert.assertEquals(countXX.countXX(str), 0);
    }
  }
