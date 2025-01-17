import java.util.*;
public class minOperationToHalveSumArr {
    public static void main(String[] args){
        int[] arr={1,5,8,19};
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            pq.add(arr[i]);
        }
        int halveSum=sum/2;
       int count=0;
        while(sum>halveSum){
            int highEle=pq.remove();
            int highEleHalve=highEle/2;
            pq.add(highEleHalve);
            sum=sum-highEle+highEleHalve;
            count++;

        }
        System.out.println(count);
    }
   
}
