package cards;

public class Card
{
    private final String face; //face of card ("A ,1 ,2 ,3 ..., K")
    private final String suit; //suit of card ("♤, ♥, ♧, ◆")

    public Card(String cardFace, String cardSuit)
    {
        this.face = cardFace; // initialize the face of card
        this.suit = cardSuit; // initialize the suit of card
    }

    public String toString()
    {
        return face + suit;
    }
}
