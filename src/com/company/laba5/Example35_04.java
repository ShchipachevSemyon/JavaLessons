package com.company.laba5;

public class Example35_04 {

    private char letter;
    private int year;
    private double number;
    public Example35_04(double number) {
        this.number = number;
    }
    public char getLetter() {
        return (char) number;
    }
    public void setLetter(char letter) {
        this.letter = letter;
    }
    public int getYear() {
        return (int) number;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getNumber() {
        return (int) ((number - (int) number) * 100);
    }
    public void setNumber(double number) {
        this.number = number;
    }
}
