import java.util.Scanner;
class CiclosFor {
    public static void main(String[] args){
	Scanner leer = new Scanner(System.in);

	int limite;

	System.out.print("ingresa un numero del 1 al 1000:");
	limite = leer.nextInt();
	for(int i=1;i<limite;i++){
	    int count=0;
	    for(int j=1;j<=i;j++){
		if(i%j==0)
		    count++;
	    }
	    if(count==2)
		System.out.println(i);
	}
    }
}
/*El codigo tiene la principal diferencia en el uso del Scanner
Seria mejor especificar que de los numeros del 2 al 1000, ya que si es uno, el programa no hace nada
De igual forma el programa no toma en consideracion el caso donde i = limite, es decir, para limite = 5, no va a imprimir el numero primo 5



Ejecucion:
Se declara una variable limite que depende del usuario
Se pone limite en 5
Se incicia un for i = 1
Se verifica que i < limite
Se inicia una variable count = 0
Se crea otro for en j = 1
Se verifica que j <= i
Se verifica que si el residuo de i / j es 0
count aumenta en 1
Se pruba para j = 2
Como i < j, no hace nada y pasa al siguiente numero
Para i = 2
Se verifica que i < limite
Se inicia una variable count = 0
Se crea otro for en j = 1
Se verifica que j <= i
Se verifica que si el residuo de i / j es 0
count aumenta en 1
para i = 2, j = 2
Se verifica que j <= i
Se verifica que si el residuo de i / j es 0
count aumenta en 1
Se imprime el numero ya que count = 2
Para i = 3
Se verifica que i < limite
Se inicia una variable count = 0
Se crea otro for en j = 1
Se verifica que j <= i
Se verifica que el residuo de i / j es 0
count aumenta en 1
para i = 3, j = 2
Se verifica que j <= i
El residuo es distinto de 0
Pasa al siguiente numero
Para i = 3, j = 3
Se verifica que j <= i
Se verifica que si el residuo de i / j es 0
count aumenta en 1
Se imprime el numero ya que count = 2
Para i = 4
Se verifica que i < limite
Se inicia una variable count = 0
Se crea otro for en j = 1
Se verifica que j <= i
Se verifica que el residuo de i / j es 0
count aumenta en 1
para i = 4, j = 2
Se verifica que j <= i
Se verifica que el residuo de i / j es 0
count aumenta en 1
Para i = 4, j = 3
Se verifica que j <= i
Se verifica que el residuo de i / j es distinto de 0
Pasa al siguiente numero
para i = 4, j = 4
Se verifica que j <= i
Se verifica que el residuo de i / j es 0
count aumenta en 1
No se imprime el numero ya que count es diferente de 2
Para i = 5
Se verifica que i = limite por tanto sale del for
Se acaba el programa
*/
