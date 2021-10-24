package chap04;

public class IntStack {
    private int ptr;    // 현재 스택에 쌓여있는 데이터의 갯수
    private int max;        // 스택의 용량
    private int stk[];

    // 실행 예외 : 스텍이 비어있음
    public class EmptyIntStackException extends RuntimeException{
        public EmptyIntStackException() {}
    }

    // 실행 예외 : 스텍이 가득 차 있음
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {}
    }

    // 스텍 생성
    public IntStack(int capacity) {
        ptr = 0;
        max = capacity;

        try{
            stk = new int[max];
        }catch (OutOfMemoryError error) {
            max = 0;
        }
    }

    // 스택에 데이터(x)를 푸시
    public int push(int x) throws OverflowIntStackException {
        if (ptr == max)
            throw new OverflowIntStackException();
        return stk[ptr++] = x;
    }

    // 스택에서 데이터(x)를 pop
    public int pop() throws EmptyIntStackException {
        if (ptr <= 0)
            throw new EmptyIntStackException();
        return stk[--ptr];
    }

    // 스텍에서 데이터 엿보기 peak 하기
    public int peak() throws EmptyIntStackException {
        if (ptr <= 0)
            throw new EmptyIntStackException();
        return stk[ptr-1];
    }

    // 검색 메서드 indexOf
    public int indexOf(int x) {
        for (int i = ptr -1; i >= 0; i--)
            if (stk[i] == x)
                return i;
        return -1;
    }

    // 스텍의 모든 요소를 삭제하는 clear
    public void clear() {
        ptr = 0;
    }

    // 스택의 용량을 확인
    public int capacity() {
        return max;
    }

    // 데이터 수를 확인
    public int size() {
        return ptr;
    }

    // 스텍이 비어있는 지 여부
    public boolean isEmpty() {
        return ptr <= 0;
    }

    // 스텍이 가득 차있는지 확인
    public boolean isFull() {
       return ptr >= max;
    }

    // 스택의 모든 요소 확인
    public void dump() {
        if (ptr <= 0)
            System.out.println("Stack is empty");
        else
            for (int i = 0; i < ptr; i++)
                System.out.print(stk[i] + " 택");
        System.out.println();
    }

}
