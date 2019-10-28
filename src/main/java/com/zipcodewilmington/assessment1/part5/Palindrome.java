package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){

        char[] chArray = input.toCharArray();
        int noOfPalindromes = 0;
        int arrayLength = chArray.length-1;

        for(int i=0; i< arrayLength; i++ )
        {
            if (chArray[i] == chArray[i+1])
            {
                 noOfPalindromes++;
            }
        }

        if (chArray[arrayLength] == chArray[0])
        {
            noOfPalindromes++;
        }

        return noOfPalindromes + chArray.length;
    }
}
