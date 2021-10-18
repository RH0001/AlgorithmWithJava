package chap03.practice;

import java.util.Scanner;

public class Q5 {
    static int binSearch(int[] a, int n, int key) {
        int pl = 0;
        int pr = n - 1;

        do {
            int pc = (pl + pr) / 2;
            if (a[pc] == key) {
                for (; pc > pl; pc--)
                    if (a[pc - 1] < key)
                        break;
                return pc;
            }
            else if (a[pc]<key)
                pl = pc + 1;
            else
                pr = pc -1;
        } while(pl <= pr);

        return -1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수: ");
        int idx = stdIn.nextInt();
        int[] x = new int[idx];

        System.out.print("x[0]: ");
        x[0] = stdIn.nextInt();

        for (int i = 1; i < idx; i++) {
            do {
                System.out.printf("x[%d]: ", i);
                x[i] = stdIn.nextInt();
            }while(x[i] < x[i-1]);
        }

        System.out.print("검색할 값 : ");
        int key = stdIn.nextInt();
        int resultIdx = binSearch(x, idx, key);

        if (resultIdx == -1)
            System.out.println("해당 값이 없습니다.");
        else
            System.out.println(key + "은(는) x[" + resultIdx + "]에 있습니다.");
    }
}
