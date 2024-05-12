package com.practice.singlepj;

import java.util.Scanner;

public class SampleArr3 {

    public static void main(String[] args) {

        System.out.println("매거진 수량을 입력하세요");
        Scanner scan = new Scanner(System.in);
        int magazine = scan.nextInt();
        int[] element = new int[magazine];
        for (int i = 0; i < magazine; i++) {
            System.out.println((i+1) + "번 매거진의 전극 적재량을 입력하세요");
            element[i] = scan.nextInt();
        }
        for (int i = 0; i < magazine; i++) {
            System.out.println((i+1) + "번째 매거진에 담긴 전극 수량 " + element[i] + "장입니다.");
        }

    }
}
