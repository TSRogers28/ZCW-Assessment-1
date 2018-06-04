 

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int sum = 0;
        for(int x =0; x < n; x++){
        sum +=x;
        }
        return sum;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 1 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        int sum = 1;
        for(int x = 1; x < n; x++){
        sum *=x;
        }
        return sum;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        int reversedNum = 0;
        while(val != 0){
        reversedNum = reversedNum * 10 + val % 10;
        val = val/10;
        }
        

        return reversedNum;
    }
}
