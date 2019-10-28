package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign)
    {
        String strReturn = "";
        if (handSign.equalsIgnoreCase("rock"))

            strReturn =  "paper";


        else if (handSign.equalsIgnoreCase("paper"))

            strReturn = "scissor";

        else //if scissor

            strReturn = "rock";

        return strReturn;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String strReturn = "";
        if (handSign.equalsIgnoreCase("rock"))

            strReturn =  "scissor";


        else if (handSign.equalsIgnoreCase("paper"))

            strReturn = "rock";

        else //if scissor

            strReturn = "paper";

        return strReturn;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {

        String str1 = getWinningMove(handSignOfPlayer1);
        String winner;
        if (str1.equalsIgnoreCase(handSignOfPlayer2))
        {
            winner =  handSignOfPlayer2;
        }
        else
        {
            winner =  handSignOfPlayer1;
        }

        return winner;


    }
}
