public class Bubblesort extends Arreglo{

  public static void ordenar (int [] arreglo){

    for (int i = 1; i < arreglo.length ; i++) {
      for (int j = arreglo.length - 1; j >= i ; j --) {
        if (arreglo[j] < arreglo[j - 1]) {
          cambiar(arreglo, j, j - 1);
        }
      }
    }
  }
}
