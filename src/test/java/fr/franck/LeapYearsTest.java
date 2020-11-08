package fr.franck;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class LeapYearsTest {
    
    @Test
    void isDivisibleBy400() {
        assertEquals(true, LeapYears.isDivisibleBy400(2000));
        assertEquals(false, LeapYears.isDivisibleBy400(2019));
    }
    @Test
    void isDivisibleBy100ButNot400() {
        assertEquals(true, LeapYears.isDivisibleBy100ButNot400(1700));
        assertEquals(false, LeapYears.isDivisibleBy100ButNot400(2020));
        assertEquals(true, LeapYears.isDivisibleBy100ButNot400(1800));
        assertEquals(false, LeapYears.isDivisibleBy100ButNot400(1996));
        assertEquals(true, LeapYears.isDivisibleBy100ButNot400(1900));
    }
    @Test
    void isDivisibleBy4ButNot100(){
        assertEquals(true, LeapYears.isDivisibleBy4ButNot100(2008));
        assertEquals(false, LeapYears.isDivisibleBy4ButNot100(2007));
        }
    @Test
    void isNotDivisibleBy4() {
        assertEquals(true, LeapYears.isNotDivisibleBy4(2011));
        assertEquals(false, LeapYears.isNotDivisibleBy4(2012));
        assertEquals(true, LeapYears.isNotDivisibleBy4(2010));
        assertEquals(false, LeapYears.isNotDivisibleBy4(2008));
        assertEquals(true, LeapYears.isNotDivisibleBy4(2009));
    }
    @Test
    void isLeapYear() {
        assertEquals(true, LeapYears.isLeapYear(2020));
        assertEquals(false, LeapYears.isLeapYear(2019));
    }
  
}

