package fr.franck;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FooBarQixTest {

    @Test 
    void isDivisibleBy3() {
        assertEquals("Foo", FooBarQix.isDivisibleBy3("3"));
        assertEquals("Foo", FooBarQix.isDivisibleBy3("126"));
        assertEquals("Foo", FooBarQix.isDivisibleBy3("333"));
    }

    @Test
    void isDivisibleBy5() {
        assertEquals("Bar", FooBarQix.isDivisibleBy5("5"));
        assertEquals("Bar", FooBarQix.isDivisibleBy5("255"));
        assertEquals("Bar", FooBarQix.isDivisibleBy5("600"));
    }

    @Test
    void isDivisibleBy7() {
        assertEquals("Qix", FooBarQix.isDivisibleBy7("7"));
        assertEquals("Qix", FooBarQix.isDivisibleBy7("273"));
        assertEquals("Qix", FooBarQix.isDivisibleBy7("693"));
    }

    @Test
    void contain3ReturnFoo() {
        assertEquals("Foo", FooBarQix.contain3ReturnFoo("3"));
        assertEquals("4", FooBarQix.contain3ReturnFoo("4"));
        assertEquals("FooFoo", FooBarQix.contain3ReturnFoo("33"));
        assertEquals("FooFoo", FooBarQix.contain3ReturnFoo("343"));
        assertEquals("FooFooFooFoo", FooBarQix.contain3ReturnFoo("3433663"));
    }

    @Test
    void contain5ReturnBar() {
        assertEquals("Bar", FooBarQix.contain5ReturnBar("5"));
        assertEquals("4", FooBarQix.contain5ReturnBar("4"));
        assertEquals("BarBar", FooBarQix.contain5ReturnBar("55"));
        assertEquals("BarBar", FooBarQix.contain5ReturnBar("565"));
        assertEquals("BarBarBarBar", FooBarQix.contain5ReturnBar("5589255"));
    }

    @Test
    void contain7ReturnQix() {
        assertEquals("Qix", FooBarQix.contain7ReturnQix("7"));
        assertEquals("4", FooBarQix.contain7ReturnQix("4"));
        assertEquals("QixQix", FooBarQix.contain7ReturnQix("77"));
        assertEquals("QixQix", FooBarQix.contain7ReturnQix("787"));
        assertEquals("QixQixQixQix", FooBarQix.contain7ReturnQix("98767277"));
    }
    
    @Test
    void contain3Or5Or7ReturnFooBarOrQix() {
        assertEquals("Foo", FooBarQix.contain3Or5Or7ReturnFooBarOrQix("3"));
        assertEquals("Bar", FooBarQix.contain3Or5Or7ReturnFooBarOrQix("5"));
        assertEquals("Qix", FooBarQix.contain3Or5Or7ReturnFooBarOrQix("7"));
        assertEquals("9", FooBarQix.contain3Or5Or7ReturnFooBarOrQix("9"));
        assertEquals("FooFoo", FooBarQix.contain3Or5Or7ReturnFooBarOrQix("33"));
        assertEquals("FooFoo", FooBarQix.contain3Or5Or7ReturnFooBarOrQix("343"));
        assertEquals("BarBar", FooBarQix.contain3Or5Or7ReturnFooBarOrQix("55"));
        assertEquals("BarBar", FooBarQix.contain3Or5Or7ReturnFooBarOrQix("565"));
        assertEquals("QixQix", FooBarQix.contain3Or5Or7ReturnFooBarOrQix("77"));
        assertEquals("QixQix", FooBarQix.contain3Or5Or7ReturnFooBarOrQix("787"));
        assertEquals("FooBarQix", FooBarQix.contain3Or5Or7ReturnFooBarOrQix("3659972"));
        assertEquals("BarFooFooQixBar", FooBarQix.contain3Or5Or7ReturnFooBarOrQix("59932387115"));
    }

    @Test
    void returnFooBarQix() {
        assertEquals("8", FooBarQix.returnFooBarQix("8"));
        assertEquals("86", FooBarQix.returnFooBarQix("86"));
        assertEquals("FooFoo", FooBarQix.returnFooBarQix("3"));
        assertEquals("BarBar", FooBarQix.returnFooBarQix("5"));
        assertEquals("QixQix", FooBarQix.returnFooBarQix("7"));
        assertEquals("FooBarBar", FooBarQix.returnFooBarQix("15"));
        assertEquals("FooFooFoo", FooBarQix.returnFooBarQix("33"));
        assertEquals("FooBarQix", FooBarQix.returnFooBarQix("3659972"));

    }

    @Test
    void returnFooBarQixZeroToStar() {
        // assertEquals("1*1", FooBarQix.returnFooBarQixZeroToStar("101"));
        // assertEquals("1**4", FooBarQix.returnFooBarQixZeroToStar("1004"));
        assertEquals("FooFoo*Foo", FooBarQix.returnFooBarQixZeroToStar("303"));
        assertEquals("FooBarQix*Bar", FooBarQix.returnFooBarQixZeroToStar("105"));
        assertEquals("FooQix**", FooBarQix.returnFooBarQixZeroToStar("10101"));
    }
}
