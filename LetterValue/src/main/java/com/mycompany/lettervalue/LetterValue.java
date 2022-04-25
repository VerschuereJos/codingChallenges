/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lettervalue;

import java.util.Scanner;

/**
 *
 * @author lumy
 */
public class LetterValue {
    public static void main(String[] args) {
        int[] valueTable = tableCreation();
        int wordValue = 0;
        //obtaining the word via user input
        Scanner reader = new Scanner(System.in);
        System.out.println("input a word to get its value");
        String word = reader.nextLine();
        //determining the wordvalue by checking the array
        for(int i = 0;i<word.length();i++){
            wordValue += valueTable[word.charAt(i)];
        }
        System.out.print(wordValue);
    }
    //creation of the array with the letter values, 
    //with the position in the array corresponding to the decimal ASCII value of the letter.
    public static int[] tableCreation(){
        int[] valueTable = new int[123];
        for(int i = 1 ; i<27; i++ ){    
            valueTable[(char) (i+64)] = i ;
            valueTable[(char) (i+96)] = i ;   
        }
        return valueTable;
    }
}
