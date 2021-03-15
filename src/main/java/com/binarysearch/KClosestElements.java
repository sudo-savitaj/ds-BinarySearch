package com.binarysearch;

import java.util.ArrayList;
import java.util.List;

public class KClosestElements {
    public void displayResult() {
        int[] inputArray = new int[]{1,1,1,10,10,10};
        int k = 1;
        int x = 10;
        List<Integer> kClosestElements = findClosestElements(inputArray, k,x);
        for (Integer element : kClosestElements) {
            System.out.println(element);
        }
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int low = 0;
        int high = arr.length -1;
        int distance = high - low +1;
        while (distance > k){
            if (Math.abs(arr[low] - x)<= Math.abs(arr[high] -x )){
                high --;
            } else {
                low ++;
            }
            distance = high - low +1;
        }

        List<Integer> kClosestElements = new ArrayList<>();
        for (int i = low; i <= high; i++) {
            kClosestElements.add(arr[i]);
        }
        return kClosestElements;
    }
}
