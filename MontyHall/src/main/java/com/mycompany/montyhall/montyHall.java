/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.montyhall;
import static java.lang.Math.abs;
import java.util.Random;
/**
 *
 * @author lumy
 */
public class montyHall {
    public static void main(String[] args) {
        
        
        int timesAmount = 10000;
        //creation of the participants
        participant part1 = new participant("alice",1,false);
        participant part2 = new participant("bob",1,true);
        
        int part1Won = calculation(part1, timesAmount);
        int part2Won = calculation(part2, timesAmount);
        //declaration of the results
        System.out.println(part1.getName()+"won a total of "+part1Won+" times, out of "+timesAmount);
        System.out.println(part2.getName()+"won a total of "+part2Won+" times, out of "+timesAmount);
        
    }
    public static int calculation(participant part, int amount){
        Random rand = new Random();
        int doorOpened ;
        int timesWon = 0;
        for(int i = 0 ;i < amount; i++){
            int doorReward = rand.nextInt(3) + 1;
            doorOpened = (abs(doorReward - part.getStartingDoor()));
            //checking wether or not the participant won
            if((doorOpened != 0)&&(part.getswitchDoor())){
                timesWon ++;
            }else if ((doorOpened ==0)&&(!part.getswitchDoor())){
                timesWon ++;
            }
        }
        return timesWon ;
    }
}
