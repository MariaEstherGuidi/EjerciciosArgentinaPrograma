//Trabajo Practico nº 1 - Introducción a Algoritmos y Java;
 // Alumna: Guidi Maria Esther;
 // //EJERCICIO 1.D;
package IntrodAlgoritmosJava;

public class Ejercicio1d
{
	public static void main(String[] args) 
	{
	
	int numeroinicio = 3;
	int numerofin = 12;
	int aux = numerofin;
	int i=0;
	if (numerofin%2!=0)
		{
		aux=numerofin-1;  
		}
	for ( i= aux; i>= numeroinicio; i= i-2)
		{
		System.out.println(i);
		}
	}
}
