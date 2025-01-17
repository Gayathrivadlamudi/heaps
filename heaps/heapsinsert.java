import java.util.*;
public class heapsinsert {
    public static class heaps{
        ArrayList<Integer> list=new ArrayList<>();
        public void add(int num){
            list.add(num);
            int child=list.size()-1;
            int parent=(child-1)/2;
            while(list.get(parent)>list.get(child)){
                int temp=list.get(child);
                list.set(child,list.get(parent));
                list.set(parent,temp);
                child=parent;
                parent=(child-1)/2;
            }
        }
        public int peek(){
            return list.get(0);
        }
        public int remove(){
            int data=list.get(0);
            //swap first and last elements in visulized tree
            int temp=list.get(0);
            list.set(0,list.get(list.size()-1));
            list.set(list.size()-1,temp);
            //delete last element which we swapped
            list.remove(list.size()-1);
            //we need set the tree again after deleting
            heapify(0);

            return data;
        }
        public void heapify(int i){
            int minindx=i;
            int leftchild=2*i+1;
            int rightchild=2*i+2;
            if(leftchild<list.size() && list.get(minindx)>list.get(leftchild)){
                minindx=leftchild;
            }
            if(rightchild<list.size() && list.get(minindx)>list.get(leftchild)){
                minindx=rightchild;
            }
            if(minindx!=i){
                //now swap
                int temp=list.get(i);
                list.set(i,list.get(minindx));
                list.set(minindx,temp);
                heapify(minindx);
            }
        }
        public boolean isEmpty(){
            return list.size()==0;
        }

    }
    public static void main(String[] args){
        heaps hp=new heaps();
        hp.add(59);
        hp.add(49);
        hp.add(48);
        hp.add(47);
        hp.add(46);
        while(!hp.isEmpty()){
            System.out.println(hp.remove());
        }


    }
    
}
