package models;

public class Square extends Rectangle {
    private final int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }
}
