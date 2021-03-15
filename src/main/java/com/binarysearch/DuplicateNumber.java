package com.binarysearch;

public class DuplicateNumber {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int sum = (n*(n+1)) /2;
        return 0;
    }

    public void display() {
        int[] inputArray = new int[]{1,10,10,10,10};
        int duplicate = findDuplicate(inputArray);
        System.out.println(duplicate);
    }
}
