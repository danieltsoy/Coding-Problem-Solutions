/**
 * https://leetcode.com/problems/single-number/
 * Problem 136. Single Number
 * @danieltsoy
 */
 public class SingleNumberSolution {
    public int singleNumber(int[] nums) {
        int x = 0;
	for (int a : nums) {
		x = x ^ a;
	}
	return x;
}
}