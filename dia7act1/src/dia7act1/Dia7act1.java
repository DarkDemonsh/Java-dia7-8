package dia7act1;

import java.util.Scanner;

public class Dia7act1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 2 numeros");
        
        int elec = 0;
        int num = leer.nextInt();
        int num1 = leer.nextInt();
       
        do{
                
        System.out.println(" ");
        
        System.out.println("¿Que desea hacer?");
        System.out.println(" ");
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");
        elec = leer.nextInt(); 
            
        if(elec == 1){
        
            int rsuma = suma(num,num1);
            System.out.println(" ");
            System.out.println("la suma de los numeros es: "+rsuma);
            break;
            
        }else if(elec == 2){
            
            int rresta = resta(num,num1);
            System.out.println(" ");
            System.out.println("la resta de los numeros es: "+rresta);
            break;
            
        }else if(elec == 3){
            
            int rmult = multiplicacion(num,num1);
            System.out.println(" ");
            System.out.println("la multiplicacion de los numeros es: "+rmult);
            break;
            
        }else if(elec == 4){
            
            int rdiv = division(num,num1);
            System.out.println(" ");
            System.out.println("la division de los numeros es: "+rdiv);
            break;
            
        }else{
            System.out.println("El numero no corresponde");
            elec = 0;
            }
        
        }while(elec < 5);
    }
        
   public static int suma(int num,int num1){
       
       int rsuma = num + num1;
       
       return rsuma;
   }
   
   public static int resta(int num,int num1){
       
       int rresta = 0;
       
       if (num < num1){
       rresta = num1 - num;
       }else{
       rresta = num - num1;
       }
       
       return rresta;
   }
   
   public static int multiplicacion(int num, int num1){
   
       int rmult = num * num1;
       
       return rmult;
   }    
   
   public static int division(int num, int num1){
       
       int rdiv = num / num1;
       
       return rdiv;
   }
   
}
