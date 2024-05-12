package java.com.practice;

public class Practice {

    public static void main(String[] args) {

        Practice practice = new Practice();
        practice.angel1(); //1004
        practice.angel2(1);
        practice.angel3(25,5);

    }

    public void angel1(){
        System.out.println(1004);
    }

    public void angel2(int x) {
        System.out.println(x);
    }
    public int angel3(int x, int y) {
        System.out.println(x);
        System.out.println(y);

        return x + y;
    }

}


