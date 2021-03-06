package utilFicheros;
import java.io.*;
public class UtilFicheros {
	/*
	 * Interfaz
	 * 
	 * Este m�todo lista los ficheros de un directorio
	 * Prototipo: void listarDirectorio()
	 * Precondiciones/Entrada/Salida/Postcondiciones: No hay
	 * RESGUARDO
	 * 
	 * public void listarDirectorio()
	 * {
	 * 		System.out.println("EN CONSTRUCCION");
	 * }
	 */

	public void listarDirectorio() throws UtilException
	{
		File ruta=new File(".\\src\\utilFicheros");
		File[]archivos=ruta.listFiles();
		if(archivos==null)
		{
			throw new UtilException("El directorio debe contener archivos");
		}
		else
		{
			for(int i=0; i<archivos.length;i++)
			{
				System.out.println(archivos[i]);
			}
		}
	}
	/*
	 * Interfaz
	 * 
	 * Este m�todo indica las propiedades y lista el contenido de win.ini y system.ini de Windows
	 * Precondiciones: No hay
	 * Entradas: Dos archivos 
	 * Salidas: No hay
	 * Postcondiciones: No hay
	 * 
	 * RESGUARDO
	 * 
	 * public void fileProperties(String win, String system)
	 * {
	 * 		System.out.println("EN CONSTRUCCI�N");
	 * }
	 * 
	 */
	public void fileProperties(String win, String system)
	{
		String linea1="";
		String linea2="";
		try 
		{
			File winini1=new File(win);
			File systemini1=new File(system);
			BufferedReader winini = new BufferedReader(new FileReader(win));
			BufferedReader systemini = new BufferedReader(new FileReader(system));
			System.out.println("win.ini: ");
			linea1=winini.readLine();
			while(linea1!=null)
			{
				System.out.println(linea1);
				linea1=winini.readLine();
			}
			System.out.println("Nombre: "+winini1.getName());
			System.out.println("Ultima modificacion: "+winini1.lastModified());
			System.out.println("Ejecutable: "+winini1.canExecute());
			System.out.println("Leible: "+winini1.canRead());
			System.out.println("Se puede modificar: "+ winini1.canWrite());
			System.out.println("Esta oculto: "+winini1.isHidden());
			winini.close();
			System.out.println();
			System.out.println("system.ini: ");
			linea2=systemini.readLine();
			while(linea2!=null)
			{
				System.out.println(linea2);
				linea2=systemini.readLine();
			}
			System.out.println("Nombre: "+systemini1.getName());
			System.out.println("Ultima modificacion: "+systemini1.lastModified());
			System.out.println("Ejecutable: "+systemini1.canExecute());
			System.out.println("Leible: "+systemini1.canRead());
			System.out.println("Se puede modificar: "+ systemini1.canWrite());
			System.out.println("Esta oculto: "+systemini1.isHidden());
			systemini.close();
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
