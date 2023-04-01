package dia7act3;

import java.util.Scanner;

public class Dia7act3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String i = "S";
    do{    
        System.out.println("Ingrese la cantidad de euros");
        double euro = leer.nextInt();
        
        System.out.println("Ingrese la moneda a convertir");
        System.out.println("");
        System.out.println("1-libra");
        System.out.println("2-yenes");
        System.out.println("3-dolares");
        System.out.println("");
        
        int r = leer.nextInt();
        
        if(r == 1){
            double rlibra = libra(euro);  
        }else if(r == 2){
            double ryen = yenes(euro);
        }else if(r == 3){
            double rdolar = dolar(euro);
        }else{
            System.out.println("valor invalido");
            System.out.println("");
        }
        
        System.out.println("Desea hacer otra conversion? (S/N)");
        i = leer.next();
        if(i.equalsIgnoreCase("S")){
            System.out.println("");
        }else{
            System.out.println("A-DIOS");
        }
        
    }while(i.equalsIgnoreCase("S"));  
    }
    
    public static double libra(double euro){
        
        double rlibra = euro * 0.86;
        System.out.println("la cantidad de euros en Libra es: "+rlibra);
        System.out.println("");
        return rlibra;
    }
    public static double yenes(double euro){
        
        double ryen = euro * 129.852;
        System.out.println("la cantidad de euros en Yenes es: "+ryen);
        System.out.println("");
        return ryen;
    }
    public static double dolar(double euro){

        double rdolar = euro * 1.28611;
        System.out.println("la cantidad de euros en Dolars es: "+rdolar);
        System.out.println("");
        return rdolar;
    }
}
