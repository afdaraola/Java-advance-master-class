/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 *
 * @author pearlsoft
 */
public class Streamapi {


    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2, 3, 4, 5);
        int even =  number.stream().filter(x -> x%2 == 0).reduce(0, (ans, i) -> ans + i);

        System.out.println("even = " + even);
      

    }
}
