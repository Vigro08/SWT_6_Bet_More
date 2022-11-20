public class Game_Chair {

    public static void Start_Game() {

        Player computer = new Player("computer");
        Player player_2 = new Player("player_2");

        computer.Start();
        player_2.Start();

        Player x = BetMore_Game.FindWinner(computer, player_2);
        if (x == null) {
            System.out.println("The game is tied");
        } else {
            System.out.println("The winner is: " + x.getName());
        }
        
    }
}