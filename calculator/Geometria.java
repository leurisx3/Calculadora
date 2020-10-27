
package calculator;
import java.util.Scanner;

public class Geometria{
   
    public static void geometria(){
        
        Scanner input = new Scanner(System.in);
        
        int opciones = 0;
        int base = 0;
        int altura = 0;
        int lado = 0;
        int radio = 0;
        
        do {
            System.out.println("----- Seleccione una opción ------\n" +
            "----- Cálculo de áreas ------\n" +
            "01-Cuadrado\n" +
            "02-Rectángulo\n" +
            "03-Triángulo\n" +
            "04-Círculo\n" +
            "00-Menú anterior\n" +
            "Introduzca una opcion: ");
            opciones = input.nextInt();
        } while (opciones > 5 || opciones < 0);
        
        switch(opciones){
            
            case 1:
                System.out.print("introduzca el lado: ");
                lado = input.nextInt();
                
                System.out.println("El area del cuadrado es: "+(Math.pow(lado, 2)));
                break;
            case 2:
                System.out.print("Introduzca la base: ");
                base = input.nextInt();
                
                System.out.print("Introduzca la altura: ");
                altura = input.nextInt();
                
                System.out.println("El area del rectangulo es: "+(base * altura));
                break;
            case 3:
                System.out.print("Introduzca la base: ");
                base = input.nextInt();
                
                System.out.print("Introduzca la altura: ");
                altura = input.nextInt();
                
                System.out.println("El area del triangulo es: "+(base * altura / 2));
                break;
            case 4:
                System.out.print("Introduzca el radio: ");
                radio = input.nextInt();
                
                System.out.println("El area del circulo es: "+(3.14 * Math.pow(radio, 2)));
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
