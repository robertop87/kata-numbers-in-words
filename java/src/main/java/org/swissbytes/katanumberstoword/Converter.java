package org.swissbytes.katanumberstoword;

/**
 *
 * @author sb_dojo
 */
class Converter {

    //number to word
    int getNumber(String digitWord) {
        String lowerWord = digitWord.toLowerCase();
        switch (lowerWord.trim()) {
            case "one":
                return 1;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            case "zero":
                return 0;
            default:
                throw new NumberFormatException("this is not a number");
        }
    }

    String getWord(int i) {
        if(i<0){       
            throw new IllegalArgumentException("Invalid Amount");
        }
        switch (i) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eigth";
            case 9:
                return "nine";
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fiveteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eigthteen";
            case 19:
                return "nineteen";
            case 20:
                return "twenty";
            default: 
                throw new IllegalArgumentException("Invalid Amount");
        }
        
    }

}
