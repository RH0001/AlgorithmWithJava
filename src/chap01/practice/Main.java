package chap01.practice;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random ran = new Random();
        Quiz q1 = new Quiz();
        int a, b, c, d;

        System.out.println("Q1. 네 값의 최댓값을 구하는 max4 메서드를 작성하세요.");
        for ( int i = 0; i < 10; i ++ ){
            a = ran.nextInt(10); b = ran.nextInt(10); c = ran.nextInt(10); d = ran.nextInt(10);
            System.out.printf("\t %d, %d, %d, %d 수 중 최대값은 %d 입니다.\n", a, b, c, d, q1.max4(a, b, c, d));
        }
        System.out.println("----------------------------------------------");
        System.out.println("Q2. 세 값의 최솟값을 구하는 min3 메서드를 작성하세요.");
        for ( int i = 0; i < 10; i ++ ){
            a = ran.nextInt(10); b = ran.nextInt(10); c = ran.nextInt(10);
            System.out.printf("\t %d, %d, %d 수 중 최소값 %d 입니다.\n", a, b, c, q1.min3(a, b, c));
        }
        System.out.println("----------------------------------------------");
        System.out.println("Q3. 네 값의 최소값을 구하는 min4 메서드를 작성하세요.");
        for ( int i = 0; i < 10; i ++ ){
            a = ran.nextInt(10); b = ran.nextInt(10); c = ran.nextInt(10); d = ran.nextInt(10);
            System.out.printf("\t %d, %d, %d, %d 수 중 최소값 %d 입니다.\n", a, b, c, d, q1.min4(a, b, c, d));
        }

        System.out.println("----------------------------------------------");
        System.out.println("Q4");
        for ( int i = 0; i < 10; i ++ ){
            a = ran.nextInt(10); b = ran.nextInt(10); c = ran.nextInt(10);
            System.out.printf("\t %d, %d, %d 수 중 중앙값은 %d 입니다.\n", a, b, c, q1.med3(a, b, c));
        }

        System.out.println("-----------------------------------------------");
        System.out.println("Q6");
        a = ran.nextInt(10);
        System.out.println("1부터 "+ a + "까지 합 : " +q1.sumWhile(a));

        System.out.println("-----------------------------------------------");
        System.out.println("Q7");
        System.out.println("1부터 7까지 합 : " +q1.sumSeven());

        System.out.println("-----------------------------------------------");
        System.out.println("Q8");
        a = ran.nextInt(10);
        System.out.println("1부터 "+ 7 + "까지 합 : " +q1.sumGa(7));

        System.out.println("-----------------------------------------------");
        System.out.println("Q9");
        a = ran.nextInt(10);
        b = ran.nextInt(10);
        System.out.printf("%d 부터 %d 의 합 : %d\n", a , b, q1.sumOf(a, b));

        System.out.println("-----------------------------------------------");
        System.out.println("Q10.");
//        System.out.print("1 - 2의 값은 ?" + q1.div(1, 2));

        System.out.println("------------------------------------------------");
        System.out.println("Q12.");
        q1.guguDan();

        System.out.println("------------------------------------------------");
        System.out.println("Q13.");
        q1.plus9();

        System.out.println("------------------------------------------------");
        System.out.println("Q14.");
        q1.square(5);

        System.out.println("------------------------------------------------");
        System.out.println("Q15.");
        System.out.println("왼쪽 아래가 직각인 이등변 삼각형");
        q1.triangleLB(5);
        System.out.println();

        System.out.println("왼쪽 위가 직각인 이등병 삼각형");
        q1.triangleLU(5);

        System.out.println("오른쪽 아래가 직각인 이등변 삼각형");
        q1.triangleRB(5);
        System.out.println();

        System.out.println("오른쪽 위가 직각인 이등변 삼각형");
        q1.triangleRU(5);

        System.out.println("------------------------------------------------");
        System.out.println("Q16. n단의 피라미드를 출력하는 메서드를 작성.");
        q1.spira(5);

        System.out.println("------------------------------------------------");
        System.out.println("Q17. n단의 숫자 피라미드를 출력하는 메서드를 작성.");
        q1.npira(5);

    }
}
