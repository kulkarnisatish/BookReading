package org.example;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if(args.length == 0) args= new String[]{"2","3","5","9"};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < Math.min(5, args.length); i++)
            list.add(Integer.parseInt(args[i]));
        //System.out.print(RecursionCountElements.CountElement(new int[]{1}, 0, 1));
        System.out.print(RecursionCountElements.MaxElements(convertIntegers(list), list.toArray().length));
    }
    public static int[] convertIntegers(ArrayList<Integer> integers)
    {
        int[] ret = new int[integers.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }
}
