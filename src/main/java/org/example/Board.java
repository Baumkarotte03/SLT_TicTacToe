package org.example;

public class Board {
    private char[][] board;

    public Board() {
        board = new char[3][3];
        clear();
    }

    public boolean isCellEmpty(int x, int y) {
        return board[x][y] == ' ';
    }

    public void place(int x, int y, char marker) {
        board[x][y] = marker;
    }

    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(board[i][j] == ' '){
                    return false;
                }
            }
        }
        return true;
    }

    public void clear(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public void print(){
        System.out.println("  ---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
            if(i < 2){
                System.out.println("  ---------");
            }
        }
        System.out.println("  ---------");
    }

    public char[][] getBoard() {
        return board;
    }

}
