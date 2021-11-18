/**
*@author Juan Luis Rivera Ibarra
*@version 1.0
*/
public class CicloFor{
  /**
  *Programa que analiza todos los numeros menores a 1000 para deteminar cuales son primos
  */
  public static void main(String[] args){
    /**
    *Metodo main, el cual es forzoso y lleva  acabo la ejecucion del programa
    */
    for (int i = 2; i <= 1000 ; i ++) {
      boolean esprimo = true;
      for (int j = 2; j < i ; j ++ ) {
        if (i % j == 0) {
          esprimo = false;
        }
      }
      if (esprimo) {
        System.out.println(i);
      }
    }
  }
}
