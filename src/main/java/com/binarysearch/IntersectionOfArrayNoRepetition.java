package com.binarysearch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrayNoRepetition {
    public void displayResult() {
        int[] nums1 = new int[]{4,9,5};
        int[] nums2 = new int[]{9,4,9,8,4};
        int[] num3 = intersection(nums1, nums2);
        for (int num : num3) {
            System.out.println(num);
        }
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);

        Set<Integer> intersection = new HashSet<>();
        for (int num : nums2) {
            if(binarySearch(nums1,num))
            {
                intersection.add(num);
            }
        }

        int[] result = new int[intersection.size()];
        int i=0;
        for (Integer num : intersection) {
            result[i++] = num;
        }
        return result;
    }

    public boolean binarySearch(int[] list, int searchItem) {
        int low = 0;
        int high = list.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (list[mid] == searchItem) {
                return true;
            } else if (list[mid] < searchItem) {
                low = mid +1;
            } else {
                high = mid -1;
            }
        }
        return false;
    }
}
