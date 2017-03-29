package ligaFutbol;
/*
 * An�lisis
 * 
 * Este programa es una aplicacion de gestion de un grupo de la Champions League
 * Entradas:
 *		- Nombre del equipo local, nombre del equipo visitante
 * 		- Resultado del partido, dos enteros
 * Salidas:
 * 		- Se imprimir� por pantalla la tabla clasificatoria con sus datos correspondientes
 * Restricciones:
 * 		- El resultado de los partidos es mayor o igual a 0.
 * 
 * PSEUDOC�DIGO GENERALIZADO
 * 
 * Inicio
 * 		Leer y validar iniciar liga
 * 		Mientras quiera iniciar liga
 * 			Presentar men� y leer y valdiar opcion
 * 			Segun(opcion)
 * 				Caso 1:
 * 					Simular jornada
 * 				Caso 2:
 * 					Imprimir tabla de clasificaci�n
 * 				Caso 3:
 * 					Llamar al tito Floren
 * 			Fin_Segun
 * 			Leer y validar reiniciar
 * 		Fin_Mientras
 * Fin
 * 	
 * ---M�dulo Simular jornada---
 * Inicio
 * 		Generar e imprimir Jornada
 *		Generar resultados e imprimir resultados
 * Fin
 * 
 * ---M�dulo Llamar al tito Floren---
 * Inicio
 * 		Imprimir resultados
 * 		Leer y validar elegir partido
 * 		Leer y validar nuevo resultado
 * 		Imprimir resultados
 * Fin			
 */

import java.io.*;

public class MAIN 
{
	public static void main (String[]args) throws IOException
	{
		String seguir=" ";
		
		
		Equipo sevilla=null;
		Equipo juventus=null;
		Equipo zagreb=null;
		Equipo lyon=null;
		Partido partido1=null;
		Partido partido2=null;
		GestoraLiga gestora=new GestoraLiga();
		try
		{
			sevilla=new Equipo("Sevilla FC",0,0,0,0,0);
			juventus=new Equipo("Juventus FC",0,0,0,0,0);
			zagreb=new Equipo("Dinamo de Zagreb",0,0,0,0,0);
			lyon=new Equipo("Olympique de Lyon",0,0,0,0,0);
			partido1=new Partido();
			partido2=new Partido();
		}catch(ligaException mensaje)
		{
			System.out.println(mensaje);
		}
		InputStreamReader corriente=new InputStreamReader(System.in);
		BufferedReader tecladoString=new BufferedReader(corriente);
		
		do
		{
			System.out.println("Desea iniciar la liguilla?");
			seguir=tecladoString.readLine().toLowerCase();
		}while(!seguir.equals("si")&&!seguir.equals("no"));
		while(seguir.equals("si"))
		{
			gestora.cargarArray(sevilla, juventus, zagreb, lyon);
			
			do
			{
				System.out.println("Desea reiniciar la liguilla?");
				seguir=tecladoString.readLine().toLowerCase();
			}while(!seguir.equals("si")&&!seguir.equals("no"));
		}
	}

}
