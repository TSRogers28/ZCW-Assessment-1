 import java.lang.*;

public class Palindrome {

    public Integer countPalindromes(String input){
        StringBuilder builder = new StringBuilder();
        int count = 0;
        char [] inputToChar = input.toCharArray();
        int i1 =0;
        int i2 = inputToChar.length -1;
        
        int x1 = 0;
        int x2 = inputToChar.length -1;
        while (i2 > i1){
        if (inputToChar[i1] == inputToChar [i2]){
                count++;
        }
        i1++;
        i2--;
    }
    
    while(x2 > x1){
    String tester = input.substring(x2 , x1);
    if (tester.equals(new StringBuilder(tester).reverse().toString())){
    count++;
    }
    x2--;
    }
    
    
    
    int individualLetters = input.length();
    int total = count + individualLetters;
        return total;
    }
    
    public Boolean isPlaindrome(char [] array){
     {
    return array.toString().equals(new StringBuilder(array.toString()).reverse().toString());
    
    }
}
}
