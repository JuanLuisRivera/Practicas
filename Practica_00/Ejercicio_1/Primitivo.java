/**
*@author Juan Luis Rivera Ibarra
*@version 1.0
*/
public class Primitivo{
  /**
  *Programa que regresa el valor en bytes de los diferentes tipos de datos
  */
  public static void main(String[] args){
    /**
    *Metodo main, el cual es forzoso y lleva  acabo la ejecucion del programa
    */
    System.out.println("byte: " + (Byte.BYTES) + " bytes.");
    System.out.println("short: " + (Short.BYTES) + " bytes.");
    System.out.println("int: " + (Integer.BYTES) + " bytes.");
    System.out.println("long: " + (Long.BYTES) + " bytes.");
    System.out.println("float: " + (Float.BYTES) + " bytes.");
    System.out.println("double: " + (Double.BYTES) + " bytes.");
    System.out.println("boolean: 1 byte.");
    System.out.println("char: " + (Character.BYTES) + " bytes.");
  }
}
