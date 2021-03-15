package com.binarysearch;

public class TernarySearch {
    public void displayResult() {
        int[] inputArray = new int[]{-1, 0, 3, 5, 9, 12};
        int searchItem = 9;
        int index = search(inputArray, searchItem);
    }

    private int search(int[] inputArray, int searchItem) {
        int low = 0;
        int high = inputArray.length - 1;
        int mid1;
        int mid2;

        while (low <= high) {
            mid1 = low + (high - low) / 3;
            mid2 = high - (high - low) / 3;
            if (inputArray[mid1] == searchItem) {
                return mid1;
            } else if (inputArray[mid2] == searchItem) {
                return mid2;
            } else if ( searchItem < inputArray[mid1]){
                high = mid1 -1;
            } else if(searchItem > inputArray[mid2]){
                low = mid2 + 1;
            } else {
                low = mid1 +1;
                high = mid2 -1;
            }
        }

        return -1;
    }
}
