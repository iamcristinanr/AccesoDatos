import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ej03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion;
		Scanner sc = new Scanner(System.in);
		
		File miDirectorio = new File("C:\\AD\\Ejercicios\\nuevoDirectorio");
		File miFichero = new File("C:\\AD\\Ejercicios\\Fichero_de_texto.txt");
		File miFichero2 = new File("C:\\AD\\Ejercicios\\nuevoDirectorio\\Fichero_de_texto2.txt");
		
		try {
			if (miFichero.createNewFile()) 
				System.out.println("Fichero creado correctamente");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
		
		do {
			System.out.println("____ CREAR UN FICHERO DE TEXTO ____");
			System.out.println(" MENU DE OPCIONES");
			System.out.println(" 1. Crear directorio nuevoDirectorio");
			System.out.println(" 2. Crear fichero miFichero2.txt en nuevoDirectorio");
			System.out.println(" 3. Eliminar fichero miFichero.txt");
			System.out.println(" 4. Eliminar directorio nuevoDirectorio");
			System.out.println(" 0. Salir");
			System.out.println(" Elige una opcion");
			opcion = sc.nextInt();
		
			
		switch(opcion) {
			case 1: //Crear directorio nuevoDirectorio
				if(miDirectorio.mkdir())
					System.out.println("Directorio creado correctamente");
				else
					System.out.println(" No se ha podido crear correctamente");
					break;
					
			case 2: //Crear fichero miFichero2.txt en nuevoDirectorio
				try {
				if(miFichero2.createNewFile())
					System.out.println("Fichero creado correctamente");
				else
					System.out.println(" No se ha podido crear correctamente");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case 3: //Eliminar fichero mi fichero
				if(miFichero.delete())
					System.out.println("Fichero borrado correctamente");
				else
					System.out.println(" No se ha podido borrar correctamente");
				break;
				
			case 4: //Eliminar directorio nuevoDirectorio
				if(miDirectorio.delete())
					System.out.println("Directorio borrado correctamente");
				else
					System.out.println(" No se ha podido borrar correctamente");
				break;
			
			case 0: // Salir
				System.out.println("Gracias por utilizar el programa");
				break;
			
			default: //Opcion incorrecta
				System.out.println("Opción incorrecta");
				
		}
	} while (opcion !=0);
	sc.close();
	System.out.println("FIN DEL PROGRAMA");
}
}

