
/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {
        String [] words = sentence.split("\\W+");
        return words;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {
        int i = sentence.indexOf(' ');
        return sentence.substring(0, i);
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        String firstWord = getFirstWord(sentence);

        String reverseStr = reverse(firstWord);

        return reverseStr;
    }

    public static String reverse(String str) {
        char [] brokenStr = str.toCharArray();
        StringBuilder reverseBroken = new StringBuilder();

        for(int x = brokenStr.length-1; x >= 0; x--){
            reverseBroken.append(brokenStr[x]);
        }

        String reverseStr = reverseBroken.toString();

        return reverseStr;
    }

    public static String camelCase(String str) {

        String firstLetter = str.substring(0,1).toUpperCase();
        String reconnected = firstLetter + str.substring(1);
        return reconnected;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        String firstWord = getFirstWord(sentence);
        String reverseStr = reverse(firstWord);
        String camelCased = camelCase(reverseStr);
        return camelCased;
    }

    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
        String firstHalf  = str.substring(0, index);
        String secondHalf = str.substring(index+1);
        return firstHalf + secondHalf;
    }

}
