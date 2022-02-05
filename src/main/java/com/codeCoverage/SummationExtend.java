package com.codeCoverage;

public class SummationExtend {

    public int doSumExtend(int a, int b){
        int sum=a+b;
        if(sum>100){
            System.out.println("Its DONE");
        }
        else if(a>50){
            System.out.println("Its PENDING");
        }
        return sum;
    }
}
