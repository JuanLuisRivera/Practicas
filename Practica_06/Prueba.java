/**
*@author Juan Luis Rivera Ibarra
*@version 1.0
*/
public class Prueba {
    public int cantidad;


    /**Metodo constructor que genera una clase prueba con valores predeterminados
    *Valor de a igual a 10
    */
    public Prueba(){
      this.cantidad = 10;
    }

    /**Metodo que para evaluar la prueba por referencia
    *@param   a                Objeto de la clase Prueba
    */
    public void metodopruebareferencia(Prueba a){
      //Modifica el atributo del objeto a y le da un valor de 2
      a.cantidad = 2;
    }

}
