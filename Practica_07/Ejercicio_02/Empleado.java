/**
*@author Juan Luis Rivera Ibarra
*@Version 1.0
*/
/**
*Clase Empleado
*@since 1.0
*/
public class Empleado{
  protected String nombre;
  /**Metodo constructor que genera un Objeto de la clase empleado
  *@since 1.0
  *@param nombre      Tipo de dato string con el nombre del Empleado
  */
  public Empleado(String nombre){
    this.nombre = nombre;
  }
  /**Metodo constructor que genera un objeto de la clase empleado con valores predeterminados
  *@since 1.0
  *Nombre = Juan Luis
  */
  public Empleado(){
    this.nombre = "Juan Luis";
  }
  /**Regresa el atributo nombre del objeto en tipo de dato String
  *@since 1.0
  *@return nombre  Atributo del objeto de la clase empleado
  */
  public String getNombre(){
    return nombre;
  }
  /**Establece el nombre del objeto de la clase Empleado
  *@since 1.0
  *@param nombre Tipo de dato String que reemplaza el atibuto nombre del objeto de la clase Empleado
  */
  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  /**Metodo que regresa un tipo de dato String con la informacion del empleado
  *@since 1.0
  *@return  Una cadena con el nombre del Empleado
  */
  public String toString(){
    return ("Empleado: <" + getNombre() + ">.");
  }
  /**Metodo que regresa un tipo de dato boolean comparando los atributos de dos objetos
  *@since 1.0
  *@param   Objeto de la clase Empleado
  *@return  Tipo de dato Boolean que compara si los atributos son iguales
  */
  public boolean equals(Empleado empleado1){
    if (empleado1.getNombre() == this.nombre) {
      return true;
    }
    return false;
  }

}
