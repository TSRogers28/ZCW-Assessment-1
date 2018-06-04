
/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

        String firstLetter = str.substring(0,1).toUpperCase();
        String reconnected = firstLetter + str.substring(1);
        return reconnected;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        char [] brokenStr = str.toCharArray();
        StringBuilder reverseBroken = new StringBuilder();

        for(int x = brokenStr.length-1; x >= 0; x--){
            reverseBroken.append(brokenStr[x]);
        }

        String reverseStr = reverseBroken.toString();

        return reverseStr;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        char [] brokenStr = str.toCharArray();
        StringBuilder reverseBroken = new StringBuilder();

        for(int x = brokenStr.length-1; x >= 0; x--){
            reverseBroken.append(brokenStr[x]);
        }

        String reverseStr = reverseBroken.toString();

        String finalStr = reverseStr.substring(0,1).toUpperCase() + reverseStr.substring(1);

        return finalStr;
    }

    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String finalStr = str.substring(1, str.length()-1);
        return finalStr;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String newStr = "";
        for(int x =0; x < str.length(); x++){
            if(Character.isUpperCase(str.charAt(x))){
                newStr += Character.toLowerCase(str.charAt(x));
            }
            else
                newStr += Character.toUpperCase(str.charAt(x));
        }

        return newStr;
    }
}
