import java.util.Scanner;

public class DivisionDeSoloSumaYResta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
   
        System.out.print("ingresa el primer numero ( el dividiendo): ");
        int dividendo = scanner.nextInt();
        
        System.out.print("Ingresa el segundo numero(el divisor): ");
        int divisor = scanner.nextInt();
        
        int cociente = 0;
        int resto = dividendo;
        
        if (dividendo < divisor){
            System.out.println("no se puedes hacer ");
            return;
        }
        else {
        
        if (divisor == 0) {
            System.out.println("no se puedes hacer ");
            return;
        }
        
       
        while (resto >= divisor) {
            resto -= divisor;
            cociente++;     
         }
        }
        if (resto == 0 ) {
             System.out.println("la division es exacta");
        }
             else 
        { System.out.println("la division es inexata");
        
         }
        
        System.out.println("El cociente es: " + cociente);  
        System.out.println("El residuo es: " + resto);  
    }
}
