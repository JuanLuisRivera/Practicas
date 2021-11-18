/**
*@author Juan Luis Rivera Ibarra
*@version 1.0
*/
public class Rectangulo {
    private double base;
    private double altura;
    /**Metodo constructor que genera un rectangulo con valores proporcionados por el usuario
    *@param base      Valor de la base del rectangulo
    *@param altura    Valor de la altura del rectangulo
    */
    public Rectangulo(double base, double altura){
      this.base = base;
      this.altura = altura;
    }
    /**Metodo constructor que genera un rectangulo con valores predeterminados
    *Valor de la base del rectangulo igual a 10
    *Valor de la altura del rectangulo igual a 10
    */
    public Rectangulo(){
      this.base = 10.0;
      this.altura = 10.0;
    }
    /**Regresa el valor en tipo double de la base
    *@return base  Valor numerico double de la base del rectangulo
    */
    public double getbase(){
      return base;
    }
    /**Regresa el valor en tipo double de la altura
    *@return altura  Valor numerico double de la altura del rectangulo
    */
    public double getaltura(){
      return altura;
    }
    /**Establece la base del rectangulo
    *@param base Valor en double que se le asignara a la base del rectangulo
    */
    public void setbase(double base){
      this.base = base;
    }
    /**Establece la altura del rectangulo
    *@param altura Valor en double que se le asignara a la altura del rectangulo
    */
    public void setaltura(double altura){
      this.altura = altura;
    }
    /**Metodo que regresa el area del rectangulo
    *@param   base                Valor en double de la base del rectangulo
    *@param   altura              Valor en double de la altura del rectangulo
    *@return  arearectangulo      Valor en double del area del rectangulo
    */
    public double arearectangulo(double base, double altura){
      double arearectangulo = base*altura;
      return arearectangulo;
    }
    /**Metodo que regresa el perimetro del rectangulo
    *@param   base                Valor en double de la base del rectangulo
    *@param   altura              Valor en double de la altura del rectangulo
    *@return  perimetrorectangulo Valor en double del perimetro del rectangulo
    */
    public double perimetrorectangulo(double base, double altura){
      double perimetrorectangulo = 2 * base + 2 * altura;
      return perimetrorectangulo;
    }
    /**Metodo que regresa una cadena con el area y la altura del rectangulo desde el cual se llama el metodo
    *@return  Una cadena con el area y la altura del rectangulo
    */
    public String toString(){
      return ("Tienes un rectangulo cuya area es: " + arearectangulo(base, altura) + " y un perimetro: " + perimetrorectangulo(base, altura));
    }

}
