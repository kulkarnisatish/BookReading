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
}
