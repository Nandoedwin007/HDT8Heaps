//Algoritmos y Estructura de Datos
//Edwin Coronado Roche, 14148
//Dan Alvarez Ruano, 14628

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.PriorityQueue;

public class DriverHDT8JCF {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader;
		String linea = "";
		int cantLineas = 0;
		int contador = 0;
		try {//revisa la cantidad de líneas que hay en el archivo
			reader = new BufferedReader(new FileReader("pacientes.txt"));
			while (reader.readLine() != null) cantLineas++;
			reader.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		String[] lineas = new String [cantLineas];//se instancia un arreglo donde se guardará cada línea del archivo
		try {
			reader = new BufferedReader(new FileReader("pacientes.txt"));
			while((linea = reader.readLine()) != null)
			{
			    lineas[contador] = linea;//se guarda cada línea del archivo
			    contador++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		PriorityQueue<String> elementos = new PriorityQueue<String>();
		StringBuilder sb;
		int i;
		String aux = "";
		for(i=0;i<cantLineas;i++) //mueve la letra de prioridad al inicio del string para que se forme el Heap conforme a la primera letra
		{
			aux = lineas[i].substring(lineas[i].length()-1,lineas[i].length()); //obtiene la ultima letra del string
			sb = new StringBuilder(lineas[i]); //el objeto StringBuilder permite eliminar caractéres
			sb.deleteCharAt(lineas[i].length()-1); //elimino la ultima letra del string
			lineas[i] = sb.toString(); //obtengo el string y lo guardo en el vector
			lineas[i] = aux + lineas[i]; //concateno la primera letra con el resto del string y lo guardo en el vector
			elementos.add(lineas[i]); //envio el string para que se ordene
		}
		for(i=0;i<cantLineas;i++){ //despliega los strings en orden de prioridad
			lineas[i] = elementos.poll(); //obtengo la cabeza de la cola (el string mas pequeno, o sea de mayor prioridad)
			aux = lineas[i].substring(0,1); //obtengo la letra de prioridad
			sb = new StringBuilder(lineas[i]); //el objeto StringBuilder permite eliminar caractéres
			sb.deleteCharAt(0); //elimino el caracter en la primera posicion (la letra de prioridad)
			lineas[i] = sb.toString(); //obtengo el string y lo guardo en el vector
			lineas[i] = lineas[i] + aux; //concateno el vector con la letra de prioridad
			System.out.println(lineas[i]); //despliego el string
		}
	}
}