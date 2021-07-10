package cardGames;

public class Card
{
    // Types of Ranks
    public static enum Rank
    {
        ACE(1),
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11),
        QUEEN(12),
        KING(13);

        private int rankValue;

        Rank(int rankValues)
        {
            this.rankValue = rankValues;
        }

        public int getRankValue()
        {
            return this.rankValue;
        }
    }

    // Types of Suits
    public static enum Suit
    {
        DIAMONDS(1),
        CLUBS(2),
        HEARTS(3),
        SPADES(4);

        private int suitValue;

        Suit(int suitValues)
        {
            this.suitValue = suitValues;
        }

        public int getSuitValue()
        {
            return this.suitValue;
        }
    }

    private final Rank rank; //rank of card ("A ,1 ,2 ,3 ..., K")
    private final Suit suit; //suit of card ("♤, ♥, ♧, ◆")

    public Card(Rank cardRank, Suit cardSuit)
    {
        this.rank = cardRank; // initialize the rank of card
        this.suit = cardSuit; // initialize the suit of card
    }

    public Rank getRank()
    {
        return rank;
    }

    public Suit getSuit()
    {
        return suit;
    }

    public String toString()
    {
        return String.format("%s of %s", rankToString(getRank()), suitToString(getSuit()));
    }

    public static String rankToString(Rank rankValue)
    {
        switch (rankValue)
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
                return null;
        }
    }

    public static String suitToString(Suit suitValue)
    {
        switch (suitValue)
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
