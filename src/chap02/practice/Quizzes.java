package chap02.practice;

import java.util.Random;

public class Quizzes {
    Random random = new Random();
    // Q1. 키뿐만 아니라 사람 수도 난수로 생성하도록 실습 2-5를 수정하여 프로그램을 만드세요.
    public void q1() {
        int people = random.nextInt(10);
        int[] result = new int[people];

        System.out.println("사람 수 : " + people);
        System.out.print("키 :");
        for (int i = 0; i < people; i++) {
            result[i] = 100 + random.nextInt(90);
            System.out.print(" "+  result[i]);
        }
        System.out.println();
    }

    public void q2_swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    public void q2_reverse(int[] a) {
        for (int i = 0; i < a.length/2; i++) {

            System.out.printf("배열에서 a[%d]과(와) a[%d]를 교환합니다.->", i, a.length -i -1);
            q2_swap(a, i, a.length -i -1);
            for (int j : a) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }

    public void q2() {
        int[] array = new int[random.nextInt(10)];
        System.out.print("\t\t\t\t\t\t  원래 배열 :");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(" " + array[i]);
        }
        System.out.println();
        q2_reverse(array);
    }

    public int q3() {
        int[] a = new int[random.nextInt(10)];
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10);
            sum += a[i];
            System.out.print(" " + a[i]);
        }
        System.out.println();
        return sum;
    }

    public int[] q4(int[] copyArray , int[] originalArray) {
        int num = copyArray.length <= originalArray.length ? copyArray.length:originalArray.length;
        for (int i = 0; i < num; i++) {
            copyArray[i] = originalArray[i];
        }
        return copyArray;
    }

    public void q5(int[] copyReverseArray, int[] originalArray) {

        System.out.print(" 원래 배열 :");
        for (int k : originalArray) {
            System.out.print(" " + k);
        }
        System.out.println();

        System.out.print("카피 될 배열 :");
        for (int k : copyReverseArray) {
            System.out.print(" " + k);
        }
        System.out.println();

        int num = Math.min(copyReverseArray.length, originalArray.length);
        for(int i = 0; i < num; i++) {
            copyReverseArray[i] = originalArray[i];
        }
        int[] result = q4(copyReverseArray, originalArray);


        System.out.print("\t\t\t\t\t   copy 된 배열 :");
        for (int j : result) {
            System.out.print(" " + j);
        }

        System.out.println();
        q2_reverse(result);
    }

    //p.70
    public void q6() {

    }

    public void q7(){
    }
}
