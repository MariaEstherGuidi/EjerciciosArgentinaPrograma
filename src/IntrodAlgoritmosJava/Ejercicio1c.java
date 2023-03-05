//Trabajo Practico nº 1 - Introducción a Algoritmos y Java;
 // Alumna: Guidi Maria Esther;
 // EJERCICIO 1.c;
package IntrodAlgoritmosJava;

public class Ejercicio1c 
{
	public static void main(String[] args) 
	{
	int numeroInicio = 3;
	int numeroFin = 12;
	int aux = numeroInicio;
	int paroimpar = 0;
	//System.out.println(" si paroimpar es 1 imprime los  numeros impares entre 3 y 12");
	//System.out.println(" si paroimpar es 0 imprime los  numeros pares entre 3 y 12");
	while (aux <= numeroFin) 
	{
		if( paroimpar == 1)
		{
			if ( aux % 2 != 0)
			{
				System.out.println(aux);
			}
		}	
		else
			{
				if ( aux % 2 == 0)
				{
					
				System.out.println(aux);
				
				}
			}	
		
		aux=aux+1;
	
	}
	}
}

