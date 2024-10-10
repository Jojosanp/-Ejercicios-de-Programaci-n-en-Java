import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        
        //datos formula cuadratica
        System.out.println("ingrese los coeficientes de la ecuacion de segundo grado separada por espacios");
        
        float a = Sc.nextFloat();
        float b = Sc.nextFloat();
        float c = Sc.nextFloat();
        
        //calcular discriminante
        
        float D = b * b - (4 * a * c);
        
        //posibles valores del discriminante
        
        
        float raiz_cuadrada_D = (float) Math.sqrt(D);
        
        
        
        //calcular posibles valores del discriminante
        if (D > 0){
        
            float x_1 = (-b + raiz_cuadrada_D ) / (2 * a);
            float x_2 = (-b - raiz_cuadrada_D) / (2 * a);
            
            System.out.println("Tiene dos soluciones en los reales: " + x_1 + " y "+ x_2);
            
        }else if (D == 0){
            
            float x = -b / 2 * a;
            
            System.out.println(x);
        }else {
            
            System.out.println("no hay solucion en los reales");
        }
        
        //System.out.println();
        
        //cerrar scanner
        Sc.close();
        
        

        
    }
}
