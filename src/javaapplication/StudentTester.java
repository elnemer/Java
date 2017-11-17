/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp 15 -ay
 */
public class StudentTester {
    public static void main(String[] args) {
            Student ahmed = new Student("Ahmed",192,3);
            System.out.println(ahmed.getName());
            System.out.println(ahmed.getAverageScore());
            ahmed.addQuiz(56);
            System.out.println(ahmed.getAverageScore());            
    }
}
