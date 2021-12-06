import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] newArray = new int [nums1.length + nums2.length];
        System.arraycopy(nums1, 0, newArray, 0, nums1.length);  
        System.arraycopy(nums2, 0, newArray, nums1.length, nums2.length);
        int max = -999999;
        Arrays.sort(newArray);
        int i;
        for (i = 0; i < newArray.length; i += 1){
            if(newArray[i] > max){
                max = newArray[i];
            }
        }
        if(newArray.length % 2 == 0){
            int median1 = newArray[(i / 2) - 1];
            int median2 = newArray[(i / 2)];
            double median = (median1 + median2) / 2.0;
            return median;
        }
        else {
            double median = newArray[i / 2];
            return median;
        }
    }
}
