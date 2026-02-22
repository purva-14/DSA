public class strongnum{
    public static void main(String []args){
        int num=145;
        int cpy=num;
       int sum=0;
      
       while(num>0){
         int rem=0;
          int fact=1;
        rem=num%10;
        while(rem!=1){
            fact=fact*rem;
            rem=rem-1;
        }
        sum=sum+fact;
        num=num/10;
       }
        if(cpy==sum){
            System.out.println("it is a strong number");
        }else{
            System.out.println("not a strong number");
        }
    }
}