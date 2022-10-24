package com.codecool.battleship;

public enum SquareStatus {
    EMPTY(' '), SHIP('#'), HIT('¤'), MISS('×');
private final char character;
    SquareStatus(char character) {
    this.character = character;
    }

    public char getCharacter() {
        return character;
    }
}
