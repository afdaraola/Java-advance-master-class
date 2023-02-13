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
import java.util.function.IntBinaryOperator;

public class FuncInterface2 {

   public static void main(String args[]) {
        // lambda expression
        IntBinaryOperator sum = (a, b) -> a + b;
        System.out.println("Result: " + sum.applyAsInt(12, 100));

    }
}