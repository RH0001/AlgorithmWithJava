package chap01;

import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1 부터 n 까지의 합을 구합니다.");
        System.out.print("n의 값 : ");

        int n = scan.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.printf("1 부터 %d 까지의 합은 %d 입니다.", n, sum);

        int i = 1;
        while (1 <= n) {
            sum +=i;
            i++;
        }
        System.out.println();
    }
}
