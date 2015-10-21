/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol52;

import java.util.Scanner;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Bol52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double meridiano, paralelo, distanciaTerra;
        Scanner obx = new Scanner (System.in);
        System.out.println("Introduce o meridiano: ");
        meridiano=obx.nextDouble();
        System.out.println("Introduce o paralelo: ");
        paralelo=obx.nextDouble();
        System.out.println("Introduce a distancia á Terra: ");
        distanciaTerra=obx.nextDouble();
        
        Satelite sat = new Satelite (meridiano, paralelo,distanciaTerra);
        System.out.println("O satélite atópase no paralelo "+paralelo+" , no meridiano "+meridiano+" e a unha distancia da Terra de "+distanciaTerra);     
    }
    
}
