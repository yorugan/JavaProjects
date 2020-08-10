package cards;

public class Card
{
    private final int rank; //rank of card ("A ,1 ,2 ,3 ..., K")
    private final int suit; //suit of card ("♤, ♥, ♧, ◆")

    //Types of suits
    public final static int DIAMONDS = 1;
    public final static int CLUBS = 2;
    public final static int HEARTS = 3;
    public final static int SPADES = 4;

    // Types of ranks
    public final static int ACE = 1;
    public final static int TWO = 2;
    public final static int THREE = 3;
    public final static int FOUR = 4;
    public final static int FIVE = 5;
    public final static int SIX = 6;
    public final static int SEVEN = 7;
    public final static int EIGHT = 8;
    public final static int NINE = 9;
    public final static int TEN = 10;
    public final static int JACK = 11;
    public final static int QUEEN = 12;
    public final static int KING = 13;

    public Card(int cardRank, int cardSuit)
    {
        this.rank = cardRank; // initialize the face of card
        this.suit = cardSuit; // initialize the suit of card
    }

    public int getRank()
    {
        return rank;
    }

    public int getSuit()
    {
        return suit;
    }

    public static String rankToString(int rank)
    {
        switch (rank)
        {
            case ACE:
                return "A";
            case TWO:
                return "2";
            case THREE:
                return "3";
            case FOUR:
                return "4";
            case FIVE:
                return "5";
            case SIX:
                return "6";
            case SEVEN:
                return "7";
            case EIGHT:
                return "8";
            case NINE:
                return "9";
            case TEN:
                return "10";
            case JACK:
                return "J";
            case QUEEN:
                return "Q";
            case KING:
                return "K";
            default:
                return  null;
        }
    }

    public static String suitToString(int suit)
    {
        switch(suit)
        {
            case DIAMONDS:
                return "◆";
            case CLUBS:
                return "♧";
            case HEARTS:
                return "♥";
            case SPADES:
                return "♤";
            default:
                return null;
        }
    }

}
