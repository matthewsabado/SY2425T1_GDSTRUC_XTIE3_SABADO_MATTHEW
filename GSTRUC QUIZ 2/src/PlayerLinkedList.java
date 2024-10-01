public class PlayerLinkedList {
    PlayerNode head;

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    public void printList()
    {
        PlayerNode current = head;
        System.out.print("Head->");
        while (current != null)
        {
            System.out.print(current.getPlayer() + "->");
            current = current.getNextPlayer();
        }
        System.out.print("null");
    }

    /*public Player remove()
    {

    }

    public bool contains()
    {}

    public int indexOf()
    {}

    public int size()
    {} */
}