package uf1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio03OperacionesFicheros {
	
	public void escribe(File fichero) throws IOException{
		FileWriter objectWriter = new FileWriter(fichero);
		objectWriter.write("Estoy escribiendo esta línea en el fichero ");
		objectWriter.flush();
		objectWriter.close();
	}
	
	public void lee(File fichero) throws IOException{
		FileReader objectReader = new FileReader(fichero);
		int valor = objectReader.read();
		while (valor != -1) {
			System.out.println("Char: "+(char)valor+"\t\tascii: "+valor);
			valor = objectReader.read();
		}
		objectReader.close();
	
	}
}
