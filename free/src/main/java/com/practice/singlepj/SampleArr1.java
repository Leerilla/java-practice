package com.practice.singlepj;

import java.util.Scanner;

public class SampleArr1 {

    public static void main(String[] args) {

        System.out.println("시험 응시자 수를 입력하세요.");
        Scanner scan = new Scanner(System.in);
        int member = scan.nextInt();

        int[] arr = new int[member];
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i+1) + "번 응시자의 점수를 입력하세요");
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i+1) + "번째 사람의 점수는 " + arr[i] + "입니다.");
        }

    }
}
