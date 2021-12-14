import java.util.Scanner;
import java.util.NoSuchElementException;

public class Main{

  public static void main(String[] args) {
    Empleado empleado1 = new Empleado();
    Empleado empleado2 = new Empleado();
    Operador operador1 = new Operador("San comida");
    Oficial oficial1 = new Oficial("Pedro");
    String nombre = "";
    Scanner input = new Scanner(System.in);

    System.out.println("ingresa el nombre del Operador");
    try {
      nombre = input.nextLine();
    } catch(NoSuchElementException exception) {
      System.out.println("Ingresa un nombre para el Operador");
    }

    operador1.setNombre(nombre);

    if (empleado1.equals(empleado2)) {
      System.out.println("Son iguales");
    }
    System.out.println(operador1.toString());

    System.out.println(oficial1.trabaja());

    System.out.println(oficial1.toString());
  }
}
