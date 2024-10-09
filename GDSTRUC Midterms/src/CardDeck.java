import java.util.LinkedList;
import java.util.ListIterator;

public class CardDeck
{

    private LinkedList<Card> stack;

    public CardDeck()
    {
        stack = new LinkedList<Card>();
    }

    public void push(Card card)
    {
        stack.push(card);
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public Card pop()
    {
        return stack.pop();
    }

    public Card peek()
    {
        return  stack.peek();
    }

    public void printStack()
    {
        ListIterator<Card> iterator = stack.listIterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }

    public int size() {
        return stack.size(); // Returns the number of cards in the deck
    }

}
