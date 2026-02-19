public class PrimeNum{
    public static void main(String[] args){
        int num=27;
        int cnt=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                cnt++;

            }
        }
       System.out.println(cnt==2?"PRIME NUMBER":"NOT A PRIME NUMBER");
    } 
}