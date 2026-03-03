public class multipleElement{
static int[] findAllHelper(int arr[],int index,int search,int cnt){
    //basecase
    if(index==arr.length){
     int result[]=new int[cnt];
     return result;
    }

    if(arr[index]==search){
        cnt++;
    }
   
    //samll problem
   int result[]= findAllHelper(arr,index+1,search,cnt);
   if(arr[index]==search){
    result[cnt-1]=index;
   }
   return result;
}


static int[] findAll(int arr[],int index,int search){
 return findAllHelper( arr,index, search, 0);
}


    public static void main(String[] args){
     int arr[]={10,20,50,40,50,60,50};
     int index=0;
     int search=50;
     

     int result[]=findAll(arr,index,search);
       for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}