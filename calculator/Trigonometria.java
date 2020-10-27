
package calculator;

import java.util.Scanner;


public class Trigonometria {

    public static void trigonometria(){
        
        Scanner input = new Scanner(System.in);
        
        int opciones = 0;
        
        double anguloRadian = 0;
        double angulo = 0;
        double seno = 0;
        double coseno = 0;
        double tangente = 0;
        double cotangente = 0;
        double secante = 0;
        double cosecante = 0;
        
        do {
            System.out.println("----- Seleccione una opción ------\n" +
            "----- Cálculo de áreas ------\n" +
            "01-seno\n" +
            "02-coseno\n" +
            "03-tangente\n" +
            "04-cotangente\n" +
            "05-secante\n" +
            "06-cosecante\n" +
            "00-menu anterior6 \n" +
            "Introduzca una opcion: ");
            opciones = input.nextInt();
        } while (opciones > 6 || opciones < 0);
        
        switch(opciones){
            
            case 1:
                System.out.print("Introduce un angulo de 0 a 360: ");
                angulo = input.nextDouble();
                
                seno = Math.toRadians(angulo);
                System.out.println("El seno es: "+Math.sin(seno));
                break;
            case 2:
                System.out.print("Introduce un angulo de 0 a 360: ");
                angulo = input.nextDouble();
                
                coseno = Math.toRadians(angulo);
                System.out.println("El coseno es: "+Math.cos(coseno));
                break;
            case 3:
                System.out.print("Introduce un angulo de 0 a 360: ");
                angulo = input.nextDouble();
                
                tangente = Math.toRadians(angulo);
                System.out.println("La tangente es: "+Math.tan(tangente));
                break;
            case 4:
                System.out.print("Introduce un angulo de 0 a 360: ");
                angulo = input.nextDouble();
                
                anguloRadian = Math.toRadians(angulo);
                cotangente = Math.cos(anguloRadian) / Math.sin(anguloRadian);
                
                System.out.println("La cotangente es: "+cotangente);
                break;
            case 5:
                System.out.print("Introduce un angulo de 0 a 360: ");
                angulo = input.nextDouble();
                
                anguloRadian = Math.toRadians(angulo);
                secante = 1 / Math.cos(anguloRadian);
                
                System.out.println("La secante es: "+secante);
                break;
            case 6:
                System.out.print("Introduce un angulo de 0 a 360: ");
                angulo = input.nextDouble();
                
                anguloRadian = Math.toRadians(angulo);
                cosecante = 1 / Math.sin(anguloRadian);
                
                System.out.println("La cosecante es: "+cosecante);
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
