/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 *
 * @author hp 15 -ay
 */
public class Bug {
    private int position;
    public Bug(int initialPosition){
        this.position = initialPosition;
    }
    public void turn(){
        this.position = this.position -2;
    }
    public void move(){
        this.position = this.position +1;
    }
    public int getPosition(){
        return this.position;
    }
}
