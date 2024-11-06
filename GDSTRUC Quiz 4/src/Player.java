public class Player {
    int playerID;
    String name;
    int level;

    public Player(int playerID, String name) {
        this.playerID = playerID;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }


}