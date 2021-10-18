package chap03;

import java.util.Scanner;

//선형검색
public class SeqSearch {
    // 요솟수가 n인 배열 a에서 key와 같은 요소를 선형검색합니다.
    static int seqSearch(int[] a, int n, int key) {
//        int i = 0;
//
//        while(true) {
//            if (i==n)
//                return -1;
//            if (a[i] == key)
//                return i;
//            i++;
//        }

        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                return i;
            }
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
