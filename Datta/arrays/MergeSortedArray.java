class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index=m+n-1,backPointer1=m-1,backPointer2=n-1;  
        while(backPointer1>=0 && backPointer2>=0){
            if(nums1[backPointer1] > nums2[backPointer2]) nums1[index] = nums1[backPointer1--];
            else nums1[index] = nums2[backPointer2--];
            index--;
        }
        while(backPointer1>=0) nums1[index--] = nums1[backPointer1--];
        while(backPointer2>=0) nums1[index--] = nums2[backPointer2--];
    }
