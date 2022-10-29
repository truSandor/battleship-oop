package com.codecool.battleship.utils;

import com.codecool.battleship.board.Square;
import com.codecool.battleship.board.SquareStatus;

import java.util.Scanner;

import static com.codecool.battleship.utils.Constans.*;
import static com.codecool.battleship.utils.Constans.FIELD_SIZE_IN_PIXEL;


public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public boolean isValidInput(Square square) {
        //TODO
        throw new RuntimeException("Not implemented yet!");
//        return false;
    }

    public boolean isValidCoordinate(String input) {
        String X = input.substring(0, 1);
        int XintValue = X.toUpperCase().charAt(0);
        if (XintValue < 'A' || XintValue > 'A' + BOARD_SIZE - 1) return false;
        String Y = input.substring(1);
        return Y.chars().allMatch(Character::isDigit) && Integer.parseInt(Y) >= 1 && Integer.parseInt(Y) <= BOARD_SIZE;
    }

    public Square turnInputIntoSquare(String coordinate, SquareStatus status){
        int x =(coordinate.substring(0,1).toUpperCase().charAt(0)-CHARACTER_TO_BOARD_CORRECTION)*FIELD_SIZE_IN_PIXEL;
        int y = Integer.parseInt(coordinate.substring(1))*FIELD_SIZE_IN_PIXEL;
        return new Square(y,x,status);
    }

    public int[] guiInputToPositionInPixel(String coordinate){
        int x =(coordinate.substring(0,1).toUpperCase().charAt(0)-CHARACTER_TO_BOARD_CORRECTION)*FIELD_SIZE_IN_PIXEL;
        int y = Integer.parseInt(coordinate.substring(1))*FIELD_SIZE_IN_PIXEL;
        return new int[]{x,y};
    }

    public String readInput(String msg) {
        new Display().printGameMessage(msg);
        return scanner.nextLine();
    }

    public boolean isPositionFormatValid(String inputPos) {
        //TODO
        throw new RuntimeException("Not implemented yet!");
//        return false;
    }
}
