package pruebasFicheros;
import java.io.*;
public class Prueba {

	public static void main(String[] args) 
	{
		int valor;
		String ruta=".\\src\\pruebasFicheros\\prueba.txt";
		//File archivo=new File(ruta);
		FileWriter fw=null;
		FileReader fr=null;
		try 
		{
			 fw=new FileWriter(ruta);
			 fw.write("Esto es una prueba");
			 fw.write("pepe");
			 fw.close();
			 fr=new FileReader(ruta);
			 valor=fr.read();
			 while(valor!=-1)
			 {
	         System.out.print((char)valor);
	         valor=fr.read();
			 }
			 fr.close();
			 fw=new FileWriter(ruta);
			 fw.write("ivan maricona");
			 fw.close();
			 fr=new FileReader(ruta);
			 valor=fr.read();
			 while(valor!=-1)
			 {
	         System.out.print((char)valor);
	         valor=fr.read();
			 }
			 fr.close();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}

}
