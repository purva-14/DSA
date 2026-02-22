public class rotatenum{
    public static void main(String[]args){
        int num=12345;
        int cpy=num;
        int rot=2;
          int rev=0;
          int cnt=0;
          while(cpy>0){
            cnt=cnt+1;
            cpy=cpy/10;
          }
       
            rev=num%(int) Math.pow(10,rot);
            num=num/(int)Math.pow(10,rot);
            int ans=(rev*(int)Math.pow(10,cnt-rot))+num;
    
        
        System.out.println(ans);
    }
}