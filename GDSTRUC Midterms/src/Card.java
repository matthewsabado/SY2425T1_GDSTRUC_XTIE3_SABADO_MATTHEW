import java.util.Objects;

public class Card {
    String cardName;
    String cardType;

    public Card(String cardName, String cardType)
    {
        this.cardName = cardName;
        this.cardType = cardType;
    }

    public String getName()
    {
        return cardName;
    }

    public void setName(String name)
    {
        this.cardName = name;
    }

    public String getType()
    {
        return cardType;
    }

    public void setType(String cardType)
    {
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return  cardName + " (" + cardType + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card Card = (Card) o;
        return Objects.equals(cardName, Card.cardName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardName, cardType);
    }
}
