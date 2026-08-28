/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author Fatec
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 3;
        int n2 = 5;
        float media = (n1 + n2) / 2;
        System.out.println("A média é igual a " + media);
        
        System.out.println("----------------");
        
        int numero = 5;
        int valor = 5 + ++numero;
        System.out.println(valor);
        
        System.out.println("----------------");
        
        int x = 4;
        x += 2;
        System.out.println(x);
        
        System.out.println("----------------");
        
        float raiz = (float) Math.sqrt(x);
        System.out.println(raiz);
        
        System.out.println("----------------");
        
        float v = 8.9f;
        int ar = (int) Math.floor(v);
        System.out.println(ar);

        System.out.println("----------------");

        double ale = Math.random();
        int n = (int) (5 + ale * (10 - 5));
        System.out.println(n);
    }
    
}
