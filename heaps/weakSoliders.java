import java.util.*;
public class weakSoliders {
    public static class soliders implements Comparable<soliders>{
        int soliderCount;
        int indx;
        public soliders(int soliderCount,int indx){
            this.soliderCount=soliderCount;
            this.indx=indx;
        }
        @Override
        public int compareTo(soliders sol){
            if(this.soliderCount==sol.soliderCount){
                return this.indx-sol.indx;
            }
            else{
                return this.soliderCount-sol.soliderCount;
            }
        }
    }
    public static void main(String[] args){
        int k=2;
        PriorityQueue<soliders>pq=new PriorityQueue<>();
        int[][] soliderss={{1,0,0,0,0},
                           {1,1,1,0,0},
                           {1,0,0,1,1},
                           {1,1,1,1,1},
                           {1,0,1,0,1}};
        
        for(int i=0;i<soliderss.length;i++){
            int countSoliders=0;
            for(int j=0;j<soliderss[i].length;j++){
                if(soliderss[i][j]==1){
                    countSoliders++;
                }
            }
            pq.add(new soliders(countSoliders,i));
        }
        for(int i=0;i<k;i++){
            System.out.println("weakest soliders are but not so weak because they can overcome anything"+" "+pq.remove().indx);
        }
    }
    
}
