/**
 * https://leetcode.com/problems/counting-bits/
 * Problem 338. Counting Bits
 * @danieltsoy
 */
public class Solution {
     int binaryOnes = 0;
     
     public int baseTwo(int number){
         if(number == 0){
             return 0; 
         }else {
            int remainder = number % 2;
            int q = (number - remainder)/2; 
            if (remainder != 0) {
                binaryOnes++;
            }    
            baseTwo(q);
         }
            return binaryOnes;
        }
        
    public int[] countBits(int num) {
       
        int [] solution = new int[num+1];
      
        for(int i = 0; i <= num; i++){
            binaryOnes = 0;
            solution[i] = baseTwo(i);
        }
        return solution;
    }
}