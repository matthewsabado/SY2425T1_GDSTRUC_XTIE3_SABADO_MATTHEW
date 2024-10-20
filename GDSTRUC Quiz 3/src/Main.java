import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Player player1 = new Player("ImMcL0vin");
        Player player2 = new Player("eggs_haver");
        Player player3 = new Player("cav3_man");
        Player player4 = new Player("Monk3yGamer");
        Player player5 = new Player("HusInParis");
        Player player6 = new Player("NotLikeUs");
        Player player7 = new Player("xXTh1ckOfItXx");
        Player player8 = new Player("HelloWorld");
        Player player9 = new Player("eefoc");
        Player player10 = new Player("H");


        Player[] playerList = {
                player1,
                player2,
                player3,
                player4,
                player5,
                player6,
                player7,
                player8,
                player9,
                player10
        };

        ArrayQueue playerQueue = new ArrayQueue(20);
        Random random = new Random();


        int turnNumber = 1;
        int foundMatches = 0;

        while (foundMatches < 10)
        {
            int playersToQueue = random.nextInt(7) + 1;
            System.out.println("Turn Number: " + turnNumber);
            System.out.println("Current Queue Size: " + playerQueue.size());
            System.out.println("Queueing " + playersToQueue + " players");

            for (int i = 0; i < playersToQueue; i++)
            {
                int randomIndex = random.nextInt(playerList.length);
                Player chosenPlayer = playerList[randomIndex];
                playerQueue.enqueue(chosenPlayer);
                System.out.println("Enqueued: " + chosenPlayer);

                if(playerQueue.size() >= 5)
                {
                    System.out.println("--MATCH FOUND--");
                    for (int j = 0; j < 5; j++)
                    {
                        Player dequeue = playerQueue.dequeue();
                    }

                    foundMatches++;
                    System.out.println("Number of matches found: " + foundMatches);

                }
            }

            System.out.println("Press Enter To Continue...");
            System.out.println("-------------------------------");
            new java.util.Scanner(System.in).nextLine();
            turnNumber++;
        }

        System.out.println("--TEN MATCHES HAVE BEEN FOUND--");
    }
}