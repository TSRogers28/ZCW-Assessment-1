 

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSORS = "scissors";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        String answer = "";
        if(handSign.equals("rock")){
        answer += "paper";
        }
        else if(handSign.equals("paper")){
        answer += "scissors";
        }
        else
        answer += "paper";
        return answer;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String answer = "";
        if(handSign.equals("paper")){
        answer += "rock";
        }
        else if(handSign.equals("scissors")){
        answer += "paper";
        }
        else
        answer += "scissors";
        return answer;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        String answer = "";
        if(handSignOfPlayer1.equals("rock") && handSignOfPlayer2.equals("paper") || 
        handSignOfPlayer1.equals("paper") && handSignOfPlayer2.equals("rock")){
        answer += "paper";
        }
        if(handSignOfPlayer1.equals("scissors") && handSignOfPlayer2.equals("paper") || 
        handSignOfPlayer1.equals("paper") && handSignOfPlayer2.equals("scissors")){
        answer += "scissors";
        }
        if(handSignOfPlayer1.equals("scissors") && handSignOfPlayer2.equals("rock")  || 
        handSignOfPlayer1.equals("rock") && handSignOfPlayer2.equals("scissors")){
        answer += "rock";
    }
    return answer;
}
}
