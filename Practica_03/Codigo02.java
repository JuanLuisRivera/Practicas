class CicloFor{
	public static void main(String[] args){

		//Todo esto es para el marco que rodea el menú.

		/////////////////////////////////////////////////////

		System.out.print("\n\u2554");  //Este es para el marco de arriba, use los ciclos para ahorrarme estar poniendo todas las barras.
		for(int x = 0; x < 48; x++){
		System.out.print("\u2550");
		}
		System.out.print("\u2557");

		/////////////////////////////////////////////////////

		System.out.print("\n\u2551");  //Este es para el espacio vacío antes del título.
		for(int y = 0; y < 48; y++){
		System.out.print(" ");
		}
		System.out.print("\u2551\n");

		/////////////////////////////////////////////////////

		System.out.print("\u2551 *** Todos los n\u00fameros primos hasta el 1000 *** \u2551");
		System.out.print("\n\u2551");  //Este es el título del menú.
		for(int z = 0; z < 48; z++){
		System.out.print(" ");
		}
		System.out.print("\u2551");

		/////////////////////////////////////////////////////

		System.out.print("\n\u2560");  //Este es el otro espacio después del título.
		for(int a = 0; a < 48; a++){
		System.out.print("\u2550");
		}
		System.out.print("\u2563\n");

		/////////////////////////////////////////////////////

		//Aquí está lo importante.

		boolean primo;  //El booleano para distinguir si un número es primo o no.

		for(int i = 2; i < 1000; i++){  //Aquí se designa el número al que ponemos a prueba.
			primo = true;
			for (int j = 2; j < i; j++){  //Y aquí se designa el número que pondrá a prueba.
    			if (i % j == 0){
				primo = false;
				break;
				}

			}
			if (primo){  //Esto es más que todo para mantener el marco del exterior.
				if(i<10){
					System.out.print("\u2551 * El n\u00famero ["+i);
					System.out.println("] es primo.                      \u2551");
				}
				if(i>10 && i<100){
					System.out.print("\u2551 * El n\u00famero ["+i);
					System.out.println("] es primo.                     \u2551");
				}
				if(i>100 && i<1000){
					System.out.print("\u2551 * El n\u00famero ["+i);
					System.out.println("] es primo.                    \u2551");
				}
			}
		}

		/////////////////////////////////////////////////////

		System.out.print("\u255a"); //Ciclo para terminar el marco.
		for(int c = 0; c < 48; c++){
		System.out.print("\u2550");
		}
		System.out.print("\u255d");

	}
}
/*
Es mas eficiente porque hace un break cuando detecta que el numero no es primo mientras que el mio seguia la iteracion hasta i - 1


Ejecucion:
Existe una variable primo igual a true
Se inicia un for en i = 2
Se inicia otro for dentro del anterior en j = 2
Se compara si j es menor que i
Se busca que el residuo de i / j sea 0
Para i = 2 no se entra en el segundo for
primo = true
Se imprime el numero
Para i = 3, j = 2
El residuo es distinto de 0
primo = true
Se imprime el numero
Para i = 4, j= 2
El residuo es 0
primo = false
No se imprime el numero
Para i = 5, j = 2
Se cumple que el residuo es diferente de 0
para i = 5, j = 3
Se cumple que el residuo es diferente de 0
Para i = 5, j = 4
Se cumple que el residuo es diferente de 0
primo = true
Se imprime el numero
*/
