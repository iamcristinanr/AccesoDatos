package uf1;

import java.io.File;
import java.io.IOException;

public class Ej01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File miDirectorio = new File("src/miDirectorio"); //Ruta Relativa
		File miFichero = new File("src/miDirectorio/miFichero.txt");
		File miDirAbsoluto = new File("c:\\prueba");
		File miFichAbsoluto = new File("c:\\prueba"+File.separator+"miFichero.txt");
		

		try {
			miDirAbsoluto.mkdir();
			if (miFichero.createNewFile()) {
				System.out.println("Fichero creado correctamente");
			} else System.out.println("Error: No se ha podido crear el fichero");
			
			if (!miDirAbsoluto.exists()) {
				 miDirAbsoluto.mkdir();
			}
			if (miFichAbsoluto.createNewFile()) {
				System.out.println("Fichero creado correctamente");
			} else if (miFichAbsoluto.exists())
					System.out.println("Error: No se ha podido crear el fichero, el fichero existe");
					else System.out.println("Error: No se ha podido crear el fichero");
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fin del programa");
		
	}

}
