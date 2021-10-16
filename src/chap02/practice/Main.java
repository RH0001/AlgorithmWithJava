package chap02.practice;

public class Main {
    public static void main(String[] args) {
        Quizzes q = new Quizzes();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Q1. 키뿐만 아니라 사람 수도 난수로 생성하도록 실습 2-5를 수정하여 프로그램을 만드세요.");
        q.q1();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Q2. 요소를 역순으로 정렬하는 과정을 하나 나타내는 프로그램을 작성하세요.");
        q.q2();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Q3. 배열 a의 모든 합계를 구하여 반환하는 메서드를 작성하세요.");
        System.out.println("합계 : " + q.q3());
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Q4. 배열 b의 모든 요소를 배열 a에 복사하는 메서드를 작성하세요.");
        int[] original = {1, 2, 3, 4, 6, 7};
        int[] copy = {6,7,8,9,1};
        int[] result = q.q4(copy, original);
        for(int i: result) {
            System.out.println(i);
        }
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Q5. 배열 b의 모든 요소를 배열 a에 복사하는 메서드를 작성하세요.");
        original = new int[]{1, 2, 3, 4, 6, 7};
        copy = new int[]{9, 8, 7, 6};
        q.q5(copy, original);
        System.out.println("-------------------------------------------------------------------------");
    }
}
