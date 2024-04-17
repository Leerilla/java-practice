package com.ohgiraffers.chap02.section01.arithmetic;

import org.w3c.dom.ls.LSOutput;

public class Application01 {
    public static void main(String[] args) {


        int x = 10;
        int y = 20;
        long x2 = 12345678l;
        long y2 = 12345679l;
        double num1 = 5;
        double num2 = 10;

        Application01 app1 = new Application01();
        int result = app1.plus(x, y);
        System.out.println(result);

        int result1 = app1.minus(x,y);
        System.out.println(result1);

        long result2 = app1.multiply(x2,y2);
        System.out.println(result2);

        double result3 =app1.divide(num1,num2);
        System.out.println(result3);
    }

    // x, y를 더하는 기능을 만들고 결과를 반환해주세요
    public int plus (int x , int y){
        int result = x+y;
        return result;
    }

    // x,y를 빼는 기능을 만들고 결과를 반환해주세요
    public int minus(int x, int y){
        int result1 = x-y;
        return result1;
    }

    // x,y를 곱하는 기능을 만들고 결과를 반환해주세요
    public long multiply(long x2, long y2){
        long result2 =x2*y2;
        return  result2;
    }
    // x, y를 나누고 결과를 반환해주세요

    public double divide(double num1, double num2){
        double result3 =num1/num2;
        return  result3;
    }
}