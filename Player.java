import java.util.Scanner;

public class Player {
    private int newCard;
    private int number;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void Start() {
        this.newCard = 5;
        this.number = BetMore_Game.Play();

        if (this.name == "player_2") {
            this.requestNewCard();
        }
    }

    public void requestNewCard() {
        Scanner newCardCheck = new Scanner(System.in);
        boolean bn = newCardCheck.nextBoolean();
        if(bn) {
            if (this.newCard > 0) {
                this.number = BetMore_Game.Play();
                this.newCard -= 1;
                }
            }
            newCardCheck.close();
            if ((this.newCard > 0 ) & (bn)) {
                this.requestNewCard();
            }
    }


    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

}