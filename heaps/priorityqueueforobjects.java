import java.util.*;
public class priorityqueueforobjects{
    public static class obj implements Comparable<obj>{
        int rank;
        String teacher;
        public obj(int rank,String teacher){
            this.rank=rank;
            this.teacher=teacher;
        }
        @Override
        public int compareTo(obj o){
            return this.rank-o.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<obj> pq=new PriorityQueue<>();
        pq.add(new obj(123,"aparna"));
        pq.add(new obj(10,"sridevi"));
        pq.add(new obj(64,"soundarya"));
        pq.add(new obj(34,"tulasi"));
        while(!pq.isEmpty()){
            System.out.println(pq.remove().teacher);
        }

        
    }
}