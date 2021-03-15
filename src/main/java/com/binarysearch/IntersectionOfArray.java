package com.binarysearch;

import java.lang.reflect.Array;
import java.util.*;

public class IntersectionOfArray {

    public void displayResult() {
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};
        int[] num3 = intersect(nums1, nums2);
        for (int num : num3) {
            System.out.println(num);
        }
    }

    public int[] intersect(int[] nums1, int[] nums2) {

        ArrayList<Integer> intersection = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                intersection.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        int[] result = new int[intersection.size()];
        int i = 0;
        for (Integer num : intersection) {
            result[i++] = num;
        }
        return result;
    }

    public int[] intersectMergeSort(int[] nums1, int[] nums2) {
        int min = Math.min(nums1.length, nums2.length);
        int[] temp = new int[min];

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]){
                i++;
            } else if(nums1[i] > nums2[j]){
                j++;
            } else {
                temp[k++]= nums1[i++];
                j++;
            }
        }

        int[] result = new int[k];
        for(i =0; i< k; i++){
            result[i]= temp[i];
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
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

}
