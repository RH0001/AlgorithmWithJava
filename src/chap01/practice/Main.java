package chap01.practice;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random ran = new Random();
        Quiz q1 = new Quiz();
        int a, b, c, d;

        System.out.println("Q1. 네 값의 최댓값을 구하는 max4 메서드를 작성하세요.");
        for ( int i = 0; i < 10; i ++ ){
            a = ran.nextInt(10); b = ran.nextInt(10); c = ran.nextInt(10); d = ran.nextInt(10);
            System.out.printf("\t %d, %d, %d, %d 수 중 최대값은 %d 입니다.\n", a, b, c, d, q1.max4(a, b, c, d));
        }
        System.out.println("----------------------------------------------");
        System.out.println("Q2. 세 값의 최솟값을 구하는 min3 메서드를 작성하세요.");
        for ( int i = 0; i < 10; i ++ ){
            a = ran.nextInt(10); b = ran.nextInt(10); c = ran.nextInt(10);
            System.out.printf("\t %d, %d, %d 수 중 최소값 %d 입니다.\n", a, b, c, q1.min3(a, b, c));
        }
        System.out.println("----------------------------------------------");
        System.out.println("Q3. 네 값의 최소값을 구하는 min4 메서드를 작성하세요.");
        for ( int i = 0; i < 10; i ++ ){
            a = ran.nextInt(10); b = ran.nextInt(10); c = ran.nextInt(10); d = ran.nextInt(10);
            System.out.printf("\t %d, %d, %d, %d 수 중 최소값 %d 입니다.\n", a, b, c, d, q1.min4(a, b, c, d));
        }

        System.out.println("----------------------------------------------");
        System.out.println("Q4");
        for ( int i = 0; i < 10; i ++ ){
            a = ran.nextInt(10); b = ran.nextInt(10); c = ran.nextInt(10);
            System.out.printf("\t %d, %d, %d 수 중 중앙값은 %d 입니다.\n", a, b, c, q1.med3(a, b, c));
        }
    }
}
