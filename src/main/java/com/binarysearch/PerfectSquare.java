package com.binarysearch;

public class PerfectSquare {
    public boolean isPerfectSquareViaLinear(int num) {
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;
    }

    public boolean isPerfectSquare(int num) {
        int low = 1;
        int high = num/2;
        if (num == 1) {
            return true;
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int res = num / mid;
            int tail = num % mid;
            if (res == mid && tail ==0) {
                return true;
            } else if (mid > res) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    public void displayResult() {
        int num = 808201;
        System.out.println(isPerfectSquare(num));
    }
}
