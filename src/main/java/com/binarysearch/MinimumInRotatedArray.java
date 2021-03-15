package com.binarysearch;

public class MinimumInRotatedArray {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length -1;
        int mid = 0;
        while (low < high){
            mid = low + (high - low)/2;
            if(nums[mid] > nums[high]){
                low = mid +1;
            } else if(nums[mid]<nums[high]){
                high = mid;
            } else{
                high--;
            }
        }
        return nums[low];
    }



    public void displayResult() {
        int[] inputArray = new int[]{1,10,10,10,10};
        int minimum = findMin(inputArray);
        System.out.println(minimum);


    }
}

//1,3,3
//2,2,2,0,1
//3,4,5,1,2
//3,3,1,3
//3,3,3,3,3,3,3,3,1,3
//1,10,10,10,10