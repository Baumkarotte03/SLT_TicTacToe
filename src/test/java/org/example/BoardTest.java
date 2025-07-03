package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    private Board board;

    @BeforeEach
    void setUp() {
        board = new Board();
    }

    @Test
    public void testBoardIsEmptyOnInit() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                assertTrue(board.isCellEmpty(i, j));
            }
        }
    }

    @Test
    public void testPlaceMarker(){
        board.place(1,1,'X');
        assertFalse(board.isCellEmpty(1,1));
    }

    @Test
    public void testClearBoard(){
        board.place(0,0, 'X');
        board.place(1,0, 'O');
        board.clear();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                assertTrue(board.isCellEmpty(i, j));
            }
        }
    }

    @Test
    public void testIsFull(){
        assertFalse(board.isFull());

        char marker = 'X';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board.place(i, j, marker);
            }
        }
        assertTrue(board.isFull());
    }

}