package com.practice.marcket;

public class Application {

    public static void main(String[] args) {

        ProductOrder[] orders = new ProductOrder[2];
        ProductOrder order1 = new ProductOrder();

        order1.productName = "감자";
        order1.price = 2000;
        order1.quantity = 1;
        orders[0] = order1;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "호박";
        order2.price = 4000;
        order2.quantity = 1;
        orders[1] = order2;

        int totalAmount = 0;
        for (ProductOrder order : orders) {
            System.out.println("품명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
            totalAmount += order.quantity * order.price;
        }

        System.out.println("총합 : " + totalAmount + "원");

    }
}
