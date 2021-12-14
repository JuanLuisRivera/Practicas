/**
*@author Juan Luis Rivera Ibarra
*@Version 1.0
*/
/**
*Clase Oficial
*@since 1.0
*/
public class Oficial extends Operador{
  /**Metodo constructor que genera un Objeto de la clase Oficial
  *@since 1.0
  *@param nombre      Nombre del Oficial
  */
  Oficial(String nombre){
    super(nombre);
  }
  /**Metodo constructor que genera un Objeto de la clase Oficial con nombre predeterminado
  *@since 1.0
  *Nombre = Juan Luis
  */
  Oficial(){
    super();
  }
  /**Metodo que regresa un tipo de dato String con la informacion del Oficial
  *@since 1.0
  *@return  Una cadena con el nombre del Oficial
  */
  @Override
  public String toString(){
    return ("Oficial: <" + getNombre() + ">.");
  }
  /**Metodo que regresa un tipo de dato String con la frase "Estoy trabajando"
  *@since 1.0
  *@return  Una cadena con la frase "Estoy trabajando"
  */
  public String trabaja(){
    return ("Estoy trabajando.");
  }
}
