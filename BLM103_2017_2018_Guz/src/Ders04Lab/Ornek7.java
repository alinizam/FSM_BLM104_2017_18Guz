/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04Lab;

/**
 *
 * @author anizam
 */
public class Ornek7 {

    public static void main(String[] args) {
        int satir = 0;
        int sutun = 0;
        while (satir < 10) {
            while (sutun <= satir) {
                System.out.print("*");
                sutun++;
            }
            satir++;
            sutun = 0;
            System.out.println("");
        }

    }
}
