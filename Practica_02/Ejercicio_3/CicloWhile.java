/**
*@author Juan Luis Rivera Ibarra
*@version 1.0
*/

public class CicloWhile{
  /**
  *Programa que analiza los numeros menores a 1000 y determina cuales son primos
  */
  public static void main(String[] args){
    /**
    *Metodo main, el cual es forzoso y lleva  acabo la ejecucion del programa
    */
    int i = 2;
    while (i < 1000){
      boolean esprimo = true;
      int j = 2;
      while (j < i) {
        if (i % j == 0) {
          esprimo = false;
        }
        j++;
      }
      if (esprimo) {
        System.out.println(i);
      }
      i++;
    }
  }
}
