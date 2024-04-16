package com.ohgiraffers.chap02.section01.arithmetic;

import org.w3c.dom.ls.LSOutput;

public class Application01 {

    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        long x1 = 5l;
        long y1 = 6l;
        double x2 = 7d;
        double y2 = 8d;


        Application01 app1 = new Application01();
        int sum = app1.plus(x, y);
        int sub = app1.minus(x, y);
        long mul = app1.multiply(x1, y1);
        double dvi = app1.divide(x2, y2);

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(dvi);

    }


    // x, y를 더하는 기능을 만들고 결과를 반환해주세요
    public int plus (int x , int y){
        int sum = x + y;
        return sum;
    }

    // x,y를 빼는 기능을 만들고 결과를 반환해주세요
    public int minus(int x, int y){
        int sub = x - y;
        return sub;
    }

    // x,y를 곱하는 기능을 만들고 결과를 반환해주세요
    public long multiply(long x1, long y1){
        long mul = x1 * y1;
        return mul;
    }
    // x, y를 나누고 결과를 반환해주세요

    public double divide(double x2, double y2){
        double div = x2 / y2;
        return div;
    }
}
