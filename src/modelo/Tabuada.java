package modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Tabuada {
	
	
	
	  public static void main(String[] args) throws IOException {
		  
		    Scanner ler = new Scanner(System.in);
		    int i, n;
		 
		    System.out.printf("Informe o número para a tabuada:\n");
		    n = ler.nextInt();
		 
		    FileWriter destino = new FileWriter("C:/Users/Home/Documents/tabuada.txt"); 
		    try (PrintWriter gravarArq = new PrintWriter(destino)) {
				gravarArq.printf("+--Resultado--+%n");
				  for (i=1; i<=12; i++) {		    	
				    gravarArq.printf("| %d X %2d = %2d |%n", n, i, (i*n));
				  }
				gravarArq.printf("+-------------+%n");
				destino.close();
				gravarArq.close();
			}
		 
		    System.out.printf("\nTabuada dos %d foi salva com sucesso.\n", n);
		  }

}
