/**
*@author Juan Luis Rivera Ibarra
*@version 1.0
*/
public class Cilindro{
  /**
  *Programa que regresa volumen y area de un cilindro predeterminado
  */
  public static void main(String[] args){
    /**
    *Metodo main, el cual es forzoso y lleva acabo la ejecucion del programa
    */
    int radio = 10;
    int altura = 20;
    double pi = 3.1415;
    double area;
    double volumen;

    System.out.print("El area del cilindro es: " + (2 * pi * radio * altura + 2 * pi * (radio * radio)) + "cm² \n");
    System.out.print("El volumen del cilindro es: " + (pi * radio * radio * altura) + "cm³ \n");
  }
}
