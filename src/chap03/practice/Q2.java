package chap03.practice;

import java.util.Scanner;

//선형 검색 과정 출력
public class Q2 {
    static int seqSearch(int[] array, int length, int key) {
        System.out.print("   |");
        for (int k : array)
            System.out.printf("%4d", k);
        System.out.print("\n---+");
        for(int i = 0; i < 4 * length +2; i++) {
            System.out.print("-");
        }
        System.out.println();

        for (int j = 0; j < length; j++) {
            System.out.print("   |");
            System.out.printf(String.format("%%%ds*\n", (j * 4) + 3), "");
            System.out.printf("%3d|", j);
            for (int k = 0; k < length; k++) {
                System.out.printf("%4d", array[k]);
            }
            System.out.println("\n   |");
            if (array[j] == key)
                return j;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.printf("x[%d]: ", i);
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색할 값 : ");
        int key = stdIn.nextInt();
        int idx = seqSearch(x, num, key);

        if (idx == -1)
            System.out.println("해당 값이 없습니다.");
        else
            System.out.println(key + "은(는) x[" + idx + "]에 있습니다.");
    }
}
