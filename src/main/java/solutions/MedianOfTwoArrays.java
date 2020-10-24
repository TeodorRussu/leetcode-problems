package solutions;

public class MedianOfTwoArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        int med1 = 0;
        int med2 = 0;
        for (int i = 0, index1 = 0, index2 = 0; i <= totalLength / 2; i++) {
            int temp;
            if (index1 == nums1.length) {
                temp = nums2[index2++];
            } else if (index2 == nums2.length) {
                temp = nums1[index1++];
            } else if (nums1[index1] < nums2[index2]) {
                temp = nums1[index1++];
            } else {
                temp = nums2[index2++];
            }

            if (i == totalLength / 2 - 1) {
                med1 = temp;
            }else if (i == totalLength/2){
                med2 = temp;
                break;
            }
        }
        return  totalLength % 2 == 0 ? ((double)(med1 + med2)) / 2 : (double) med2;
    }
}
