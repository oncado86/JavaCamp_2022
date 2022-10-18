package Homeworks.h04_abstractClasses;

public abstract class GameCalculator {

    public final void gameOver() {
        System.out.println("Oyun bitti.");
    }

    public abstract void calculate();
}
