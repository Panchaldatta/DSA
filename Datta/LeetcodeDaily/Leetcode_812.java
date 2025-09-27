// https://leetcode.com/problems/largest-triangle-area/description/?envType=daily-question&envId=2025-09-27


class Solution {
    public double largestTriangleArea(int[][] points) {
        double maxArea = 0.0;
        int n = points.length;
        for (int i = 0; i < n - 2; i++) {
            int[] A = points[i];
            for (int j = i + 1; j < n - 1; j++) {
                int[] B = points[j];
                for (int k = j + 1; k < n; k++) {
                    int[] C = points[k];
                    double area = Math.abs(
                        (A[0] * (B[1] - C[1]) +
                         B[0] * (C[1] - A[1]) +
                         C[0] * (A[1] - B[1])) * 0.5
                    );

                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }
}