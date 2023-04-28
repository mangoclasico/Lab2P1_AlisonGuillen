/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_alisonguillen;

/**
 *
 * @author Dell i7
 */
import java.util.Scanner;

public class Lab2P1_AlisonGuillen {

    private static Object pi;

    /**
     * @param args the command line arguments
     */
     public static boolean par(int numero) {
        return numero % 2 == 0;
    }
    
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
    int Respuesta = 1;
        
            while (Respuesta != 3) {
            System.out.println("\nMenu");
            System.out.println("1. Clasificando numeros");
            System.out.println("2. Aproximado PI");
            System.out.println("3. MCD");
            System.out.println("4. Adios");
    int opcion = leer.nextInt();
    switch (opcion) {
        case 1: {
        System.out.println("Ingrese un número:");
        int num = leer.nextInt();    
               // TODO code application logic here
        int contador_ciclo = 1;
        int contador_cero = 0;                
            while (contador_ciclo <= num) {
                if (num % contador_ciclo == 0) {
                    contador_cero++;
                }
                contador_ciclo++;
            }
         if (par(num)) {
            System.out.print(num + " es par");
        } else {
            System.out.print(num + " es impar");
        }
                if (contador_cero == 2) {
                    System.out.println(" y  primo.");
                }         
            }
        break;
        
  case 2:
              System.out.println("Ingrese la precision del calculo: ");
        int n = leer.nextInt();
        double resultado = 2;
        int i = 1;
        while (i <= n) {
            double numerador = (double) (2 * i) * (2 * i);
            double denominador = numerador - 1;
            resultado *= numerador / denominador;
            i++;
        }
        System.out.println("PI es: " + resultado);

        case 3: {
       System.out.println("Ingrese el numero A: ");
       int numa = leer.nextInt();
       System.out.println("Ingrese el numero B: ");
       int numb = leer.nextInt();
       {
       while(numa!= numb)
            if(numa>numb)
                numa= numa-numb;
            else
                numb= numb - numa; 
              System.out.println("El MCD de : " + numa);
      
       break ;
        }
        }       
        case 4: 
        System.out.println("Adiós!");
        break;
    
        default :
        System.out.println("Opción inválida");
            // TODO code application logic here

        // TODO code application logic here
    }
    
            }
    }
}