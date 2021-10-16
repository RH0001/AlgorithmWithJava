package chap02;

/*
 * 배열
 *  - 같은 자료형의 변수로 이루어진 구성요소 (component)가 모인것.
 *  - 선언 방식 : int[] a; or int a[];
 */
public class IntArray {
    public static void main(String[] args) {
        int[] a = new int[5];   //선언 및 참조하기

        a[1]=37;    // a[1]에 37을 대입
        a[2]=51;    // a[2]에 51을 대입
        a[4]=a[1] * 2; // a[4]에 a[1] * 2를 대입

        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d] = %d\n", i, a[i]);
        }
    }
}
