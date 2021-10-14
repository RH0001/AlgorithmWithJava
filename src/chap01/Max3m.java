package chap01;

import java.util.Random;

public class Max3m {
    public static int max3 (int a, int b, int c) {
        int max = a;
        if (b > max ) max = b;
        if (c > max) max = c;

        return max;
    }

    public static void main(String[] args) {
        Random ran = new Random();
        int a, b, c;

        for ( int i = 0; i < 10; i ++ ){
            a = ran.nextInt(10); b = ran.nextInt(10); c = ran.nextInt(10);
            System.out.printf("세 수 (%d, %d, %d) 중 최대값은 %d 입니다.\n", a, b, c, max3(a, b, c));
        }

    }
}
