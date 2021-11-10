package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack_app;

import java.util.Scanner;

public class BlackjackController {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to BlackJack, what's your name?  ");
        Player playerHuman = new Player(sc.nextLine());
        Player playerComp = new Player("Computer");

        Deck deck = new Deck();
        deck.deal(playerHuman);
        deck.deal(playerHuman);
        deck.deal(playerComp);
        deck.deal(playerComp);

        boolean player1Done = false;
        boolean computerDone = false;

        do {
            if (player1Done != true) {
                playerHuman.printHand();
                System.out.println(playerHuman.getName() + ", do you want another card? Y/N ");
                if (sc.nextLine().equalsIgnoreCase("Y")) {
                    deck.deal(playerHuman);
                    if (playerHuman.getHand().isBust()) {
                        player1Done = true;
                    }
                } else {
                    player1Done = true;
                }
            }

            if (computerDone != true) {
                if (playerComp.aiWants()) {
                    deck.deal(playerComp);
                    if (playerComp.getHand().isBust()) {
                        computerDone = true;
                    }
                    System.out.println("Computer took another card");
                } else {
                    System.out.println("Computer holds");
                    computerDone = true;
                }
            }
        } while (player1Done != true || computerDone != true);

        playerHuman.printHand();
        System.out.println("Your hand score is " + playerHuman.getHandValue());
        playerComp.printHand();;
        System.out.println("Computer hand score is " + playerComp.getHandValue());

        if (playerHuman.getHandValue() > 21 && playerComp.getHandValue() > 21){
            System.out.println("Both of you bust, Nobody wins");
        } else if (playerHuman.getHandValue() > 21 && playerComp.getHandValue() <= 21){
            System.out.println("You bust, Computer wins");
        } else if (playerHuman.getHandValue() <= 21 && playerComp.getHandValue() > 21){
            System.out.println("Computer busts, You win");
        } else {
            if (playerHuman.getHandValue() > playerComp.getHandValue()){
                System.out.println("You win");
            } else{
                System.out.println("Computer wins");
            }
        }



    }

}
