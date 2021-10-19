package chap03.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int length = scan.nextInt();

        int[] x = new int[length];

        System.out.println("오름차순으로 입력을 받습니다.");
        System.out.print("x[0]: ");
        x[0] = scan.nextInt();

        for (int i = 1; i < length; i++) {
            do {
                System.out.printf("x[%d]: ", i );
                x[i] = scan.nextInt();
            } while (x[i] < x[i -1]);
        }

        System.out.print("검색 할 값: ");
        int key = scan.nextInt();

        int result = Arrays.binarySearch(x, key);

        if (result < 0)
            System.out.println("삽입 포인트: " + result);
        else
            System.out.println(result + 1 + "번째에 존재합니다.");
    }
}
