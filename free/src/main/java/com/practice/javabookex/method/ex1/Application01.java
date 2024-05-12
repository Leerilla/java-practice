package com.practice.javabookex.method.ex1;

public class Application01 {

    public static void main(String[] args) {


        Car car1 = new Car();
//        car1.num = 123;
//        car1.gas = 56.4;

        //System.out.println(car1.num); 1차
        //System.out.println(car1.gas); 1차

        //car1.show(); 2차

        //car1.showCar(); // 3차

        car1.setNum(1234);
        car1.setGas(60);



    }

}
