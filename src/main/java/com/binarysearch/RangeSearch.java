package com.binarysearch;

public class RangeSearch {
    public int[] searchRange(int[] nums, int target) {
        int[] range = {-1,-1};

        int leftIndex = getExtremeIndex(nums, target, true);

        if (leftIndex == nums.length || nums[leftIndex] != target) {
            return range;
        }

        int rightIndex = getExtremeIndex(nums,target,false);

        range[0] = leftIndex;
        range[1] = ((rightIndex == 0 || rightIndex ==1) && nums[rightIndex] == target) ? rightIndex: rightIndex -1;
        return range;
    }


    private int getExtremeIndex(int[] nums, int target, boolean left) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while (low < high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target ) {
                if(left) {
                    high = mid;
                }
                else {
                    low = mid + 1 ;
                }
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1 ;
            }

//            if (nums[mid] > target || (left && target == nums[mid])) {
//                high = mid;
//            }
//            else {
//                low = mid+1;
//            }
        }
        return low;

    }

    public int[] searchRangeTrinarySearch(int[] nums, int target) {
        int[] range = {-1,-1};
        int low = 0;
        int high = nums.length -1;
        int mid1, mid2;
        while (low < high){
            mid1 = low + (high - low)/3;
            mid2 = high - (high - low)/3;
            if(nums[mid1] > target){
                high = mid1 -1;
            } else if(nums[mid2] < target){
                low = mid2 +1;
            } else {
                low = mid1 + 1;
                high = mid2 -1;
            }

        }
       return range;
    }


    public int[] searchRangeSearch(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);
        return result;
    }

    private int findFirst(int[] nums, int target){
        int idx = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + ( end - start) / 2;
            if(nums[mid] >= target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
            if(nums[mid] == target) idx = mid;
        }
        return idx;
    }

    private int findLast(int[] nums, int target){
        int idx = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + ( end - start) / 2;
            if(nums[mid] <= target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
            if(nums[mid] == target) idx = mid;
        }
        return idx;
    }

    public void displayResult() {
        int[] inputArray = new int[]{5,7,7,8,8,10};
        int searchItem = 8;
        int[] range = searchRangeSearch(inputArray, searchItem);
        for (int element : range) {
            System.out.println(element);
        }
    }
}
