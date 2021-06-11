import java.util.Scanner;

public class Ejercicio2Java{
    static Scanner leer = new Scanner(System.in);

    public static void main (String[] args){
        int numero;
        int cantidadNumeros = 0;

        numero = getInt("Ingrese un número");
        if(numero > 0){
            if(numero == 1){
                System.out.println("No hay ningun valor comprendido");
            }
            else{
                cantidadNumeros = numero;
                for(int i = 0;i<numero;i++){
                    System.out.println(cantidadNumeros);
                    cantidadNumeros--;
                }
            }

        }
        else{
            cantidadNumeros = numero;
            for(int i = 0;i>numero  ;i--){
                System.out.println(cantidadNumeros);
                cantidadNumeros++;
            }
        }
    }

    public static int getInt(String titulo){
        String n = "";

        while(n.equals("")){
            System.out.println(titulo);
            n = leer.nextLine();
            if(!n.matches("[0-9]*$")){
                n = "";
            }
        }
        
        return Integer.parseInt(n);
    }
}