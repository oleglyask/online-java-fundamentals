package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack_app;

public class Card {

    private static final char[] possibleSuit = new char[]{'♠', '♦', '♥', '♣'};
    private char suit;
    private int type; //the name of the card with be a int from 1 (ace) to 13 (king)
    private int cardValue;


    public Card(int suit, int type){

        this.suit = this.possibleSuit[suit];
        this.type = type;

        if (type <=10){
            this.cardValue = type;
        } else {
            this.cardValue = 10;
        }
    }

    public int getCardValue() {
        return cardValue;
    }

    public String typeToString(){
        String retResult = new String();

        if (type > 1 && type <=10 ){
            retResult = String.valueOf(type);
        } else {
            switch (type) {
                case 11:
                    retResult = "J";
                case 12:
                    retResult = "Q";
                case 13:
                    retResult = "K";
                case 1:
                    retResult = "A";
            }
        }
        return retResult;
    }

    @Override
    public String toString() {
        return typeToString() + suit + " ";
    }
}
