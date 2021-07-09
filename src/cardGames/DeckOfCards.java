package cards;

import java.security.SecureRandom;
import java.util.*;

public class DeckOfCards
{
    private List<Card> list;

    private int currentCard;
    private static final int NUMBER_OF_SUITS = 4;
    private static final int NUMBER_OF_RANKS = 13;
    private static final int NUMBER_OF_CARDS = NUMBER_OF_SUITS * NUMBER_OF_RANKS;
    private static final SecureRandom randomNumbers = new SecureRandom();

    public DeckOfCards()
    {
        int card = 0;
        Card[] deck = new Card[NUMBER_OF_CARDS]; // Create an array of Card objects

        for (Card.Suit suit : Card.Suit.values()) // Populate the Deck with Card objects;
        {
            for (Card.Rank rank : Card.Rank.values())
            {
                deck[card] = new Card(rank, suit);
                ++card;
            }
        }
        list = new LinkedList<Card>(Arrays.asList(deck));
    }

    public void shuffle()
    {
        currentCard = 0;
        Collections.shuffle(list);
    }

    public void displayDeck()
    {
        for (int i = 0; i < list.size(); i++)
        {
            System.out.printf("%-19s%s", list.get(i), ((i + 1) % 4 == 0) ? "\n" : "");
        }
    }

    public int sizeOf()
    {
        return list.size();
    }

    public void displayList()
    {
        ListIterator listIterator = list.listIterator();
        while(listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }
    }

    public Card dealCard()
    {
        ListIterator listIterator = list.listIterator();
        Card card = (Card) listIterator.next();
        listIterator.remove();

        return card;
    }

}
