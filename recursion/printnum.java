public class printnum{
    static void printdigit(int num){
     //basecase
     if(num==0){
        return;
     }
     printdigit(num/10);
     System.out.println(num%10);
    }
    public static void main(String[] args){
       printdigit(12345);
    }
}