package tgibbons.diceroller_s2021;

import java.util.Random;

public class Dice {

    public Integer roll(Integer numSides) {
        Random rand = new Random();
        Integer randomNum = rand.nextInt(numSides)+1;
        return randomNum;
    }
}
