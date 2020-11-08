package fr.franck;

// import java.util.regex.Pattern;
// import java.util.regex.Matcher;

public class FooBarQix {

    public static String isDivisibleBy3(String string) {
        String result = "";
        String number = string;

        int x = Integer.parseInt(number);

        if ((x % 3) == 0) {
            result = "Foo";
        }

        return result;
    }

    public static String isDivisibleBy5(String string) {
        String result = "";
        String number = string;

        int x = Integer.parseInt(number);

        if ((x % 5) == 0) {
            result = "Bar";
        }

        return result;
    }

    public static String isDivisibleBy7(String string) {
        String result = "";
        String number = string;

        int x = Integer.parseInt(number);

        if ((x % 7) == 0) {
            result = "Qix";
        }

        return result;
    }

    public static String contain3ReturnFoo(String string) {

        String[] splitString = string.split("");
        String result = "";

        for (int i = 0; i < splitString.length; i++) {
            if (splitString[i].equals("3"))
                result += "Foo";
        }
        if (result.equals("")) {
            result = string;
        }
        return result;
    }

    public static String contain5ReturnBar(String string) {

        String[] splitString = string.split("");
        String result = "";

        for (int i = 0; i < splitString.length; i++) {
            if (splitString[i].equals("5"))
                result += "Bar";
        }
        if (result.equals("")) {
            result = string;
        }
        return result;
    }

    public static String contain7ReturnQix(String string) {

        String[] splitString = string.split("");
        String result = "";

        for (int i = 0; i < splitString.length; i++) {
            if (splitString[i].equals("7"))
                result += "Qix";
        }
        if (result.equals("")) {
            result = string;
        }
        return result;
    }

    public static String contain3Or5Or7ReturnFooBarOrQix(String string) {
        String result = "";
        String[] splitString = string.split("");

        for (int i = 0; i < splitString.length; i++) {
            if (splitString[i].equals("3")) {
                result += "Foo";
            } else if (splitString[i].equals("5")) {
                result += "Bar";
            } else if (splitString[i].equals("7")) {
                result += "Qix";
            }
        }
        if (result.equals("")) {
            result = string;
        }
        return result;
    }

    public static String returnFooBarQix(String string) {
        String result = "";

        result += isDivisibleBy3(string);
        result += isDivisibleBy5(string);
        result += isDivisibleBy7(string);
        result += contain3Or5Or7ReturnFooBarOrQix(string);

        if (result.equals("")) {
            result = string;
        }

        return result;

    }

    public static String returnFooBarQixZeroToStar(String string) {
        String result = "";
        String[] splitString = string.split("");

        result += isDivisibleBy3(string);
        result += isDivisibleBy5(string);
        result += isDivisibleBy7(string);

        for (int i = 0; i < splitString.length; i++) {
            if (splitString[i].equals("3")) {
                result += "Foo";
            } else if (splitString[i].equals("5")) {
                result += "Bar";
            } else if (splitString[i].equals("7")) {
                result += "Qix";
            } else if (splitString[i].equals("0")) {
                result += "*";
            }
        }

        // Ne fonctionne pas...
        if (result.equals("")) {
        result = string;
        result.replaceAll("0", "*");
        // Condition pour le cas 101 => 1*1,
        // ne fonctionne pas alors qu'elle me semble logique.
        // j'ai essayé bien d'autre façon (cf par exemple com
        // en dessous)
        }

        if (result.equals(""))
            result = string;

        return result;

        // Autre tentative infructueuse...

        // Pattern p = Pattern.compile("[357]");
        // Matcher m = p.matcher(string);

        // if (!m.matches()) {
        // for (int i = 0; i < splitString.length; i++) {
        // if (splitString[i].equals("0")) {
        // result += "*";
        // }
        // if (!splitString[i].equals("0")) {
        // result += splitString[i];
        // }
        // }
        // }



        // Pattern p = Pattern.compile("[124689]");
        // Matcher m = p.matcher(result);

        // if (m.matches()) {
        //     for (int i = 0; i < splitString.length; i++) {
        //         if (splitString[i].equals("0")) {
        //             result += "*";
        //         }
        //         if (!splitString[i].equals("0")) {
        //             result += splitString[i];
        //         }
        //     }
        // }
    }
}