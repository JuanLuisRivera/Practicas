/**
*@author Juan Luis Rivera Ibarra
*@version 1.0
*/
import java.util.Scanner;

public class Main{
  /**
  *Programa que prueba la construccion de dos rectangulos, uno predefinido y el otro con valores proporcionador por el usuario
  */
  public static void main(String[] args){
    /**
    *Metodo main, el cual es forzoso y lleva  acabo la ejecucion del programa
    */
    Scanner input = new Scanner(System.in);

    System.out.println("Rectangulo pre-establecido: \n");
    Rectangulo r = new Rectangulo();
    System.out.print("\n");
    System.out.print("Base rectangulo predeterminado: \n" + r.getbase());
    System.out.print("\n");
    System.out.print("Altura rectangulo predeterminado: \n" + r.getaltura());
    System.out.print("\n");
    System.out.print("Area Rectangulo predeterminado: \n" + r.arearectangulo(r.getbase(), r.getaltura()));
    System.out.print("\n");
    System.out.print("Perimetro Rectangulo predeterminado: \n" + r.perimetrorectangulo(r.getbase(), r.getaltura()));
    System.out.print("\n");

    System.out.print("\n");
    System.out.print("Base del rectangulo determinado por el usuario: \n");
    double rb = input.nextDouble();
    System.out.print("Altura del rectangulo determinado por el usuario: \n");
    double ra = input.nextDouble();
    Rectangulo r1 = new Rectangulo(rb, ra);
    System.out.print("Area Rectangulo: \n" + r1.arearectangulo(rb, ra));
    System.out.print("\n");

    System.out.print("Perimetro Rectangulo: \n" + r1.perimetrorectangulo(rb, ra));
    System.out.print("\n");

    System.out.print("\n");
    System.out.print("Base rectangulo predeterminado: \n" + r.getbase());

    System.out.print("\n");
    System.out.print("Cambiar valor de base rectangulo predeterminado: \n");
    double rc = input.nextDouble();
    r.setbase(rc);

    System.out.print("\n");
    System.out.print("Altura rectangulo predeterminado: \n" + r.getaltura());

    System.out.print("\n");
    System.out.print("Cambiar valor de altura rectangulo predeterminado: \n");
    double rd = input.nextDouble();
    r.setaltura(rd);

    System.out.print(r.toString() + "\n");
    input.close();
  }
}
