package com.mioopp.util;

/**
 * @author mioopp
 * @create 2021-01-21 14:38
 */
public class ArrayUtil {

  public static String[][] arrayClone(String[][] arr) {
    String[][] newArr = new String[arr.length][];
    for (int i = 0; i < arr.length; i++) {
      newArr[i] = arr[i];
    }
    return newArr;
  }

  public static int[][] arrayCloneAndReverse(int[][] arr) {
    int[][] newArr = new int[arr.length][];
    for (int i = 0; i < arr.length; i++) {
      newArr[i] = arr[arr.length - i - 1];
    }
    return newArr;
  }
}
