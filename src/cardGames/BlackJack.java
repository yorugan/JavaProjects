package cards;

import java.util.Scanner;

public class BlackJack
{
    public static void main(String args[])
    {
        int userMoney = 100;
        int bet;
        boolean userWins;
        Scanner userBet = new Scanner(System.in);
        boolean playGame = true;
        System.out.println("Welcome to the game of blackjack.");

        while (playGame)
        {
            System.out.println("You have " + userMoney + " dollars");

            do
            {
                System.out.println("How much would you like to bet?");
                bet = userBet.nextInt();
                if (bet < 0 || bet > userMoney)
                {
                    System.out.println("Your answer must be between 0 and " + userMoney + ". Please try again");
                }
            }
            while (bet < 0 || bet > userMoney);

            if (bet == 0)
                break;

            userWins = playBlackjack();
            if (userWins)
                userMoney = userMoney + bet;
            else
                userMoney = userMoney - bet;

            if (userMoney == 0)
            {
                System.out.println("You ran out of money! You need to leave!");
                break;
            }
        }
    }

    public static boolean playBlackjack()
    {
        DeckOfCards deck = new DeckOfCards();
        BlackJackHand playerHand = new BlackJackHand();
        BlackJackHand dealerHand = new BlackJackHand();
        Scanner userInput = new Scanner(System.in);

        // Shuffles the deck and then deals two card to each player
        deck.shuffle();
        playerHand.addCard(deck.dealCard());
        playerHand.addCard(deck.dealCard());
        dealerHand.addCard(deck.dealCard());
        dealerHand.addCard(deck.dealCard());

        /* Check if either one of the players have Blackjack.
           The player with Blackjack (value of two card equals 21) wins the game.
        */
        if (dealerHand.getBlackJackValue() == 21)
        {
            System.out.println(("Dealer has the " + dealerHand.getCard(0) +
                    "and the " + dealerHand.getCard(1)));
            System.out.println("Player has the " + playerHand.getCard(0) + " and the "
                    + playerHand.getCard(1));
            System.out.println("Dealer has the BlackJack.\nYou lose!");

            return false;
        }

        if (playerHand.getBlackJackValue() == 21)
        {
            System.out.println(("Dealer has the " + dealerHand.getCard(0) +
                    "and the " + dealerHand.getCard(1)));
            System.out.println("Player has the " + playerHand.getCard(0) + " and the "
                    + playerHand.getCard(1));
            System.out.println("Player has the BlackJack.\nCongratulations! You won!");

            return true;
        }

        // Ask for user input whether to hit or stand

        while (true)
        {
            System.out.println("You currently have: ");
            playerHand.displayHand();
            System.out.println("The value of your cards equals: ");
            System.out.println(playerHand.getBlackJackValue());
            System.out.println("Dealer has " + dealerHand.getCard(0) + " and one hidden card");
            System.out.println("Please type H for hit and S for stand.");
            System.out.println("Would you hit or stand?");

            char userAction = userInput.next().charAt(0);
            do
            {
                userAction = Character.toUpperCase(userAction);
                if (userAction != 'H' && userAction != 'S')
                {
                    System.out.println("Please type H for hit and S for stand.");
                    System.out.println("Would you hit or stand?");
                }
            } while (userAction != 'H' && userAction != 'S');

            if (userAction == 'H')
            {
                playerHand.addCard(deck.dealCard());
                System.out.println("Player hits...");
                System.out.println("Your new card is: " + playerHand.getNewCard());
                System.out.println("Your total value of the cards are now " + playerHand.getBlackJackValue());
                if (playerHand.getBlackJackValue() > 21)
                {
                    System.out.println("You have busted by going over 21. \nYou lose!");
                    System.out.println("Dealer's other card was " + dealerHand.getCard(1));

                    return false;
                }
            } else if (userAction == 'S')
            {
                break;
            }
        }

        // if player stands, move onto dealers hand and deals the card to the dealer

        System.out.println("Player stands.");
        System.out.println("Dealer's cards are: ");
        dealerHand.displayHand();
        while (dealerHand.getBlackJackValue() <= 16)
        {
            dealerHand.addCard(deck.dealCard());
            if (dealerHand.getBlackJackValue() > 21)
            {
                System.out.println("Dealer busted by going over 21. \nCongratulations! You won!");
                dealerHand.displayHand();

                return true;
            }
        }

        System.out.println("Dealer's total value of the cards are " + dealerHand.getBlackJackValue() + "\n");

        // Checks for dealers value of card

        if (dealerHand.getBlackJackValue() == playerHand.getBlackJackValue())
        {
            System.out.println("Dealer wins on a tie. \nYou lose!");

            return false;
        } else if (dealerHand.getBlackJackValue() > playerHand.getBlackJackValue())
        {
            System.out.println("Dealer wins the game. Dealer had: " + dealerHand.getBlackJackValue());
            dealerHand.displayHand();
            System.out.println(" and the Player had: " + playerHand.getBlackJackValue());
            playerHand.displayHand();

            return false;
        } else
        {
            System.out.println("You win! You had: " + playerHand.getBlackJackValue());
            playerHand.displayHand();
            System.out.println("while the dealer had: " + dealerHand.getBlackJackValue());
            dealerHand.displayHand();

            return true;
        }
    }
}
