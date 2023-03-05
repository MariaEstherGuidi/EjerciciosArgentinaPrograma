//Trabajo Practico nº 1 - Introducción a Algoritmos y Java:
 // Alumna: Guidi Maria Esther;
 //EJERCICIO 1.B;
package IntrodAlgoritmosJava;

public class Ejercicio1b 
{
	public static void main(String[] args) 
	{
	
	int numeroInicio = 3;
	int numeroFin = 12;
	int aux = numeroInicio;
	if (numeroInicio%2!=0)
		{
		aux=numeroInicio+1;  
		}
	while (aux <= numeroFin) 
		{
		System.out.println(aux);
		aux=aux+2;
		}
	}
}
