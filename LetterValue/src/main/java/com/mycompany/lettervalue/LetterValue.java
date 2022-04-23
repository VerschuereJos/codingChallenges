/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lettervalue;

/**
 *
 * @author lumy
 */
public class LetterValue {
    public static void main(String[] args) {
        char[] valueTable = tableCreation();
        
        String word = "cab";
        int wordValue = 0;
        
        for(int i = 0;i<word.length();i++){
            for(int j = 0;j<(valueTable.length);j++){
                if(word.charAt(i)==valueTable[j]){
                   System.out.print(valueTable[j]); 
                   wordValue = wordValue + j + 1;
                }
                    
            }
        }
        System.out.print(wordValue);
    }
    public static char[] tableCreation(){
        char[] valueTable = new char[26];
        valueTable[0]= 'a';
        valueTable[1]= 'b';
        valueTable[2]= 'c';
        valueTable[3]= 'd';
        valueTable[4]= 'e';
        valueTable[5]= 'f';
        valueTable[6]= 'g';
        valueTable[7]= 'h';
        valueTable[8]= 'i';
        valueTable[9]= 'j';
        valueTable[10]= 'k';
        valueTable[11]= 'l';
        valueTable[12]= 'm';
        valueTable[13]= 'n';
        valueTable[14]= 'o';
        valueTable[15]= 'p';
        valueTable[16]= 'q';
        valueTable[17]= 'r';
        valueTable[18]= 's';
        valueTable[19]= 't';
        valueTable[20]= 'u';
        valueTable[21]= 'v';
        valueTable[22]= 'w';
        valueTable[23]= 'x';
        valueTable[24]= 'y';
        valueTable[25]= 'z';
        return valueTable;
    }
}
