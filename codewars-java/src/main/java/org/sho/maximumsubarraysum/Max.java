// https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c
package org.sho.maximumsubarraysum;

public class Max {

    // intuitive approach, not using Kadane's algorithm
    public static int sequence(int[] arr) {

        int maxSum = 0;
        int tmpSum;
        for (int i = 0; i < (arr.length - 1); i++) {
            tmpSum = arr[i];
            for (int j = (i + 1); j < arr.length; j++) {
                tmpSum += arr[j];
                if (tmpSum > maxSum) {
                    maxSum = tmpSum;
                }
            }
        }

        return maxSum;
    }
}
