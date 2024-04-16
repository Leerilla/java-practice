package com.ohgiraffers.chap02.section01.comparsion;

public class Application01 {
    public static void main(String[] args) {

        Application01 app1 = new Application01();

        int x = 5;
        int y = 5;

        System.out.println(app1.valueCheck(x,y));
        System.out.println(app1.maxNumberOf(x,y));
        System.out.println(app1.rangeNum(x));



    }

    // 두 수의 값을 비교하여 같으면 true 다르면 false를 출력하는 프로그램을 작성해주세요
    public boolean valueCheck(int x, int y){

        return (x == y)?true:false;
    }

    // 두 수의 값을 비교하여 큰 값을 반환하는 프로그램을 작성해주세요
    // 만약 같다면 0의 값을 반환합니다.
    public int maxNumberOf(int x, int y){
        return  (x==y)?0:(x>y)?x:y;
    }

    // int x의 값이 0  ~ 100 사이의 값이 맞다면 true 아니면 false를 출력하는 프로그램을 만들어주세요
    public boolean rangeNum(int x){
        return (x>=0 && x<=100)?true:false;
    }
}
