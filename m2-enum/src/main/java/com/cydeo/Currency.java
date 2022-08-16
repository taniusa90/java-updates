package com.cydeo;

public enum Currency {  //special class that hold only constants

    PENNY(1),NICKLE(5),DIME(10),QUARTER(25);//Penny is a constant object of a Currency class ;

    private int value;

    Currency(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
