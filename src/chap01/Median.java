package chap01;

import java.util.Scanner;

public class Median {

    static int med3(int a, int b, int c) {
        if (a >= b)
            if (b >= c)
                return b;
            else if (a <= c)
                return a ;
            else
                return c;
        else if (a > c)
            return a;
        else if (b > c)
            return c;
        else
            return b;

    }

    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        System.out.println("세 수의 중앙 값을 구합니다.");
        System.out.print("a의 값 : "); int a = san.nextInt();
        System.out.print("b의 값 : "); int b = san.nextInt();
        System.out.print("c의 값 : "); int c = san.nextInt();

        System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
    }
}
