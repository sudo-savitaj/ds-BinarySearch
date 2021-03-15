package com.binarysearch;

public class RotatedSortedArray {
    public void displayResult() {
        int[] inputArray = new int[]{5,1,3};
        int searchItem = 5;
        int index = search(inputArray, searchItem);

        System.out.println(index);
    }

    private int search(int[] inputArray, int searchItem) {
        int low = 0;
        int high = inputArray.length -1;
        int mid = 0 ;
        while(low <= high){
            mid = low + (high - low)/2;
            if(inputArray[mid]<inputArray[high]){
                high = mid ;
            } else {
                low = mid+1;
            }
        }

        int lastIndex = inputArray.length -1;
        if ( searchItem <= inputArray[lastIndex] ){
            low = mid;
            high = lastIndex;
        } else {
            low = 0;
            high = mid-1;
        }
        while (low <= high){
            mid = (low + high)/2 ;
            if (inputArray[mid] == searchItem){
                return mid;
            } else if(searchItem < inputArray[mid]){
                high = mid -1;
            } else {
                low = mid +1;
            }
        }
        return  -1;
    }

}

//4,5,6,7,0,1,2
//low = 0 = 4
//high = length -1
//mid = low + ( high - low)/2 + pivot