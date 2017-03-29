package ligaFutbol;

import java.lang.reflect.Array;
import java.util.Random;

public class GestoraLiga 
{
	
	private Equipo[] clasificacion;
	
	//Constructores
	public GestoraLiga()
	{
		clasificacion=new Equipo[4];
	}
	public GestoraLiga(Equipo[]clasificacion)
	{
		this.clasificacion=clasificacion;
	}
	public GestoraLiga(GestoraLiga gestora)
	{
		this.clasificacion=gestora.clasificacion;
	}
	
	/*
	 * Interfaz
	 * 
	 * Este m�todo carga el array de clasificacion con los equipos ordenados aleatoriamente
	 * Prototipo: void cargarArray(Equipo equipo1, Equipo equipo2,Equipo equipo3,Equipo equipo4)
	 * Precondiciones: No hay
	 * Entradas: 4 objetos equipo
	 * Salidas: No hay
	 * Postcondiciones: No hay
	 * 
	 * RESGUARDO
	 * 
	 * 	public void cargarArray(Equipo equipo1, Equipo equipo2,Equipo equipo3,Equipo equipo4)
	 * {
	 * 		System.out.println("EN CONSTRUCCION");
	 * }
	 */
	public void cargarArray(Equipo equipo1, Equipo equipo2, Equipo equipo3, Equipo equipo4)
	{
		Random aleatorio=new Random();
		int numero=0;
		int i;
		for(i=0;i<clasificacion.length;)
		{
			numero=aleatorio.nextInt(4);
			if(numero==equipo1.getIdentificador())
			{
				if(buscarEquipo(equipo1)==-1)
				{
					clasificacion[i]=equipo1;
					i++;
				}
			}
			else if(numero==equipo2.getIdentificador())
			{
				if(buscarEquipo(equipo2)==-1)
				{
					clasificacion[i]=equipo2;
					i++;
				}
			}
			else if (numero==equipo3.getIdentificador())
			{
				if(buscarEquipo(equipo3)==-1)
				{	
					clasificacion[i]=equipo3;
					i++;
				}
			}
			else
			{
				if(buscarEquipo(equipo4)==-1)
				{
					clasificacion[i]=equipo4;
					i++;
				}
			}
		}
	}
	
	/*
	 * Interfaz
	 * 
	 * Este m�todo busca los equipos en la clasificacion
	 * Prototipo: int buscarEquipo (Equipo equipo)
	 * Precondiciones: No hay
	 * Entrada: un objeto equipo
	 * Salidas: Un entero
	 * Postcondiciones: -1 si no ha encontrado nada y del 0 al 3 si lo ha encontrado
	 * 
	 * RESGUARDO
	 * 
	 * public int buscarEquipo(Equipo equipo)
	 * {
	 * 		return 1;
	 * }
	 */
	public int buscarEquipo(Equipo equipo)
	{
		int i, encontrado=-1;
		for(i=0;encontrado==-1&&i<clasificacion.length;i++)
		{
			if(clasificacion[i]==equipo)
			{
				encontrado=i;
			}
		}
		return encontrado;
	}

}