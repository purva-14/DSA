public class reversenum{
    public static void main(String[] args){
        int rev=0;
        int sum=0;
        int num=123;
        while(num>0){
            rev=num%10;
            sum=sum*10+rev;
            num=num/10;
        }
        System.out.println(sum);
    }
}