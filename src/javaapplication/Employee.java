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
public class Employee {
    private String name;
    private double salary;
    public Employee(String employeeName, double currentSalary){
        this.name = employeeName;
        this.salary = currentSalary;
    }
public String getName(){
    return this.name;
}
public double getSalary(){
    return this.salary;
}
public void raiseSalary(double byPercent){
    this.salary = this.salary + ( this.salary * byPercent );
}
}
