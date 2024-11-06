//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Player player1 = new Player(122, "XJohnnyX");
        Player player2 = new Player(123, "Garris");
        Player player3 = new Player(124, "Harry");
        Player player4 = new Player(125, "Jerry");
        Player player5 = new Player(125, "Lars");
        Player player6 = new Player(125, "Johnson");

        SimpleHashTable hashtable = new SimpleHashTable();
        hashtable.put(player1.getName(), player1);
        hashtable.put(player2.getName(), player2);
        hashtable.put(player3.getName(), player3);
        hashtable.put(player4.getName(), player4);
        hashtable.put(player5.getName(), player5);
        hashtable.put(player6.getName(), player6);

        hashtable.printHashtable();

        System.out.println(" ");
        hashtable.remove("Johnson");
        System.out.println(" ");
        hashtable.printHashtable();
    }
}