package ca.tetervak.diceroller3;

import java.util.ArrayList;
import java.util.List;

public class Game {

    public static int NUM_OF_DICE = 3;

    private final List<Die> dice;

    public Game() {
        dice = new ArrayList<>(NUM_OF_DICE);
        for(int i = 0; i < NUM_OF_DICE; i++){
            dice.add(new Die());
        }
    }

    public List<Die> getDice() {
        return dice;
    }

    private boolean isRolled = false;

    public boolean isRolled() {
        return isRolled;
    }

    private void setRolled(boolean rolled) {
        isRolled = rolled;
    }

    public int getTotal(){
        if(isRolled){
            var sum = 0;
            for(Die die: dice){
                sum += die.getValue();
            }
            return sum;
        }else{
            return 0;
        }
    }

    public void roll(){
        for(Die die: dice){
            die.roll();
        }
        isRolled = true;
    }

    public void reset(){
        for(Die die: dice){
            die.reset();
        }
        isRolled = false;
    }

    @Override
    public String toString(){
        String ret = "Game{\n isRolled = " + isRolled + ",\n";
        for(Die die: dice){
            ret += " " + die + ",\n";
        }
        ret += " total = " + getTotal() + "\n}";
        return ret;
    }
}
