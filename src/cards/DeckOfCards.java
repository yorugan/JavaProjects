package cards;
import java.security.SecureRandom;
public class DeckOfCards
{
    private Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;

    private static final SecureRandom randomNumbers= new SecureRandom();

    public DeckOfCards()
    {
        String[] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"}
        String[] suits = {"♤, ♥, ♧, ◆"};

        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;

        for(int count = 0; count <deck.length; count++)
        {
            deck[count] = new Card(faces[count % 13], suits [count / 13]);
        }
    }


}
