package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int flagHeight, int jumpHeight)
    {
        int noOfJumps = 0;
        if (flagHeight < jumpHeight)
        {
         noOfJumps = flagHeight;
        }
        else
        {
            noOfJumps = flagHeight/jumpHeight + flagHeight%jumpHeight;
        }

        return noOfJumps;
    }
}
