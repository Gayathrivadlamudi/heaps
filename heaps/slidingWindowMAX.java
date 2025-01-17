import java.util.*;
public class slidingWindowMAX {
    public static class SWM implements Comparable<SWM>{
        int value;
        int indx;
        public SWM(int value,int indx){
            this.value=value;
            this.indx=indx;
        }
        @Override
        public int compareTo(SWM swm){
            return swm.value-this.value;
        }
    }
    public static void main(String[] args){
        int[] arr={50,51,52,53,54};
        int k=2;
        PriorityQueue<SWM>pq=new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(new SWM(arr[i],i));
        }
        int[] res=new int[arr.length-k+1];
        res[0]=pq.peek().value;
        for(int i=k;i<arr.length;i++){
            while(pq.size()>0 && pq.peek().indx<=(i-k)){
                pq.remove();
            }
            pq.add(new SWM(arr[i],i));
            res[i-k+1]=pq.peek().value;
        }
        for(int i=0;i<res.length;i++){
            System.out.println("the reslutant maximum array is "+ res[i]);
        }

    }
}
