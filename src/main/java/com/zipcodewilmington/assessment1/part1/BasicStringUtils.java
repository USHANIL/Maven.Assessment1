package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        return str.substring(0, 1).toUpperCase()+str.substring(1);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        //char[] charArray = str.toCharArray();
        String reverseString = "";
        for (int i=str.length()-1 ; i>=0 ; i--)
        {
            reverseString += str.charAt(i);
        }

        return reverseString;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {

        return camelCase(reverse(str));
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        //char[] ch1 = str.toCharArray();
        String newStr = "";

        for (int i=1 ; i<str.length() - 1 ; i++)
        {
            newStr += str.charAt(i);
        }

        return newStr;

    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str)
    {
        char[] charArray = str.toCharArray();
        String newStr = "";
        boolean chCase = true;
        for (int i=0 ; i<charArray.length ; i++) {
            char ch = charArray[i];
            if (Character.isUpperCase(ch)) {
                charArray[i] = Character.toLowerCase(ch);
            } else {
                charArray[i] = Character.toUpperCase(ch);
            }

        }

        return new String(charArray);


    }
}
