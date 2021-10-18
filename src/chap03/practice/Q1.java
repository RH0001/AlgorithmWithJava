package chap03.practice;

import java.util.Scanner;

public class Q1 {

    static int seqSearchSen(int[] array, int length, int key) {
        int i;
        array[length] = key;
        for (i =0; i < length; i++) {
            if (array[i] == key)
                break;
        }
        return i == length ? -1 : i;
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
