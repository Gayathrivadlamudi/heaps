import java.util.*;
public class kthLargestElement {
    public static class heap{
        PriorityQueue<Integer> minpq=new PriorityQueue<>();
        public ArrayList<Integer> heaps(int[] arr,ArrayList<Integer> list,int k){
            for(int val:arr){
                if(minpq.size()<k){
                    minpq.add(val);
                }
                else {
                    if(val>minpq.peek()){
                        minpq.remove();
                        minpq.add(val);
                    }
                }
                if(minpq.size()>=k){
                    list.add(minpq.peek());
                }
                else{
                    list.add(-1);
                }

            }

            return list;
        }

    }
    public static void main(String[] args){
        int k=3;
        int[] arr={10,20,11,70,50,40,100,65};
        ArrayList<Integer>list=new ArrayList<>();
        heap h=new heap();
        list=h.heaps(arr,list,k);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
    
}
