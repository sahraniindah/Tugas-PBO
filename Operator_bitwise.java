/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.operator_bitwise;

/**
 *
 * @author user
 */
public class Operator_bitwise {

    public static void main(String[] args) {
        int a = 40;    
        int b = 10;    
        int c = 0;

        // and
        c = a & b;       
        System.out.println("a & b = " + c);
        
        // or
        c = a | b;       
        System.out.println("a | b = " + c);

        //XOR
        c = a ^ b;      
        System.out.println("a ^ b = " + c);

        // Negasi/kebalikan
        c = ~a;          
        System.out.println("~a = " + c);

        // left shift
        c = a << 2;     
        System.out.println("a << 2 = " + c);

        // right shift
        c = a >> 2;     
        System.out.println("a >> 2  = " + c);

        //right shift (unsigned)
        c = a >>> 2;    
        System.out.println("a >>> 2 = " + c);
    }
}
