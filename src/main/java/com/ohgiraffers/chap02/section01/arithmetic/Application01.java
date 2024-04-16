package com.ohgiraffers.chap02.section01.arithmetic;

public class Application01 {

    public static void main(String[] args){
        int x =10;
        int y =20;

        Application01 app1 = new Application01();

        int result = app1.plus(x, y);
        System.out.println(result);

        int result2 = app1.minus(x, y);
        System.out.println(result2);

        long result3 = app1.multiply(x, y);
        System.out.println(result3);

        double result4 = app1.divide(x, y);
        System.out.println(result4);



    }

    // x, y를 더하는 기능을 만들고 결과를 반환해주세요
    public int plus (int x , int y){
        int result = x + y;
        return 30;
    }




    // x,y를 빼는 기능을 만들고 결과를 반환해주세요
    public int minus(int x, int y){

        int result = x - y;

        return -10;
    }

    // x,y를 곱하는 기능을 만들고 결과를 반환해주세요
    public long multiply(int x, int y){

        int result = x * y;

        return 200;
    }
    // x, y를 나누고 결과를 반환해주세요

    public double divide(int x, int y){

        double result = x / y;

        return 0.0;
    }
}
