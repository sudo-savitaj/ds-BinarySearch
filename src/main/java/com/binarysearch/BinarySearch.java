package com.binarysearch;

public class BinarySearch {

    public void displayResult() {
        int[] inputArray = new int[]{-1,0,3,5,9,12};
        int searchItem = 9;
        int index = search(inputArray,searchItem);
        System.out.println(index);
    }

    private int search(int[] inputArray, int searchItem) {
        int low = 0;
        int high = inputArray.length -1;
        int middle;
        while (low <= high){
            middle = low + (high - low)/2;
            if(searchItem == inputArray[middle]){
                return middle;
            } else if (searchItem < inputArray[middle]){
                high = middle -1;
            } else {
                low = middle +1;
            }
        }
        return -1;
    }
}
