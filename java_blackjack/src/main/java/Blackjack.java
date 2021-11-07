public class Blackjack {

    public int parseCard(String card) {

        if (card == "ace") {
            return 11;
        } else if (card == "two") {
            return 2;
        } else if (card == "three") {
            return 3;
        } else if (card == "four") {
            return 4;
        } else if (card == "five") {
            return 5;
        } else if (card == "six") {
            return 6;
        } else if (card == "seven") {
            return 7;
        } else if (card == "eight") {
            return 8;
        } else if (card == "nine") {
            return 9;
        } else if (card == "ten") {
            return 10;
        } else if (card == "jack") {
            return 10;
        } else if (card == "queen") {
            return 10;
        } else if (card == "king") {
            return 10;
        } else if (card == "other") {
            return 0;
        }
        return 0;
    }

    public boolean isBlackjack(String card1, String card2) {

        if ((card1 == "ace" && (card2 == "ten" || card2 == "jack" || card2 == "queen" || card2 == "king"))
                || (card2 == "ace" && (card1 == "ten" || card1 == "jack" || card1 == "queen" || card1 == "king"))) {

            return true;

        } else return false;

    }

    public String largeHand(boolean isBlackjack, int dealerScore) {

        if (isBlackjack == false) {
            return "P";
        } else if (isBlackjack == true && dealerScore < 10) {
            return "W";
        } else if (isBlackjack == true && dealerScore > 10) {
            return "S";
        } else if (isBlackjack == true && dealerScore > 0) {
            return "S";
        }
        return null;
    }

    public String smallHand(int handScore, int dealerScore) {

        if (handScore >= 17) {
            return "S";
        } else if (handScore <= 11) {
            return "H";
        } else if ((handScore >= 12 && handScore <= 16) && dealerScore < 7) {
            return "S";
        } else if ((handScore >= 12 && handScore <= 16) && dealerScore >= 7){
            return "H";
        } else return null;

    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.

    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }

}

