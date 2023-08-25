package com.kodnest.cc;

public class Main {

    public static void identifyCharacter(char ch) {
        Character character = ch;
        
        if (Character.isLowerCase(character)) {
            if (character.equals('a') || character.equals('e') || character.equals('i') || character.equals('o') || character.equals('u')) {
                System.out.println("Lower-case vowel");
            } else {
                System.out.println("Lower-case consonant");
            }
        } else if (Character.isUpperCase(character)) {
            if (character.equals('A') || character.equals('E') || character.equals('I') || character.equals('O') || character.equals('U')) {
                System.out.println("Upper-case vowel");
            } else {
                System.out.println("Upper-case consonant");
            }
        } else if (Character.isDigit(character)) {
            System.out.println("Digit");
        } else {
            System.out.println("Special character");
        }
    }

    public static void main(String[] args) {
        identifyCharacter('a');
    }
}

	
	
	