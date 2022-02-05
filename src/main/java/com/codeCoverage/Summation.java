package com.codeCoverage;

public class Summation {

    public int doSum(int a, int b){
        int sum=a+b;
        if(sum>100){
            System.out.println("Its DONE");
        }
        else {
            System.out.println("Its PENDING");
        }
        return sum;
    }
}
