public class BetMore_Game{

    public BetMore_Game() {

    }

    public static int Play() {
        return Shuffle.pick_card();
    }

    public static Player FindWinner(Player a, Player b) {
        if (a.getNumber() > b.getNumber()) {
            return a;
        } else if (a.getNumber() < b.getNumber()) {
            return b;
        } else {
            return null;
        }
    }
}