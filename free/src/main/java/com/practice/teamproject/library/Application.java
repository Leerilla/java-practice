package com.practice.teamproject.library;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        System.out.println("\n무인 관리대에 오신걸 환영 합니다.\n");

        Scanner sc = new Scanner(System.in);

        UserRepository userRepository = new UserRepository();

        while (true) {

            try {
                Thread.sleep(2000); // 타임 딜레이 2초
            } catch (InterruptedException e) {
                System.out.println("오류가 발생 했습니다.");
                e.printStackTrace();
            }

            System.out.println("1. 회원 등록 ");     // arraylist 배열을 이용해서 회원등록
            System.out.println("2. 전체 회원 조회 "); // 1번이 잘 되었는지 확인하는 작업
            System.out.println("3. 도서 검색 "); //jdbc 이용
            System.out.println("4. 도서 대여 "); //jdbc 이용
            System.out.println("5. 도서 반납 "); //jdbc 이용

            System.out.print("\n원하는 항목을 선택해 주세요. : ");

            int input = sc.nextInt();
            sc.nextLine();

            switch (input) {
                case 1: // 회원등록
                    System.out.println("\n회원 등록을 진행합니다.");
                    System.out.print("이름을 입력해주세요. ex)이상우 : ");
                    String name = sc.nextLine();
                    System.out.print("나이를 입력해주세요. ex)20 : ");
                    int age = sc.nextInt();
                    System.out.print("휴대폰 번호를 입력해주세요. : ");
                    sc.nextLine(); // 버퍼를 비워줍니다.
                    String phone = sc.nextLine();
                    UserDTO userDTO = new UserDTO(name,age,phone); //생성자를 이용하여 안정성과 가독성을 높임
                    userRepository.addUser(userDTO);
                    System.out.println(userDTO+"님 등록이 완료되었습니다.\n");

                    break;

                case 2:
                    userRepository.print();
                    System.out.println("\n");
                    break;

                default:
                    System.out.println("\n해당하는 항목이 없습니다. 다시 입력해 주세요.\n");



                }

            }
        }

    }
