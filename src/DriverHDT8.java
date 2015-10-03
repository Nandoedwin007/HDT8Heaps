//Algoritmos y Estructura de Datos
//Edwin Coronado Roche, 14148
//Dan Alvarez Ruano, 14628

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DriverHDT8 {

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
		
		VectorHeap<String> elementos = new VectorHeap<String>();
		int i = 0;
		for(i=0;i<cantLineas;i++)
		{
			elementos.add(lineas[i]);
		}
		for(i=0;i<cantLineas;i++){
			System.out.println(elementos.remove());
		}
	}
}