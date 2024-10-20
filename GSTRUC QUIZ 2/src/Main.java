
public class Main
{
        public static void main(String[] args) {


                Player player1 = new Player(123, "Ichan", 1);
                Player player2 = new Player(121, "Gio", 1);
                Player player3 = new Player(124, "Uly", 1);

                PlayerLinkedList playerLinkedList = new PlayerLinkedList();

                playerLinkedList.addToFront(player1);
                playerLinkedList.addToFront(player2);
                playerLinkedList.addToFront(player3);


                System.out.println("Size of list " + playerLinkedList.size());
                if (playerLinkedList.contains(player3)) {
                        System.out.println("Gio is present");
                        System.out.println("Gio's index is " + playerLinkedList.indexOf(player2));
                }

                else
                {
                    System.out.println("Gio is absent");
                }

                System.out.println("\n");

                System.out.println(playerLinkedList.remove() + " was removed");

                System.out.println("\n");

                System.out.println("Size of list " + playerLinkedList.size());
                if (playerLinkedList.contains(player2)) {
                        System.out.println("Gio is present");
                        System.out.println("Gio's index is " + playerLinkedList.indexOf(player2));
                }

                else
                {
                        System.out.println("Gio is absent");
                }
        }
}
