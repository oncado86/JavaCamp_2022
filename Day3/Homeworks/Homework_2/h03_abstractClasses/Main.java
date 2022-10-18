package Homeworks.h04_abstractClasses;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GameCalculator> gameCalculators = new ArrayList<>(){{
            add(new KidsGameCalculator());
            add(new ManGameCalculator());
            add(new OlderGameCalculator());
            add(new WomanGameCalculator());
            }
        };

        for (GameCalculator gameCalculator : gameCalculators) {
            gameCalculator.gameOver();
            gameCalculator.calculate();
            System.out.println();
        }
    }
}
