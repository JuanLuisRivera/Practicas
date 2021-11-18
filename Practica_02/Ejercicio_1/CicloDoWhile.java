/**
*@author Juan Luis Rivera Ibarra
*@version 1.0
*/

public class CicloDoWhile{
  /**
  *Programa que analiza los numeros menores a 1000 y determina cuales son primos
  */
  public static void main(String[] args){
    /**
    *Metodo main, el cual es forzoso y lleva  acabo la ejecucion del programa
    */
    int i = 2;
    do {
      boolean esprimo = true;
      int j = 2;
      do {
        if (i % j == 0 && i != 2) {
          esprimo = false;
        }
        j++;
      } while (j < i);
      if (esprimo) {
        System.out.println(i);
      }
      i++;
    } while (i != 1000);
  }
}
