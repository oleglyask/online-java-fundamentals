package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack_app;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> cards = new ArrayList<Card>();
    private int handValue = 0;

    public void addCard(Card card) {
        this.cards.add(card);
        handValue += card.getCardValue();
    }

    public int getHandValue() {
        return handValue;
    }

    public boolean isBust(){
        if (handValue > 21){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String handString = new String();
        for (Card card : cards){
            handString += card.toString();
        }
        return handString + " - Total Score - " + handValue;
    }
}
