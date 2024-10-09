import java.util.Random;

public class Main
{
    public static void main(String[] args) {
        CardDeck discardDeck = new CardDeck();
        CardDeck playerHand = new CardDeck();
        CardDeck playerDeck = new CardDeck();

        Card[] cards = {
                new Card("Strike", "Attack"),
                new Card("Defend", "Skill"),
                new Card("Foresight", "Power"),
                new Card("Eruption", "Attack"),
                new Card("Vigilance", "Skill"),
                new Card("Consecrate", "Attack"),
                new Card("Crush Joints", "Attack"),
                new Card("Cut Through Fate", "Attack"),
                new Card("Third Eye", "Skill"),
                new Card("Bowling Bash", "Attack"),
                new Card("Carve Reality", "Attack"),
                new Card("Deceive Reality", "Skill"),
                new Card("Empty Fist", "Attack"),
                new Card("Flurry of Blows", "Attack"),
                new Card("Follow-Up", "Attack"),
                new Card("Halt", "Skill"),
                new Card("Inner Peace", "Skill"),
                new Card("Just Lucky", "Attack"),
                new Card("Meditate", "Skill"),
                new Card("Prostrate", "Skill"),
                new Card("Sash Whip", "Attack"),
                new Card("Swivel", "Skill"),
                new Card("Talk to the Hand", "Skill"),
                new Card("Wallop", "Attack"),
                new Card("Strike", "Attack"),
                new Card("Defend", "Skill"),
                new Card("Eruption", "Attack"),
                new Card("Vigilance", "Skill"),
                new Card("Third Eye", "Skill"),
                new Card("Consecrate", "Attack"),
        };

        for (Card card : cards) {
            playerDeck.push(card);

        }

        int turnNumber = 1;

while (!playerDeck.isEmpty()) {

    System.out.println("Turn " + turnNumber);
    Random random = new Random();

    int cardsToDraw = random.nextInt(5) + 1;
    int cardsToDiscard = random.nextInt(5) + 1;
    int cardsToTake = random.nextInt(5 - 1 + 1) + 1;

    int actionTakenThisTurn = random.nextInt(3 - 1 + 1) + 1;

    switch (actionTakenThisTurn) {

        case 1: //Card Draw command
            System.out.println("> DRAW <");
            if (cardsToDraw > playerDeck.size())
            {
                System.out.println("No cards left to draw.");
                break;
            }

            else {

                for (int i = 0; i < cardsToDraw; i++) {
                    Card cardsDrawn = playerDeck.pop();
                    playerHand.push(cardsDrawn);

                }

                System.out.println("Drew " + cardsToDraw + " cards!");
                break;
            }


        case 2: //Discard Command
            System.out.println("> DISCARD <");
            if (playerHand.size() < cardsToDiscard)
            {
                cardsToDiscard = playerHand.size();

            }

            for (int i = 0; i < cardsToDiscard; i++)
            {
                Card cardsDiscarded = playerHand.pop();
                discardDeck.push(cardsDiscarded);

            }

            System.out.println("Discarded " + cardsToDiscard + " cards!");
            break;


        case 3: //Take form discard deck command
            System.out.println("> TAKE <");
            if (discardDeck.size() < cardsToTake) {
                cardsToTake = discardDeck.size();

            }

            for (int i = 0; i < cardsToTake; i++)
            {
                Card cardsTaken = discardDeck.pop();
                playerHand.push(cardsTaken);

            }


                System.out.println("Took " + cardsToTake + " cards out of the discard pile!");
                break;
            }
            System.out.println("Your deck: ");
            if (playerHand.isEmpty()) {
                System.out.println("Your hand is empty.");
            }

            else {
                playerHand.printStack();
            }

            System.out.println(" ");
            System.out.println("Cards remaining in the deck: " + playerDeck.size());
            System.out.println("Cards in the discard pile: " + discardDeck.size());
            System.out.println(" ");
            turnNumber++;

        }
    }
}

