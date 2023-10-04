package algorithm.study.data_structure.stack;

import java.util.EmptyStackException;

//연습문제 Q1. 스택을 직접 구현해보기
public class Stack {
    private int[] stk;   //스택용 배열
    private int capacity;   //스택의 용량
    private int ptr;    //스택 포인터


    public class EmptyStackException extends RuntimeException {
        public EmptyStackException() {}
    }

    public class OverFlowStackException extends RuntimeException {
        public OverFlowStackException() {}
    }

    public Stack(int maxlen) {
        ptr = 0;
        capacity = maxlen;
        try {
            stk = new int[capacity];
        } catch(OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public int push(int x) throws OverFlowStackException {
        if(ptr >= capacity) throw new OverFlowStackException();
        return stk[ptr++] = x;
    }

    public int pop(int x) throws EmptyStackException {
        if(ptr <= 0) throw new EmptyStackException();
        return stk[--ptr];
    }

    public int peek() throws EmptyStackException {
        if(ptr <= 0) throw new EmptyStackException();
        return stk[ptr - 1];
    }

    public void dump() {
        if(ptr <= 0) {
            System.out.println("스택이 비어있습니다.");
        } else {
            for(int i = 0; i < ptr; i++) {
                System.out.print(stk[i] + " ");
            }
            System.out.println();
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return ptr;
    }
}
