package ordenacionFicheros;
import java.io.*;
public class Merge {

			   
			
			   public  void run() {
				   String INPUT= ".\\src\\ordenacionFicheros\\ficheroAOrdenar.txt" ;
				   String AUX1  =  ".\\src\\ordenacionFicheros\\aux1.txt" ;
				   String AUX2  =  ".\\src\\ordenacionFicheros\\aux2.txt" ;
			     try {
			       boolean sorted = split(INPUT, AUX1, AUX2);
			       while (!sorted) {
			         merge(AUX1, AUX2, INPUT);
			         sorted = split(INPUT, AUX1, AUX2);
			       }
			       System.out.println("Ya esta chavale ya esta ordenao del to, o no ");
			     } catch (IOException ex) {
			       System.out.println("No se pudo ordenar el fichero: "+ex);
			     }
			   }
			
			    public boolean split(String input,String output1,String output2) throws IOException {
			
			     BufferedReader in = new BufferedReader(new FileReader(input));
			     BufferedWriter out = new BufferedWriter(new FileWriter(output1));
			     BufferedWriter other = new BufferedWriter(new FileWriter(output2));
		
			     boolean sorted = true;
			     String previous = ""  ;
			     String current = in.readLine();
			
			     while (current != null) {
			       if (previous.compareTo(current) > 0) {
			         sorted = false;
			        BufferedWriter tmp = out;
			         out = other;
			         other = tmp;
			       }
			       out.write(current);
			       out.newLine();
			
			       previous = current;
			       current = in.readLine();
			     }
			
			     in.close();
			     out.close();
			     other.close();
			
			     return sorted;
			   }
			
			   public void merge(String input1,String input2, String output) throws IOException {
			
			     BufferedReader in1 = new BufferedReader(new FileReader(input1));
			     BufferedReader in2 = new BufferedReader( new FileReader(input2));
			     BufferedWriter out = new BufferedWriter(new FileWriter(output));
			
			     String current1 = in1.readLine();
			     String current2 = in2.readLine();
			
			     while (current1 != null && current2 != null) {
			    	        if (current1.compareTo(current2) <= 0) {
			         out.write(current1);
			         out.newLine();
			         current1 = in1.readLine();
			       } else {
			         out.write(current2);
			         out.newLine();
			         current2 = in2.readLine();
			       }
			     }
			
			     while (current1 != null) {
			       out.write(current1);
			       out.newLine();
			       current1 = in1.readLine();
			     }
			
			     while (current2 != null) {
			       out.write(current2);
			       out.newLine();
			       current2 = in2.readLine();
			     }
			   }
}
