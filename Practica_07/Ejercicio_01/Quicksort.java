public class Quicksort extends Arreglo{

  public static void ordenar (int [] arreglo, int izquierdo, int derecho){
    int izquierdo1;
    int derecho1;
    izquierdo1 = izquierdo;
    derecho1 = derecho;
    int pivote = arreglo [(derecho + izquierdo) / 2];

    do {
      while(arreglo[izquierdo1] < pivote){
        izquierdo1 ++;
      }
      while (arreglo[derecho1] > pivote) {
        derecho1 --;
      }
      if (izquierdo1 <= derecho1) {
        cambiar(arreglo, izquierdo1, derecho1);
        izquierdo1++;
        derecho1--;
      }
    } while (izquierdo1 <= derecho1);

    if (izquierdo1 < derecho) {
      ordenar(arreglo, izquierdo1, derecho);
    }
    if (izquierdo < derecho1) {
      ordenar(arreglo, izquierdo, derecho1);
    }
  }
}
