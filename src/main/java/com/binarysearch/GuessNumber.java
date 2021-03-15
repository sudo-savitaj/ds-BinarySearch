package com.binarysearch;

public class GuessNumber {

    public int guessNumber(int n) {
        int lower = 1;
        int upper = n;
        while(lower<=upper) {
            int middle = lower + ( upper - lower)/2;
            int guess = guess(middle);
            if(guess == 0){
                return middle;
            } else if(guess == -1)  {
                upper = middle -1;
            } else {
                lower = middle +1 ;
            }
        }
        return -1;
    }

    int guess(int num){
        if(num == 6){
            return 0;
        } else if (6 < num){
            return -1;
        } else {
            return 1;
        }
    }

    public void displayResult() {
        int guess = guessNumber(10);
        System.out.println(guess);
    }
}
