/**
*@author Juan Luis Rivera Ibarra
*@version 1.0
*/

import java.util.Scanner;

public class Bisiesto{
  /**
  *Programa que analiza un año y determina si tiene 365 (No bisiesto) o 366 dias(Bisiesto)
  */
  public static void main(String[] args){
    /**
    *Metodo main, el cual es forzoso y lleva  acabo la ejecucion del programa
    */
    Scanner input = new Scanner(System.in);

    System.out.print("Ingresa un año: \n");
    int m = input.nextInt();

    if (m % 400 == 0){
      System.out.println("Es bisiesto.");
    }
    if(m % 4 == 0){
      if(! (m % 100 == 0)){
        System.out.println("Es bisiesto.");
      }
    }
    else{
      System.out.println("No es bisisesto.");
    }

    input.close();
  }
}
