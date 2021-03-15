package com.binarysearch;

public class FirstBadVersion {
    public void displayResult() {
        int firstBadVersion = firstBadVersion(5);
        System.out.println(firstBadVersion);
    }

    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (isBadVersion(mid)) {
                    high = mid -1 ;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    boolean isBadVersion(int version) {
        return (version == 4 || version == 5) ? true : false;
    }
}
