public class Arreglo{

  protected static void cambiar(int [] arreglo, int i, int j){
    int temp;

    temp = arreglo[i];
    arreglo[i] = arreglo[j];
    arreglo[j] = temp;
  }

  protected static void imprimir (int [] arreglo){
    for (int i = 0; i < arreglo.length ; i++ ) {
      System.out.println(arreglo[i]);
    }
  }
}
