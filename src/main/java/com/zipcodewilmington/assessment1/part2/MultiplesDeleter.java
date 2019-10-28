package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {

        ArrayList<Integer> newList = new ArrayList<Integer>();
        for (int i=0; i<ints.length ; i++)
        {
           if (ints[i]%2 != 0)
           {
                newList.add(ints[i]);
           }
        }
        /*
        Integer[] c = new Integer[newList.size()];
        for(int i = 0; i < newList.size(); i++)
        {
            c[i] = (Integer) newList.get(i);
        }
        */

        return castingMethodtoInteger(newList) ;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        ArrayList<Integer> newList = new ArrayList();
        for (int i=0; i<ints.length ; i++)
        {
            if (ints[i]%2 == 0)
            {
                newList.add(ints[i]);
            }
        }

        return castingMethodtoInteger(newList);
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        ArrayList<Integer> newList = new ArrayList();
        for (int i=0; i<ints.length ; i++)
        {
            if (ints[i]%3 != 0)
            {
                newList.add(ints[i]);
            }
        }

        return castingMethodtoInteger(newList);
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        ArrayList<Integer> newList = new ArrayList();
        for (int i=0; i<ints.length ; i++)
        {
            if (ints[i]% multiple != 0)
            {
                newList.add(ints[i]);
            }
        }
        return castingMethodtoInteger(newList);
    }

    //added by usha
    public Integer[] castingMethodtoInteger(ArrayList al)
    {
        Integer[] c = new Integer[al.size()];
        for(int i = 0; i < al.size(); i++)
        {
            c[i] = (Integer) al.get(i);
        }
        return c;

    }
}
