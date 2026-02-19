public class PrimeNum{
    public static void main(String[] args){
        //this is a brute force approach
        int num=5;
        int cnt=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                cnt++;

            }
        }
       System.out.println(cnt==2?"PRIME NUMBER":"NOT A PRIME NUMBER");

       //optamized approach
       //loop should run only till the sqrt of the NUMBER as after that the
       //factors starts to repeat itself
    } 
}