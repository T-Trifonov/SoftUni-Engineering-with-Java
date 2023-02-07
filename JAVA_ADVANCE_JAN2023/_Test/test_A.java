package _Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class test_A {

    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();

        deque.offer("1");
        deque.offer("2");
        deque.offer("3");
        deque.offer("4");
        deque.offer("5");


        System.out.println(deque.poll());

        deque.addLast("a");
        deque.addFirst("z");


        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println(stack.pop());

        stack.addLast(10);
        stack.addFirst(20);



    }
}
