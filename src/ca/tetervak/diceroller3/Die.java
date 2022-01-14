package ca.tetervak.diceroller3;

public class Die {

    public static final int INIT_DIE_VALUE = 1;

    private boolean isRolled = false;

    public boolean isRolled() {
        return isRolled;
    }

    private void setRolled(boolean rolled) {
        isRolled = rolled;
    }

    private int value = INIT_DIE_VALUE;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value >= 1 && value <= 6) {
            this.value = value;
        } else {
            System.err.println("Illegal die value " + value);
            throw new IllegalArgumentException("Illegal die value " + value);
        }
    }

    public Die() {
    }

    public Die(boolean isRolled, int value) {
        this();
        this.isRolled = isRolled;
        this.value = value;
    }

    public void roll(){
        setValue(1 + (int)(6*Math.random()));
        isRolled = true;
    }

    public void reset(){
        value = INIT_DIE_VALUE;
        isRolled = false;
    }

    @Override
    public String toString(){
        return "Die{ isRolled = " + isRolled + ", " + "value = " + value + "}";
    }
}
