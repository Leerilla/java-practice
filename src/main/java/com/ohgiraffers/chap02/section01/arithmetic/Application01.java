package com.ohgiraffers.chap02.section01.arithmetic;

public class Application01 {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        Application01 app1 = new Application01();

        System.out.println(app1.plus(x,y));
        System.out.println(app1.minus(x,y));
        System.out.println(app1.multiply(x,y));
        System.out.println(app1.divide(x,y));

    }


    public int plus (int x , int y){
        return x + y;
    }


    public int minus(int x, int y){
        return x - y;
    }


    public long multiply(int x, int y){
        return x * y;
    }


    public double divide(int x, int y){
        return x / y;
    }
}
