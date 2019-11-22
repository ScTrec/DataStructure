
import Queue.*;

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
        int optCount = 100000;
        ArrayQueue<Integer> arrayQueue =new ArrayQueue<Integer>();
        double time1 = testQueue(arrayQueue,optCount);
        System.out.println("ArrayQueue, time: "+time1+" s");
        LoopQueue<Integer> loopQueue =new LoopQueue<Integer>();
        double time2 = testQueue(loopQueue,optCount);
        System.out.println("LoopQueue, time: "+time2+" s");
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
}
