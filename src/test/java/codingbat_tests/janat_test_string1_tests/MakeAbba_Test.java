package codingbat_tests.janat_test_string1_tests;

import codingbat.janat.string1.MakeAbba;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeAbba_Test {
    MakeAbba makeAbba = new MakeAbba();

    @DataProvider(name = "make_abba")
    public Object[][] dpMakeAbba(){
        return new Object[][]{
                {"Hi", "Bye", "HiByeByeHi"},
                {"Yo", "Alice", "YoAliceAliceYo"},
                {"What", "Up", "WhatUpUpWhat"},
                {"aaa", "bbb", "aaabbbbbbaaa"},
                {"x", "y", "xyyx"},
        };
    }

    @Test(description = "Verify Make_Abba Function", dataProvider = "make_abba")
    public void makeAbbaTest(String str, String str1, String exp){
        Assert.assertEquals(makeAbba.makeAbba(str, str1), exp);
    }
}
