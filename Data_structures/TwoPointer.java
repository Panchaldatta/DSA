public class TwoPointer {
    public static int[] findPair(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int sum = nums[left] + nums[right];
            
            if (sum == target) {
                return new int[]{nums[left], nums[right]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        return new int[]{-1, -1}; // No pair found
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9};
        int target = 12;
        
        int[] pair = findPair(nums, target);
        System.out.println("Pair: " + pair[0] + ", " + pair[1]); // Output: Pair: 3, 9
    }
}
