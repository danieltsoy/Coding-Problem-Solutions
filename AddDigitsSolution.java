/**
 * https://leetcode.com/problems/add-digits/
 * Problem 258. Add Digits 
 * @danieltsoy
 */
public class AddDigitsSolution {
    public int addDigits(int num) {
         
        int number = num; // = and int
         
        if(number < 10){
            return number;
        }
       
        LinkedList<Integer> stack = new LinkedList<Integer>();
        
        while (number > 0) {
         stack.push( number % 10 );
         number = number / 10;
        }

        while (!stack.isEmpty()) {
            number =  number + stack.pop();
        }

        return addDigits(number);
    }
}