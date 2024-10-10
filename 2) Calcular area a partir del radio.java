// 2. Pedir el radio de un círculo y calcular su área. A=PI*r^2.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)){
        
         System.out.println("ingresa el radio del circulo para calcular su area");
         
         int radio = scanner.nextInt();
         
         while (radio < 0){
             System.out.println("por favor ingresa un numero positivo");
             radio = scanner.nextInt();
         }
        
         float PI = 3.141516f;
         
         float area = PI*(radio*radio);
         
         System.out.println("El area del circulo es: " + area + " metros cuadrados");
           
           
           
           
       }
        
        
        
    }
}
