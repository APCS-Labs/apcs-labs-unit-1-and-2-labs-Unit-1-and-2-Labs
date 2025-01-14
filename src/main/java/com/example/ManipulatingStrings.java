package com.example;
import java.util.Scanner;

public class ManipulatingStrings
{
    int phraseLength;
    int middleIndex;

    // print string with state and city name and associated information phrase
    public static void main (String[] args)
    {
        ManipulatingStrings manipulator = new ManipulatingStrings();
        manipulator.printPhraseInfo("This is a String test.");          
    }
    
    // compute the length and middle index of the phrase
    public String findMiddle3(String p) {
        String middle3 = ""; 
        return middle3;
    }

    // concatenate the firstHalf at the end of the secondHalf
    public String switchPhrase(String p) {
        findMiddle3(p);
        String firstHalf = "";
        String secondHalf = "";
        String switchedPhrase = "";
        return switchedPhrase;
    }

    // replace the blanks with astericks
    public String replaceBlanks(String p) {
        findMiddle3(p);
        String switchedPhrase = "";
        return switchedPhrase;
    }

    // print associated information phrase
    public void printPhraseInfo(String p) {
        findMiddle3(p);
        System.out.println();
        System.out.println("Original phrase: ");
        System.out.println("Length of the phrase: ");
        System.out.println("Index of the middle: ");
        System.out.println("Character at the middle index: ");
        System.out.println("Switched phrase: ");
        System.out.println("Middle 3: ");
        System.out.println();
    }
}
