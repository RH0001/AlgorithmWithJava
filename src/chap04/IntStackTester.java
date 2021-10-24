package chap04;


import java.util.Scanner;

public class IntStackTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntStack s = new IntStack(64);

        while (true) {
            System.out.println("--------------------------------------------------");
            System.out.println("현재 데이터의 수 : " + s.size() + " / " + s.capacity());
            System.out.println("1. push \t2. pop \t3.peak \t4. dump \t" + "0. exit");
            System.out.print(": ");
            int input = scanner.nextInt();
            System.out.println("--------------------------------------------------");

            if (input == 0) break;

            int x;
            switch (input) {
                case 1: //push
                    System.out.print("입력할 데이터 : ");
                    x = scanner.nextInt();
                    try {
                        s.push(x);
                    } catch (IntStack.OverflowIntStackException e) {
                        System.out.println("스텍이 가득 차있습니다.");
                    }
                    break;

                case 2: //pop
                    try {
                        System.out.println("pop 한 데이터: " + s.pop());
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어있습니다.");
                    }
                    break;

                case 3: //peak
                    try {
                        System.out.println("peak 한 데이터: " + s.peak());
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어있습니다.");
                    }
                    break;

                case 4: //dump
                    s.dump();
                    break;

                default:
                    System.out.println("메뉴에 나타나있는 숫자만 입력해주세요.");
            }
        }
    }
}
