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
public class BugTester {
    public static void main(String[] args) {
        Bug bugsy = new Bug(10);
        bugsy.move(); // Now the position is 11
        System.out.println(bugsy.getPosition());
        bugsy.turn();
        System.out.println(bugsy.getPosition());
        bugsy.move(); // Now the position is 10
        System.out.println(bugsy.getPosition());

    }
}
