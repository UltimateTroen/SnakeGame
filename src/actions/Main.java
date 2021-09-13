package actions;

import clocks.GameClock;
import gui.GUI;

public class Main {

    public static void main(String[] args) {

        GUI g = new GUI();
        GameClock gc = new GameClock();

        g.create();
        gc.start();
    }
}
