
import List.LinkedList;
import Queue.*;
import Stack.*;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

//        Array<Integer> arr = new Array<Integer>();
//        for(int i = 0 ; i < 10 ; i ++)
//            arr.addLast(i);
//        System.out.println(arr);
//
//        arr.add(1, 100);
//        System.out.println(arr);
//
//        arr.addFirst(-1);
//        System.out.println(arr);
//
//        arr.remove(2);
//        System.out.println(arr);
//
//        arr.removeElement(4);
//        System.out.println(arr);
//
//        arr.removeFirst();
//        System.out.println(arr);
//
//        for(int i = 0 ; i < 4 ; i ++){
//            arr.removeFirst();
//            System.out.println(arr);
//        }

        // 数组队列和循环数组队列对比
        int optCount = 100000;
        ArrayQueue<Integer> arrayQueue =new ArrayQueue<Integer>();
        double time1 = testQueue(arrayQueue,optCount);
        System.out.println("ArrayQueue, time: "+time1+" s");
        LoopQueue<Integer> loopQueue =new LoopQueue<Integer>();
        double time2 = testQueue(loopQueue,optCount);
        System.out.println("LoopQueue, time: "+time2+" s");
        LinkedListQueue<Integer> linkedListQueue =new LinkedListQueue<Integer>();
        double time3 = testQueue(linkedListQueue,optCount);
        System.out.println("LinkedListQueue, time: "+time3+" s");


        // 链表test
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        for(int i=0;i<5;i++){
//            linkedList.addFirst(i);
//            System.out.println(linkedList);
//        }
//        linkedList.add(2,666);
//        System.out.println(linkedList);
//        linkedList.remove(2);
//        System.out.println(linkedList);

        // 数组栈和链表栈比较
//        int optCount = 100000;
//        ArrayStack<Integer> arrayStack =new ArrayStack<Integer>();
//        double time1 = testStack(arrayStack,optCount);
//        System.out.println("ArrayStack, time: "+time1+" s");
//        LinkedListStack<Integer> linkedListStack =new LinkedListStack<Integer>();
//        double time2 = testStack(linkedListStack,optCount);
//        System.out.println("LinkedListStack, time: "+time2+" s");

    }

    public static double testQueue(Queue<Integer> q, int optCount){
        long startTime = System.nanoTime();
        Random random = new Random();
        for(int i= 0 ;i<optCount;i++){
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        }
        for(int i= 0 ;i<optCount;i++){
            q.dequeue();
        }
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }
    public static double testStack(Stack<Integer> stack, int optCount){
        long startTime = System.nanoTime();
        Random random = new Random();
        for(int i= 0 ;i<optCount;i++){
            stack.push(random.nextInt(Integer.MAX_VALUE));
        }
        for(int i= 0 ;i<optCount;i++){
            stack.pop();
        }
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }
}
