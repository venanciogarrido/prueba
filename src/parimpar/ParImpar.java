
package parimpar;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        int numero; 
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();
        if (numero%2 == 0)
            System.out.println("El número "+numero+ " es Par");
        else
             System.out.println("El número "+numero+ " es Impar");
            
    }
    
}
