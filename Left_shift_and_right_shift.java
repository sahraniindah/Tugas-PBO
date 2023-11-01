

package com.mycompany.left_shift_and_right_shift;

import java.util.Scanner;

public class Left_shift_and_right_shift {

    public static void main(String[] args) {
        int Nilai3, Nilai4, hasil3, hasil4;
        
        Scanner keyboard=new Scanner(System.in);
        
            System.out.print("Input angka-1: ");
        Nilai3 = keyboard.nextInt();
            System.out.print("Input angka-2: ");
        Nilai4 = keyboard.nextInt();
        // Bitwise Negasi (~)
        hasil3 = Nilai4 << Nilai3; 
            System.out.println("Bitwise Left Shift");
            System.out.println("Hasil Left Shift "+hasil3);
            
            
            
        System.out.print("Input angka-1: ");
        Nilai3 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai4 = keyboard.nextInt();
        // Bitwise Negasi (~)
        hasil4 = Nilai4 >> Nilai3; 
            System.out.println("Bitwise Right Shift");
            System.out.println("Hasil Right Shift "+hasil4);
            
            
        
    }
}
