package uf1;

import java.io.File;
import java.io.IOException;

public class EjLecturaEscrituraTextoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			File ficheroDatos = new File("C:\\AD\\Ejercicios\\nuevoDirectorio"+File.separator+"datos.txt");
			if (!ficheroDatos.exists()) {
				try {
					if(ficheroDatos.createNewFile())
						System.out.println("Fichero creado correctamente");
					else
						System.out.println("No se ha podido crear el fichero correctamente");
				} catch (IOException e) {
					// TODO Auto-generated method stub
					e.printStackTrace();
				}
			}
			Ejercicio03OperacionesFicheros objectOperador = new Ejercicio03OperacionesFicheros();
			try {
				objectOperador.escribe(ficheroDatos);
				objectOperador.lee(ficheroDatos);
			}catch (IOException e) {
				// TODO Auto-generated method stub
				e.printStackTrace();
	}

}
}
