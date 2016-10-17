/**
 * https://leetcode.com/problems/reverse-string/
 * Problem 344. Reverse String
 * @danieltsoy
 */
public class ReverseStringSolution {
    public String reverseString(String s) {
        
        char [] tempArray = s.toCharArray();
        int begin=0;
        int end=tempArray.length-1;
        char temp;
        
        while(end>begin){
            temp = tempArray[begin];
            tempArray[begin]=tempArray[end];
            tempArray[end] = temp;
            end--;
            begin++;
        }
        
        return new String(tempArray);
    }
}