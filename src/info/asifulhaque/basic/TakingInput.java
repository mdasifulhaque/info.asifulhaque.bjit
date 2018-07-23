/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.asifulhaque.basic;

import java.util.Scanner;

/**
 *
 * @author mdasifulhaque
 */
public class TakingInput {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        /**
         * This section is for integer testing
         */
        
        //Method 1
        System.out.println("Please Enter an Number ");
        int number=scn.nextInt();
        System.out.println("The number you have input is = "+number);
        
        //Method 2
        System.out.println("Please enter and number  ");
        System.out.println("The number you have input is = "+scn.nextInt());
        
        
    }
    
}
