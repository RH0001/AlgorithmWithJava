package chap02;

// 실습 2-3
public class CloneArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = a.clone();

        b[3] = 0;

        System.out.print("a =");
        for (int i: a ) {
            System.out.print(" " + i);
        }

        System.out.print("\nb =");
        for (int i : b) {
            System.out.print(" " + i);
        }
    }
}
