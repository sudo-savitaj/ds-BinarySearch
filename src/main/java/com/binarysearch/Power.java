package com.binarysearch;

public class Power {
    public double myPow(double x, int n) {
        if(x == 0 || x == 1){
            return x;
        }
        if(n == 0){
            return 1;
        } else if(n == Integer.MIN_VALUE && x > 1)
        {
            return 0;
        }

        if(n<0){
            x = 1/x;
            n = -n;
        }
        return (n%2) == 0 ? myPow(x*x,n/2) : x* myPow(x*x,n/2);
    }

    public void displayResult() {
        System.out.println(myPow(2.0, 10));
    }
}
