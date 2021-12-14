/**
*@author Juan Luis Rivera Ibarra
*@Version 1.0
*/
/**
*Clase Operador
*@since 1.0
*/
public class Operador extends Empleado{
  /**Metodo constructor que genera un Objeto de la clase Operador
  *@since 1.0
  *@param nombre      Nombre del Operador
  */
  Operador(String nombre){
    super(nombre);
  }
  /**Metodo constructor que genera un Objeto de la clase Operador con nombre predeterminado
  *@since 1.0
  *Nombre = Juan Luis
  */
  Operador(){
    super();
  }
  /**Metodo que regresa un tipo de dato String con la informacion del Operador
  *@since 1.0
  *@return  Una cadena con el nombre del Operador
  */
  @Override
  public String toString(){
    return ("Operador: <" + getNombre() + ">.");
  }
}
