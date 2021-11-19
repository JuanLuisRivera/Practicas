/**
*@author Juan Luis Rivera Ibarra
*@version 1.0
*/

public class Parametros{
  /**
  *Programa que prueba el paso por valor y referencia en Java
  */
  public static void main(String[] args){
    /**
    *Metodo main, el cual es forzoso y lleva  acabo la ejecucion del programa
    */
    Prueba a = new Prueba();

    //Se analizara el paso por valor
    System.out.println("Ejemplo para paso con valor.\n");
    //Se incializa la variable i con valor 2
    int i = 2;
    //Se llama al metodo metodopruebavalor y se pasa el argumento i
    metodopruebavalor(i);
    //Se imprime el valor de i igual a 2
    System.out.println("Valor de i: \n" + i);


    //Se analizara el paso por referencia
    System.out.println("\nEjemplo para paso con referencia.\n");
    //Se imprime el valor de la cantidad a igual a 10
    System.out.println(a.cantidad + "\n");
    //Se ejecuta el metodo de la clase Prueba
    a.metodopruebareferencia(a);
    //Se imprime el valor de la cantidad a igual a 2
    System.out.println(a.cantidad + "\n");


  }


  //Metodo que recibe el valor de i y crea una copia de el para operar
  public static void metodopruebavalor(int a){
    //Se ejecutan las operaciones en a
    a = a * a;
    //Se imprime el valor de a igual a 4
    System.out.println("Valor de a: \n" + a);
  }


}
