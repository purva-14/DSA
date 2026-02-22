public class angstrom{
    public static void main(String[] args){
        int num=153;
        int cpy2=num;
        int cpy=num;
        int cnt=0;
        int rem=0;
        int sum=0;
        while(cpy>0){
         cnt++;
         cpy=cpy/10;
         }

         while(num>0){
            rem=num%10;
            sum=sum+ (int)Math.pow(rem,cnt);
            num=num/10;
         }
         if(sum==cpy2){
           System.out.println("it is an angstrom number");
         }else{
            System.out.println("it is not an angstrom number");
         }
    }
}