package com.practice.test1;

import java.util.Scanner;

public class Application {

        public static void main(String[] args) {
//            Fetch book record based on book roll no from the database
            Book model = retriveBookFromDatabase();

            // Create a view to write book details on console
            View view = new View();

            Controller controller = new Controller(model, view);
            controller.updateView();

            Scanner scan = new Scanner(System.in);
            // Update model data
            String result = "";
            controller.setBookTitle("도서 등록 프로그램입니다.");
            controller.updateView();


        }

        private static Book retriveBookFromDatabase() {
            // fetch a book from database
            Book book = new Book("책 제목", "채 저자");
            return book;
        }
    }


