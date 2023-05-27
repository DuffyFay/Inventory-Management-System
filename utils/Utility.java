package com.finalproject.InventoryManagementSystem.utils;

import java.util.Scanner;

 /**
 The function of Utility:
 Handle user input in a variety of situations
 and obtain user console input as needed by the programmer

  Name: Ming Zhong
  ID: R00240259

 */


public class Utility {
    //static
    private static Scanner scanner = new Scanner(System.in);


    /**
     * Function: Read a menu option entered by the keyboard
     * value: range from 1 to 5
     * @return 1——5
     */
    public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1, false);
            c = str.charAt(0);//Convert string to character char type
            if (c != '1' && c != '2' &&
                    c != '3' && c != '4' && c != '5') {
                System.out.print("Wrong enter, please re-enter:");
            } else break;
        }
        return c;
    }


    /**
     * Function: read a character entered by the keyboard
     * @return a character
     */
    public static char readChar() {
        String str = readKeyBoard(1, false);
        return str.charAt(0);
    }


    /**
     * Function: Reads a keyboard character
     * if you press Enter directly, it returns the default value
     * otherwise, it returns the input character
     * @param defaultValue The default value specified
     * @return Default value or entered character
     */
    public static char readChar(char defaultValue) {
        String str = readKeyBoard(1, true);//Either an empty string or a character
        return (str.length() == 0) ? defaultValue : str.charAt(0);
    }


    /**
     * Function: read the integer input by the keyboard
     * the length is less than 2 digits
     * @return int
     */
    public static int readInt() {
        int n;
        for (; ; ) {
            String str = readKeyBoard(10, false);//An integer, length <= 10 bits
            try {
                n = Integer.parseInt(str);//convert string to integer
                break;
            } catch (NumberFormatException e) {
                System.out.print("Number input error, input NUMBER ONLY, please re-enter:");
            }
        }
        return n;
    }


    /**
     * Function: read the integer or default value entered by the keyboard
     * return the default value if you hit Enter directly
     * otherwise return the entered integer
     * @param defaultValue the default value specified
     * @return int
     */
    public static int readInt(int defaultValue) {
        int n;
        for (; ; ) {
            String str = readKeyBoard(10, true);
            if (str.equals("")) {
                return defaultValue;
            }

            //exception
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("Number input error, please re-enter:");
            }
        }
        return n;
    }


    /**
     * Function: Read a String of specified length entered by the keyboard
     * @param limit limited length
     * @return /
     */
    public static String readString(int limit) {
        return readKeyBoard(limit, false);
    }


    /**
     * Function: Read a string entered by the keyboard or a default value of the specified length
     * if you press Enter immediately, the default value is returned
     * otherwise, the string is returned
     * @param limit limited length
     * @param defaultValue the default value specified
     * @return str
     */

    public static String readString(int limit, String defaultValue) {
        String str = readKeyBoard(limit, true);
        return str.equals("")? defaultValue : str;
    }


    /**
     * Function: confirmation option, read the keyboard's Y or N.
     * Encapsulate small function into a single method.
     * @return Y or N
     */
    public static char readConfirmSelection() {
        System.out.println("Choose carefully, Please enter your choice (Y/N):");
        char c;
        for (; ; ) {//Infinite loop
            //The received characters are changed to uppercase letters
            //y => Y n=>N
            String str = readKeyBoard(1, false).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.print("Wrong enter, please enter again:");
            }
        }
        return c;
    }

    /**
     * Function: read a string
     * @param limit read length
     * @param blankReturn   If it is true, it means that the empty string can be read.
     *                      If false, empty strings cannot be read.
     *
     *	It will display to re-enter if the input is empty or longer than the permitted length.
     * @return str
     */
    private static String readKeyBoard(int limit, boolean blankReturn) {

        //defines the string
        String line = "";

        //scanner.hasNextLine() determine whether there is a next line
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();//read this line

            //If line.length=0, that is, the user has not entered any content, return Enter
            if (line.length() == 0) {
                if (blankReturn) return line;//If blankReturn=true, an empty string can be returned
                else continue; //If blankReturn=false, empty strings are not accepted, and content must be entered
            }

            //If the content entered by the user is greater than the limit, prompt to rewrite the input
            //If the content of the user such as >0 <= limit , it accept
            if (line.length() < 1 || line.length() > limit) {
                System.out.print("Input length (cannot be greater than " + limit + ") error, please try again:");
                continue;
            }
            break;
        }

        return line;
    }
}