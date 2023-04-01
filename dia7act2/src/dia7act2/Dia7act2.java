package dia7act2;

import java.util.Scanner;

public class Dia7act2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String nombre = "";
        int edad = 0;

        
        System.out.println("Ingrese la cantidad de personas");
        int cantp = leer.nextInt();
        
        do{
              
        String rper = people(nombre);
            
        System.out.println("ingrese la edad de "+rper);
        int redad = age(edad);
            
        if(redad >= 18){
            System.out.println("la edad de "+rper+" es "+redad+" el es mayor de edad");
        }else{
            System.out.println("la edad de "+rper+" es "+redad+" el es menor de edad");
        }
        
        System.out.println("¿desea continuar? (SI/NO)");
        String r = leer.next();
        
        if(r.equalsIgnoreCase("SI")){
        cantp = cantp - 1;
        }else{
        System.out.println("BINGOOOooooo.....");
        break;
        }
        
        }while(cantp != 0);
        
    }
    
    public static String people(String nombre){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre de la persona");
        nombre = leer.next();
        
        String rper = nombre;
        
        return rper;         
    }
    
    public static int age(int edad){
        Scanner leer = new Scanner(System.in);
        
        edad = leer.nextInt();

        int redad = edad;
 
        return redad;
        
    }
    
}