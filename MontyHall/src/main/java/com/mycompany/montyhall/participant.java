/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.montyhall;

/**
 *
 * @author lumy
 */
public class participant {
    private String name;
    private int startingDoor;
    private boolean switchDoor;
    public participant(String names, int firstDoor, boolean switchD){
        name = names;
        startingDoor = firstDoor;
        switchDoor = switchD;
    }
    public int getStartingDoor(){
        return startingDoor;
    }
    public boolean getswitchDoor(){
        return switchDoor;
    }
    public String getName(){
        return name;
    }
}
