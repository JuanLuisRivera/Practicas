/**
*@author Juan Luis Rivera Ibarra
*@Version 1.0
*/
/**
*Clase Directivo
*@since 1.0
*/
public class Directivo extends Empleado{
  /**Metodo constructor que genera un Objeto de la clase Directivo
  *@since 1.0
  *@param nombre      Nombre del Directivo
  */
  Directivo(String nombre){
    super(nombre);
  }
  /**Metodo constructor que genera un Objeto de la clase Directivo con nombre predeterminado
  *@since 1.0
  *Nombre = Juan Luis
  */
  Directivo(){
    super();
  }
  /**Metodo que regresa un tipo de dato String con la informacion del Directivo
  *@since 1.0
  *@return  Una cadena con el nombre del Directivo
  */
  @Override
  public String toString(){
    return ("Directivo: <" + getNombre() + ">.");
  }
}
