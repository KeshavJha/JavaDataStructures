package ObjectsArraysCollections;

import java.util.Arrays;

public class ArraysClassUsage {
    static int[] arr1 = {1,2,3,4};
    static int[] arr2 = {2,3,4};
    static int[] arr3 = {1,2,3,4};
    static int[] arr4 = {-1,-2,-3,-4};
    static int[] arr5 = {-1,-3,-4,-2};
    public static void main(String[] args) {
        // Methods of Arrays

        // 1. asList()
        System.out.println("asList elements of arr1 ::" + Arrays.asList(1,2,3,4));
        System.out.println("asList elements of arr1 as reference ::" + Arrays.asList(new int[]{1,2,3,4}));
        System.out.println("asList arr1 ::" + Arrays.asList(arr1));

        // 2. hashCode()
        System.out.println("hasCode arr1 :: " + Arrays.hashCode(arr1));
        System.out.println("hasCode arr2:: " + Arrays.hashCode(arr2));

        System.out.println("toString :: " + Arrays.toString(arr3));

//        System.out.println("toString :: " + Arrays.deepToString(arr3));
        System.out.println("toString :: " + Arrays.binarySearch(arr3,10));

        // mismatch()
        System.out.println("mismatch arr1 and arr2 :: " + Arrays.mismatch(arr1, arr2));
        System.out.println("mismatch arr1 and arr3 :: " + Arrays.mismatch(arr1, arr3));
        System.out.println("mismatch arr4 and arr5 :: " + Arrays.mismatch(arr4, arr5));

        // equals() & deepEquals()
        System.out.println("equals arr1 and arr2 :: " + Arrays.equals(arr1, arr2));
        System.out.println("equals arr1 and arr3 :: " + Arrays.equals(arr1, arr3));
        System.out.println("equals arr4 and arr5 :: " + Arrays.equals(arr4, arr5));

        // compare() & compareUnsigned
        System.out.println("compare arr1 and arr2 :: " + Arrays.compare(arr1, arr2));
        System.out.println("compare arr1 and arr3 :: " + Arrays.compare(arr1, arr3));
        System.out.println("compare arr4 and arr5 :: " + Arrays.compare(arr4, arr5));

        System.out.println("compareUnsigned arr1 and arr2 :: " + Arrays.compareUnsigned(arr1, arr2));
        System.out.println("compareUnsigned arr1 and arr4 :: " + Arrays.compareUnsigned(arr1, arr4));
        System.out.println("compareUnsigned arr4 and arr5 :: " + Arrays.compareUnsigned(arr4, arr5));

    }
}
