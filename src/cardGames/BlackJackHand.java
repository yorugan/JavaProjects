package cardGames;

public class BlackJackHand extends Hand
{

    public int getBlackJackValue()
    {
        int value;
        boolean ace;

        int cardGames;

        value = 0;
        ace = false;
        cardGames = getCardCount();

        for(int i = 0; i < cardGames; i++)
        {
            Card card;
            int cardValue;
            card = getCard(i);
            cardValue = card.getRank().getRankValue();
            if(cardValue > 10)
            {
                cardValue = 10;
            }
            if(cardValue == 1)
            {
                ace = true;
            }

            value = value + cardValue;
        }

        if(ace == true && value + 10 <= 21)
        {
            value = value + 10;
        }

        return value;
    }
}
