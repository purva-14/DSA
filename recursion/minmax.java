public class minmax{
    static int[] minmax(int arr[],int index){
        //basecase

        if(index==arr.length){
            int r[]=new int[2];
            r[0]=Integer.MAX_VALUE;
            r[1]=Integer.MIN_VALUE;
            return r;
        }
     //small problem

    int result[]= minmax(arr,index+1);
    //min
    if(result[0]>arr[index]){
        result[0]=arr[index];
    }
    //max
    if(result[1]<arr[index]){
        result[1]=arr[index];
    }
    return result;
    }

    public static void main(String[] args){
    int arr[]={10,20,2,89,23,100,65,10};
    int index=0;
    int result[]=minmax(arr,index);
    System.out.println("Min"+" "+result[0]);
    System.out.println("Max"+" "+result[1]);

    }
}