package sample;

import java.util.Random;

public class Tile {

    Random random = new Random();
    private int value;

    public Tile() {value = random.nextInt(5)+5;}
    public int getValue() {return value;}
    public void setValue(int value) {this.value = value;}
}
