/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8Features;

/**
 *
 * @author pearlsoft
 */
interface FunctionalInterface2 {

    public int addMethod(int a, int b);
}
public class FuncInterface {

   public static void main(String args[]) {
        // lambda expression
    	FunctionalInterface2 sum = (a, b) -> a + b;
        System.out.println("Result: "+sum.addMethod(12, 100));
    }
}
