public class heapsort {
    public static void heap(int[] arr){
        //building max heap
        for(int i=arr.length/2;i>=0;i--){
            heapify(arr,i,arr.length);
        }
        //swap last and first index and then hepify it;
        for(int i=arr.length-1;i>0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            //heapify the array again
            heapify(arr,0,i);
        }
    }
    public static void heapify(int[] arr,int i,int size){
        int leftchild=2*i+1;
        int rightchild=2*i+2;
        int maxindx=i;
        if(leftchild<size && arr[maxindx]<arr[leftchild]){
            maxindx=leftchild;
        }
        if(rightchild<size && arr[maxindx]<arr[rightchild]){
            maxindx=rightchild;
        }
        if(maxindx!=i){
            int temp=arr[maxindx];
            arr[maxindx]=arr[i];
            arr[i]=temp;
            heapify(arr, maxindx, size);
        }
    }
    public static void main(String[] args){
      // To get ascending order of an array we need to build max heap
        int[] arr={50,49,48,47,46};
        heap(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
