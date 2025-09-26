// https://leetcode.com/problems/valid-triangle-number/description/?envType=daily-question&envId=2025-09-26

class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int ans = 0, n = nums.length;
        for(int i = 2; i < n; i++){
            int l = 0, r = i - 1;
            while(l < r){
                if(nums[l] + nums[r] > nums[i]){
                    ans += (r - l);
                    r--;
                }
                else l++;
            }
        }
        return ans;
    }
}