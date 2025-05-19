package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void shouldCalculateArea() {
        Rectangle rectangle = new Rectangle(1, 1);

        assertEquals(1, rectangle.area());
    }

    @Test
    void shouldCalculateAreaForWidthZero() {
        Rectangle rectangle = new Rectangle(2, 0);

        assertEquals(0, rectangle.area());
    }

    @Test
    void shouldCalculatesAreaForLengthZero() {
        Rectangle rectangle = new Rectangle(0, 6);

        assertEquals(0, rectangle.area());
    }

    @Test
    void shouldCalculatePerimeter() {
        Rectangle rectangle = new Rectangle(1, 1);

        assertEquals(4, rectangle.perimeter());
    }

    @Test
    void shouldCalculatePerimeterForWidthZero() {
        Rectangle rectangle = new Rectangle(4, 0);

        assertEquals(8,rectangle.perimeter());
    }
}