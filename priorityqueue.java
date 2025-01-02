import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueue
{
    public static void main(String[] args) {
        Queue list=new PriorityQueue();
        list.offer(3);
        list.offer(34);
        list.offer(8);
        list.offer(4);
        list.offer(112);
        list.offer(3456);
        list.offer(231);
        System.out.println(list);
        System.out.println("remove element: "+list.poll());
        System.out.println("front element: "+list.peek());
        System.out.println("remove element: "+list.poll());
        System.out.println("front element: "+list.peek());

    }
}
