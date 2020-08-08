package cards;

import java.util.ArrayList;

public class Hand
{
    private ArrayList hand;

    public Hand()
    {
        hand = new ArrayList();
    }

    // Removes all cards from the hand
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

}
