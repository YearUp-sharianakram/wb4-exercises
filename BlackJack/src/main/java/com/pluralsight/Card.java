package com.pluralsight;

public class Card {

    private String suit;
    private String value;
    private boolean isFaceUp;


    public Card(String suit, String value, boolean isFaceUp) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = isFaceUp;
    }


    public String getSuit() {
        return suit;
    }

    public int getPointValue() throws Exception {

        if(isFaceUp) {
            if (this.value.equalsIgnoreCase("A")) {
                return 11;
            } else if (this.value.equalsIgnoreCase("K")) {
                return 10;
            } else if (this.value.equalsIgnoreCase("Q")) {
                return 10;
            } else if (this.value.equalsIgnoreCase("J")) {
                return 10;
            } else if (this.value.equalsIgnoreCase("10")) {
                return 10;
            } else if (this.value.equalsIgnoreCase("9")) {
                return 9;
            } else if (this.value.equalsIgnoreCase("8")) {
                return 8;
            } else if (this.value.equalsIgnoreCase("7")) {
                return 7;
            } else if (this.value.equalsIgnoreCase("6")) {
                return 6;
            } else if (this.value.equalsIgnoreCase("5")) {
                return 5;
            } else if (this.value.equalsIgnoreCase("4")) {
                return 4;
            } else if (this.value.equalsIgnoreCase("3")) {
                return 3;
            } else if (this.value.equalsIgnoreCase("2")) {
                return 2;
            } else {
                throw new Exception("Invalid Card Value");
            }
        }
        throw new Exception("Cant get value of face down card");

    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void flip(){
        this.isFaceUp =!isFaceUp;
    }

}
