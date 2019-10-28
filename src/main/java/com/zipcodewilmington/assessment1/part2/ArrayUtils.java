package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer count = 0;
        for (int i=0 ; i < objectArray.length ; i++)
        {
            if (objectArray[i].equals(objectToCount))
            {
                count++;
            }
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {

         ArrayList newArray = new ArrayList();
        //List<Object> newArray = new ArrayList<>();
        for (int i = 0; i < objectArray.length; i++) {
            if (!objectArray[i].equals(objectToRemove)) {
                newArray.add(objectArray[i]);
            }
        }
       // Object[] objects = newArray.toArray();

        return castingMethodtoInteger(newArray); // need to change this
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray)
    {
        int newCount = 0;
        int mostCount = 0;
        Object mostCommon = new Object();
        for (int i=0 ; i<objectArray.length ; i++)
        {
            newCount = getNumberOfOccurrences(objectArray, objectArray[i]);
            if (newCount > mostCount)
            {
                mostCount = newCount;
                mostCommon = objectArray[i];
            }

        }
        return mostCommon;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray)
    {
          int newCount = 0;
          int leastCount = 0;
          Object leastCommon = new Object();
          for (int i=0 ; i<objectArray.length ; i++)
          {
              newCount = getNumberOfOccurrences(objectArray, objectArray[i]);
              if (newCount < leastCount)
              {
                  leastCount = newCount;
                  leastCommon = Integer.valueOf(objectArray[i].toString());
              }
          }
      return (Integer)leastCommon;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Integer[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {

        int objectArrayLen  = objectArray.length;
        int objectArrayToAddLen = objectArrayToAdd.length;
       // Object[] mergeArray = new Object[objectArrayLen + objectArrayToAddLen];
        ArrayList newArray = new ArrayList();

        for (int i=0 ; i< objectArrayLen; i++)
        {
          //  mergeArray[i] = objectArray[i];
            newArray.add(objectArray[i]);
        }

        for (int i=0 ; i< objectArrayToAddLen; i++)
        {
           // mergeArray[i] = objectArrayToAdd[i];
            newArray.add(objectArrayToAdd[i]);
        }


       // return (Integer)mergeArray;
        return castingMethodtoInteger(newArray);
    }

    //added by usha
    public static Integer[] castingMethodtoInteger(ArrayList al)
    {
        Integer[] c = new Integer[al.size()];
        for(int i = 0; i < al.size(); i++)
        {
            c[i] = (Integer) al.get(i);
        }
        return c;

    }
}
