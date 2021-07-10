package cardGames;

import java.util.ArrayList;
import java.util.ListIterator;

public class Hand
{
    private ArrayList<Card> hand;

    public Hand()
    {
        hand = new ArrayList<Card>();
    }

    // Removes all cardGames from the hand
    public void clear()
    {
        hand.clear();
    }

    public void addCard(Card card)
    {
        if(card == null)
        {
            throw new NullPointerException("Cannot add a null card to a hand");
        }
        hand.add(card);
    }

    public void removeCard(int position)
    {
        if(position < 0 || position >= hand.size())
        {
            throw new IllegalArgumentException("Position does not exist in hand");
        }
        hand.remove(position);
    }

    public void displayHand()
    {
        ListIterator listIterator = hand.listIterator();
        while(listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }
    }

    public int getCardCount()
    {
        return hand.size();
    }

    public Card getCard(int position)
    {
        if(position < 0 || position >= hand.size())
        {
            throw new IllegalArgumentException("Position does not exist in hand");
        }

        return (Card)hand.get(position);
    }

    public Card getNewCard()
    {
        if(hand.isEmpty())
        {
            throw new IllegalArgumentException("Hand is empty");
        }

        return (Card)hand.get(hand.size() - 1);
    }

}
