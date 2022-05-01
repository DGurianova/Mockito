package com.company;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class OtherProgramTest {

    @Test

    public void testOtherProgram() {
        MyProgram mockMyProgram = Mockito.mock(MyProgram.class);
        Mockito.when(mockMyProgram.sayHi(Mockito.anyString())).thenReturn("Hello from mock");
        OtherProgram otherProgram = new OtherProgram();
        otherProgram.printHello(mockMyProgram);
    }
}