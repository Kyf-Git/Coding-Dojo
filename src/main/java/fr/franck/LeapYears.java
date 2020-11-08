package fr.franck;

public class LeapYears {
    
    public static boolean isDivisibleBy400(int year) {
        if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isDivisibleBy100ButNot400(int year) {
        if ((year % 100 == 0) && (year % 400 !=0)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isDivisibleBy4ButNot100(int year) {
        if ((year % 4 == 0) && (year % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isNotDivisibleBy4(int year) {
        if (year % 4 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isLeapYear(int year) {
        if (isDivisibleBy400(year) || isDivisibleBy4ButNot100(year)) {
            return true;
        } else if (isDivisibleBy100ButNot400(year) || isNotDivisibleBy4(year)) {
            return false;
        } else {
            return false;
        }
    }
    
}

