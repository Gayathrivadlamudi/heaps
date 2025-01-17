import java.util.*;
public class nearbycars {
    public static class prorityheap implements Comparable<prorityheap>{
        int x;
        int y;
        int distsq;
        int indx;
        public prorityheap(int x,int y,int distsq,int indx){
            this.x=x;
            this.y=y;
            this.distsq=distsq;
            this.indx=indx;
        }
        @Override
        public int compareTo(prorityheap obj){
            return this.distsq-obj.distsq;
        }

    }
    public static void main(String[] args){
        int[][] cars={{3,3},{5,-1},{-2,4}};
        int k=2;
        PriorityQueue<prorityheap> pq=new PriorityQueue<>();
        for(int i=0;i<cars.length;i++){
            int distsq=cars[i][0]*cars[i][0]+cars[i][1]*cars[i][1];
            pq.add(new prorityheap(cars[i][0],cars[i][1],distsq,i));
        }
        for(int i=0;i<k;i++){
            System.out.println("C"+pq.remove().indx);
        }

    }
    
}
