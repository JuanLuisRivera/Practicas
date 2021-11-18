/**
*@author Juan Luis Rivera Ibarra
*@version 1.0
*/
import java.util.Scanner;

public class Main{
  /**
  *Programa que prueba la generacion de dos cuentas bancarios, una predefinida y la otra con valores proporcionados por el usuario
  */
  public static void main(String[] args){
    /**
    *Metodo main, el cual es forzoso y lleva  acabo la ejecucion del programa
    */
    Scanner input = new Scanner(System.in);

    System.out.println("Cuenta pre-establecida: \n");
    Cuenta r = new Cuenta();
    System.out.print("\n");
    System.out.print("Titular: \n" + r.gettitular());
    System.out.print("\n");
    System.out.print("Dinero disponible: \n" + r.getdineroDisponible());
    System.out.print("\n");

    System.out.println("Cuenta de usuario nuevo: \n");
    System.out.print("Nombre del titular: \n");
    String t1 = input.next();
    Cuenta t = new Cuenta(t1);
    System.out.print("Cuenta Creada \n");
    System.out.print("Titular: \n" + t.gettitular());
    System.out.print("Dinero disponible: \n" + t.getdineroDisponible());
    System.out.print("\n");


    System.out.print("Nuevo dinero disponible: \n");
    double d1 = input.nextDouble();
    t.setdineroDisponible(d1);

    System.out.print("\n");
    System.out.print("Cambiar nombre de titular: \n");
    String t2 = input.next();
    t.settitular(t2);

    System.out.print("\n");
    System.out.print("Titular: \n" + t.gettitular());

    System.out.print("\n");
    System.out.print("Dinero disponible: \n" + t.getdineroDisponible());

    System.out.print(t.toString() + "\n");
    input.close();
  }
}
