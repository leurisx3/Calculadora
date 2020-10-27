
package calculator;

import java.util.Scanner;
public class Aritmetica {
    
    
    public static void aritmetica(){
        
        Scanner input = new Scanner(System.in);
        
        int opciones = 0;
        int num1 = 0;
        int num2 = 0;
        float num1Float = 0;
        float num2Float = 0;
        double num1Double = 0;
        double num2Double = 0;
        
        do{
        System.out.println("----- Seleccione una opción ------\n" +
        "01-Sumar\n" +
        "02-Restar\n" +
        "03-multiplicar\n" +
        "04-Dividir\n" +
        "05-Potencia\n" +
        "00-Menú anterior\n" +
        "Introduzca una opcion:");
        opciones = input.nextInt();
        
        }while(opciones > 6 || opciones < 0);
        
        switch(opciones){
            
            case 1: 
                System.out.print("Introduzca un numero: ");
                num1 = input.nextInt();

                System.out.print("Introduzca otro numero: ");
                num2 = input.nextInt();

                System.out.println("La suma es: "+(num1 + num2));
                break;
            case 2:
                System.out.print("Introduzca un numero: ");
                num1 = input.nextInt();
                
                System.out.print("Introduzca otro numero: ");
                num2 = input.nextInt();
                
                System.out.println("La resta es: "+(num1 - num2));
                break;
            case 3:
                System.out.print("Introduzca un numero: ");
                num1 = input.nextInt();
                
                System.out.print("Introduzca otro numero: ");
                num2 = input.nextInt();
                
                System.out.println("La multiplicacion es: "+(num1 * num2));
                break;
            case 4:
                System.out.print("Introduzca un numero: ");
                num1Float = input.nextFloat();
                
                System.out.print("Introduzca otro numero: ");
                num2Float = input.nextFloat();
                
                System.out.println("La division es: "+(num1Float / num2Float));
                break;
            case 5:
                System.out.print("Introduzca un numero: ");
                num1Double = input.nextDouble();
                
                System.out.print("Introduzca otro numero: ");
                num2Double = input.nextDouble();
                
                System.out.println("La potencia es: "+(Math.pow(num1Double, num2Double)));
                break;
                
            case 0:
                do{
                    System.out.println("1-Cálculo aritmética\n" +
                    "2-Cálculo geometría\n" +
                    "3-Calculo trigonometria\n" +        
                    "0-Salir\n" +
                    "Introduzca una opcion:");
                    opciones = input.nextInt();
        }while(opciones > 3 || opciones < 0);
        
        switch(opciones){
            
            case 1:
                Aritmetica aritmetica = new Aritmetica();
                aritmetica.aritmetica();
                break;
            case 2:
                Geometria geometria = new Geometria();
                geometria.geometria();
                break;
            case 3:
                Trigonometria trigonometria = new Trigonometria();
                trigonometria.trigonometria();
                break;
            case 0: 
                System.out.println("CERRANDO CALCULADORA...");
        }
        break;
        }
        
    }
    
}