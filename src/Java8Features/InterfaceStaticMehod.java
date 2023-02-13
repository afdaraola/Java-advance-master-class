/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8Features;

import java.util.concurrent.RecursiveAction;

/**
 *
 * @author pearlsoft
 */
interface InterfaceStaticMehod {

    abstract public String consumer();

    static String producer() {
        return "BMW";
    }

    default  String getOverview() {
        return "X5 series made by " + producer();
    }

}
