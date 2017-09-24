/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenar;

import java.util.Arrays;
import java.util.Scanner;



/**
 *
 * @author Juan A
 */
public class Ordenar {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String entradatexto = pedirNumeros();
     if(true){
         String numerosOrdenados[] = ordenar(entradatexto);
         System.out.println(Arrays.toString(numerosOrdenados));
     }else{
         entradatexto = pedirNumeros();
     }
    }

    public static String pedirNumeros() {
        System.out.println("Introduzca los numeros");
        Scanner scanner = new Scanner(System.in);
        String entradatexto = scanner.nextLine();
        return entradatexto;
    }
    
    public static String[] ordenar(String cadena){
        String str[] = cadena.split("-");        
        Arrays.sort(str);
        return str;
    }
    public static int[] parsearStringArray(String[] sarray){
        int intarray[] = new int[sarray.length];
        for (int i = 0; i < sarray.length - 1 ; i++) {
            intarray[i] = Integer.valueOf(sarray[i]);
        }
        return intarray;
    }
    public static boolean validarCadena(String cadena){
        
        return cadena.matches("^\\d-*\\d$");
    }
    
}
