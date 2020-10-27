package calculator;
import java.util.Scanner;

public class Calculator {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int opciones = 0;
        
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
    }
}
