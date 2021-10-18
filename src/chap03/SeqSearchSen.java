package chap03;

import java.util.Scanner;

public class SeqSearchSen {
    static int seqSearchSen(int[] a, int n, int key) {
        int i = 0;

        //보초값
        a[n] = key;

        while (true) {
            if (a[i] == key)
                break;
            i++;
        }

        return i == n ? -1: i;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = stdIn.nextInt();

        // 보초값을 추가하기 위해 num + 1을 진행한다.
        int[] x = new int[num + 1];

        for (int i = 0; i < num; i++) {
            System.out.printf("x[%d]: ", i);
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색할 값 : ");
        int key = stdIn.nextInt();

        int idx = seqSearchSen(x, num, key);

        if (idx == -1)
            System.out.println("해당 값이 없습니다.");
        else
            System.out.println(key + "은(는) x[" + idx + "]에 있습니다.");
    }
}
