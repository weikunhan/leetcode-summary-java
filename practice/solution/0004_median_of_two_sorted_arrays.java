class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        
        int low = 0;
        int high = nums1.length;
        double res = -1;
        
        while (low <= high) {
            int a_mid = (low + high) / 2;
            int b_mid = (nums1.length + nums2.length) / 2 - a_mid;
            int a_low = (a_mid != 0) ? nums1[a_mid - 1] : Integer.MIN_VALUE;
            int b_low = (b_mid != 0) ? nums2[b_mid - 1] : Integer.MIN_VALUE;
            int a_high = (a_mid != nums1.length) ? nums1[a_mid] : Integer.MAX_VALUE;
            int b_high = (b_mid != nums2.length) ? nums2[b_mid] : Integer.MAX_VALUE;
            
            if (a_low > b_high) {
                high = a_mid -1;
            } else if (b_low > a_high) {
                low = a_mid + 1;
            } else {
                if (((nums1.length + nums2.length) % 2) != 0) {
                    res = Math.min(a_high, b_high) / 1.0;
                } else {
                    res = (Math.max(a_low, b_low) + Math.min(a_high, b_high)) / 2.0;
                }
                
                return res;
            }
        }
        
        return res;
        
    }
}