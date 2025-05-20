package models;

import models.rectangle.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    @Test
    void shouldCalculateAreaOfSquare() {
        Square square = new Square(5);

        assertEquals(25, square.area());
    }

    @Test
    void shouldCalculateAreaOfSquareOfSideZero() {
        Square square = new Square(0);

        assertEquals(0,square.area());
    }
}
