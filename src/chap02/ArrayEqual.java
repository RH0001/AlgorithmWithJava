package chap02;

import java.util.Scanner;

public class ArrayEqual {
    static boolean equals(int[] a, int[] b) {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++ )
            if (a[i] != b[i])
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("배열 A의 요솟수 : ");
        int index = scanner.nextInt();

        int[] a = new int[index];

        for (int i = 0; i < a.length;i++) {
            System.out.println(i+1 + ": ");
            a[i] = scanner.nextInt();
        }

        System.out.print("배열 B의 요솟수 : ");
        index = scanner.nextInt();

        int[] b = new int[index];

        for (int i = 0; i < b.length;i++) {
            System.out.println(i+1 + ": ");
            b[i] = scanner.nextInt();
        }

        System.out.println("배열 a와 b는 " + (equals(a, b) ? "같습니다." : "같지 않습니다."));

    }
}
