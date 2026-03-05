import java.util.*;
public class rearrangearray{
   static int maxEqualPieces(int[]nums){
        int n=nums.length;
        Map<Integer,Integer>map=new HashMap<>();
        int max=0;
        for(int num:nums){
            int freq=map.getOrDefault(num,0)+1;
            map.put(num,freq);
            max=Math.max(max,freq);
           
           }
           if(max<=(n+1)/2){
            return n;
           }
           return 2*(n-max)+1;
     
    }
    public static void main(String[]args){
        int[] nums={1,1,1,2,2,3,3};
        System.out.println(maxEqualPieces(nums));
    }
}