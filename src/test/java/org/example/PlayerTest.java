package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    public void x_marker_in_constructor_is_x_marker_in_getter() {
        char marker = 'X';
        Player player = new Player(marker);

        char result = player.getMarker();

        assertEquals(marker, result);
    }
}