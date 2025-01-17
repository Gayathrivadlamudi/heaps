import java.util.*;
public class priorityqueue{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        //for reverse order you nedd to use Comparator.reverseOrder()
        //PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(5);
        pq.add(3);
        pq.add(3453);
        pq.add(45);
        pq.add(421);
        while(!pq.isEmpty()){
            System.out.println(pq.remove());
        }
    }
}