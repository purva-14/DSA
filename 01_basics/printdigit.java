public class printdigit{
    public static void main(String[] args){
        int num=69852;
        int cpy=num;
        int cnt=0;
        while(cpy>0){
            cnt++;
            cpy=cpy/10;
        }

        while(num>0){
            int rem=num/(int)Math.pow(10,cnt-1);
            System.out.println(rem);
            num=num%(int)Math.pow(10,cnt-1);
            cnt--;
        }
    }
}