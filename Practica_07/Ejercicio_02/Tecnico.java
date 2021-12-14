/**
*@author Juan Luis Rivera Ibarra
*@Version 1.0
*/
/**
*Clase Tecnico
*@since 1.0
*/
public class Tecnico extends Operador{
  /**Metodo constructor que genera un Objeto de la clase Tecnico
  *@since 1.0
  *@param nombre      Nombre del Tecnico
  */
  Tecnico(String nombre){
    super(nombre);
  }
  /**Metodo constructor que genera un Objeto de la clase Tecnico con nombre predeterminado
  *@since 1.0
  *Nombre = Juan Luis
  */
  Tecnico(){
    super();
  }
  /**Metodo que regresa un tipo de dato String con la informacion del Tecnico
  *@since 1.0
  *@return  Una cadena con el nombre del Tecnico
  */
  @Override
  public String toString(){
    return ("Tecnico: <" + getNombre() + ">.");
  }
  /**Metodo que regresa un tipo de dato String con la frase "Estoy trabajando"
  *@since 1.0
  *@return  Una cadena con la frase "Estoy trabajando"
  */
  public String trabaja(){
    return ("Estoy trabajando.");
  }
}
