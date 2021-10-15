package chap01.practice;

import java.util.Random;
import java.util.Scanner;

public class Quiz {
    // Q1
    public int max4 (int a, int b, int c, int d) {
        int max = a;

        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;

        return max;
    }

    // Q2
    public int min3(int a, int b, int c) {
        int min = a;

        if (b < min) min = b;
        if (c < min) min = c;

        return min;
    }

    // Q3
    public int min4(int a, int b, int c, int d) {
        int min = a;

        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;

        return min;
    }

    // Q4
    public int med3(int a, int b, int c) {
        if (a >= b)
            if (b >= c)
                return b;
            else if (a <= c)
                return a;
            else
                return c;
        else if (a > c)
            return a;
        else if (b > c)
            return c;
        else
            return b;
    }
    //Q5


    //Q6. SumWhile에서 while 문이 종료될때 변수 i값이 n+1이 됨을 확인하세요.
    // (변수 i값을 출력하도록 프로그램을 수정하세요.)
   public int sumWhile(int n) {
        int sum = 0;
        int i = 1;
        while(i <= n) {
            sum += i;
            i++;
        }
        return sum;
   }

   // Q7. 실습 1-5 프로그램을 참고하여 n이 7이면 '1+2+3+4+5+6+7=28'로 출력하는 프로그램을 작성하세요.
    public int sumSeven(){
        int sum = 0;
        for (int i = 0; i < 8; i++) sum += i;
        return sum;
    }

    // Q8. 가우스의 덧셈을 이용하여 1부터 n까지의 합을 구하는 프로그램을 작성하세요.
    public int sumGa(int n) {
        return (1 + n) * (n /2) + (n%2==0?0:(1+n)/2);
    }


    // Q8. 정수 a, b 를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 아래 메서드를 작성하세요.
    public int sumOf(int a, int b) {
        int max;
        int min;
        int sum = 0;

        if ( a > b) {
            max = a;
            min = b;
        } else if (a == b) {
            return a;
        } else {
            max = b;
            min = a;
        }

        for ( int i = min; i < max+1; i++) {
            sum += i;
        }
        return sum;
    }

    // Q10. 오른쪽과 같이 두 변수 a, b 에 정수를 입력하고 b -a를 출력하는 프로그램을 작성하세요.
//    static int div(int a, int b) {
//        Scanner scanner = new Scanner(System.in);
//        a = scanner.nextInt();
//
//        while (true) {
//            b = scanner.nextInt();
//            if (a < b) {
//                break;
//            }
//            System.out.println("a 보다 큰 값을 입력하세요.");
//        }
//        return b -a;
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("a의 값 : ");
//        int a = scanner.nextInt();
//        int b;
//
//        while (true) {
//            System.out.print("b의 값 : ");
//            b = scanner.nextInt();
//            if (a < b) {
//                break;
//            }
//            System.out.println("a 보다 큰 값을 입력하세요.");
//        }
//        System.out.println("b -a 의 값은 " + (b -a) + "입니다.");
//    }

    // Q11. 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;

        while (true) {
            System.out.print("정수 입력: ");
            input = scanner.nextInt();

            if (input > 0) {
                break;
            }

            System.out.println("양의 정수를 입력하세요.");
        }
        int cnt = 0;
        while (input > 0) {
            input /= 10;
            cnt++;
        }
        System.out.println("그 수의 자릿수는 " + cnt +"입니다.");

    }

    //Q12. 위쪽가 왼쪽에 곱하는 수가 있는 곱셈표를 출력하는 프로그램을 작성하세요.
    public void guguDan() {
        System.out.print("  |");
        for (int i = 1; i <10; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println("\n--+----------------------------");
        for (int i = 1; i <10; i++) {
            System.out.print(i + " |");
            for (int j = 1; j < 10; j++) {
                    System.out.printf("%3d", i * j);
            }
            System.out.println();
        }

    }

    public void plus9() {
        System.out.print("  |");
        for ( int i = 1; i <10; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println("\n--+---------------------------");
        for (int i = 1; i <10; i++) {
            System.out.printf("%d |", i);
            for (int j = 1; j < 10; j++) {
                System.out.printf("%3d", i + j);
            }
            System.out.println();
        }
    }

    public void square(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public void triangleLB(int n) {
        for (int i = 0; i <n+1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void triangleLU(int n) {
        for (int i = 0; i <n+1; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void triangleRU(int n) {
        for (int i = 0; i <n; i++) {
            for(int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void triangleRB(int n) {
        for (int i = 0; i <n; i++) {
            for(int k = n -1; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void spira(int n) {
        for (int i = 0; i <n; i++) {
            for(int k = n -1; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int p = 0; p < i; p++)
                System.out.print("*");
            System.out.println();
        }
    }

    public void npira(int n) {
        for (int i = 0; i <= n; i++) {
            for(int k = n; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(i+1);
            }
            for (int p = 0; p < i; p++)
                System.out.print(i+1);
            System.out.println();
        }
    }
}
