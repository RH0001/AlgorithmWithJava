package chap03.practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {
    static int searchIdx (int[] a, int n, int key) {

        int i;
        int cnt = 0;
        ArrayList<Integer> idx = new ArrayList<Integer>();

        for (i = 0; i < n; i++) {
            if (a[i] == key) {
                idx.add(i);
            }
        }

        return idx.isEmpty() ? -1 : idx.size();
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
        int idx = searchIdx(x, num, key);

        if (idx == -1)
            System.out.println("해당 값이 없습니다.");
        else {
            System.out.println(key + "은(는) x[" + idx + "]에 있습니다.");
            System.out.println(idx);

        }
    }
}
