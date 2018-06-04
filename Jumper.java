 

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int total = 0;
        int getThroughJumpJ = k / j;
        if(k % j == 0){
        total = getThroughJumpJ;
        }
        else{
        int oneJumpsLeft = k % j;
        total = getThroughJumpJ + oneJumpsLeft;}
        
        return total;
    }
}
