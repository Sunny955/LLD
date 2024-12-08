package org.lld_practice.TicTacToe;

import org.apache.commons.lang3.tuple.Pair;
import org.lld_practice.TicTacToe.Model.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("resource")
public class GameRunner {
    Deque<Player> players;
    Board gameBoard;

    GameRunner() {
        initGame();
    }

    public void initGame() {
        // Creating players and assigning pieces
        players = new LinkedList<>();

        PlayingPieceX cross = new PlayingPieceX();
        Player p1 = new Player("Shubham", cross);

        PlayingPieceO zero = new PlayingPieceO();
        Player p2 = new Player("Nandi", zero);

        players.add(p1);
        players.add(p2);

        // initialize game board
        gameBoard = new Board(3);
    }

    public String startGame() {
        boolean noWinner = true;
        Scanner sc = new Scanner(System.in);
        while (noWinner) {
            Player playerTurn = players.remove(); // remove and gives you first player

            gameBoard.printBoard();
            List<Pair<Integer, Integer>> freeSpaces = gameBoard.getFreeCells();
            if (freeSpaces.isEmpty()) {
                noWinner = false;
                continue;
            }

            // Read user input
            System.out.print("Player: " + playerTurn.getName() + " Enter row,column: ");
            String s = sc.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.parseInt(values[0]);
            int inputCol = Integer.parseInt(values[1]);

            boolean pieceAdded = gameBoard.addPiece(inputRow, inputCol, playerTurn.getPlayingPiece());
            if (!pieceAdded) {
                System.out.println("Incorrect position chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner = isThereWinner(inputRow, inputCol, playerTurn.getPlayingPiece().pieceType);

            if (winner) {
                return playerTurn.getName();
            }
        }
        sc.close();
        return "tie";
    }

    public boolean isThereWinner(int row, int col, PieceType pieceType) {
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        // need to check in row
        for (int i = 0; i < gameBoard.size; i++) {

            if (gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType != pieceType) {
                rowMatch = false;
            }
        }

        // need to check in column
        for (int i = 0; i < gameBoard.size; i++) {

            if (gameBoard.board[i][col] == null || gameBoard.board[i][col].pieceType != pieceType) {
                columnMatch = false;
            }
        }

        // need to check diagonals
        for (int i = 0, j = 0; i < gameBoard.size; i++, j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                diagonalMatch = false;
            }
        }

        // need to check anti-diagonals
        for (int i = 0, j = gameBoard.size - 1; i < gameBoard.size; i++, j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;

    }
}
