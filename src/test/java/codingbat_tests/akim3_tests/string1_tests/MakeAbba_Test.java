package codingbat_tests.akim3_tests.string1_tests;

import codingbat.akim3.string1.MakeAbba;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeAbba_Test {
    MakeAbba makeAbba = new MakeAbba();

    @DataProvider(name = "make_abba")
    public Object[][] dpMakeAbba(){
        return new Object[][]{
                {"Hi", "Bye", "HiByeByeHi"},
                {"What", "Up", "WhatUpUpWhat"},
                {"x", "", "xx"}
        };
    }

    @Test(description = "Verify makeAbba function", dataProvider = "make_abba")
    public void makeAbbaTest(String str1, String str2, String expected){
        Assert.assertEquals(makeAbba.makeAbba(str1, str2), expected);
    }
}
