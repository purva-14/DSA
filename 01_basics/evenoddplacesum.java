public class evenoddplacesum{
    public static void main(String []arg){
        int num=1859;
        int pos=0;
        int rem=0;
        int evensum=0;
        int oddsum=0;
        while(num>0){
         rem=num%10;
         pos++;
         if(pos%2==0){
            evensum=evensum+rem;
         }else{
            oddsum=oddsum+rem;
         }
         num=num/10;
        }
        System.out.println("even sum "+evensum);
         System.out.println("odd sum "+oddsum);

    }
}