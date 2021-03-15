package com.binarysearch;

public class FindMedianOf2SortedArray {
    public void display() {
        int[] num1 = new int[]{1, 10, 10, 10, 10};
        int[] num2 = new int[]{1, 10, 10, 10, 10};
        double medianSortedArrays = findMedianSortedArrays(num1, num2);
        System.out.println(medianSortedArrays);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int mid1 = 0;
        int mid2 = 0;
        int i = 0;
        int j = 0;
        while (i+j <= (n + m) / 2 + 1) {
           int k =0;
            if (nums1[i] < nums2[j]) {
                k = i;
                i++;
            } else {
                k = j;
                j++;
            }

            if (i+j == (n+m)/2){

            } else if (i+j == (n+m)/2 +1){

            }
        }
        return (n+m)%2 == 0 ? (mid1) : 0;
    }
}
