/**
*@author Juan Luis Rivera Ibarra
*@version 1.0
*/
public class Cuenta {
    private String titular;
    private double dineroDisponible;
    /**Metodo constructor que genera un rectangulo con valores proporcionados por el usuario
    *@param titular             Nombre de la persona asociada a la cuenta proporcionada por el usuario
    *Valor del dinero asociado a la cuenta igual a 0.0
    */
    public Cuenta(String titular){
      this.titular = titular;
      this.dineroDisponible = 0.0;
    }
    /**Metodo constructor que genera un rectangulo con valores predeterminados
    *Nombre de la persona asociada a la cuenta igual a Rivera Ibarra Juan Luis
    *Valor del dinero asociado a la cuenta igual a 10
    */
    public Cuenta(){
      this.titular = "Rivera Ibarra Juan Luis";
      this.dineroDisponible = 10.0;
    }

    /**Regresa una cadena con el nombre del titular
    *@return   Valor numerico double de la base del rectangulo
    */
    public String gettitular(){
      return titular;
    }
    /**Regresa el valor en tipo double del dinero asociado a la cuenta
    *@return dineroDisponible  Valor numerico tipo double del dinero asociado a la cuenta
    */
    public double getdineroDisponible(){
      return dineroDisponible;
    }
    /**Establece el nombre del titular asociado a la cuenta
    *@param titular  Cadena del nombre del titular asociado a la cuenta
    */
    public void settitular(String titular){
      this.titular = titular;
    }
    /**Establece el valor del dinero asociado a la cuenta
    *@param dineroDisponible Valor en tipo double del dinero asociado a la cuenta
    */
    public void setdineroDisponible(double dineroDisponible){
      this.dineroDisponible = dineroDisponible;
    }
    /**Metodo que regresa una cadena con el nombre del titular y el dinero asociado a la cuenta
    *@return Una cadena con el nombre del titular y el dinero asociado a la cuenta
    */
    public String toString(){
      return ("Tienes una cuenta cuyo dinero disponible es: " + getdineroDisponible() + ", " + gettitular());
    }

}
