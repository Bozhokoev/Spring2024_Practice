package codingbat_tests.zarina3_tests.string1_tests;

import codingbat.zarina3.string1.MakeAbba;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeAbba_Test {

    MakeAbba makeAbba = new MakeAbba();

    @DataProvider(name = "MakeAbba")
    public Object [][] dpMakeAbba(){
        return new Object[][]{
                {"Hi","Bye","HiByeByeHi"},
                {"What","Up","WhatUpUpWhat"},
                {"x","y","xyyx"},
                {"Bo","Ya","BoYaYaBo"},
        };
    }

    @Test(description = "Verify MakeAbba Test",dataProvider = "MakeAbba")
    public void makeAbbaTest(String str, String str2, String res){
        Assert.assertEquals(makeAbba.makeAbba(str,str2),res);
    }
}
