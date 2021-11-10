package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack_app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Deck {

    private Card[] cards = new Card[DECKSIZE];
    private ArrayList<Integer> usedCards = new ArrayList<Integer>();

    private static final int DECKSIZE = 52;

    public static int cardsInDeck = 52; //take out

    //constructor
    public Deck(){
        initDeck();
    }

    //will reshufle the deck
    public void initDeck(){
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 13; j++){
                cards[i * 13 + j] = new Card(i, j + 1);
            }
        }
        cardsInDeck=52; //take out
    }

    //will generate a random card from the deck if it hasn't been used
    public void deal(Player player){

        //check to see if deck is not full and reshuffle if so reshuffle
        if (usedCards.size() >= DECKSIZE) {
            reshuffle();
        }

        Random random = new Random();
        int randInt;

        do { randInt = random.nextInt(DECKSIZE);
        } while (usedCards.contains(randInt));

        usedCards.add(randInt);
        cardsInDeck--; //take out
        player.addCardToHand(cards[randInt]);
    }

    //will reshuffle the deck
    public void reshuffle(){
        this.cards = new Card[DECKSIZE];
        initDeck();
        usedCards.clear();
    }

    //prints out the cards in the deck
    @Override
    public String toString() {

        String deckString = new String();

        for (int i = 0; i < 52; i++){
            deckString += cards[i].toString();
        }
        return deckString;
    }


}
