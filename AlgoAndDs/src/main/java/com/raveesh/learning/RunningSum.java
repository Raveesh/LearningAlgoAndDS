package com.raveesh.learning;

import java.util.Arrays;

/**
 * Running Sum
 *
 * I did not know how to do this .. I am ashamed..
 */
public class RunningSum {

  public static void main(String[] args) {

    int[] input = {1, 2, 3, 4};
    int[] outputArray = runningSum(input);
    System.out.println(Arrays.toString(outputArray));

  }

  public static int[] runningSum(int[] nums) {

    int[] resultArray = new int[nums.length];
    resultArray[0] = nums[0];
    for (int i = 1; i < nums.length; i++) {
      resultArray[i] = nums[i] + resultArray[i - 1];
    }
    return resultArray;
  }
}
