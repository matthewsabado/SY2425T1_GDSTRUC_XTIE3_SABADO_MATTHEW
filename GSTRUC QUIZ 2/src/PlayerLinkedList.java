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

    public String remove()
    {

    if (head == null)
    {
        return null;
    }
        Player removedPlayer = head.getPlayer();
        head = head.getNextPlayer();
        return removedPlayer.name;
    }


    public boolean contains(Player player)
    {
        PlayerNode current = head;

        while (current != null)
        {
            if (current.getPlayer().equals(player))
            {
                return true;
            }

            current = current.getNextPlayer();
        }

        return false;
    }

    public int indexOf(Player player)
    {
        PlayerNode current = head;

        int index = 0;

        while (current != null)
        {
            if (current.getPlayer().equals(player))
            {
                return index;
            }

            current = current.getNextPlayer();
            index++;

        }

        return 0;
    }

    public int size()
    {
       int size = 0;
       PlayerNode current = head;

       while (current != null)
        {
            size++;
            current = current.getNextPlayer();
        }
            return size;
    }
}