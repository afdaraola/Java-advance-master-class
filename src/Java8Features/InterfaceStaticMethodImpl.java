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
public class InterfaceStaticMethodImpl implements InterfaceStaticMehod {

    @Override
    public String consumer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public static void main(String[] args) {
        System.out.println(InterfaceStaticMehod.producer());
        System.out.println(new InterfaceStaticMethodImpl().getOverview());
    }
    
}


