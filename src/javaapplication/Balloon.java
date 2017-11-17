/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp 15 -ay
 */
public class Balloon {
    private double r = 0;
    public void inflate(double amount){
        r += amount;
    }
    public double getVolume(){
        //V = (4/3) * Pi * R^3 
        double v = (4/3.0) * Math.PI * (r*r*r);
        return v;
    }
}
