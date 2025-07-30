class Solution {
    public int majorityElement(int[] nums) {
        int count = 1, maxElement = 0;
				for(int num: nums) {
					if(count == 1) {
						maxElement = num;
					}
					if(maxElement == num) {
						count++;
					} else {
						count--;
					}
				}

				return maxElement;
    }
}
