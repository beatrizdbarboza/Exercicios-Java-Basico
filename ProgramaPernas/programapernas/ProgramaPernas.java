/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author Fatec
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantas pernas? ");
        
        int perna = teclado.nextInt();
        String tipo;
        System.out.println("Isso é um(a): ");
        
        tipo = switch (perna) {
            case 1 -> "Saci";
            case 2 -> "Bípede";
            case 3 -> "Tripé";
            case 4 -> "Quadrúpede";
            case 6 -> "Aranha";
            default -> "ET";
        };
        
        System.out.println(tipo);
    }
    
}
