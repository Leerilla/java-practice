package practice.training;

import java.util.Scanner;

public class Training_matrix {

    public static void main(String[] args) {

        // 사용자 정보 입력 받기 위한 배열 세팅
        String[] memberInfo = new String[4];
        String result = "";

        Scanner sc = new Scanner(System.in); // 입력 클래스 on

        // 사용자 정보 입력 받기
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("전화번호를 입력하세요 : ");
        String phone = sc.nextLine();
        System.out.print("이메일을 입력하세요 : ");
        String email = sc.nextLine();
        System.out.print("주소를 입력하세요 : ");
        String address = sc.nextLine();

        // 배열에 정보 등록하기
        memberInfo[0] = name;
        memberInfo[1] = phone;
        memberInfo[2] = email;
        memberInfo[3] = address;

        



    }
}
