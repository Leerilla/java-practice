package com.ohgiraffers.chap02.section01.comparsion;

public class Application01 {

    public static void main(String[] args){

        int x = 10;
        int y = 10;

        Application01 app1 = new Application01();
        boolean result = app1.valueCheck(x, y);
        System.out.println(result);


        Application01 app2 = new Application01();
        int result2 = app2.maxNumberOf(x, y);
        System.out.println(result2);



        Application01 app3 = new Application01();
        boolean result3 = app3.rangeNum(x);
        System.out.println(result3);



    }

    // 두 수의 값을 비교하여 같으면 true 다르면 false를 출력하는 프로그램을 작성해주세요
    public boolean valueCheck(int x, int y){

        String result = "x == y";
        return true;
    }

    // 두 수의 값을 비교하여 큰 값을 반환하는 프로그램을 작성해주세요
    // 만약 같다면 0의 값을 반환합니다.

    public int maxNumberOf(int x, int y){
        Calculator cal = new Calculator();
        int max = cal.maxNumberOf(x,y);
        int result = (x != y)? max : 0;
        return 0;
    }

    // int x의 값이 0  ~ 100 사이의 값이 맞다면 true 아니면 false를 출력하는 프로그램을 만들어주세요
    public boolean rangeNum(int x){

        String result = (x >= 0 && x <= 100)? "true" : "false";

        return false;
    }
}
