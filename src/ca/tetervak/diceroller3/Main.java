package ca.tetervak.diceroller3;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Sheridan!");

        Die die = new Die();
        System.out.println("Step 1: die.value = " + die.getValue());

        die.roll();
        System.out.println("Step 2: die.value = " + die.getValue());

        die.reset();
        System.out.println("Step 3: die.value = " + die.getValue());

        System.out.println("Step 4: die = " + die);

        Game game = new Game();
        System.out.println("Step 5:\ngame = " + game);

        game.roll();
        System.out.println("Step 6:\ngame = " + game);

        game.reset();
        System.out.println("Step 7:\ngame = " + game);
    }
}
