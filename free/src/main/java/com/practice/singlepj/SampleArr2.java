package com.practice.singlepj;

import java.util.Scanner;

public class SampleArr2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("인원 수 별로 급여를 입력합니다. 인원 수를 입력하세요");
        int member = scan.nextInt();
        int[] arr = new int[member];

        for (int i = 0; i < arr.length; i++) {
            System.out.println((i+1) + "번째 인원의 급여를 입력해주세요");
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i+1) + "번째 인원의 급여는 " + arr[i] + " 원입니다.");
        }


    }
}
