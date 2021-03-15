package com.binarysearch;

public class Sqrt {

    public int mySqrt(int x) {
        if (x == 0 || x == 1){
            return x;
        }
        int left = 1;
        int right = x;
        int mid = 0;
        while(true){
            mid = left + (right - left)/2;
            if(mid > (x/mid)){
                right = mid -1;
            } else {
                if((mid+1) > (x/(mid+1))){
                    return mid;
                }
                left = mid + 1;

            }
        }
    }

    public void displayResult() {
        int sqrt = mySqrt(10);
        System.out.println(sqrt);
    }
}

//9
//4
//3 4