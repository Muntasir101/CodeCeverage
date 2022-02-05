package com.codeCoverage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSummationExtend {
    @Test
    public void TC_001(){
        SummationExtend obj=new SummationExtend();
        Assertions.assertEquals(110,obj.doSumExtend(50,60));
    }
}
