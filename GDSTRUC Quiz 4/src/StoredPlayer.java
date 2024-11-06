public class StoredPlayer {
    public String key;
    public Player value;

    public StoredPlayer(Player value, String key) {
        this.value = value;
        this.key = key;
    }

    @Override
    public String toString() {
        return key;
    }
}
