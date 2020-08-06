package snakes;

import board.*;

import java.awt.*;

/**
 * Only for Debugging or Testing. This snake is controllable with the arrows on the keyboard
 */
public class DebugSnake extends Snake {

    public int direction = RIGHT;

    public DebugSnake() {
        this.NAME = "DebugSnake";                  // everybody can set his favorite name
        this.COLOR = new Color(0, 80, 0); // everybody can set his favorite color

    }

    /**
     * Main function for every intelligence of the snake
     *
     * @param board the whole board with every information necessary
     * @return direction in which the snake should move
     */
    @Override
    public int think(BoardInfo board) {
        return direction;
    }
}