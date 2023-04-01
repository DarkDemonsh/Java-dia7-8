package dia7act4;

import java.util.Scanner;

public class Dia7act4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
             
        if (nprimo(num)){
            System.out.println("El numero "+num+" es primo");
        }else{
            System.out.println("El numero "+num+" no es primo");
        }
    }
    
    public static boolean nprimo(int num){
    if (num < 2){
        return false;
    }
    for(int i = 2; i <= Math.sqrt(num); i++){
        if (num % i == 0){
            return false;
        }
    } 
        return true;
    }
    
}
