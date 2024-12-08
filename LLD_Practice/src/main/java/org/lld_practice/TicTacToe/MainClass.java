package org.lld_practice.TicTacToe;

public class MainClass {
    public static void main(String[] args) {
        GameRunner game = new GameRunner();
        game.initGame();
        System.out.println("Game winner is: "+game.startGame());
    }
}
