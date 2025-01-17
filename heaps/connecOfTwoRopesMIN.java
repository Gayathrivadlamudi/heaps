import java.util.*;
public class connecOfTwoRopesMIN {
    public static void main(String[] args){
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        int[] costOFRopes={2,3,3,4,5,6,7};
        for(int i=0;i<costOFRopes.length;i++){
            pq.add(costOFRopes[i]);
        }
        int mina=0;
        int minb=0;
        int cost=0;
        while(pq.size()>1){
            mina=pq.remove();
            minb=pq.remove();
            cost=mina+minb;
            pq.add(cost);
        }
        System.out.println("Minimum cost of ropes is "+cost);
    }
    
}
