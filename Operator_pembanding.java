/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.operator_pembanding;

/**
 *
 * @author user
 */
public class Operator_pembanding {

    public static void main(String[] args) {
        int nilai1 = 12;
        int nilai2 = 4;
        boolean hasil;

        // lebih besar
        hasil = nilai1 > nilai2;
        System.out.println(hasil);

        // lebih kecil
        hasil = nilai1 < nilai2;
        System.out.println(hasil);

        // lebih besar sama dengan
        hasil = nilai1 >= nilai2;
        System.out.println(hasil);

        // lebih kecil sama dengan
        hasil = nilai1 <= nilai2;
        System.out.println(hasil);

        // sama dengan
        hasil = nilai1 == nilai2;
        System.out.println(hasil);

        // tidak sama dengan
        hasil = nilai1 != nilai2;
        System.out.println(hasil);
    }
}
