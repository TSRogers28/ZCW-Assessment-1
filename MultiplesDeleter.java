
/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */

    public Integer[] deleteEvens(Integer[] ints) {
        int count = 0;
        for(int x : ints){
            if(x%2 != 0)
                count++;
        }

        Integer [] oddsOnly = new Integer [ints.length - count];
        int j = 0;
        for(int x =0; x < ints.length; x++){
            if(x%2 == 0){
                oddsOnly[j] = ints[x];
                j++;
            }
        }
        return oddsOnly;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        int count = 0;
        for(int x : ints){
            if(x%2 == 0)
                count++;
        }

        Integer [] evensOnly = new Integer [ints.length - count];
        int j = 0;
        for(int x =0; x < ints.length; x++){
            if(x%2 != 0){
                evensOnly[j] = ints[x];
                j++;
            }
        }
        return evensOnly;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        int count = 0;
        for(int x : ints){
            if(x%3 == 0)
                count++;
        }

        Integer [] ofNoThrees = new Integer [ints.length - count];
        int j = 0;
        for(int x =0; x < ints.length; x++){
            if(ints[x] % 3 == 0){
                ofNoThrees[j] = ints[x];
                j++;
            }
        }
        return ofNoThrees;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        int count = 0;
        for(int x : ints){
            if(x%2 == 0)
                count++;
        }

        Integer [] oddsOnly = new Integer [ints.length - count];
        int j = 0;
        for(int x =0; x < ints.length; x++){
            if(x%2 != 0){
                oddsOnly[j] = ints[x];
                j++;
            }
        }
        return oddsOnly;
    }
}
