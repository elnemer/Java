/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp 15 -ay
 */
public class Student {
    private String name;
    private double total;
    private int numberOfQuzies;
    public Student(String name){
    this.name = name;
    }
    public Student(double total, int numberOfQuzies){
    this.total = total;   
    this.numberOfQuzies = numberOfQuzies;
    }  
    public Student(String name,double total,int numberOfQuzies){
    this.name = name;
    this.total = total;   
    this.numberOfQuzies = numberOfQuzies;
    }    
    public String getName(){
        return this.name;
    }
    public void addQuiz(int score){
        this.numberOfQuzies = numberOfQuzies + 1;
        this.total = this.total + score;
    }
    public double getTotalScore(){
        return this.total;
    }
    public double getAverageScore(){
        double aver = this.total / this.numberOfQuzies;
        return aver;
    }    
}
