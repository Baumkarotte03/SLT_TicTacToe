package org.example;
import java.util.Scanner;

public class TicTacToe {
    private Player player1;
    private Player player2;
    private Player currentplayer;
    private Board board = new Board();

    Scanner sc = new Scanner(System.in);


    public TicTacToe() {
        player1 = new Player('X');
        player2 = new Player('O');
        currentplayer = player1;
    }

    public void start(){
        int tempx;
        int tempy;
        for(int i = 0; i < 9; i++){
            board.print();
            System.out.println("Current Player: " + currentplayer.getMarker());
            System.out.println("please enter x");
            tempx = sc.nextInt();
            System.out.println("please enter y");
            tempy = sc.nextInt();
            while (!board.isCellEmpty(tempx, tempy)) {
                System.out.println("please enter x again");
                tempx = sc.nextInt();
                System.out.println("please enter y again");
                tempy = sc.nextInt();
            }
            board.place(tempx,tempy,currentplayer.getMarker());

            if(hasWinner()){
                System.out.println(currentplayer.getMarker() + " wins!");
                board.clear();
                break;
            }
            else if(board.isFull()){
                System.out.println("no winner!");
                board.clear();
                break;
            }
            switchCurrentPlayer();
        }
    }

    private void switchCurrentPlayer(){
        if(currentplayer == player1){
            currentplayer = player2;
        }
        else if(currentplayer == player2){
            currentplayer = player1;
        }
    }

    private boolean hasWinner() {
        char[][] boardwinner = board.getBoard();
        if (boardwinner[0][0] == boardwinner[1][0] && boardwinner[0][0] == boardwinner[2][0] && boardwinner[0][0] != ' ') {
            return true;
        } else if (boardwinner[0][1] == boardwinner[1][1] && boardwinner[0][1] == boardwinner[2][1] && boardwinner[0][1] != ' ') {
            return true;
        } else if (boardwinner[0][2] == boardwinner[1][2] && boardwinner[0][2] == boardwinner[2][2] && boardwinner[0][2] != ' ') {
            return true;
        } else if (boardwinner[0][0] == boardwinner[0][1] && boardwinner[0][0] == boardwinner[0][2] && boardwinner[0][0] != ' ') {
            return true;
        } else if (boardwinner[1][0] == boardwinner[1][1] && boardwinner[1][0] == boardwinner[1][2] && boardwinner[1][0] != ' ') {
            return true;
        } else if (boardwinner[2][0] == boardwinner[2][1] && boardwinner[2][0] == boardwinner[2][2] && boardwinner[2][0] != ' ') {
            return true;
        } else if (boardwinner[0][0] == boardwinner[1][1] && boardwinner[0][0] == boardwinner[2][2] && boardwinner[0][0] != ' ') {
            return true;
        } else if (boardwinner[0][2] == boardwinner[1][1] && boardwinner[0][2] == boardwinner[2][0] && boardwinner[0][2] != ' ') {
            return true;
        } else{
            return false;
        }
    }
}
