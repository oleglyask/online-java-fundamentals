package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack_app;

public class Player {

    private String name;
    private Hand hand;
    private int potValue;


    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    public int getHandValue() {
        return hand.getHandValue();
    }

    public Hand getHand() {
        return hand;
    }

    public void addCardToHand(Card card){
        hand.addCard(card);
    }

    public boolean aiWants(){
        if (hand.getHandValue() >= 16){
            return false;
        } else {
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public void printHand(){
        System.out.println(name + " - " + hand.toString());
    }
}
