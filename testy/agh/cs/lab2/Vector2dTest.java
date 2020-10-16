package agh.cs.lab2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vector2dTest {

    @Test
    void testToString() {
        Vector2d position = new Vector2d(1,2);
        String points = position.toString();
        Assertions.assertEquals("(1,2)", points);
    }

    @Test
    void precedes() {
        Vector2d position1 = new Vector2d(1, 2);
        Vector2d position2 = new Vector2d(2, 3);
        boolean lower = position1.precedes(position2);
        Assertions.assertEquals(true, lower);
    }

    @Test
    void follows() {
        Vector2d position1 = new Vector2d(1, 2);
        Vector2d position2 = new Vector2d(2, 3);
        boolean higher = position2.follows(position1);
        Assertions.assertEquals(true, higher);
    }

    @Test
    void upperRight() {
        Vector2d position1 = new Vector2d(1, 4);
        Vector2d position2 = new Vector2d(2, 3);

        Vector2d position3 = new Vector2d(2, 4);
        Assertions.assertEquals(position3, position1.upperRight(position2));

    }

    @Test
    void lowerLeft() {
        Vector2d position1 = new Vector2d(1, 4);
        Vector2d position2 = new Vector2d(2, 3);

        Vector2d position3 = new Vector2d(1, 3);
        Assertions.assertEquals(position3, position1.lowerLeft(position2));
    }

    @Test
    void add() {
        Vector2d position1 = new Vector2d(1, 4);
        Vector2d position2 = new Vector2d(2, 3);

        Vector2d position3 = new Vector2d(3, 7);
        Assertions.assertEquals(position3, position1.add(position2));
    }

    @Test
    void subtract() {
        Vector2d position1 = new Vector2d(1, 4);
        Vector2d position2 = new Vector2d(2, 3);

        Vector2d position3 = new Vector2d(-1, 1);
        Assertions.assertEquals(position3, position1.subtract(position2));
    }

    @Test
    void testEquals() {
        Vector2d position1 = new Vector2d(1, 4);
        Vector2d position2 = new Vector2d(1, 4);
        Vector2d position3 = new Vector2d(3, 7);
        Assertions.assertEquals(true, position1.equals(position2));
        Assertions.assertEquals(false, position1.equals(position3));
    }

    @Test
    void opposite() {
        Vector2d position1 = new Vector2d(1, 4);
        Vector2d position2 = new Vector2d(-1, -4);
        Assertions.assertEquals(position2, position1.opposite());
    }
}