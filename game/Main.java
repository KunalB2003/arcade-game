package game;

import static game.Constants.GAME_NAME;

import game.frame.GameFrame;

public class Main {

    public static void main(String[] args) {
        GameFrame game = new GameFrame(GAME_NAME);
        game.setVisible(true);
    }

}