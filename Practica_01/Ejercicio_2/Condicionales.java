/**
*@author Juan Luis Rivera Ibarra
*@version 1.0
*/

import java.util.Scanner;

public class Condicionales{
  /**
  *Programa que compara dos numeros enteros y regresa el numero mayor
  */
  public static void main(String[] args){
    /**
    *Metodo main, el cual es forzoso y lleva  acabo la ejecucion del programa
    */
    Scanner input = new Scanner(System.in);

    System.out.print("Primer numero entero: \n");
    int m = input.nextInt();
    System.out.print("Segundo numero entero: \n");
    int n = input.nextInt();

    if (m>n){
      System.out.println("El numero con mayor valor es: " + (m));
    }
    else{
      System.out.println("El numero con mayor valor es: " + (n));
    }

    input.close();
  }
}
