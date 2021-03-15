package com.binarysearch;

public class FindPeak {
    public int findLargestPeakElement(int[] nums) {
        int peakIndex = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] > nums[i+1] ){
                if(peakIndex < nums[i]){
                    peakIndex = i;
                }
            }
        }

        return peakIndex;
    }

    private int findPeakElement(int[] inputArray) {
        int low = 0;
        int high = inputArray.length -1;
        while (low < high){
            int mid = low + (high - low)/2;
            if(inputArray[mid] > inputArray[mid+1]){
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public void displayResult() {
        int[] inputArray = new int[]{1,2,1,3,5,6,4};
        int index = findPeakElement(inputArray);
        System.out.println(index);
    }
}
