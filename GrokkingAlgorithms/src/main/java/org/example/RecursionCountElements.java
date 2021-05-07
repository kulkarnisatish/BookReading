package org.example;

import java.util.Arrays;

public class RecursionCountElements {
    public static int CountElement(int[] arr, int sindex, int lindex)
    {
        if(sindex == lindex)
        {
            return 0;
        }
        else
        {
            return 1 + CountElement(arr, sindex +1, lindex);
        }
    }

    public static int MaxElements(int[]arr, int n)
    {
        if(n ==1)
        {
            return arr[0];
        }else
        {
            if(arr[n-1] > MaxElements(arr, n-1))
                return arr[n-1];
            else
                return MaxElements(arr, n-1);
        }
    }
}
