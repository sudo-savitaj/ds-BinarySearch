package com.binarysearch;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwoNumbers {
    public void display() {
        int[] nums = new int[]{3,24,50,79,88,150,345};
        int target = 200;
        int[] range = twoSum(nums, target);

        for (int num : range) {
            System.out.println(num);
        }
    }

    public int[] twoSum(int[] numbers, int target) {
        int[] result = {-1,-1};
        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int sum = numbers[low] + numbers[high];
            if (target > sum) {
                low ++ ;
            } else if (target < sum) {
                high --;
            } else {
                break;
            }

//            int mid = low + (high - low)/2;
//            if(numbers[low] + numbers[mid] < target){
//                low = mid;
//            } else if(numbers[low] + numbers[mid] > target)
//            {
//                result[0] = low + 1;
//                result[1] = mid + 1;
//                break;
//            }
        }

        if(numbers[low] + numbers[high] == target){
            result[0] = low + 1;
            result[1] = high + 1;
        }

        return result;
    }


    // O(N); O(N)
    private int[] map(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                return new int[] { map.get(numbers[i]) + 1, i + 1};
            } else {
                map.put(target - numbers[i], i);
            }
        }

        return new int[0];
    }

    // O(N); O(1)
    private int[] linear(int[] numbers, int target) {
        int[] res = new int[2];

        int l = 0;
        int r = numbers.length - 1;

        while(l < r) {
            int sum = numbers[l] + numbers[r];
            if(sum == target) {
                res[0] = l+1;
                res[1] = r+1;
                break;
            } else if(sum < target) {
                l++;
            } else {
                r--;
            }
        }

        return res;
    }

    // O(NlogN); O(1)
    private int[] binarySearch(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int idx = search(numbers, i + 1, target - numbers[i]);
            if (idx != -1) {
                return new int[] { i + 1, idx + 1};
            }
        }
        return new int[0];
    }


    private int search(int[] nums, int start, int target) {
        int l = start;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

}
