package codingbat_tests.dana_test_string1_tests;

import codingbat.dana.string1.MakeAbba;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeAbba_test {

    MakeAbba makeAbba = new MakeAbba();

    @DataProvider(name = "makeAbba")
    public Object[][] dpMakeAbba(){
        return new Object[][]{
                {"Hi", "Bye", "HiByeByeHi"},
                {"Yo", "Alice", "YoAliceAliceYo"},
                {"What", "Up", "WhatUpUpWhat"},
                {"aaa", "bbb", "aaabbbbbbaaa"},
                {"x", "y", "xyyx"},
                {"x", "", "xx"},
                {"", "y", "yy"},
                {"Bo", "Ya", "BoYaYaBo"},
                {"Ya", "Ya", "YaYaYaYa"}
        };
    }

    @Test(description = "Verify Make Abba Functional", dataProvider = "makeAbba")
    public void makeAbba_test(String a, String b, String res){
        Assert.assertEquals(makeAbba.makeAbba(a, b), res);
    }
}
