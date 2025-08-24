public class Main{
    public static void main(String[] args) {
        
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        int[] sortedArr = mergeSort(arr);
        System.out.println("Sorted Array: ");
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(java.util.Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(java.util.Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    // You need to implement the merge method as well
    static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }
        return result;
    }
}