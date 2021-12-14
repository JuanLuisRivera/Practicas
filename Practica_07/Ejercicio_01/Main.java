import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main{

  public static void main(String[] args){
    Random r = new Random();

    int [] quicksort = new int[100000];
    int [] bubblesort = new int[100000];

    for (int i = 0; i < bubblesort.length; i++){
      bubblesort[i] = r.nextInt();
      quicksort[i] = bubblesort[i];
    }

    long iniciobubble = System.nanoTime();

    Bubblesort.ordenar(bubblesort);

    long finalbubble = System.nanoTime();
    long tiempobubble = finalbubble - iniciobubble;

    System.out.println("Se imprimira el arreglo ordenado de bubblesort");
    Bubblesort.imprimir(bubblesort);

    long inicioquick = System.nanoTime();

    Quicksort.ordenar(quicksort, 0, quicksort.length - 1);

    long finalquick = System.nanoTime();
    long tiempoquick = finalquick - inicioquick;

    System.out.println("Se imprimira el arreglo ordenado de quicksort");
    Quicksort.imprimir(quicksort);

    if (tiempoquick > tiempobubble) {
      System.out.println("Bubblesort fue mas rapido.");
      System.out.println("Bubblesort: " + (tiempobubble / 1000000) + " ms.");
    }
    else {
      System.out.println("Quicksort fue mas rapido.");
      System.out.println("Quicksort: " + (tiempoquick / 1000000) + " ms.");
    }
  }
}
