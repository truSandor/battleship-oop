package com.codecool.battleship.board;

import com.codecool.battleship.ship.Ship;

public class Board {
    private Square[][] ocean;
    public Board(int size){
        ocean = new Square[size][size];
    }

    public Square[][] createEmptyBoard(){
        for (int i = 0; i < ocean.length; i++) {
            for (int j = 0; j < ocean.length; j++) {
                ocean[i][j]=new Square(i, j, SquareStatus.EMPTY);
            }
        }
        return ocean;
    }

    public Square[][] getOcean() {
        return ocean;
    }

    public boolean isPlacementOk(Square square, Ship ship){
        //TODO
        return false;
    }
}
