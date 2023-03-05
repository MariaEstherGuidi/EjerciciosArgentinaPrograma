//Trabajo Practico nº 1 - Introducción a Algoritmos y Java;
// Alumna: Guidi Maria Esther;
 // //EJERCICIO 2;
package IntrodAlgoritmosJava;

public class Ejercicio2 
{
	public static void main(String[] args) 
	{
        // defino y le doy valor a todas las variables de entrada;
		
		int ingresostotales = 500000;
		int vehiculos = 4;
		int antigüedad = 1;
		int inmuebles = 4;
		boolean variosmas = true;
		
        ///resuelvo si pertenece o no a la clase de ingresos altos con el if y utilzando operadores logicos;
		
		if ( (ingresostotales >=489083) || ((vehiculos>= 3) && (antigüedad < 5)) || ( inmuebles >= 3) || (variosmas == true))
	    {	
			System.out.println(" pertenece a la clase de ingresos altos");
	    }
		else
			{
			System.out.println(" no pertenece a la clase de ingresos altos");
			
			}
		
		
		
	}

}
