public class flipnum{
    public static void main(String[] args){
        int pos=0;
        int num=32145;
        int sum=0;
        while(num>0){
            int singledigit=num%10;
            pos++;
            int pow=(int)Math.pow(10,singledigit-1);
            sum=sum+pow*pos;
            num=num/10;
        }
        System.out.println(sum);
    }
}