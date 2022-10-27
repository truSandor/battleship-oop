package com.codecool.battleship.board;

public class Square {
    private int y;
    private int x;

    private SquareStatus status;

    public Square(int y, int x, SquareStatus status){
        this.y = y;
        this.x = x;
        this.status = status;
    }

    public SquareStatus getStatus() {
        return status;
    }

    public void setStatus(SquareStatus status) {
        this.status = status;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    @Override
    public String toString() {
        return  "y = "  + y + ", x = " + x;
    }
}
