/**
 * https://leetcode.com/problems/sum-of-two-integers/
 * Problem 371. Sum of Two Integers
 * @danieltsoy
 */
public class SumTwoIntsSolution {
    public int getSum(int a, int b) {
         while(b!=0){
			int c = a&b;
			a=a^b;
			b=c<<1;
		}
    return a; 
    }
}