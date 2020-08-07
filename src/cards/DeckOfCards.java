package cards;

import java.security.SecureRandom;

public class DeckOfCards
{
    private Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;

    private static final SecureRandom randomNumbers = new SecureRandom();

    public DeckOfCards()
    {
        String[] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] suits = {"♤", "♥", "♧", "◆"};

        deck = new Card[NUMBER_OF_CARDS]; // Create an array of Card objects
        currentCard = 0; // First Card dealt will be from deck[0]

        for (int count = 0; count < deck.length; count++) // populate the deck with Card objects
        {
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
        }
    }

    public void shuffle()
    {
        currentCard = 0;

        for (int first = 0; first < deck.length; first++)
        {
            //select a random number between 0 and 51
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            // swaps the Card with randomly selected Card = shuffles the card
            Card shuffleTemp = deck[first];
            deck[first] = deck[second];
            deck[second] = shuffleTemp;
        }
    }

    public Card dealCard()
    {
        // checks whether there are any Card left to be dealt
        if (currentCard < deck.length)
        {
            return deck[currentCard++];
        } else
        {
            return null;
        }
    }

}
