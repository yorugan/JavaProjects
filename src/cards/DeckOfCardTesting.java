package cards;

import java.util.concurrent.LinkedTransferQueue;

public class DeckOfCardTesting
{
    public static void main(String args[])
    {
        DeckOfCards cardDeck = new DeckOfCards();
        cardDeck.shuffle();

        for (int i = 1; i<= 52; i++)
        {
            System.out.printf("%-4s", cardDeck.dealCard());

            if(i % 4 == 0)
            {
                System.out.println();
            }
        }
    }

}
