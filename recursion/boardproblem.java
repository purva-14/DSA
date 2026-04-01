public class boardproblem{
    static void boardProblem(int currentValue,int endValue,String result){
        if(currentValue>endValue){
            return;
        }
        if(currentValue==endValue){
            System.out.println(result);
            return;
        }
        
        for(int dice=1;dice<=6;dice++){
            boardProblem(currentValue+dice,endValue,result+dice);
        }
    }
    public static void main(String[] args){
        boardProblem(0,10,"");
    }
}