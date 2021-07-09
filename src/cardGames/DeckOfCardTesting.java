package cards;

public class DeckOfCardTesting
{
    public static void main(String args[])
    {
        DeckOfCards cardDeck = new DeckOfCards();
        Hand hand = new Hand();

        System.out.println(cardDeck.sizeOf());
        hand.addCard((Card) cardDeck.dealCard());
        hand.addCard((Card) cardDeck.dealCard());

        hand.displayHand();

        cardDeck.displayList();

    }

}
