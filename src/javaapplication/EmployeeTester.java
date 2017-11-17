
import lab.Employee;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp 15 -ay
 */
public class EmployeeTester {
    public static void main(String[] args) {
        Employee harry = new Employee("Hacker, Harry", 50000);
        System.out.println(harry.getName());
        System.out.println(harry.getSalary());
        harry.raiseSalary(10); // Harry gets a 10 percent raise
        System.out.println(harry.getSalary());
   }
}
