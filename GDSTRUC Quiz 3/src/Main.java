import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayQueue queue = new ArrayQueue(7);

        Player player1 = new Player(123, "Ichan", 1);
        Player player2 = new Player(121, "Gio", 1);
        Player player3 = new Player(124, "Uly", 1);
        Player player4 = new Player(124, "Uly", 1);
        Player player5 = new Player(124, "Uly", 1);
        Player player6 = new Player(124, "Uly", 1);
        Player player7 = new Player(124, "Uly", 1);


        queue.enqueue(player1);
        queue.enqueue(player2);
        queue.enqueue(player3);
        queue.enqueue(player4);
        queue.enqueue(player5);
        queue.enqueue(player6);
        queue.enqueue(player7);

        Random random = new Random();

        int randomPlayers = random.nextInt(7 - 1 + 1) + 1;

        while (true)
        {
            System.out.println("\nPlayers in queue: " + queue.dequeue());
            queue.printQueue();
            System.out.println("\nDequeing: " + queue.dequeue());
            System.out.println("\nNew Front: " + queue.enqueue());
            System.out.println(" ");
            queue.printQueue();
            System.out.println("Press Enter To Continue...");
            new java.util.Scanner(System.in).nextLine();
        }

    }
}