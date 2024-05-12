package com.practice.javabookex.method.ex1;

public class Car { // <-- Car class 생성

    int num = 0; // 자동차 번호
    double gas = 0;//연료

    void show() { // 정보 조회
        System.out.println("차량 번호" + this.num + " 입니다.");
        System.out.println("연료는 " + this.gas + "l 입니다.");
    }

    void showCar() { // 알림 + 정보 조회
        System.out.println("지금부터 자동차의 정보를 표시합니다.");
        show();
    }

    void setNum(int n) {
        num = n;
        System.out.println("차량 번호를 " + num + "으로 바꿨습니다.");
    }

    void setGas(double g) {
        gas = g;
        System.out.println("연료량을 " + gas + "으로 바꿨습니다.");
    }
}
