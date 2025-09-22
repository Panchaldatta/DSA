// https://leetcode.com/problems/count-elements-with-maximum-frequency/



class Solution {
    public int maxFrequencyElements(int[] nums) {
        byte[] freq = new byte[101];
        byte max = 0, res = 0;
        for (int n : nums) {
            byte f = ++freq[n];
            if (f > max) {
                max = f; 
                res = f;
            } else if (f == max) 
                res += f;
        }
        return res;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,3,2,2,5,2,3,7};
        System.out.println("test: " + sol.maxFrequencyElements(nums));
    }
}