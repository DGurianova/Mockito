package com.company;

public class Main {

    public static void main(String[] args) {
        OtherProgram newProgram = new OtherProgram();
        MyProgram newMyProgram = new MyProgram();
        newProgram.printHello(newMyProgram);
    }
}
