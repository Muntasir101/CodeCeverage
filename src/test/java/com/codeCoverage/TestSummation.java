package com.codeCoverage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSummation {
    @Test
    public void TC_001(){
        Summation obj=new Summation();
        Assertions.assertEquals(110,obj.doSum(50,60));
    }
    @Test
    public void TC_002(){
        Summation obj=new Summation();
        Assertions.assertEquals(55,obj.doSum(25,30));
    }

    @Test
    public void TC_003(){
        Summation obj=new Summation();
        Assertions.assertEquals(20,obj.doSum(-10,30));
    }
    @Test
    public void TC_004(){
        Summation obj=new Summation();
        Assertions.assertEquals(-5,obj.doSum(25,-30));
    }
    @Test
    public void TC_005(){
        Summation obj=new Summation();
        Assertions.assertEquals(-55,obj.doSum(-25,-30));
    }
}
