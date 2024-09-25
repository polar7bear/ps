import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        while (n-- > 0) {
            String[] command = br.readLine().split(" ");

            switch (command[0]) {
                case "push":
                    int val = Integer.parseInt(command[1]);
                    stack.push(val);
                    break;

                case "pop":
                    sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
                    break;

                case "size":
                    sb.append(stack.size()).append("\n");
                    break;

                case "empty":
                    sb.append(stack.isEmpty() ? 1 : 0).append("\n");
                    break;

                case "top":
                    sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
            }
        }
        System.out.println(sb);
    }


    static class Stack<T> {
        Node<T> top; // 스택 최상단을 가리키는 포인터
        int size; // 스택 사이즈

        static class Node<T> { // 스택의 각 요소
            T data;
            Node<T> next;

            public Node(T data) {
                this.data = data;
            }
        }

        void push(T data) {
            Node<T> node = new Node<>(data);
            node.next = top;
            top = node;
            size++;
        }

        T pop() {
            if (isEmpty()) throw new EmptyStackException();

            T data = top.data;
            top = top.next;
            size--;
            return data;
        }

        int size() {
            return size;
        }

        T peek() {
            if (isEmpty()) throw new EmptyStackException();
            return top.data;
        }

        boolean isEmpty() {
            return top == null;
        }


    }

}