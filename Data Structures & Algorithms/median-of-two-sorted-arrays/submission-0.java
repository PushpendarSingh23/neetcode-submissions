class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int[] arr = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        // Merge the arrays
        while (i < m && j < n) {

            if (nums1[i] <= nums2[j]) {
                arr[k++] = nums1[i++];
            } else {
                arr[k++] = nums2[j++];
            }
        }

        // Remaining elements of nums1
        while (i < m) {
            arr[k++] = nums1[i++];
        }

        // Remaining elements of nums2
        while (j < n) {
            arr[k++] = nums2[j++];
        }

        int len = m + n;

        // Even length
        if (len % 2 == 0) {
            return (arr[len / 2] + arr[(len / 2) - 1]) / 2.0;
        }

        // Odd length
        return arr[len / 2];
    }
}