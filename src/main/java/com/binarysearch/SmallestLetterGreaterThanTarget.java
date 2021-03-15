package com.binarysearch;

public class SmallestLetterGreaterThanTarget {

    public char recordLettersSeen(char[] letters, char target) {
        boolean[] seen = new boolean[26];
        for (char letter : letters) {
            seen[letter - 'a'] = true;
        }
        while (true) {
            target++;
            if (target > letters[letters.length - 1]) target = letters[0];
            if (seen[target - 'a'] == true) {
                return target;
            }
        }
    }

    public char linearScan(char[] letters, char target) {
        for (char letter : letters) {
            if (target < letter) {
                return letter;
            }
        }
        return letters[0];
    }

    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (letters[mid] > target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        if (letters[low] <= target) {
            low++;
        }
        return letters[low % letters.length];
    }

    public void displayResult() {
        char[] inputArray = new char[]{'c', 'f', 'j'};
        char target = 'j';
        char nextGreatestLetter = nextGreatestLetter(inputArray, target);
        System.out.println(nextGreatestLetter);
    }
}
